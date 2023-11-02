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
                if (datosUniversidad.length >= 10) { 
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
 public int[] departamentoele(){
        int aux[] = new int [6];
        int i=0;
        while (i<universidades.size()){
            Universidad temp = universidades.get(i);
            switch (temp.Departamento){
                case "BOGOTA D.C.":   aux[0]+=1;
                                break;
                case "CALDAS" :    aux[1]+=1;
                                    break;
                case "ANTIOQUIA":    aux[2]+=1;
                                        break;
                case "CAUCA":  aux[3]+=1;
                                        break;
                case "TOLIMA":  aux[4]+=1;
                                    break;
                case "SANTANDER":  aux[5]+=1;
                                break;
                default:    System.out.println("Error: La region "+temp.Departamento+" no esta dentro de las posibles.");
                            break;
            }
            i++;
        }
        return aux;
    }
}
