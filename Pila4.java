/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Stack;


public class Main
{
	public static void main(String[] args) {
	   Stack<Integer> pila = new Stack<>();
	   int[] ListNum = {6,4,2,1,6,8};
	   
	   // Push: Agregar elementos del arreglo a la pila
	   for(int num : ListNum){
	       pila.push(num);
	   }
	   
	   System.out.println("Num: " + pila);
	   
	   int[] revertido = new int[ListNum.length];
	   int i = 0;
	   
	    // Pop: Sacar los elementos de la pila para invertir el orden
	   while(!pila.isEmpty()){
	       revertido[i++] = pila.pop();
	   }
	   
	   
	    // Mostrar el arreglo revertido
        System.out.print("Arreglo invertido: ");
	    for(int num : revertido){
	        System.out.println(num);
	    }
        
		System.out.println("PROGRAMA FINALIZADO");
	}
}