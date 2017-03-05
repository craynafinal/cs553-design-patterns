import java.util.*;

public class CommandManager {
	private Stack<CommandIF> stack = new Stack<>();

	public boolean execute(CommandIF command) {
		boolean result = false;

		if (command instanceof Undo) {
			CommandIF last = stack.pop();
			if (last != null) {
				last.undo();
				result = true;
			}
		} else if (command instanceof Redo) {
			CommandIF last = stack.pop();
			if (last != null) {
				last.redo();
				result = true;
			}
		} else if (command instanceof History) {
			System.out.println("printing history of size: " + stack.size());
			for (CommandIF c : stack)
				System.out.println(c);
			result = true;
		} else {
			stack.push(command);
			command.execute();
			result = true;
		}

		return result;
	}

	public static void main(String[] args) {
		List<CommandIF> commands = new ArrayList<>();
		commands.add(new Insert());
		commands.add(new Undo());
		commands.add(new Insert());
		commands.add(new Redo());
		commands.add(new History());
		commands.add(new Insert());
		commands.add(new Insert());
		commands.add(new History());

		CommandManager cm = new CommandManager();

		for (CommandIF c : commands) {
			cm.execute(c);
		}
	}
}
