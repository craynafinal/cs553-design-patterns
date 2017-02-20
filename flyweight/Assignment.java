import java.io.*;

public class Assignment extends Statement {
	private Expr left = null;
	private Expr right = null;

	public Assignment(Expr left, Expr right) {
		this.left = left;
		this.right = right;
	}

	public void print(PrintStream out, int indent) {
		printIndent(out, indent, left + " := " + right); 	
	}
}
