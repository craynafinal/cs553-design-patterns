import java.util.Enumeration;
import java.util.NoSuchElementException;

/**
 * Instances of this class are nodes of a linked list.
 *<p>
 * A linked list is a chain of objects that have two object references
 * associated with them.  One is the head of the list, which is a
 * data object that implements the ComparableIF interface.
 * The other is the tail of the list, which is either null
 * or another linked list.
 */
public class LinkedList implements Cloneable, java.io.Serializable {
	private ComparableIF head;
	private LinkedList tail;
	private boolean traversed = false; // true when this noed is being
																		 // traversed 

	/**
	 * This constructor creates a LinkedList with a null head and a null
	 * tail. 
	 */
	public LinkedList() {
		this(null, null);
	} // constructor()

	/**
	 * This constructor creates a LinkedList with the given head and a
	 * null tail.
	 * @param head The object that will be the head of this list
	 */
	public LinkedList(ComparableIF head) {
		this(head, null);
	} // constructor(LinkedList)
	
	/**
	 * This constructor creates a LinkedList with the given head and
	 * tail.
	 * @param head The object that will be the head of this list
	 * @param tail null or the rest of this linked list.
	 */
	public LinkedList(ComparableIF head, LinkedList tail) {
		this.head = head;
		this.tail = tail;
	} // constructor(LinkedList)

	/**
	 * Return the head of this linked list.
	 */
		public ComparableIF getHead() {
			return head;
	} // getHead()

	/**
	 * Return the tail of this linked list.
	 */
	public LinkedList getTail() {
		return tail;
	} // getTail()

	/**
	 * Return the number of nodes in this linked list
	 */
	synchronized public int size() {
		if (tail == null)
			return 1;
		try {
			traversed = true;
			if (tail.traversed)
				return 1;
			return 1 + tail.size();
		} finally {
			traversed = false;
		} // try
	} // size()

	/**
	 * Return an Enumeration of the data in this linked list (the
	 * heads).
	 */
	public Enumeration elements() {
		return new ListEnumeration();
	} // elements()

	/**
	 * private class to enumerate data of a linked list.
	 */
	private class ListEnumeration implements Enumeration {
		private LinkedList thisNode = LinkedList.this;

		/**
		 * Tests if this enumeration contains more elements.
		 * @return  <code>true</code> if this enumeration contains more
		 *          elements; 
		 */
		public boolean hasMoreElements() {
			return thisNode != null;
		} // hasMoreElements()

		/**
		 * Returns the next element of this enumeration.
		 * @return     the next element of this enumeration. 
		 * @exception  NoSuchElementException  if no more elements exist.
		 */
		public Object nextElement() {
			if (thisNode == null)
				throw new NoSuchElementException();
			ComparableIF next = thisNode.head;
			thisNode = thisNode.tail;
			return next;
		} // nextElement()
	} // class ListEnumeration

	/**
	 * Find the longest suffix whose head is equal to the given
	 * object. Objects in the linked list must be comparable, i.e.,
	 * implement the <EM>ComparableIF</EM> interface.  Method <EM>compare</EM>
	 * determines the kind of equality appropriate for an object.
	 * @param target The object to search for.
	 * @return a LinkedList whose head is equal to the given object or
	 *         null if the target is not found.
	 */
	public LinkedList find(ComparableIF target) {
		/*
		if (target == null)
			// null comparison if target is null
			return findNull ();
		else if (target.compare (head))
			// match, return itself
			return this;
		else if (tail == null)
			// the case it cannot find the target
			return null;
		else
			try {
				traversed = true;
				if (tail.traversed)
					return null;
				return tail.find(target);
			} finally {
				traversed = false;
			} // try
		*/

		boolean result = false;

		try {
			// head calls compare instead of target
			result = head.compare(target);
		} catch (NullPointerException e) {
			// this means that the head is null
			// if target is also null, return this
			if (target == null) {
				return this;
			}
		}

		if (result) {
			// return if the nodes match
			return this;
		} else if (tail == null) {
			// if there is no more to go, return null
			return null;
		}	else {
			try {
				traversed = true;
				if (tail.traversed)
					return null;
				return tail.find(target);
			} finally {
				traversed = false;
			} // try
		}			
	} // find(ComparableIF)

	/**
	 * Find the longest suffix that contains a null object.
	 * @return the longest LinkedList whose head is contains a null object or
	 *         null if the entire list contains only non-null objects.
	 */

	/*
	public LinkedList findNull () {
		if (head == null)
			return this;
		else if (tail == null)
			return null;
		else
			try {
				traversed = true;
				if (tail.traversed)
					return null;
				return tail.findNull ();
			} finally {
				traversed = false;
			} // try
	} // findNull ()
	*/

	// the original 3 methods from book
	/**
	 * Find an object in a linked list that is equal to the given
	 * object. Equality is normally determined by calling the given
	 * object's equals method. However, if the given object implements
	 * the EqualByIdentity interface, then equality will be determined
	 * by the == operator.
	 */
	// public LinkedList find(Object target) {
	//	if (target == null || target instanceof EqualByIdentity)
	//		return findEq(target);
	//	else
	//		return	findEquals(target);
	//}	// find(Object)

	/**
	 * Find an object in a linked list that is equal to the given
	 * object. Equality is determined by the == operator.
	 */
	// private synchronized LinkedList findEq(Object target) { ...	} // find(Object)

	/**
	 * Find an object in a linked list that is equal to the given
	 * object. Equality is determined by calling the given
	 * object's equals method.
	 */
	// private synchronized LinkedList findEqual(Object target) { ... } // find(Object)

} // class LinkedList
