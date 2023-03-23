
package controle;

import conexao.Conexao; // importar o package a classe
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel; // para reconhecimento da Jtable
import java.sql.*;

public class frmDadosEditora extends javax.swing.JFrame {

    
    Conexao con_cliente;
    
    public frmDadosEditora() {
        
        
        initComponents();
        con_cliente = new Conexao(); // inicialização do objeto
        con_cliente.conecta(); // chama o método que conecta
        con_cliente.executaSQL("select * from editora order by ID_EDITORA");
        preencherTabela(); 
        posicionarRegistro();
        tblcliente.setAutoCreateRowSorter(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtnome = new javax.swing.JTextField();
        txtfone = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtend = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcliente = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        btnprimeiro = new javax.swing.JButton();
        btnultimo = new javax.swing.JButton();
        btnproximo = new javax.swing.JButton();
        btnanterior = new javax.swing.JButton();
        btnnovoreg = new javax.swing.JButton();
        btngravar = new javax.swing.JButton();
        btnalterar = new javax.swing.JButton();
        btnexcluir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(24, 74, 170));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID do Editora:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Telefone:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Endereço:");

        txtid.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        txtnome.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        txtfone.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        txtemail.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        txtend.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        tblcliente.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        tblcliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "EMAIL", "TELEFONE", "CPF", "RG"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblcliente);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/pilha-de-livros (2)_resized.png"))); // NOI18N

