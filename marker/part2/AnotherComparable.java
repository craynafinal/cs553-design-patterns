public class AnotherComparable implements ComparableIF {
	// just some simple value to test compare method
	private String value;

	public AnotherComparable(String value) {
		this.value = value;
	}

	// if the given object is an instance of this class
	// compare two values; otherwise return false
	public boolean compare(ComparableIF c) {
		if (c instanceof AnotherComparable) {
			return this.value.equals(((AnotherComparable)c).value);	
		} else {
			return false;
		}
	}
}
