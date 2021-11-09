package HW6;

import HW6.Comandos.*;

public class DemoCliente {

	public static void main (String [] args) {

		Invoker botones = new Invoker();
		Receiver robot = new Receiver();
		Command adelante = new MoveForward(robot, "15");
		Command atras = new MoveBack(robot, "15");
		Command derecha = new TurnRight(robot, "90");
		Command izquierda = new TurnLeft(robot, "90");

		comandoPulsado(botones, adelante);
		comandoPulsado(botones, izquierda);
		borrarPulsado(botones);

		comandoPulsado(botones, derecha);
		comandoPulsado(botones, adelante);
		comandoPulsado(botones, adelante);
		comandoPulsado(botones, adelante);
		borrarPulsado(botones);
		borrarPulsado(botones);

		comandoPulsado(botones, derecha);
		comandoPulsado(botones, adelante);
		comandoPulsado(botones, izquierda);
		comandoPulsado(botones, atras);
		comandoPulsado(botones, derecha);
		borrarPulsado(botones);

		comandoPulsado(botones, izquierda);

		goPulsado(botones);
	}

	private static void comandoPulsado(Invoker botones, Command command){
		botones.setCommand(command);
	}

	private static void borrarPulsado(Invoker botones) {
		botones.removeCommand();
	}

	private static void goPulsado(Invoker botones) {
		botones.executeCommands();
	}
}
