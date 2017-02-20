import java.io.*;

public class Assignment extends Statement {
	private String left = null;
	private Expr right = null;

	public Assignment(String left, Expr right) {
		this.left = left;
		this.right = right;
	}

	public void print(PrintStream out, int indent) {
		printIndent(out, indent, left + " := " + right); 	
	}
}
