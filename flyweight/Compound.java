import java.io.*;
import java.util.*;

public class Compound extends Statement {
	private List<Statement> bodies = null;

	// compound (begin ... end) may have multiple stmts
	public Compound (Statement ... stmts) {
		bodies = new ArrayList<>();
		
		for (Statement s : stmts) {
			bodies.add(s);
		}
	}

	public Compound (List<Statement> stmts) {
		bodies = stmts;
	}

	// print method overriding
	public void print (PrintStream out, int indent) {
		printIndent(out, indent, "begin");

		int i = 0;

		// check the order of print
		for (Statement s : bodies) {
			s.print(out, indent + 1);

			i++;

			if (i < bodies.size() - 1) {
				out.print(";");
			}
		}

		printIndent(out, indent, "end");
	}
}
