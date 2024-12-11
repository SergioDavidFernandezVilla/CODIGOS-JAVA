import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
        System.out.println("*** Palíndromo ***");
        EsPalindromo palindromo = new EsPalindromo();
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Ingrese la palabra que desea: ");
            String cadena = scanner.nextLine();

            if(palindromo.verificarPalidromo(cadena)){
                System.out.println("La palabra \"" + cadena + "\" es un palíndromo.");
            } else {
                System.out.println("La palabra \"" + cadena + "\" no es un palíndromo.");
            }

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
