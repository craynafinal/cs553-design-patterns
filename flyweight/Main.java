public class Main {
	public static void main (String[] args) {
		/* expected result:
			begin
				fact = 1;
				while (n > 1) do
					begin
						fact := fact * n;
						n := n - 1
					end
			end
		*/

		Statement factorial = new Compound (
	    new Assignment (new Variable ("fact"), new Variable ("1")),
	    new While (new Gt (new Variable ("n"),
			       						 new Variable ("1")), new Compound (
     		new Assignment (new Variable ("fact"),
												new Mul (new Variable ("fact"),
					 							new Variable ("n"))),
	     	new Assignment (new Variable ("n"),
												new Sub (new Variable ("n"),
					 											 new Variable ("1"))))));

		// printing the result
		factorial.print(System.out, 0);
		System.out.println("\n");
	}
}
