public class Main {
	public static void main (String[] args) {
		/* expected result:
			begin
				fact := expression;
				while expression do
					begin
						fact := expression;
						n := expression
					end
			end
		*/

		Statement factorial = new Compound(
			new Assignment("fact", new Expr()),
			new While(new Expr(), new Compound(
				new Assignment("fact", new Expr()),
				new Assignment("n", new Expr()))));

		// printing the result
		factorial.print(System.out, 0);
		System.out.println("\n");		
	}
}
