import java.util.Scanner;
import java.util.Stack;

public class Pilas2 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            Stack<Character> pila = new Stack<>();
            
            System.out.println("Ingrese la cadena: ");
            String cadena = scanner.nextLine();

            System.out.println("*** ORDEN INVERTIDO ***");

            for(char c : cadena.toCharArray()){
                pila.push(c);
            }

            StringBuilder reversa = new StringBuilder();

            while(!pila.isEmpty()){
                reversa.append(pila.pop());
            }

            System.out.println("Cadena original: " + cadena);
            System.out.println("Cadena invertida: " + reversa);

        } catch (Exception e) {
            System.err.println("Error " + e.getMessage());
        }

        System.out.println("PROGRAMA FINALIZADO");
    }
}
