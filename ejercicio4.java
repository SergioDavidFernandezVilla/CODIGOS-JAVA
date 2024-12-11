import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args){
        System.out.println("Generador Tabla Multiplicar");
        Scanner scanner = new Scanner(System.in);
        Table table = new Table();

        try {

            System.out.println("Ingrese un numero:");
            int num = scanner.nextInt();
            scanner.nextLine();

            if (num >= 1 && num <= 10){

               System.out.println(table.GeneratedNumberTable(num));

               System.out.println("¿Quieres guardarlo en un txt, la tabla ya generada? yes/no");
               String question = scanner.nextLine();
               
               if (question.equals("yes")){
                    table.SavedGeneratedTable(num);
               } else {
                 System.out.println("Ah bueno, master.");
               }
                
            } else {
                System.out.println("Ingrese un valor 1 a 10...");
            }

        } catch (Exception e) {
            System.out.println("Error: Ha ocurrido un error");

        } finally {
            scanner.close();
        }

    }
}
