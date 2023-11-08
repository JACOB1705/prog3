/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carreracarro;

import javax.swing.JLabel;
import javax.swing.JOptionPane;


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
        
        int carro1 = 0;
        int carro2 = 0;
        int carro3 = 0;
        int carro4 = 0;
        
        while (true){
            try{
                
                sleep((int)(Math.random()*5000));
                carro1 = carro.getCarro1().getLocation().x;
                carro2 = carro.getCarro2().getLocation().x;
                carro3 = carro.getCarro3().getLocation().x;
                carro4 = carro.getCarro4().getLocation().x;
                
                if(carro2 < carro.getMeta().getLocation().x - 50 && carro1 < carro.getMeta().getLocation().x - 50 ){
                    tag.setLocation(tag.getLocation().x + 50, tag.getLocation().y );
                    carro.repaint();
                }else{
                    break;
                }
                
            }catch(InterruptedException e){
                System.out.println(e);
            }
             if(tag.getLocation().x >= carro.getMeta().getLocation().x - 50 ) {
                if (carro2 < carro1 && carro3 < carro1 && carro4 < carro1) {
                  JOptionPane.showMessageDialog(null,"Gano el primer carro");
                
                } else if(carro2 > carro1 && carro3< carro2 && carro4<carro2) {
                    JOptionPane.showMessageDialog(null,"Gano el segundo carro");
                } else if (carro3>carro1 && carro3>carro2 && carro3>carro4){
                    JOptionPane.showMessageDialog(null,"Gano el tercer carro");
                }else if (carro4>carro1 && carro4>carro2 && carro4>carro3){
                    JOptionPane.showMessageDialog(null,"Gano el cuarto carro");
             }else {
                    JOptionPane.showMessageDialog(null,"La carrera termino en empate");
                }
             }
        }
    }
}
