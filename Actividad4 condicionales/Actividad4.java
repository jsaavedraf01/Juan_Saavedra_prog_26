import java.util.Scanner;

public class Actividad4 {
	public static Scanner sc = new Scanner(System.in);

	public static void ejercicio1() {
		System.out.println("Introduzca el número");
		int nb = sc.nextInt();
		if (nb % 3 == 0)
			System.out.println(nb + " es múltiplo de 3");
		else
			System.out.println(nb + " no es múltiplo de 3");
	}

	public static void ejercicio2() {
		System.out.println("Introduzca el primer número");
		int a = sc.nextInt();
		System.out.println("Introduzca el segundo número");
		int b = sc.nextInt();
		System.out.println("Introduzca el tercer número");
		int c = sc.nextInt();
		if (a > b) {
			if (c > a)
				System.out.println(c + " es el mayor número");
			else
				System.out.println(a + " es el mayor número");
		} else {
			if (c > b)
				System.out.println(c + " es el mayor número");
			else
				System.out.println(b + " es el mayor número");

		}
	}

	public static void ejercicio3() {
		System.out.println("Introduzca las horas");
		int h = sc.nextInt();
		System.out.println("Introduzca los minutos");
		int m = sc.nextInt();
		System.out.println("Introduzca los segundos");
		int s = sc.nextInt();
		if (h >= 0 && h < 24 && m >= 0 && m < 60 && s >= 0 && s < 60)
			System.out.println(h + ":" + m + ":" + s + " es una hora válida");
		else
			System.out.println(h + ":" + m + ":" + s + " no es una hora válida");
	}

	public static void ejercicio4() {
		System.out.println("Introduzca un número");
		int nb = sc.nextInt();
		switch (nb) {
			case 0:
				System.out.println("cero");
				break;
			case 1:
				System.out.println("uno");
				break;
			case 2:
				System.out.println("dos");
				break;
			case 3:
				System.out.println("tres");
				break;
			case 4:
				System.out.println("cuatro");
				break;
			case 5:
				System.out.println("cinco");
				break;
			case 6:
				System.out.println("seis");
				break;
			case 7:
				System.out.println("siete");
				break;
			case 8:
				System.out.println("ocho");
				break;
			case 9:
				System.out.println("nueve");
				break;
			case 10:
				System.out.println("diez");
				break;
			default:
				System.out.println("Error: número no válido");
				;
		}
	}

	public static void ejercicio5() {
		System.out.println("Introduzca un número en letras");
		String number = sc.nextLine().toLowerCase();
		if (number.equals("cero"))
			System.out.println("0");
		else if (number.equals("uno"))
			System.out.println("1");
		else if (number.equals("dos"))
			System.out.println("2");
		else if (number.equals("tres"))
			System.out.println("3");
		else if (number.equals("cuatro"))
			System.out.println("4");
		else if (number.equals("cinco"))
			System.out.println("5");
		else if (number.equals("seis"))
			System.out.println("6");
		else if (number.equals("siete"))
			System.out.println("7");
		else if (number.equals("ocho"))
			System.out.println("8");
		else if (number.equals("nueve"))
			System.out.println("9");
		else if (number.equals("diez"))
			System.out.println("10");
		// String[] numbers = { "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis",
		// "siete", "ocho", "nueve", "diez" };
		// for (int i = 0; i <= 10; i++) {
		// if (number.equals(numbers[i]))
		// System.out.println(i);
		// }

	}

	public static void ejercicio6() {
		System.out.println("Introduzca el número del mes");
		int nb = sc.nextInt();
		switch (nb) {
			case 1:
				System.out.println("Tiene 31 días y es enero");
				break;
			case 2:
				System.out.println("Tiene 28 días y es febrero");
				break;
			case 3:
				System.out.println("Tiene 31 días y es marzo");
				break;
			case 4:
				System.out.println("Tiene 30 días y es abril");
				break;
			case 5:
				System.out.println("Tiene 31 días y es mayo");
				break;
			case 6:
				System.out.println("Tiene 30 días y es junio");
				break;
			case 7:
				System.out.println("Tiene 31 días y es julio");
				break;
			case 8:
				System.out.println("Tiene 31 días y es agosto");
				break;
			case 9:
				System.out.println("Tiene 31 días y es septiembre");
				break;
			case 10:
				System.out.println("Tiene 31 días y es octubre");
				break;
			case 11:
				System.out.println("Tiene 31 días y es noviembre");
				break;
			case 12:
				System.out.println("Tiene 31 días y es diciembre");
				break;
			default:
				System.out.println("Error: número no válido");
		}
	}

	public static void ejercicio7() {
		int flag = 0;
		System.out.println("Introduzca la nota de la primera evaluación");
		float a = sc.nextFloat();
		System.out.println("Introduzca la nota de la segunda evaluación");
		float b = sc.nextFloat();
		System.out.println("Introduzca la nota de la tercera evaluación");
		float c = sc.nextFloat();
		if (a < 0 || a > 10 || b < 0 || b > 10 || c < 0 || c > 10) {
			System.out.println("Error: notas no válidas");
			return;
		}

		if (a < 5)
			flag += 1;
		if (b < 5)
			flag += 2;
		if (c < 5)
			flag += 4;
		switch (flag) {
			case 1:
				System.out.println("La primera evaluación está suspensa");
				break;
			case 2:
				System.out.println("La segunda evaluación está suspensa");
				break;
			case 3:
				System.out.println("La primera y la segunda evaluación están suspensas");
				break;
			case 4:
				System.out.println("La tercera evaluación está suspensa");
				break;
			case 5:
				System.out.println("La primera y la tercera evaluación están suspensas");
				break;
			case 6:
				System.out.println("La segunda y la tercera evaluación están suspensas");
				break;
			case 7:
				System.out.println("Las tres evaluaciones están suspensas");
				break;
			default:
				System.out.println("La nota media es " + ((a + b + c) / 3));
		}
	}

	public static void ejercicio8() {
		System.out.println("Introduzca las horas trabajadas");
		int nb = sc.nextInt();
		if (nb < 0)
			System.out.println("Error: número de horas no válida");
		else if (nb < 150)
			System.out.println("El sueldo es " + (nb * 10));
		else
			System.out.println("El sueldo es " + ((150 * 10) + (nb - 150) * 20));
	}

	public static void ejercicio9() {
		System.out.println("Introduzca el año");
		int nb = sc.nextInt();
		if (nb % 400 == 0 || (nb % 4 == 0 && nb % 100 != 0))
			System.out.println("El año es bisiesto");
		else
			System.out.println("El año no es bisiesto");
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
	}
}