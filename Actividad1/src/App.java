import java.util.Scanner;
// import java.lang.Math;

public class App {
	public static void ejercicio1() {
		System.out.println("Introduce tu nombre");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Bienvenido, " + name);
		sc.close();
	}

	public static void ejercicio2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String name = sc.nextLine();
		System.out.println("Introduce tu edad");
		int age = sc.nextInt();
		System.out.println("Introduce tu correo electrónico");
		String email = sc.next();
		System.out.println("Bienvenido, " + name + ", de " + age + " años y con email " + email);
		sc.close();
	}

	public static void ejercicio3() {
		System.out.println("Tree\t\tÁrbol");
		System.out.println("English\t\tInglés");
		System.out.println("Gray\t\tGris");
		System.out.println("Godfather\tPadrino");
		System.out.println("Warrior\t\tGuerrero");
		System.out.println("Family\t\tFamilia");
		System.out.println("Kingdom\t\tReino");
		System.out.println("Blackboard\tPizarra");
		System.out.println("Sword\t\tEspada");
		System.out.println("Stone\t\tPiedra");
	}

	public static void ejercicio4() {
		System.out.println("Lunes\tMartes\tMiércoles\tJueves\tViernes");
		System.out.println("IPE\tPGRMC\tENTDL\t\tSSINF\tLMSGI");
		System.out.println("SSINF\tPGRMC\tENTDL\t\tSSINF\tLMSGI");
		System.out.println("SSINF\tBBDD\tBBDD\t\tPGRMC\tPGRMC");
		System.out.println("ENTDL\tBBDD\tBBDD\t\tPGRMC\tPGRMC");
		System.out.println("LMSGI\tIP\tSSINF\t\tIP\tBBDD");
		System.out.println("LMSGI\tIPE\tPGRMC\t\tIPE\tBDD");
	}

	public static void ejercicio5() {
		System.out.println("    *    ");
		System.out.println("   ***   ");
		System.out.println("  *****  ");
		System.out.println(" ******* ");
		System.out.println("*********");
	}

	public static void ejercicio6() {
		System.out.println("    *    ");
		System.out.println("   * *   ");
		System.out.println("  *   *  ");
		System.out.println(" *     * ");
		System.out.println("*********");
	}

	public static void ejercicio7() {
		System.out.println("*********");
		System.out.println(" *     * ");
		System.out.println("  *   *  ");
		System.out.println("   * *   ");
		System.out.println("    *    ");
	}

	public static void main(String[] args) throws Exception {
		// ejercicio1();
		// ejercicio2();
		ejercicio3();
		ejercicio4();
		ejercicio5();
		ejercicio6();
		ejercicio7();

		// double random = Math.random();
		// System.out.println(random);
		// System.out.println("Bienvenidos");
		// Scanner sc = new Scanner(System.in);
		// String input = sc.nextLine();
		// System.out.println(input);
		// int number = sc.nextInt();
		// System.out.println(number);
		// sc.close();
	}
}
