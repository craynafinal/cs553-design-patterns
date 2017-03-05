import java.util.*;

public abstract class CommandIF {
	private static Stack<CommandIF> history = new Stack<>();

	protected void saveHistory() {
		history.push(this);
	}

	protected CommandIF popHistory() {
		return history.pop();
	}

	protected Stack<CommandIF> getHistory() {
		return history;
	}

	public abstract void execute();
	public abstract void undo();
	public abstract void redo();
}
