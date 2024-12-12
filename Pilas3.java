public class Pilas3 {

    public static void main(String[] args){
        OrdenarNumeroPila OrdenarArreglo = new OrdenarNumeroPila();

        try {
            int[] ArregloInt = {1,5,6,1,2};
            int[] resultado = OrdenarArreglo.SiguienteMayorNumero(ArregloInt);

                // Imprimir el resultado
                System.out.print("Resultado: ");
                for (int num : resultado) {
                    System.out.print(num + " ");
                }
            
            
                    } catch (Exception e) {
                        System.out.println("Error" + e.getMessage());
                    }
            
                    System.out.println("PROGRAMA FINALIZADO");
                }
}
