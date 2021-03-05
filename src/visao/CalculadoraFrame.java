/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;
import modelo.Calculadora;

/**
 *
 * @author Aluno
 */
public class CalculadoraFrame extends javax.swing.JFrame {

    /**
     * Creates new form CalculadoraFrame
     */
    public CalculadoraFrame() {
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

        jTextField1 = new javax.swing.JTextField();
        jlpCalculadora = new javax.swing.JLayeredPane();
        jlNum1 = new javax.swing.JLabel();
        jlNum2 = new javax.swing.JLabel();
        jtNum1 = new javax.swing.JTextField();
        jtNum2 = new javax.swing.JTextField();
        jlpResultado = new javax.swing.JLayeredPane();
        jbCalcular = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlpCalculadora.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Calculadora")));

        jlNum1.setText("1° Numero:");

        jlNum2.setText("2° Numero:");

        jlpCalculadora.setLayer(jlNum1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpCalculadora.setLayer(jlNum2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpCalculadora.setLayer(jtNum1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpCalculadora.setLayer(jtNum2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpCalculadoraLayout = new javax.swing.GroupLayout(jlpCalculadora);
        jlpCalculadora.setLayout(jlpCalculadoraLayout);
        jlpCalculadoraLayout.setHorizontalGroup(
            jlpCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpCalculadoraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jlpCalculadoraLayout.createSequentialGroup()
                        .addComponent(jlNum1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtNum1))
                    .addGroup(jlpCalculadoraLayout.createSequentialGroup()
                        .addComponent(jlNum2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jlpCalculadoraLayout.setVerticalGroup(
            jlpCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpCalculadoraLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jlpCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNum1)
                    .addComponent(jtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jlpCalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNum2)
                    .addComponent(jtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jlpResultado.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));

        jbCalcular.setText("Calcular");
        jbCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcularActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jlpResultado.setLayer(jbCalcular, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpResultado.setLayer(jbLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpResultadoLayout = new javax.swing.GroupLayout(jlpResultado);
        jlpResultado.setLayout(jlpResultadoLayout);
        jlpResultadoLayout.setHorizontalGroup(
            jlpResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpResultadoLayout.createSequentialGroup()
                .addComponent(jbCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jlpResultadoLayout.setVerticalGroup(
            jlpResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpResultadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jlpResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlpResultado)
                    .addComponent(jlpCalculadora))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlpCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlpResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void calcular(){
        Calculadora c = new Calculadora();
        c.setNum1(Integer.parseInt(jtNum1.getText()));
        c.setNum2(Integer.parseInt(jtNum2.getText()));
        
        JOptionPane.showMessageDialog(rootPane,"Calculo feito!"+c.toString(),"Resultado:",JOptionPane.PLAIN_MESSAGE);
    }//fecha calcular
    private void limpar(){
        jtNum1.setText(null);
        jtNum2.setText("");
    }// fecha limpar
    
    private void jbCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcularActionPerformed
        calcular();
        limpar();
    }//GEN-LAST:event_jbCalcularActionPerformed
       
    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
                 limpar();
    }//GEN-LAST:event_jbLimparActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbCalcular;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JLabel jlNum1;
    private javax.swing.JLabel jlNum2;
    private javax.swing.JLayeredPane jlpCalculadora;
    private javax.swing.JLayeredPane jlpResultado;
    private javax.swing.JTextField jtNum1;
    private javax.swing.JTextField jtNum2;
    // End of variables declaration//GEN-END:variables
}
