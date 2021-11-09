package HW6;

import HW6.Comandos.Command;

import java.util.ArrayList;

public class CommandsList {
	ArrayList<Command> commands = new ArrayList<>();

	public void addCommand(Command command) {
		commands.add(command);
	}

	public void removeCommand() {
		if (!commands.isEmpty())
			commands.remove(commands.size() - 1);
	}

	public Command getCommand() {
		if (commands.isEmpty()) return null;
		return commands.remove(0);
	}

	public boolean isEmpty() {
		return commands.isEmpty();
	}
}