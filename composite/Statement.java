import java.io.*;

public abstract class Statement {

	public abstract void print (PrintStream out, int indent);

	public void printIndent (PrintStream out, int indent, String text) {
		out.println();
		for (int i = 0; i < indent; i++)
			out.print("  ");

		out.print(text);
	}

}
