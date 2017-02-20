import java.io.*;

public class Expr {
	private static String expr = "expression";

	public void print (PrintStream out) {
		out.print(expr);
	}

	public String toString() {
		return expr;
	}
}
