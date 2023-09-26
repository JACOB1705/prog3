
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Jacobo
 */
public class Lab0301 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese codigo de estudiante: ");
        String Codigo = scanner.nextLine();

        System.out.print("Ingrese su nombre: ");
        String Nombre = scanner.nextLine();

        System.out.print("Ingrese su correo institucional: ");
        String Correo = scanner.nextLine();

        System.out.print("Ingrese el semestre actal: ");
        int Semestre = scanner.nextInt();

        Estudiante estudiante = new Estudiante(Codigo, Nombre, Correo, Semestre);

       
        List<Asignatura> asignaturasDisponibles = CargarAsignaturasDesdeArchivo("Asignaturas.txt");

        
        while (true) 
        {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Registrar asignatura");
            System.out.println("2. Mostrar asignaturas");
            System.out.println("3. Generar lista en archivo");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opcion: ");

            int Opcion = scanner.nextInt();

            switch (Opcion) 
            {
                case 1 -> {
                    System.out.println("Asignaturas disponibles:");
                    for (int i = 0; i < asignaturasDisponibles.size(); i++) 
                    {
                        System.out.println(i + 1 + ". " + asignaturasDisponibles.get(i));
                    }
                    System.out.print("Seleccione el numero de asignatura que va a cursar: ");
                    int NumeroAsignatura = scanner.nextInt();
                    
                    if (NumeroAsignatura >= 1 && NumeroAsignatura <= asignaturasDisponibles.size()) 
                    {
                        Asignatura asignaturaSeleccionada = asignaturasDisponibles.get(NumeroAsignatura - 1);
                        estudiante.registrarAsignatura(asignaturaSeleccionada);
                    } else 
                    {
                        System.out.println("Numero de asignatura no válido.");
                    }
                }
                    case 2 -> estudiante.MostrarReporte();
                    case 3 -> estudiante.GenerarReporteArchivo("reporte_asignaturas.txt");
                    case 4 -> {
                    System.out.println("operacion finalizada");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Opcion no valida.");
            }
        }
    }


    
}