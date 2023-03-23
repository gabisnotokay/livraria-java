
package controle;

import conexao.Conexao;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.sql.*;

public class frmMenuVendedor extends javax.swing.JFrame {

    public frmMenuVendedor() {
        initComponents();      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        painel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        painel2 = new javax.swing.JPanel();
        btnccliente = new javax.swing.JButton();
        btndesen = new javax.swing.JButton();
        btnvendedor = new javax.swing.JButton();
        btnlivro = new javax.swing.JButton();
        btnsair = new javax.swing.JButton();
        btneditora = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        painel1.setBackground(new java.awt.Color(28, 74, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/MicrosoftTeams-image (4)_resized.png"))); // NOI18N

        javax.swing.GroupLayout painel1Layout = new javax.swing.GroupLayout(painel1);
        painel1.setLayout(painel1Layout);
        painel1Layout.setHorizontalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(jLabel1)
                .addContainerGap(323, Short.MAX_VALUE))
        );
        painel1Layout.setVerticalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        painel2.setBackground(new java.awt.Color(28, 74, 170));

        javax.swing.GroupLayout painel2Layout = new javax.swing.GroupLayout(painel2);
        painel2.setLayout(painel2Layout);
        painel2Layout.setHorizontalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 821, Short.MAX_VALUE)
        );
        painel2Layout.setVerticalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        btnccliente.setBackground(new java.awt.Color(28, 74, 170));
        btnccliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/atendimento-ao-cliente_resized.png"))); // NOI18N
        btnccliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncclienteActionPerformed(evt);
            }
        });

        btndesen.setBackground(new java.awt.Color(28, 74, 170));
        btndesen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/mulheres_resized.png"))); // NOI18N
        btndesen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndesenActionPerformed(evt);
            }
        });

        btnvendedor.setBackground(new java.awt.Color(28, 74, 170));
        btnvendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/vend.png"))); // NOI18N
        btnvendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvendedorActionPerformed(evt);
            }
        });

        btnlivro.setBackground(new java.awt.Color(28, 74, 170));
        btnlivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/pilha-de-livros (1)_resized.png"))); // NOI18N
        btnlivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlivroActionPerformed(evt);
            }
        });

        btnsair.setBackground(new java.awt.Color(255, 153, 153));
        btnsair.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnsair.setForeground(new java.awt.Color(255, 255, 255));
        btnsair.setText("DESLOGAR");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });

        btneditora.setBackground(new java.awt.Color(28, 74, 170));
        btneditora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/dia-mundial-do-livro (1)_resized.png"))); // NOI18N
        btneditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnvendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnccliente, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btndesen)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btneditora, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlivro, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(161, 161, 161))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(346, 346, 346)
                .addComponent(btnsair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(painel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnlivro, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnccliente))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnvendedor)
                            .addComponent(btneditora, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btndesen)
                        .addGap(97, 97, 97)))
                .addComponent(btnsair)
                .addGap(30, 30, 30)
                .addComponent(painel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 803, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
    frmLoginVendedor mostra = new frmLoginVendedor();
    mostra.setVisible(true);
    dispose();
    }//GEN-LAST:event_btnsairActionPerformed

    private void btncclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncclienteActionPerformed
    frmDadosClientes mostra = new frmDadosClientes();
    mostra.setVisible(true);
    }//GEN-LAST:event_btncclienteActionPerformed

    private void btnvendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvendedorActionPerformed
    frmDadosVendedor mostra = new frmDadosVendedor();
    mostra.setVisible(true);
    }//GEN-LAST:event_btnvendedorActionPerformed

    private void btndesenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndesenActionPerformed
    frmDesenv2 mostra = new frmDesenv2();
    mostra.setVisible(true);
    }//GEN-LAST:event_btndesenActionPerformed

    private void btnlivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlivroActionPerformed
    frmDadosLivro mostra = new frmDadosLivro();
    mostra.setVisible(true);
    }//GEN-LAST:event_btnlivroActionPerformed

    private void btneditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditoraActionPerformed
    frmDadosEditora mostra = new frmDadosEditora();
    mostra.setVisible(true);
    }//GEN-LAST:event_btneditoraActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenuVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnccliente;
    private javax.swing.JButton btndesen;
    private javax.swing.JButton btneditora;
    private javax.swing.JButton btnlivro;
    private javax.swing.JButton btnsair;
    private javax.swing.JButton btnvendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel painel1;
    private javax.swing.JPanel painel2;
    // End of variables declaration//GEN-END:variables
}
