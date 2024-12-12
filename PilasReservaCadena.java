import java.util.Stack;

public class PilasReservaCadena {

    public void CadenaReservePila(String cadena){
        Stack<Character> pila = new Stack();

        for(char c : cadena.toCharArray()){
            pila.push(c);
        }

        StringBuilder reversa = new StringBuilder();
        System.out.println("Reversa inicial: " + reversa);
        while (!pila.isEmpty()) { 
            reversa.append(pila.pop());
        }

        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena invertida: " + reversa);
    }

    public int InvertirNumero(int num){
        Stack<Integer> pila = new Stack<>();

        while(num > 0){
            pila.push(num % 10);
            num /= 10;
        }

        int result = 0;
        int multiplicacion = 1;

        while(!pila.isEmpty()){
            result += pila.pop() * multiplicacion;
            multiplicacion *= 10;
        }

        return result;
    }
}
