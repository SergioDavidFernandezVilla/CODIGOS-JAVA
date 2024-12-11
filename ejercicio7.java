import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        StringReversed stringReversed = new StringReversed();
        
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("*** PROGRAMA STRING INVERTIDO ***");

            System.out.println("Ingrese una palabra que desea: ");
            String cadena = scanner.nextLine();

            System.out.println("Cadena invertida: " + stringReversed.StringReversedGenerated(cadena));
            System.out.println("Cadena original: " + cadena);

            System.out.println("Programa finalizado");
        } catch (Exception e) {
            System.out.println("error " + e.getMessage());
        }
    }
}
