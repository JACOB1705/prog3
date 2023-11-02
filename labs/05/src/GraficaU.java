/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.*;
import java.awt.BorderLayout;
import java.io.File;
import java.io.IOException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
/**
 *
 * @author Jacobo
 */
public class GraficaU extends javax.swing.JFrame {
 boolean generado = false;
    JFreeChart barrasexp;
    JFreeChart pastelexp;
    /**
     * Creates new form GraficaU
     */
    LecData lectura = new LecData();
    public GraficaU() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CALDAS = new javax.swing.JRadioButton();
        BOGOTA = new javax.swing.JRadioButton();
        ANTIOQUIA = new javax.swing.JRadioButton();
        CAUCA = new javax.swing.JRadioButton();
        TOLIMA = new javax.swing.JRadioButton();
        SANTANDER = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        botongrafica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Graficadora  matriculas universitarias por departamento ");

        CALDAS.setBackground(new java.awt.Color(51, 51, 51));
        CALDAS.setForeground(new java.awt.Color(255, 255, 255));
        CALDAS.setText("CALDAS");

        BOGOTA.setBackground(new java.awt.Color(51, 51, 51));
        BOGOTA.setForeground(new java.awt.Color(255, 255, 255));
        BOGOTA.setText("BOGOTA D.C.");

        ANTIOQUIA.setBackground(new java.awt.Color(51, 51, 51));
        ANTIOQUIA.setForeground(new java.awt.Color(255, 255, 255));
        ANTIOQUIA.setText("ANTIOQUIA");

        CAUCA.setBackground(new java.awt.Color(51, 51, 51));
        CAUCA.setForeground(new java.awt.Color(255, 255, 255));
        CAUCA.setText("CAUCA");

        TOLIMA.setBackground(new java.awt.Color(51, 51, 51));
        TOLIMA.setForeground(new java.awt.Color(255, 255, 255));
        TOLIMA.setText("TOLIMA");

        SANTANDER.setBackground(new java.awt.Color(51, 51, 51));
        SANTANDER.setForeground(new java.awt.Color(255, 255, 255));
        SANTANDER.setText("SANTANDER");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 582, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        botongrafica.setBackground(new java.awt.Color(51, 51, 51));
        botongrafica.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        botongrafica.setForeground(new java.awt.Color(255, 255, 255));
        botongrafica.setText("Graficar");
        botongrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botongraficaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TOLIMA)
                            .addComponent(SANTANDER)
                            .addComponent(ANTIOQUIA)
                            .addComponent(CAUCA)
                            .addComponent(BOGOTA)
                            .addComponent(CALDAS)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(botongrafica)))
                .addGap(39, 39, 39)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(175, 175, 175))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(BOGOTA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CALDAS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANTIOQUIA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CAUCA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TOLIMA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SANTANDER)
                        .addGap(52, 52, 52)
                        .addComponent(botongrafica)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botongraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botongraficaActionPerformed
        // TODO add your handling code here:
        int[] aux = lectura.departamentoele();
        
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        
        if(BOGOTA.isSelected()){
        datos.setValue(aux[0], "BOGOTA", "Departamentos");
        } if(CALDAS.isSelected()){
        datos.setValue(aux[1], "CALDAS", "Departamentos");
        }if(ANTIOQUIA.isSelected()){
        datos.setValue(aux[2], "ANTIOQUIA", "Departamentos");
        }if(CAUCA.isSelected()){
        datos.setValue(aux[3], "CAUCA","Departamentos");
        }if(TOLIMA.isSelected()){
        datos.setValue(aux[4], "TOLIMA","Departamentos");
        }if(SANTANDER.isSelected()){
        datos.setValue(aux[5], "SANTANDER","Departamentos");
        }
        
         JFreeChart barras = ChartFactory.createBarChart("Matriculados", "Universidad", "Departamento", datos, PlotOrientation.VERTICAL, true, true, false);
        ChartPanel panel2 = new ChartPanel(barras);
        panel2.setMouseWheelEnabled(true);
        
        jPanel2.setLayout(new BorderLayout());
        jPanel2.add(panel2, BorderLayout.NORTH);
        pack();
        repaint();
        
         float n = aux[0]+aux[1]+aux[2]+aux[3]+aux[4]+aux[5];
        DefaultPieDataset datos1 = new DefaultPieDataset();
        if(BOGOTA.isSelected()){
        datos1.setValue("BOGOTA ("+(aux[0]/n)*100+"%)", aux[0]);
        }if(CALDAS.isSelected()){
        datos1.setValue("CALDAS ("+(aux[1]/n)*100+"%)", aux[1]);
        }if(ANTIOQUIA.isSelected()){
        datos1.setValue("ANTIOQUIA ("+(aux[2]/n)*100+"%)", aux[2]);
        }if(CAUCA.isSelected()){
        datos1.setValue("CAUCA ("+(aux[3]/n)*100+"%)", aux[3]);
        }if(TOLIMA.isSelected()){
        datos1.setValue("TOLIMA ("+(aux[4]/n)*100+"%)", aux[4]);
        }if(SANTANDER.isSelected()){
        datos1.setValue("SANTANDER ("+(aux[5]/n)*100+"%)", aux[5]);
        }
      
         JFreeChart pastel = ChartFactory.createPieChart("Matriculados por departamentos", datos1, true, true, false);
         ChartPanel panel_temporal = new ChartPanel(pastel);
        panel_temporal.setMouseWheelEnabled(true);

        jPanel3.setLayout(new BorderLayout());
        jPanel3.add(panel_temporal, BorderLayout.NORTH);

        pack();
        repaint();
        
        generado=true;
        barrasexp=barras;
        pastelexp=pastel;
    }//GEN-LAST:event_botongraficaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GraficaU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficaU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficaU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficaU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraficaU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ANTIOQUIA;
    private javax.swing.JRadioButton BOGOTA;
    private javax.swing.JRadioButton CALDAS;
    private javax.swing.JRadioButton CAUCA;
    private javax.swing.JRadioButton SANTANDER;
    private javax.swing.JRadioButton TOLIMA;
    private javax.swing.JButton botongrafica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
