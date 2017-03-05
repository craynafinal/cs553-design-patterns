public class History implements CommandIF {
	public void execute() {
		throw new IllegalStateException("execute of history");
	}

	public void undo() {
		throw new IllegalStateException("undo of history");
	}

	public void redo() {
		throw new IllegalStateException("redo of history");
	}
}
