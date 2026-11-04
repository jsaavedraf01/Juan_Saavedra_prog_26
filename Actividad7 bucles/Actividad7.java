import java.util.Random;
import java.util.Scanner;

public class Actividad7 {
	public static Scanner sc = new Scanner(System.in);
	public static Random random = new Random();

	public static void ejercicio1() {
		int positivos = 0;
		int negativos = 0;
		int ceros = 0;
		int pares = 0;
		int impares = 0;
		System.out.println("Introduzca la cantidad de numeros que quiera introducir");
		int count = sc.nextInt();
		for (int i = 0; i < count; i++) {
			System.out.println("Introduzca un número");
			int nb = sc.nextInt();
			if (nb > 0)
				positivos++;
			else if (nb < 0)
				negativos++;
			else
				ceros++;
			if (nb % 2 == 0)
				pares++;
			else
				impares++;
		}
		System.out.println("Hay " + positivos + " positivos, " + negativos + " negativos, " + ceros + " ceros, " + pares
				+ " pares y " + impares + " impares");
	}

	public static void ejercicio2() {
		System.out.println("Introduzca un número");
		int nb = sc.nextInt();
		for (int i = 1; i <= 10; i++)
			System.out.println(i + "x" + nb + "=" + (nb * i));
	}

	public static void ejercicio3() {
		String c;
		do {
			System.out.println("Introduzca C para pasar de C a F, F para pasar de F a C");
			c = sc.nextLine();
			if (c.equals("C")) {
				System.out.println("Introduzca grados Celsius");
				double Celsius = sc.nextInt();
				double Fahrenheit = (Celsius * 1.8) + 32;
				System.out.println(Celsius + "ºC son " + Fahrenheit + "F");
			} else if (c.equals("F")) {
				System.out.println("Introduzca grados Celsius");
				double Fahrenheit = sc.nextInt();
				double Celsius = (Fahrenheit - 32) / 1.8;
				System.out.println(Fahrenheit + "F son " + Celsius + "ºC");
			}
		} while (!c.equals("C") && !c.equals("F"));
	}

	public static void ejercicio4() {
		System.out.println("Introduzca un número positivo");
		int nb = sc.nextInt();
		int result = 0;
		for (int i = 1; i < nb; i++) {
			if (nb % i == 0)
				result++;
		}
		if (nb == result)
			System.out.println(nb + " es un número perfecto");
	}

	public static boolean primo(int p) {
		boolean flag = true;
		if (p % 2 == 0)
			flag = false;
		for (int i = 3; i < (int) Math.sqrt(p); i += 2) {
			if (p % i == 0)
				flag = false;
		}
		return flag;
	}

	public static void ejercicio5() {
		System.out.println("Introduzca un número positivo");
		int nb = sc.nextInt();
		int result = 0;
		for (int i = 2; i < nb; i++) {
			if (primo(nb)) {
				result++;
			}
		}
		System.out.println("La suma es " + result);
	}

	public static void ejercicio6() {
		int saldo = 100;
		boolean play = false;
		do {
			int bet;
			do {
				System.out.println("Introduzca la cantidad a apostar");
				bet = sc.nextInt();
			} while (bet < 1 || bet > saldo);
			boolean result = random.nextBoolean();
			if (result)
				saldo += bet;
			else
				saldo -= bet;
			System.out.println("Su saldo es " + saldo + ", ¿Quieres seguir jugando? S o N");
			String next = sc.nextLine();
			if (next.equals("S"))
				play = true;
			else
				play = false;
		} while (play && saldo > 0);
	}

	public static void ejercicio7() {
		int sum = 0;
		for (int i = 1; i <= 15; i++) {
			String c = "1";
			do {
				if (!(c.equals("2") || c.equals("1") || c.equals("X")))
					System.out.println("ERROR");
				System.out.println("Introduzca 1, X o 2");
				c = sc.nextLine();
			} while (!(c.equals("2") || c.equals("1") || c.equals("X")));
			int result = random.nextInt(1, 4);
			switch (result) {
				case 1:
					if (c.equals("1")) {
						System.out.println("Resultado: 1, Tu apuesta: " + c + ". Has acertado!!!");
						sum++;
					}

					else
						System.out.println("Resultado: 1, Tu apuesta: " + c + ". Has fallado");
					break;
				case 2:
					if (c.equals("X")) {
						System.out.println("Resultado: X, Tu apuesta: " + c + ". Has acertado!!!");
						sum++;
					}
					else
						System.out.println("Resultado: X, Tu apuesta: " + c + ". Has fallado");
					break;
				case 3:
					if (c.equals("2")) {
						System.out.println("Resultado: 2, Tu apuesta: " + c + ". Has acertado!!!");
						sum++;
					}
					else
						System.out.println("Resultado: 2, Tu apuesta: " + c + ". Has fallado");
					break;
			}
		}
		System.out.println("Has acertado " + sum);
		if (sum == 15)
			System.out.println("Has acertado el Pleno");
		else
			System.out.println("NO has acertado el Pleno");
	}

	public static void ejercicio8() {
		System.out.println("Introduzca una cadena");
		String cadena = sc.nextLine();
		cadena = cadena.toLowerCase();
		for (int i = 0; i < cadena.length(); i++) {
			if (i == 0 || cadena.charAt(i - 1) == ' ')
				System.out.print(Character.toUpperCase(cadena.charAt(i)));
			else if (cadena.charAt(i) != ' ')
				System.out.print(cadena.charAt(i));
		}
	}

	public static void main(String[] args) throws Exception {
		// ejercicio1();
		// ejercicio2();
		// ejercicio3();
		// ejercicio4();
		// ejercicio5();
		// ejercicio6();
		ejercicio7();
		// ejercicio8();
	}
}