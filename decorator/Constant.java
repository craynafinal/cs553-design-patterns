public class Constant implements Expr {
	private int val;

	public Constant(int val) {
		this.val = val;		
	}

	public int eval() {
		return val;
	}
}
