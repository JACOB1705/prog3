/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carreracarro;

import javax.swing.JLabel;


/**
 *
 * @author Jacobo
 */
public class Carrera extends Thread{
    
    private JLabel tag;
    private Intcarro carro;

    
    public Carrera(JLabel tag, Intcarro carro) {
        this.tag = tag;
        this.carro = carro;
    }
    
    @Override
    public void run(){
        
        int carro1;
        int carro2;
        int carro3;
        int carro4;
        
        while (true){
            try{
                
                sleep((int)(Math.random()*1000));
                carro1 = carro.getCarro1().getLocation().x;
                carro2 = carro.getCarro2().getLocation().x;
                
                if(carro1 < carro.getMeta().getLocation().x - 200){
                    
                }
                
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
