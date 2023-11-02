/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carreracarro;

import javax.swing.JLabel;

/**
 *
 * @author Estudiante
 */
public class Carrera extends Thread{
    private JLabel con;
    private Intcarro i;
    
    public Carrera(JLabel con,Intcarro i){
        this.con=con;
        this.i=i;
    }
    
}
