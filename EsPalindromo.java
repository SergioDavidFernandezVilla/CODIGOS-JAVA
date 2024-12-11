public class EsPalindromo {

    public boolean verificarPalidromo(String cadena){
        int inicio = 0;
        int fin = cadena.length() - 1;

        cadena = cadena.toLowerCase();

        while (inicio < fin) {
            if(cadena.charAt(inicio) != cadena.charAt(fin)){
                return false;
            }
            inicio++;
            fin--;
        }

        return true;
    }
}
