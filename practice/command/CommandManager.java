import java.util.*;

public class CommandManager {
	private Stack<CommandIF> stack = new Stack<>();

	public void execute(CommandIF command) {
		if (command instanceof Undo) {

		} else if (command instanceof Redo) {

		} else if (command instanceof History) {

		}
	}
}
