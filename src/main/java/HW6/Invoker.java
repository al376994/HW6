package HW6;

import HW6.Comandos.Command;

public class Invoker {
	private final CommandsList listCommands = new CommandsList();

	public void setCommand(Command command) {
		listCommands.addCommand(command);
	}

	public void removeCommand() {
		listCommands.removeCommand();
	}

	public void executeCommands() {
		for (Command c = listCommands.getCommand(); c != null; c = listCommands.getCommand())
			c.execute();
	}
}
