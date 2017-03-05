public class Undo extends CommandIF {
	public void execute() {
		CommandIF last = super.popHistory();
		last.undo(); 
	}

	public void undo() {
		throw new IllegalStateException("undo of undo");
	}

	public void redo() {
		throw new IllegalStateException("undo of redo");
	}
}
