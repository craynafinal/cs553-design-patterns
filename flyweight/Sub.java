import java.io.*;

public class Sub implements Expr {
  private Expr left;
	private Expr right;

	public Sub(Expr left, Expr right) {
		this.left = left;
		this.right = right;
	}

  public void print (PrintStream out) {
    out.print(this);
  }

	public String toString() {
		return left + " - " + right;
	}
}
