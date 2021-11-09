package HW6.Comandos;

import HW6.Receiver;

public class MoveForward implements Command{

	private Receiver reciver;
	private String param;

	public MoveForward(Receiver reciver, String centimetros) {
		this.reciver = reciver;
		this.param = centimetros;
	}

	@Override
	public void execute() {
		reciver.operation("mover", "delante", param);
	}
}
