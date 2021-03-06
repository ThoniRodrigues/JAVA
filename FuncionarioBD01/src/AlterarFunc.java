
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author capan
 */
public class AlterarFunc extends javax.swing.JFrame {

    /**
     * Creates new form AlterarFunc
     */
    public AlterarFunc() {
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

        jpAlterar = new javax.swing.JPanel();
        altMatr = new javax.swing.JTextField();
        altNome = new javax.swing.JTextField();
        altSexo = new javax.swing.JTextField();
        lbMatricula = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbSexo = new javax.swing.JLabel();
        btaltOK = new javax.swing.JButton();
        btaltAlterar = new javax.swing.JButton();
        btaltSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpAlterar.setBorder(javax.swing.BorderFactory.createTitledBorder("Alterar funcionario"));

        altNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altNomeActionPerformed(evt);
            }
        });

        altSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altSexoActionPerformed(evt);
            }
        });

        lbMatricula.setText("Matricula");

        lbNome.setText("Nome");

        lbSexo.setText("Sexo");

        btaltOK.setText("OK");
        btaltOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaltOKActionPerformed(evt);
            }
        });

        btaltAlterar.setText("Alterar");
        btaltAlterar.setEnabled(false);
        btaltAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaltAlterarActionPerformed(evt);
            }
        });

        btaltSair.setText("Sair");
        btaltSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaltSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpAlterarLayout = new javax.swing.GroupLayout(jpAlterar);
        jpAlterar.setLayout(jpAlterarLayout);
        jpAlterarLayout.setHorizontalGroup(
            jpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAlterarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAlterarLayout.createSequentialGroup()
                        .addGroup(jpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMatricula)
                            .addComponent(lbNome)
                            .addComponent(lbSexo))
                        .addGap(55, 55, 55)
                        .addGroup(jpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(altSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btaltSair)
                                .addGroup(jpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpAlterarLayout.createSequentialGroup()
                                        .addComponent(altMatr, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btaltOK))
                                    .addComponent(altNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(btaltAlterar))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jpAlterarLayout.setVerticalGroup(
            jpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAlterarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMatricula)
                    .addComponent(altMatr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btaltOK))
                .addGap(7, 7, 7)
                .addGroup(jpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(altNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNome))
                .addGap(9, 9, 9)
                .addGroup(jpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSexo)
                    .addComponent(altSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btaltAlterar)
                    .addComponent(btaltSair))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void altNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_altNomeActionPerformed

    private void altSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_altSexoActionPerformed
    static String altMatr1;
    private void btaltOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaltOKActionPerformed
        
        btaltAlterar.setEnabled(false);
        altMatr1 =  altMatr.getText();
        BancoDados BD = new BancoDados();
        
        try {
            BD.Consultar(altMatr1);
        } catch (SQLException ex) {
            Logger.getLogger(AlterarFunc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AlterarFunc.class.getName()).log(Level.SEVERE, null, ex);
        }
        btaltAlterar.setEnabled(true);
        altNome.setText(BancoDados.eNome);
        altSexo.setText(BancoDados.eSexo);
                // TODO add your handling code here:
    }//GEN-LAST:event_btaltOKActionPerformed
    static String altNome1, altSexo1;
    private void btaltAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaltAlterarActionPerformed
        altMatr1 = altMatr.getText();
        altNome1 = altNome.getText();
        altSexo1 = altSexo.getText();
        BancoDados BD = new BancoDados();
        try {
            BD.Alterar();
        } catch (SQLException ex) {
            Logger.getLogger(AlterarFunc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AlterarFunc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btaltAlterarActionPerformed

    private void btaltSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaltSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btaltSairActionPerformed

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
            java.util.logging.Logger.getLogger(AlterarFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarFunc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField altMatr;
    private javax.swing.JTextField altNome;
    private javax.swing.JTextField altSexo;
    private javax.swing.JButton btaltAlterar;
    private javax.swing.JButton btaltOK;
    private javax.swing.JButton btaltSair;
    private javax.swing.JPanel jpAlterar;
    private javax.swing.JLabel lbMatricula;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbSexo;
    // End of variables declaration//GEN-END:variables
}
