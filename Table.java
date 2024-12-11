import java.io.FileWriter;
import java.io.IOException;

public class Table {
        
            // Metodo para crear tabla
            public String GeneratedNumberTable(int InitialNumber){
                StringBuilder result = new StringBuilder();
                result.append("*** Tabla Multiplicación de ").append(InitialNumber).append(" ***\n");
        
                int values[] = {1,2,3,4,5,6,7,8,9,10};
                
        
                for(int i = 0; i < values.length; i++){
                 
                    result.append(InitialNumber).append(" x ").append(values[i]).append(" = ")
                    .append(InitialNumber * values[i]).append("\n");
        
                }

                return result.toString();
            }
        
            // Metodo para guardar la tabla generada en un archivo .txt
            public void SavedGeneratedTable(int InitialNumber){
                String filename = "table" + InitialNumber + ".txt";
                String TableContent = GeneratedNumberTable(InitialNumber);

                try(FileWriter write = new FileWriter(filename)){
                    write.write(TableContent);
                    System.out.println("Se ha cargado el archivo " + filename);
                }catch (IOException e) {
                    System.out.println("Error al cargar el archivo " + e.getMessage());
                }
            }
}
