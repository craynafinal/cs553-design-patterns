public class History extends CommandIF {
	public void execute() {
		for (CommandIF c : super.getHistory()) {
			System.out.println(c);
		}
	}

	public void undo() {
		throw new IllegalStateException("undo of history");
	}

	public void redo() {
		throw new IllegalStateException("redo of history");
	}
}
