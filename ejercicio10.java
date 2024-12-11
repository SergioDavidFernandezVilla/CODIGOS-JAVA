import java.util.Arrays;

public class ejercicio10 {

    public static void main(String[] args) {
        OrdenarArreglo burbuja = new OrdenarArreglo();
        System.out.println("*** METODOS ORDENAMIENTO ***");

        try  {
            int[] ArregloInt = {5,3,1,6,4,2,1};
         
            System.out.println("Arreglo original: " + Arrays.toString(ArregloInt));

            burbuja.Burjuja(ArregloInt);

            System.out.println("Arreglo ordenado por Burbuja: " + Arrays.toString(ArregloInt));

            burbuja.Seleccion(ArregloInt);
            System.out.println("Arreglo ordenado por Seleccion: " + Arrays.toString(ArregloInt));

            System.out.println("PROGRAMA FINALIZADO");
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
