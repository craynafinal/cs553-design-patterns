import java.io.*;

public class Conditional extends Statement {
	private Expr expr = null;
	private Statement thenStmt = null;
	private Statement elseStmt = null;

	public Conditional (Expr expr, Statement thenStmt, Statement elseStmt) {
		this.expr = expr;
		this.thenStmt = thenStmt;
		this.elseStmt = elseStmt;
	}

	public void print (PrintStream out, int indent) {
		// if (expr)
		printIndent(out, indent, "if " + expr);
		
		// then 
		printIndent(out, indent + 1, "then");
		thenStmt.print(out, indent + 2);

		// else
		printIndent(out, indent + 1, "else");
		elseStmt.print(out, indent + 2);
	}
}
