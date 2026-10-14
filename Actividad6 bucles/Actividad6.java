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
			System.out.println(i);
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
		System.out.println("Introduzca un número");
		int nb = sc.nextInt();
		if (nb < 2) {
			System.out.println("Número no válido");
			return;
		}
		if (nb % 2 == 0) {
			System.out.println(nb + "no es primo");
			return;
		}
		for (int i = 3; i <= Math.sqrt(nb); i += 2) {
			if (nb % i == 0) {
				System.out.println(nb + " no es primo");
				return;
			}
		}
		System.out.println(nb + " es primo");
	}

	public static void ejercicio7() {
		System.out.println(
				"Introduzca varios números. Introduzca el 0 para salir. El 0 no será incluido entre los números");
		int nb = sc.nextInt();
		int max = nb;
		int min = nb;
		double result = 0;
		int count = 0;
		while (nb != 0) {
			if (nb > max)
				max = nb;
			if (nb < min)
				min = nb;
			result += nb;
			count++;
			nb = sc.nextInt();
		}
		if (count != 0)
			result /= count;
		System.out.println("El máximo es " + max + ", el mínimo es " + min + " y la media es " + result);
	}

	public static void ejercicio8() {
		int option;
		do {
			System.out.println("Introduzca una opción del menú");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Es primo");
			System.out.println("6. Salir");
			option = sc.nextInt();
			while (option < 1 || option > 6) {
				System.out.println("Opción no válida. Introduzca una opción válida");
				option = sc.nextInt();
			}
			switch (option) {
				case 1:
					System.out.println("Introduzca el primer número");
					int a = sc.nextInt();
					System.out.println("Introduzca el segundo número");
					int b = sc.nextInt();
					System.out.println("El resultado es " + (a + b));
					break;
				case 2:
					System.out.println("Introduzca el primer número");
					int c = sc.nextInt();
					System.out.println("Introduzca el segundo número");
					int d = sc.nextInt();
					System.out.println("El resultado es " + (c - d));
					break;
				case 3:
					System.out.println("Introduzca el primer número");
					int e = sc.nextInt();
					System.out.println("Introduzca el segundo número");
					int f = sc.nextInt();
					System.out.println("El resultado es " + (e * f));
					break;
				case 4:
					System.out.println("Introduzca el primer número");
					int g = sc.nextInt();
					System.out.println("Introduzca el segundo número");
					int h = sc.nextInt();
					if (h != 0)
						System.out.println("El resultado es " + (g / h));
					else
						System.out.println("No se puede dividir por 0");
					break;
				case 5:
					System.out.println("Introduzca el primer número");
					int p = sc.nextInt();
					boolean flag = true;
					if (p % 2 == 0)
						flag = false;
					for (int i = 3; i < (int) Math.sqrt(p); i += 2) {
						if (p % i == 0)
							flag = false;
					}
					if (flag)
						System.out.println("El número es primo");
					else
						System.out.println("El número no es primo");
					break;
				case 6:
					System.out.println("Adiós. Hasta la próxima");
					break;
				default:
					break;
			}
		} while (option != 6);
	}

	public static void ejercicio9() {
		System.out.println("Introduzca su DNI sin la letra");
		int dni = sc.nextInt();
		int dniLetter = dni % 23;
		switch (dniLetter) {
			case 0:
				System.out.println("T");
				break;
			case 1:
				System.out.println("R");
				break;
			case 2:
				System.out.println("W");
				break;
			case 3:
				System.out.println("A");
				break;
			case 4:
				System.out.println("G");
				break;
			case 5:
				System.out.println("M");
				break;
			case 6:
				System.out.println("Y");
				break;
			case 7:
				System.out.println("F");
				break;
			case 8:
				System.out.println("P");
				break;
			case 9:
				System.out.println("D");
				break;
			case 10:
				System.out.println("X");
				break;
			case 11:
				System.out.println("B");
				break;
			case 12:
				System.out.println("N");
				break;
			case 13:
				System.out.println("J");
				break;
			case 14:
				System.out.println("Z");
				break;
			case 15:
				System.out.println("S");
				break;
			case 16:
				System.out.println("Q");
				break;
			case 17:
				System.out.println("V");
				break;
			case 18:
				System.out.println("H");
				break;
			case 19:
				System.out.println("L");
				break;
			case 20:
				System.out.println("C");
				break;
			case 21:
				System.out.println("K");
				break;
			case 22:
				System.out.println("E");
				break;
			default:
				break;
		}
	}

	public static void ejercicio10() {
		String vocals = "aeiou";
		System.out.println("Introduzca una cadena");
		String input = sc.nextLine();
		int nbVocals = 0;
		for (int i = 0; i < input.length(); i++) {
			if (vocals.contains(String.valueOf(input.charAt(i))))
				nbVocals++;
		}
		System.out.println("La cadena tiene " + nbVocals + " vocales");
	}

	public static void ejercicio11() {
		int i = 4;
		String password = "1111";
		do {
			System.out.println("Introduzca una contraseña de 4 cifras");
			String PasswordTry = sc.nextLine();
			if (password.equals(PasswordTry)) {
				System.out.println("¡Has acertado!");
				break;
			}
			i--;
			System.out.println("Te quedan " + i + " intentos");
		} while (i > 0);
		if (i == 0)
			System.out.println("Has agotado todas las oportunidades");
		else
			System.out.println("Has abierto la caja fuerte");
	}

	public static void ejercicio12() {
		System.out.println("Introduzca el primer número");
		int a = sc.nextInt();
		System.out.println("Introduzca el segundo número");
		int b = sc.nextInt();
		int aDivSum = 1;
		int bDivSum = 1;
		for (int i = 2; i < Math.max(a, b); i++) {
			if (i < a && a % i == 0)
				aDivSum += i;
			if (i < b && b % i == 0)
				bDivSum += i;
		}
		System.out.println(aDivSum + " y " + bDivSum);
		if (a == b)
			System.out.println("Ambos son el mismo número");
		else if (aDivSum == b && bDivSum == a)
			System.out.println(a + " y " + b + " son números amigos");
		else
			System.out.println(a + " y " + b + " no son números amigos");
	}

	public static int fibonacci(int nb) {
		int fb = -1;
		if (nb == 1)
			fb = 0;
		else if (nb == 2) {
			fb = 1;
			fibonacci(nb - 1);
		} else if (nb > 2)
			fb = fibonacci(nb - 1) + fibonacci(nb - 2);
		if (fb == -1)
			System.out.println("Error: Número no válido");
		else
			System.out.println(fb);
		return fb;
	}

	public static void ejercicio13() {
		int firstFibonacci = 0;
		int secondFibonacci = 1;
		System.out.println("Introduzca el número de elementos que quieras conocer");
		int nb = sc.nextInt();
		if (nb >= 1)
			System.out.println(firstFibonacci);
		if (nb >= 2)
			System.out.println(secondFibonacci);
		for (int i = 3; i <= nb; i++) {
			int temp = firstFibonacci;
			firstFibonacci = secondFibonacci;
			secondFibonacci = temp + firstFibonacci;
			System.out.println(secondFibonacci);
		}
		// fibonacci(nb);
	}

	public static void main(String[] args) throws Exception {
		// ejercicio1();
		// ejercicio2();
		// ejercicio3();
		// ejercicio4();
		// ejercicio5();
		// ejercicio6();
		// ejercicio7();
		// ejercicio8();
		// ejercicio9();
		// ejercicio10();
		// ejercicio11();
		// ejercicio12();
		ejercicio13();
	}
}