import java.util.Iterator;

public class ProgramaWhile {
	
	private static void functionWhile(int limite) {
		System.out.println("--- While ---");
		int contador = 0;
		while (contador <= limite) {
			System.out.println(contador);
			contador ++;
		}
	}
	
	private static void functionFor(int limite) {
		System.out.println("--- For ---");
		for (int i = 0; i <= limite; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		functionFor(10);
		functionWhile(10);
	}
	
}
