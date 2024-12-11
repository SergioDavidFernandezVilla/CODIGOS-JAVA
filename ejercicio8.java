import java.util.Random;
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        System.out.println("*** SUMA MATRICES ***");
        Random random = new Random();
        int suma = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el total de columnas: ");
            int TotalColumnas = scanner.nextInt();

            System.out.println("Ingrese el total de renglones: ");
            int TotalRenglones = scanner.nextInt();

            if (TotalColumnas < 0 || TotalRenglones < 0) {
                System.out.println("Por favor.. Ingrese valores positivos");
            }

            int[][] Matriz = new int[TotalColumnas][TotalRenglones]; 

            // Rellenar Matriz con numeros random
            for(int i = 0; i < TotalColumnas; i++){
                for(int j = 0; j < TotalRenglones; j++){
                    Matriz[i][j] = random.nextInt(100);
                    suma += Matriz[i][j];
                }
            }

            // Imprimir matriz
            System.out.println("MATRIZ GENERADA");
            for(int i = 0; i < TotalColumnas; i++){
                for(int j = 0; j < TotalRenglones; j++){
                    System.out.print(Matriz[i][j] + "\t");
                }
                System.out.println();
            }
            
            System.out.println("La suma de la matriz es: " + suma);
            System.out.println("programa finalizado");
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
