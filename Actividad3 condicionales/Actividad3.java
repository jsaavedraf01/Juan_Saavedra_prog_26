import java.util.Scanner;

public class Actividad3 {
	static Scanner sc = new Scanner(System.in);

	public static void ejercicio1() {
		System.out.println("Introduzca el primer número");
		int a = sc.nextInt();
		System.out.println("Introduzca el segundo número");
		int b = sc.nextInt();
		if (a > b)
			System.out.println("El primer número es mayor que el segundo número");
		else if (a < b)
			System.out.println("El segundo número es mayor que el primer número");
		else
			System.out.println("Ambos números son iguales");
	}

	public static void ejercicio2() {
		System.out.println("Introduzca un número");
		int nb = sc.nextInt();
		if (nb % 2 == 0)
			System.out.println("El número es par");
		else
			System.out.println("El número es impar");
	}

	public static void ejercicio3() {
		System.out.println("Introduzca el dividendo");
		int dividendo = sc.nextInt();
		System.out.println("Introduzca el divisor");
		int divisor = sc.nextInt();
		if (divisor == 0)
			System.out.println("No se puede dividir entre cero");
		else
			System.out.println(
					"El resultado de la división " + dividendo + "/" + divisor + " es " + (dividendo / divisor));
	}

	public static void ejercicio4() {
		System.out.println("Introduzca la base");
		int base = sc.nextInt();
		System.out.println("Introduzca el exponente");
		int exponent = sc.nextInt();
		if (exponent == 0)
			System.out.println("El resultado es 1");
		else
			System.out.println("El resultado es " + Math.pow(base, exponent));
	}

	public static void ejercicio5() {
		System.out.println("Introduzca el primer lado");
		int a = sc.nextInt();
		System.out.println("Introduzca el segundo lado");
		int b = sc.nextInt();
		System.out.println("Introduzca el tercer lado");
		int c = sc.nextInt();
		if (a == b && a == c)
			System.out.println("El triángulo es equilatero");
		else if (a == b || a == c || b == c) {
			System.out.println("El triángullo es isósceles");
		} else
			System.out.println("El triángulo es escaleno");
		if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) || Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)
				|| Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2))
			System.out.println("El triángulo es rectángulo");
	}

	public static void ejercicio6() {
		System.out.println("Introduzca el número de alumnos");
		int alumnos = sc.nextInt();
		switch (alumnos) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
				System.out.println("El viaje cuesta 2000€ y cada alumnos debe pagar " + (2000 / alumnos));
				break;
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
				System.out.println("EL viaje cuesta " + (alumnos * 56) + " y cada alumno debe pagar 56€");
				break;
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 35:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 41:
			case 42:
			case 43:
			case 44:
			case 45:
			case 46:
			case 47:
			case 48:
			case 49:
				System.out.println("El viaje cuesta " + (alumnos * 48) + " y cada alumno debe pagar 48€");
				break;
			default:
				System.out.println("El viaje cuesta " + (alumnos * 40) + " y cada alumno debe pagar 40€");
		}
		// if (alumnos < 20)
		// System.out.println("El viaje cuesta 2000€ y cada alumno debe pagar " + (2000
		// / alumnos));
		// else if (alumnos >= 20 && alumnos <= 29)
		// System.out.println("EL viaje cuesta " + (alumnos * 56) + " y cada alumno debe
		// pagar 56€");
		// else if (alumnos > 30 && alumnos <= 49)
		// System.out.println("El viaje cuesta " + (alumnos * 48) + " y cada alumno debe
		// pagar 48€");
		// else
		// System.out.println("El viaje cuesta " + (alumnos * 40) + " y cada alumno debe
		// pagar 40€");
	}

	public static void main(String[] args) throws Exception {
		// ejercicio1();
		// ejercicio2();
		// ejercicio3();
		// ejercicio4();
		// ejercicio5();
		ejercicio6();
	}
}