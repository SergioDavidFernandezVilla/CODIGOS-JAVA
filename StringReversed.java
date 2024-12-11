public class StringReversed {

    public String StringReversedGenerated(String cadena){

        String cadenaInvertida = new StringBuilder(cadena).reverse().toString();

        return cadenaInvertida;
    }

    public String CountCharGenerated(String cadena){

        System.out.println("*** Contador de letras ***");

        for(int i = 0; i < cadena.length(); i++){
            System.out.println("Valor : " + i);
        }

        return cadena;
    }
}