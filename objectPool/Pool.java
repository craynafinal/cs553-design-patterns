/**
 * This class implements a pool of list cells.
 * It also maintains some statistics about the pool usage.
 */
public class Pool<E> {
	private List<E> pool = new Nil<E> ();
	private int created = 0;
	private int recycled = 0;
	private int held = 0;
	/**
	 * Acquire a list cell.
	 * The cell is recycled from the pool if any is available;
	 * otherwise it is created by the list cell constructor.
	 * The argument are for the initialization of the cell.
	 * @param object The head of the pooled cell.
	 * @param list The tail of the pooled cell.
	 * @return A list cell.
	 */
	public Cons<E> acquire (E e, List<E> list) {
		if (pool.isEmpty ()) {
			created++;

			// create a new object Cons<E>
			return new Cons<E> (e, list);

		}	else {
			held--;
			recycled++;

			// if pool is not empty
			// treat pool as Cons<E>
			Cons<E> tmp = (Cons<E>) pool;

			// pool becomes the tail (could be Nil<E>)
			pool = pool.tail ();

			// put head and list from param to the return obj
			tmp.reset (e, list);
			return tmp;
		}
	}
	/**
	 * Return a list cell to the pool.
	 * @param cons The list cell to return to the pool.
	 */
	public void release (Cons<E> cons) {
		held++;

		// information will be lost here
		// current pool becomes tail (saves cons from param as head)
		cons.reset (null, pool);
		pool = cons;
	}
	/**
	 * Print on standard output the number of cell nodes
	 * that have been constructed, that have been created,
	 * and that are held by the pool since the beginning
	 * of execution.
	 */
	public void statistics () {
		System.out.println ("created="+created+
												"\nrecycled="+recycled+
												"\nheld="+held);
	}
}
