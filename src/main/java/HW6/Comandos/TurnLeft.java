package HW6.Comandos;

import HW6.Receiver;

public class TurnLeft implements Command{

	private Receiver reciver;
	private String param;

	public TurnLeft(Receiver reciver, String grados) {
		this.reciver = reciver;
		this.param = grados;
	}

	@Override
	public void execute() {
		reciver.operation("girar", "izquierda", param);
	}
}
