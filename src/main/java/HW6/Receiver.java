package HW6;

public class Receiver {
	public void operation(String accion, String sentido, String cantidad) {
		if (accion.equals("mover")) {
			if (sentido.equals("delante")) {
				System.out.println("Mover hacia delante " + cantidad + "cm");
			}
			else if (sentido.equals("atras")) {
				System.out.println("Mover hacia atras " + cantidad + "cm");
			}
		}
		else if (accion.equals("girar")) {
			if (sentido.equals("derecha")) {
				System.out.println("Girar hacia la derecha " + cantidad + "º");
			}
			else if (sentido.equals("izquierda")) {
				System.out.println("Girar hacia la izquierda " + cantidad + "º");
			}
		}
	}
}
