import java.util.Scanner;


public class Punto1 {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Ingrese la base del triangulo");
			double base = sc.nextDouble();
			
			System.out.println("Ingrese la altura del triangulo");
			double altura = sc.nextDouble();
			
			double superficie = 0.5 * base * altura;
			
			System.out.println("La superficie del triangulo es: " + superficie);
			
	}

	}

}
