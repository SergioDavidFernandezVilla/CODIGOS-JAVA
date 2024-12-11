import java.util.Scanner;

public class ejercicio5 {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Promedio CalPromedio = new Promedio();

            System.out.println("*** PROMEDIO CALIFICACION ***");

            System.out.println("Ingrese el primera calificación: ");
            int numero1 = scanner.nextInt();

            System.out.println("Ingrese el segunda calificación: ");
            int numero2 = scanner.nextInt();

            System.out.println("Ingrese el tercera calificación: ");
            int numero3 = scanner.nextInt();

            System.out.println("El promedio es " + CalPromedio.CalcularPromedio(numero1, numero2, numero3));

            System.out.println("Programa finalizado");
        }
    }
}
