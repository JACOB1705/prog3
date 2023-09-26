    
/**
 *
 * @author Jacobo
 */

public class Asignatura {
    int codigo;
    String nombre;
    int semestre;
    int num_creditos;
    String horario;
    
     public Asignatura(int codigo, String nombre, int semestre, int num_creditos,
            String horario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.semestre = semestre;
        this.num_creditos = num_creditos;
        this.horario = horario;
    }

    public int getSemestre() {
        return semestre;
    }
    
    public int getNum_creditos() {
        return num_creditos;
    }

    public String getHorario() {
        return horario;
    }

 
}