        btnprimeiro.setBackground(new java.awt.Color(255, 153, 153));
        btnprimeiro.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btnprimeiro.setForeground(new java.awt.Color(255, 255, 255));
        btnprimeiro.setText("PRIMEIRO");
        btnprimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprimeiroActionPerformed(evt);
            }
        });

        btnultimo.setBackground(new java.awt.Color(255, 153, 153));
        btnultimo.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btnultimo.setForeground(new java.awt.Color(255, 255, 255));
        btnultimo.setText("ÚLTIMO");
        btnultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnultimoActionPerformed(evt);
            }
        });

        btnproximo.setBackground(new java.awt.Color(255, 153, 153));
        btnproximo.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btnproximo.setForeground(new java.awt.Color(255, 255, 255));
        btnproximo.setText("PRÓXIMO");
        btnproximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproximoActionPerformed(evt);
            }
        });

        btnanterior.setBackground(new java.awt.Color(255, 153, 153));
        btnanterior.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btnanterior.setForeground(new java.awt.Color(255, 255, 255));
        btnanterior.setText("ANTERIOR");
        btnanterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanteriorActionPerformed(evt);
            }
        });

        btnnovoreg.setBackground(new java.awt.Color(255, 153, 153));
        btnnovoreg.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btnnovoreg.setForeground(new java.awt.Color(255, 255, 255));
        btnnovoreg.setText("NOVO REGISTRO");
        btnnovoreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnovoregActionPerformed(evt);
            }
        });

        btngravar.setBackground(new java.awt.Color(255, 153, 153));
        btngravar.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btngravar.setForeground(new java.awt.Color(255, 255, 255));
        btngravar.setText("GRAVAR");
        btngravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngravarActionPerformed(evt);
            }
        });

        btnalterar.setBackground(new java.awt.Color(255, 153, 153));
        btnalterar.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btnalterar.setForeground(new java.awt.Color(255, 255, 255));
        btnalterar.setText("ALTERAR");
        btnalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalterarActionPerformed(evt);
            }
        });

        btnexcluir.setBackground(new java.awt.Color(255, 153, 153));
        btnexcluir.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        btnexcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnexcluir.setText("EXCLUIR");
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("VOLTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfone))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtemail))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtend, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(157, 157, 157))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnprimeiro)
                        .addGap(18, 18, 18)
                        .addComponent(btnultimo)
                        .addGap(18, 18, 18)
                        .addComponent(btnproximo)
                        .addGap(18, 18, 18)
                        .addComponent(btnanterior)
                        .addGap(18, 18, 18)
                        .addComponent(btnnovoreg)
                        .addGap(18, 18, 18)
                        .addComponent(btngravar)
                        .addGap(18, 18, 18)
                        .addComponent(btnalterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnexcluir)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtfone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnprimeiro)
                    .addComponent(btnultimo)
                    .addComponent(btnproximo)
                    .addComponent(btnanterior)
                    .addComponent(btnnovoreg)
                    .addComponent(btngravar)
                    .addComponent(btnalterar)
                    .addComponent(btnexcluir))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnprimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprimeiroActionPerformed
        try {
            con_cliente.resultset.first();
            mostrar_Dados();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não foi possível acessar o primeiro registo: " + erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnprimeiroActionPerformed

    private void btnultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnultimoActionPerformed
        try {
            con_cliente.resultset.last();
            mostrar_Dados();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não foi possível acessar o primeiro registo: " + erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnultimoActionPerformed

    private void btnproximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproximoActionPerformed
        try {
            con_cliente.resultset.next();
            mostrar_Dados();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não foi possível acessar o primeiro registo: " + erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnproximoActionPerformed

    private void btnanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanteriorActionPerformed
        
        try {
            con_cliente.resultset.previous();
            mostrar_Dados();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Não foi possível acessar o primeiro registo: " + erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnanteriorActionPerformed

    private void btnnovoregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovoregActionPerformed
        
        txtid.setText("");
        txtnome.setText("");
        txtfone.setText("");
        txtemail.setText("");
        txtend.setText("");
    }//GEN-LAST:event_btnnovoregActionPerformed

    private void btngravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngravarActionPerformed
        String nome = txtnome.getText();
        String fone = txtfone.getText();
        String email = txtemail.getText();
        String end = txtend.getText();

        try {
            String insert_sql = "insert into editora (nome, telefone, email, endereco) values ('" + nome + "', '" + fone + "', '" + email + "', '" + end + "')";
            con_cliente.statement.executeUpdate(insert_sql);
            JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!", "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);

            con_cliente.executaSQL("select * from editora order by ID_EDITORA");
            preencherTabela();

        }catch(SQLException errosql){
            JOptionPane.showMessageDialog(null, "\n Erro na gravação: \n " + errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);

        }
        
    }//GEN-LAST:event_btngravarActionPerformed

    private void btnalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalterarActionPerformed
        String nome = txtnome.getText();
        String fone = txtfone.getText();
        String email = txtemail.getText();
        String end = txtend.getText();
        String sql;
        String msg="";

        try {
            if(txtid.getText().equals("")){
                sql = "insert into editora (nome, telefone, email, endereco) values ('" + nome + "','" + fone + "','" + email + "','" + end + "')";
                msg = "Gravação de um novo registro";
            }
            else {
                sql = "update editora set nome='" + nome + "', telefone = '" + fone + "', email = '" + email + "', endereco = '" + end + "' where ID_EDITORA = " + txtid.getText();
                msg = "Alteração de registro";
            }

            con_cliente.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);

            con_cliente.executaSQL("select * from editora order by ID_EDITORA");
            preencherTabela();

        }catch(SQLException errosql){
            JOptionPane.showMessageDialog(null, "\n Erro na gravação: \n " + errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_btnalterarActionPerformed

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
        String sql="";
        try {
            int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o registro: ","Confirmar Exclusão", JOptionPane.YES_NO_OPTION,3);
            if (resposta==0){
                sql="delete from editora where ID_EDITORA = " + txtid.getText();

                int excluir = con_cliente.statement.executeUpdate(sql);

                if (excluir==1){
                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!!","Mensagem do Programa" , JOptionPane.INFORMATION_MESSAGE);

                    con_cliente.executaSQL("select * from editora order by ID_EDITORA");
                    con_cliente.resultset.first();
                    preencherTabela();
                    posicionarRegistro();
                } else {
                    JOptionPane.showMessageDialog(null, "Operacação cancelada pelo o usuário!! ","Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }catch (SQLException excecao){
            JOptionPane.showMessageDialog(null, "Erro na exclusão: "+excecao,"Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frmMenuVendedor mostra = new frmMenuVendedor();
        mostra.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    public void preencherTabela(){
        tblcliente.getColumnModel().getColumn(0).setPreferredWidth(80);
        tblcliente.getColumnModel().getColumn(1).setPreferredWidth(80);
        tblcliente.getColumnModel().getColumn(2).setPreferredWidth(80);
        tblcliente.getColumnModel().getColumn(3).setPreferredWidth(80);
        tblcliente.getColumnModel().getColumn(4).setPreferredWidth(80);

        
        DefaultTableModel modelo = (DefaultTableModel) tblcliente.getModel();
        
        modelo.setNumRows(0);
        
        try
        {
            con_cliente.resultset.beforeFirst();
            while(con_cliente.resultset.next())
            {
                modelo.addRow(new Object[]
                {
                    con_cliente.resultset.getString("ID_EDITORA"), 
                    con_cliente.resultset.getString("NOME"), 
                    con_cliente.resultset.getString("TELEFONE"),
                    con_cliente.resultset.getString("EMAIL"),
                    con_cliente.resultset.getString("ENDERECO"),

               });
            }
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "\n Erro ao listar dados da tabela!! :\n " 
            + erro, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void posicionarRegistro()
    {
        try
        {
            con_cliente.resultset.first();
            mostrar_Dados(); 
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Não foi possível posicionar no primeiro registro: "
            +erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void mostrar_Dados()
    {
        try
        {
            txtid.setText(con_cliente.resultset.getString("ID_EDITORA"));
            txtnome.setText(con_cliente.resultset.getString("NOME"));
            txtfone.setText(con_cliente.resultset.getString("TELEFONE"));
            txtemail.setText(con_cliente.resultset.getString("EMAIL"));
            txtend.setText(con_cliente.resultset.getString("ENDERECO"));

        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Não localizou dados: "
            + erro, "Mensagemdo Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
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
            java.util.logging.Logger.getLogger(frmDadosEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDadosEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDadosEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDadosEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDadosEditora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnalterar;
    private javax.swing.JButton btnanterior;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btngravar;
    private javax.swing.JButton btnnovoreg;
    private javax.swing.JButton btnprimeiro;
    private javax.swing.JButton btnproximo;
    private javax.swing.JButton btnultimo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblcliente;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtend;
    private javax.swing.JTextField txtfone;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnome;
    // End of variables declaration//GEN-END:variables
}
