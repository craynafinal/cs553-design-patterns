public class Adapter {
	// this is a singleton class
	private Adapter() {}
	
	// just returning the results of the methods from Matrix class
	// which just have different names
	public static Matrix add(Matrix l, Matrix r) {
		return Matrix.plus(l, r);
	}

	public static Matrix sub(Matrix l, Matrix r) {
		return Matrix.minus(l, r);
	}
}
