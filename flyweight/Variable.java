import java.io.*;

public class Variable implements Expr {
  private String var;

	public Variable(String var) {
		this.var = var;
	}

  public void print (PrintStream out) {
    out.print(var);
  }

  public String toString() {
    return var;
  }
}
