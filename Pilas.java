import java.util.Stack;
import java.util.Scanner;

public class Pilas {

    public static void main(String[] args){
        System.out.println("*** PILAS ***");
        Stack<Integer> pilas = new Stack<>();
        PilasReservaCadena pilanew = new PilasReservaCadena();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cadena: ");
        String cadena = scanner.nextLine();

        pilanew.CadenaReservePila(cadena);

        System.out.println("*** INVERTIR NUMERO ***");
        System.out.println("Ingrese un numero: ");
        int num = scanner.nextInt();
        System.out.println("Valor numero Invertido: " + pilanew.InvertirNumero(num));

        System.out.println("PROGRAMA FINALIZADO");
    }
}
