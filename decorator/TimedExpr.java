public class TimedExpr implements Expr {
	Expr expr;
	long time = -1;

	public TimedExpr(Expr expr) {
		this.expr = expr;
	}

	public int eval() {
		long beginTime = System.currentTimeMillis();
		int ret =  expr.eval();
		long endTime = System.currentTimeMillis();

		time = endTime - beginTime;
		return ret;
	}

	public long elapsed() {
		return time;
	}
}
