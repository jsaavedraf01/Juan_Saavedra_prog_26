import java.util.Scanner;

public class Actividad6 {
	static Scanner sc = new Scanner(System.in);

	public static void ejercicio1() {
		System.out.println("Introduzca un número");
		int nb = sc.nextInt();
		for (int i = 1; i <= nb; i++) {
			for (int j = 1; j <= nb; j++)
				System.out.printf("%d", j);
			System.out.println();
		}
	}

	public static void ejercicio2() {
		System.out.println("Introduzca un número");
		int nb = sc.nextInt();
		for (int i = 1; i <= nb; i++) {
			for (int j = nb; j >= 1; j--)
				System.out.printf("%d", j);
			System.out.println();
		}
	}

	public static void ejercicio3() {
		System.out.println("Introduzca un número");
		int nb = sc.nextInt();
		for (int i = 1; i <= nb; i++) {
			for (int j = 1; j <= i; j++)
				System.out.printf("%d", j);
			System.out.println();
		}
	}

	public static void ejercicio4() {
		for (int i = 100; i >= 0; i -= 7) {
			System.err.println(i);
		}
	}

	public static void ejercicio5() {
		System.out.println("¿Cuántos números quieres leer?");
		int nb = sc.nextInt();
		double result = 0;
		for (int i = 1; i <= nb; i++) {
			System.out.println("Introduzca un número");
			int num = sc.nextInt();
			result += num;
		}
		result /= nb;
		System.out.println("La media es " + result);
	}

	public static void ejercicio6() {
	}

	public static void ejercicio7() {
	}

	public static void ejercicio8() {
	}

	public static void ejercicio9() {
	}

	public static void ejercicio10() {
	}

	public static void ejercicio11() {
	}

	public static void ejercicio12() {
	}

	public static void ejercicio13() {
	}

	public static void main(String[] args) throws Exception {
		// ejercicio1();
		// ejercicio2();
		// ejercicio3();
		// ejercicio4();
		ejercicio5();
		// ejercicio6();
		// ejercicio7();
		// ejercicio8();
		// ejercicio9();
		// ejercicio10();
		// ejercicio11();
		// ejercicio12();
		// ejercicio13();
	}
}