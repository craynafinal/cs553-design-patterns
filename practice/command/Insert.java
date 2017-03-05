public class Insert extends CommandIF {
	public void execute() {
		super.saveHistory();
		System.out.println("executing insert");
	}

	public void undo() {
		System.out.println("undoing insert");
	}

	public void redo() {
		System.out.println("redoing insert");
	}
}
