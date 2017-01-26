public class Comparable implements ComparableIF {
	// just some simple value to test compare method
	private int value;

	public Comparable(int value) {
		this.value = value;
	}

	// if the given object is an instance of this class
	// compare two values; otherwise return false
	public boolean compare(ComparableIF c) {
		if (c instanceof Comparable) {
			return this.value == ((Comparable)c).value;	
		} else {
			return false;
		}
	}
}
