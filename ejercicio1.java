import java.util.*;

public class ejercicio1 {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        int resultado = 0;

        System.out.println("Welcome to Calculdora Basic");

        System.out.print("Opcion 1: Suma\n");
        System.out.print("Opcion 2: Multiplicacion\n");
        System.out.print("Opcion 3: Division\n");
        System.out.print("Opcion 4: Restar\n");

        System.out.print("Ingrese la opcion que desea: ");
        int opcion = scanner.nextInt();

        if(opcion >= 1 && opcion <= 4){
            System.out.println("Has ingresado una opcion valida!!!");


            System.out.println("Ingrese el primer numero: ");
            int numero1 = scanner.nextInt();

            System.out.println("Ingrese el segundo numero: ");
            int numero2 = scanner.nextInt();

        switch (opcion) {
            case 1:
                    System.out.println("Has elegido Suma...");
                    resultado = calculadora.Suma(numero1, numero2);
                    System.out.println("El resultado de su suma es: " + resultado);
                break;

            case 2:
                    System.out.println("Has elegido Multiplicacion...");
                    resultado = calculadora.Multiplicacion(numero1, numero2);
                    System.out.println("El resultado de su Multiplicacion es: " + resultado);
                break;

            case 3:
                System.out.println("Has elegido Division...");
                resultado = calculadora.Division(numero1, numero2);
                System.out.println("El resultado de su Division es: " + resultado);

                break;

            case 4:
                System.out.println("Has elegido Resta...");
                resultado = calculadora.Resta(numero1, numero2);
                System.out.println("El resultado de su Resta es: " + resultado);

                break;
            default:
                System.out.println("No se ingreso ningun numero valido");
        }
            
    } // FIN DEL IF
    else {
        System.out.println("No se ha ingresado ningun numero valido de opcion");
    }

        scanner.close();
    }
}
