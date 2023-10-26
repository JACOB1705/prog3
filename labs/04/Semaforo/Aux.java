import static java.lang.Thread.sleep;
import java.awt.Color;
import javax.swing.*;

public class Aux implements Runnable {
    public boolean rep;
    public JButton rojo;
    public JButton amarillo;
    public JButton verde;
    public JTextField texto;
    public int num=0, temp1=0, temp2=0, temp3=0, temp4=0;
   
    public Aux(JButton entrada1, JButton entrada2, JButton entrada3, JTextField entrada4){
        this.rojo=entrada1;
        this.amarillo=entrada2;
        this.verde=entrada3;
        this.texto=entrada4;
    }
