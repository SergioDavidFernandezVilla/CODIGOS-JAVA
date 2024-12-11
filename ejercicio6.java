import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args){
        int cantidad = 3;

        try (Scanner scanner = new Scanner(System.in)) {
            
            double[] calificaciones = new double[cantidad];
            double suma = 0;

            for (int i = 0; i < cantidad; i++) {
                System.out.println("Ingrese la calificacion " + (i + 1) + ":");
                calificaciones[i] = scanner.nextDouble();


                if (calificaciones[i] < 50 || calificaciones[i] > 100){
                    System.out.println("Por favor, ingrese un valor entre 50 a 100 de calificación");
                    i--;
                } else {
                    suma += calificaciones[i];
                }
            }

           double promedio = suma / cantidad;
           System.out.println("El promedio de las calificaciones es: " + promedio);

        } catch (Exception e) {
            System.out.println("error " + e.getMessage());
        }
    }
}
