import java.util.Scanner;

public class LecData {
    private final List<Universidad> universidades;

    public  LecData() {
        universidades = new ArrayList<>();
        cargarUniversidadesDesdeArchivo();
    }
