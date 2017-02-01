import java.io.*;
import java.util.*;

public class While extends Statement {
	private Expr expr = null;
	private List<Statement> bodies = null;
	
	public While (Expr expr, Statement ... stmts) {
		this.expr = expr;
		this.bodies = new ArrayList<>();
		
		for (Statement s : stmts) {
			this.bodies.add(s);
		}
	}

	public void print (PrintStream out, int indent) {
		printIndent(out, indent, "while " + expr + " do");
		
		for (Statement s : bodies) {
			s.print(out, indent + 1);
		}
	}
}
