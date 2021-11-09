package HW6.Comandos;

import HW6.Receiver;

public class TurnRight implements Command {

	private Receiver reciver;
	private String param;

	public TurnRight(Receiver reciver, String grados) {
		this.reciver = reciver;
		this.param = grados;
	}

	@Override
	public void execute() {
		reciver.operation("girar", "derecha", param);
	}
}
