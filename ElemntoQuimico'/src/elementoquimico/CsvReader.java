package elementoquimico;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvReader {
    public static void leerElementosQuimicos(String archivoCsv, int n) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivoCsv))) {
            String linea;
            br.readLine(); 

            int count = 0;
            while ((linea = br.readLine()) != null && count < n) {
                String[] datos = linea.split(",");

                if (datos.length < 4) {
                    System.err.println("Línea malformada (menos de 4 campos): " + linea);
                    continue; 
                }

                try {
                    String atomicNumber = datos[0].trim();
                    String name = datos[1].trim();
                    String symbol = datos[2].trim();
                    String atomicMass = datos[3].trim();

                    System.out.println(atomicNumber + "," + name + "," + symbol + "," + atomicMass);
                } catch (NumberFormatException e) {
                    System.err.println("Error de formato en la línea: " + linea);
                }
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String archivoCsv = "src/Elementos.csv";
        int n = 118; 

        leerElementosQuimicos(archivoCsv, n);
    }
}