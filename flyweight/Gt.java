import java.io.*;

public class Gt implements Expr {
	private Expr left;
	private Expr right;

	public Gt(Expr left, Expr right) {
		this.left = left;
		this.right = right;
	}

  public void print (PrintStream out) {
		out.print(this);
  }

	public String toString() {
		return left + " > " + right;
	}
}

