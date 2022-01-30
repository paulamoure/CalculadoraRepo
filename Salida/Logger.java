package Salida;

public class Logger {
	private final String OUTPUT = "Ha elegido la operación %s";

	public void log(String operacion) {
		String output = String.format(OUTPUT, operacion);
		System.out.println(output);
	}
}
