public class Actividad8 {

	public static int suma(int a, int b) {
		return a + b;
	}

	public static void ejercicio1() {
		int a = 5;
		int b = 10;
		System.out.println("La suma es " + suma(a, b));
	}

	public static void holamundo() {
		System.out.println("Hola mundo!");
	}

	public static void ejercicio2() {
		holamundo();
	}

	public static void eco(int n) {
		for (int i = 1; i <= n; i++)
			System.out.println("ECO");
	}

	public static void ejercicio3() {
		eco(5);
	}

	public static void mostrarIntermedios(int a, int b) {
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		for (int i = min; i <= max; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}
	}

	public static void ejercicio4() {
		mostrarIntermedios(5, 8);
	}

	public static double areaCirculo(double r) {
		return (Math.PI * r * 2);
	}

	public static void ejercicio5() {
		double r = 5;
		double area = areaCirculo(r);
		System.out.println(area);
	}

	public static int max(int a, int b) {
		if (a > b)
			return a;
		return b;
	}

	public static void ejercicio6() {
		System.out.println(max(1, 5));
	}

	public static void main(String[] args) throws Exception {
		ejercicio1();
		ejercicio2();
		ejercicio3();
		ejercicio4();
		ejercicio5();
		ejercicio6();
	}
}