public class Undo implements CommandIF {
	public void execute() {
		throw new IllegalStateException("execute of undo");
	}

	public void undo() {
		throw new IllegalStateException("undo of undo");
	}

	public void redo() {
		throw new IllegalStateException("undo of redo");
	}
}
