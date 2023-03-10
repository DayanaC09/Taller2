import java.util.Scanner;

	public class Punto3 {
	    public static void main(String[] args) {
	        int capacidadAutobus = 45;
	        int personasApuntadas = obtenerNumeroPersonasApuntadas();
	        int autobusesNecesarios = personasApuntadas / capacidadAutobus;
	        int personasEnFurgonetas = personasApuntadas % capacidadAutobus;
	        System.out.println("Numero de autobuses necesarios: " + autobusesNecesarios);
	        System.out.println("Numero de personas en furgonetas: " + personasEnFurgonetas);
	    }

	    private static int obtenerNumeroPersonasApuntadas() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Introduce el numero de personas apuntadas: ");
	        return sc.nextInt();
	    }
	}