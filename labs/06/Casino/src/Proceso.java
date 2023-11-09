import java.awt.Dimension;
import java.util.Timer;
import javax.swing.*;
import java.awt.*;
import java.util.TimerTask;

/**
 *
 * @author Jacobo
 */
public class Proceso {
    private Timer tiempo ;
    private TimerTask task;
    private int speed = 60;
    private int frame=1;
    boolean run = false;
    private int im;
    
    
    public Proceso(Dimension d){        
        this.setSize(d);
    }  
    
    public void setimage(int n){ 
        int b = ((int)(Math.random()*9)+1);
      
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icono" + b + ".jpg"))); 
        setim(b);
    }
    
    public void setvelocidad(int v){
        this.speed= v;        
    }
  
  
}


