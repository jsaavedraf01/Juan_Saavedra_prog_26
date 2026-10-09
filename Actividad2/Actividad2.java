import java.util.Scanner;

public class Actividad2 {
	static Scanner sc = new Scanner(System.in);

	public static void ejercicio1() {
		System.out.println("Introduzca su nombre");
		String name = sc.nextLine();
		System.out.println("Bienvenido " + name);
	}

	public static void ejercicio2() {
		System.out.println("Introduzca el primer número");
		int nb1 = sc.nextInt();
		System.out.println("Introduzca el segundo número");
		int nb2 = sc.nextInt();
		System.out.println("La suma es " + (nb1 + nb2) + ", la resta es " + (nb1 - nb2) + ", la multiplicación es "
				+ (nb1 * nb2) + " y la división es " + (nb1 / nb2));
	}

	public static void ejercicio3() {
		System.out.println("Introduzca un número");
		int nb = sc.nextInt();
		System.out.println("La raíz cuadrada de " + nb + " es " + Math.sqrt(nb));
	}

	public static void ejercicio4() {
		System.out.println("Introduzca la base de la potencia");
		int base = sc.nextInt();
		System.out.println("Introduzca el exponente de la potencia");
		int exponent = sc.nextInt();
		System.out.println(base + " elevado a " + exponent + " es " + Math.pow(base, exponent));
	}

	public static void ejercicio5() {
		System.out.println("Introduzca el radio del círculo");
		int r = sc.nextInt();
		System.out.println("El área del círculo de radio " + r + " es " + (Math.PI * Math.pow(r, 2)));
	}

	public static void ejercicio6() {
		System.out.println("Introduzca el radio del círculo");
		int r = sc.nextInt();
		System.out.println("La longitud del círculo de radio " + r + " es " + (Math.PI * 2 * r));
	}

	public static void ejercicio7() {
		System.out.println("Introduzca la contraseña");
		String password = sc.nextLine();
		final String definedPassword = "password";
		if (definedPassword.equals(password))
			System.out.println("Contraseña correcta");
		else
			System.out.println("Contraseña incorrecta");
	}

	public static void ejercicio8() {
		System.out.println("Introduzca una frase");
		String sentence = sc.nextLine();
		System.out.println("La longitud de " + sentence + " es " + sentence.length() + ", su primera letra es "
				+ sentence.charAt(0) + " y su última letra es " + sentence.charAt(sentence.length() - 1));
	}

	public static void ejercicio9() {
		System.out.println("Introduzca una frase");
		String sentence = sc.nextLine();
		String friend = "Cadena no encontrada";
		if (sentence.indexOf("amigo") != -1)
			friend = sentence.substring(sentence.indexOf("amigo"), sentence.indexOf("amigo") + "amigo".length());
		System.out.println(friend);
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
		ejercicio9();
		// System.out.printf("Cadena"); // printf de C/C++
		// toUpperCase() y toLowerCase() para poner en mayusculas y en minusculas respectivamente
	}
}