import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LecData {
    private final List<Universidad> universidades;

    public  LecData() {
        universidades = new ArrayList<>();
        cargarUniversidadesDesdeArchivo();
    }
 private void cargarUniversidadesDesdeArchivo() {
        try (Scanner scanner = new Scanner(new File("datos.txt"))) {
            while (scanner.hasNextLine()) {
                String[] datosUniversidad = scanner.nextLine().split(",");
                if (datosTramo.length >= 10) { 
                    Universidad universidad = new Universidad(Integer.parseInt(datosUniversidad[1]), datosUniversidad[2], datosUniversidad[3]);
                    universidades.add(universidad);
                    System.out.println(datosUniversidad[1]+"a");
                } else {
                    System.out.println("La línea no cuenta con el espacio suficiente: " + Arrays.toString(datosUniversidad));
                }
            }
            String currentDirectory = System.getProperty("user.dir");
            System.out.println("a"+scanner.hasNextLine()+currentDirectory);
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo de departamentos: " + e.getMessage());
        }
    }
