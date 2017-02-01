public class Main {
	public static void main (String[] args) {
		double [] [] 	e = {{1, 0}, {0, 1}},
									f = {{0, 1}, {20, 3}};

		// create new matrices using new operator
		Matrix a = new Matrix (e);
		Matrix b = new Matrix (f);

		// create a new matrix using the adapter method
		Matrix c = Adapter.add (a, b);
		c.print ();
		System.out.println ();
		Matrix d = Adapter.sub (a, b);
		d.print ();
	}
}
