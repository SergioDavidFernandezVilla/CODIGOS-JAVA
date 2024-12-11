import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("el numero " + numero + " es par");
        } else {
            System.out.println("El numero " + numero + " es impar");
        }

        System.out.println("Programa finalizado");

        scanner.close();
    }
}
