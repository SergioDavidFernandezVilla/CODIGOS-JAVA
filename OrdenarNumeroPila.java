import java.util.Stack;

public class OrdenarNumeroPila {
    // Recorremos de derecha a izquierda
    public int[] SiguienteMayorNumero(int[] arr) {
        int ListNum = arr.length;
        int[] result = new int[ListNum];
        Stack<Integer> pila = new Stack();
        
        for(int i = ListNum - 1; i >= 0; i--){
            // Eliminar elementos menores o iguales al actual
            while(!pila.isEmpty() && pila.peek() <= arr[i]){
                pila.pop();
            }

            // Si la pila está vacía, no hay mayor elemento a la derecha
            result[i] = pila.isEmpty() ? -1 : pila.peek();

            // Agregar el elemento actual a la pila
            pila.push(arr[i]);
        }

        return result;
    }
}
