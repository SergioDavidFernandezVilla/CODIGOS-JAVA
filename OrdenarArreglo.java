public class OrdenarArreglo {

    public void Burjuja(int[] Arreglo){
        int n = Arreglo.length;

        for(int i = 0; i < n - 1; i++){

            // En cada pasada, comparamos cada par de elementos
            for(int j = 0; j < n - 1; j++){
                // Si el elemento actual es mayor que el siguiente, los intercambiamos
                if(Arreglo[j] > Arreglo[j + 1]){
                    // Intercambios
                    int tempo = Arreglo[j];
                    Arreglo[j] = Arreglo[j + 1];
                    Arreglo[j + 1] = tempo;
                }
            }
        }
    }


    public void Seleccion(int[] Arreglo){

        // Suponemos que el mínimo está en la posición actual
        int n = Arreglo.length;

        for(int i = 0; i < n - 1; i++){
            int IndiceMinimo = i;

            // Buscamos el elemento más pequeño en el resto del arreglo
            for(int j = i + 1; j < n; j++){

                if ( Arreglo[j] < Arreglo[IndiceMinimo] ) {
                    IndiceMinimo = j; // Actualizamos el índice del mínimo
                }

                // Intercambiamos el elemento más pequeño con el elemento actual
                int tempo = Arreglo[i];
                Arreglo[i] = Arreglo[IndiceMinimo];
                Arreglo[IndiceMinimo] = tempo;
            }
        }
    }
}
