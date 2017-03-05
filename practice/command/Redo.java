public class Redo extends CommandIF {
	public void execute() {
		CommandIF last = super.popHistory();
		last.redo();
	}

	public void undo() {
		throw new IllegalStateException("undo of redo");
	}

	public void redo() {
		throw new IllegalStateException("redo of redo");
	}
}
