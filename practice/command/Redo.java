public class Redo implements CommandIF {
	public void execute() {
		throw new IllegalStateException("execute of redo");
	}

	public void undo() {
		throw new IllegalStateException("undo of redo");
	}

	public void redo() {
		throw new IllegalStateException("redo of redo");
	}
}
