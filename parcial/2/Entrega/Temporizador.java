import java.util.TimerTask;

public class Temporizador extends TimerTask {
    private String mensaje;

    public Temporizador(String mensaje) {
        this.mensaje = mensaje;
    }

    public void run() {
        System.out.println(); 
        System.out.println("Temporizador ha expirado: " + mensaje);
    }
}
