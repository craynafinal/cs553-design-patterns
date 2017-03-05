public class Insert implements CommandIF {
	public void execute() {
		System.out.println("executing insert");
	}

	public void undo() {
		System.out.println("undoing insert");
	}

	public void redo() {
		System.out.println("redoing insert");
	}
}
