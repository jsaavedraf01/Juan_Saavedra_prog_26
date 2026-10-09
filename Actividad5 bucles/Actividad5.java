import java.util.Random;
import java.util.Scanner;

public class Actividad5 {
	public static Scanner sc = new Scanner(System.in);
	public static Random random = new Random();

	public static void ejercicio1() {
		int i = 1;
		while (i <= 100) {
			System.out.println(i);
			i++;
		}
		i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 100);
		for (i = 1; i <= 100; i++)
			System.out.println(i);
	}

	public static void ejercicio2() {
		System.out.println("Introduzca un valor positivo");
		int nb = sc.nextInt();
		if (nb < 1)
			System.out.println("Número no válido");
		for (int i = 1; i <= nb; i++)
			System.out.println(i);
	}

	public static void ejercicio3() {
		int suma = 0;
		float media = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println("Introduzca un número");
			int nb = sc.nextInt();
			suma += nb;
		}
		media = suma / 10;
		System.out.println("La suma es " + suma + " y la media es " + media);
	}

	public static void ejercicio4() {
		String name = "Juan";
		String tryName;
		do {
			System.out.println("Intenta adivinar mi nombre");
			tryName = sc.nextLine();
		} while (!name.equals(tryName));
		System.out.println("¡Bien hecho! Has adivinado mi nombre");
	}

	public static void ejercicio5() {
		String answer;
		int dice1;
		int dice2;
		do {
			dice1 = random.nextInt(1, 7);
			dice2 = random.nextInt(1, 7);
			if (dice1 == dice2)
				System.out.println("Ambos dados han sacado el mismo número");
			System.out.println("Desea repetir la tirada? Introduzca si o no");
			answer = sc.nextLine().toLowerCase();
		} while (answer.equals("si"));
	}

	public static void ejercicio6() {
		int nbOculto = 2000;
		int trynb;
		do {
			System.out.println("Intenta adivinar el número");
			trynb = sc.nextInt();
			if (trynb > nbOculto)
				System.out.println("menor");
			else if (trynb < nbOculto)
				System.out.println("mayor");
			else
				System.out.println("¡Muy bien!¡Has adivinado!");
		} while (nbOculto != trynb);
	}

	public static void ejercicio7() throws InterruptedException {
		System.out.println("Introduzca las horas");
		int h = sc.nextInt();
		System.out.println("Introduzca los minutos");
		int min = sc.nextInt();
		int s = 0;
		while (true) {
			Thread.sleep(1000);
			s++;
			if (s == 60) {
				s = 0;
				min++;
			}
			if (min >= 60) {
				min = min % 60;
				h++;
			}
			if (h >= 24)
				h = h % 24;
			System.out.println("Son las " + h + ":" + min + ":" + s);
		}
	}

	public static int fact(int nb)
	{
		if (nb == 1)
			return nb;
		return nb * fact(nb - 1);
	}
	public static void ejercicio8() {
		System.out.println("Introduzca el número cuyo factorial quiera calcular");
		int nb = sc.nextInt();
		int f = 1;
		for (int i = nb; i > 0; i--)
			f *= i;
		// int f = fact(nb);
		System.out.println("El factorial de " + nb + " es " + f);
	}

	public static void ejercicio9() {
		System.out.println("Introduzca la altura que quieras para la escalera");
		int height = sc.nextInt();
		if (height < 0)
			System.out.println("La altura no puede ser negativa");
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= i; j++)
				System.out.printf("*");
			System.out.println();
		}
		for (int i = 1, j = height; i <= height; i++, j--) {
			for (int k = 1; k <= j; k++)
				System.out.printf("*");
			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception {
		// ejercicio1();
		// ejercicio2();
		// ejercicio3();
		// ejercicio4();
		// ejercicio5();
		// ejercicio6();
		// ejercicio7();
		ejercicio8();
		// ejercicio9();
	}
}