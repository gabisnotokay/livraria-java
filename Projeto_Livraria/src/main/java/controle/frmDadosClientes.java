
package controle;

import conexao.Conexao; 
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel; 
import java.sql.*;

public class frmDadosClientes extends javax.swing.JFrame {

    Conexao con_cliente;
    
    public frmDadosClientes() {
        
        
        initComponents();
        
        con_cliente = new Conexao(); // inicialização do objeto
        con_cliente.conecta(); // chama o método que conecta
        con_cliente.executaSQL("select * from cliente order by ID_CLIENTE");
        tblcliente.setAutoCreateRowSorter(true);
        preencherTabela();
        posicionarRegistro();
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtnome = new javax.swing.JTextField();
        txtfone = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtrg = new javax.swing.JTextField();
        txtcpf = new javax.swing.JTextField();
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
        jLabel9 = new javax.swing.JLabel();
        txtusu = new javax.swing.JTextField();
        txtsenha = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(24, 74, 170));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID do Cliente:");

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
        jLabel5.setText("RG:");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CPF:");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Endereço:");

        txtid.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        txtnome.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        txtfone.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        txtemail.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        txtrg.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        txtcpf.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        txtend.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        tblcliente.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        tblcliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "TELEFONE", "EMAIL", "RG", "CPF", "ENDEREÇO", "USUARIO", "SENHA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblcliente);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controle/apoio-suporte_resized.png"))); // NOI18N

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

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Usuário:");

        txtusu.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        txtsenha.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Senha:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 66, Short.MAX_VALUE)
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
                .addComponent(btnexcluir)
                .addGap(61, 61, 61))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcpf))
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtrg, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(22, 22, 22)
                                .addComponent(txtend, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(118, 118, 118)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(850, 850, 850)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtusu, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
                            .addComponent(txtrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnprimeiro)
                    .addComponent(btnultimo)
                    .addComponent(btnproximo)
                    .addComponent(btnanterior)
                    .addComponent(btnnovoreg)
                    .addComponent(btngravar)
                    .addComponent(btnalterar)
                    .addComponent(btnexcluir))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(11, 11, 11))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        txtrg.setText("");
        txtcpf.setText("");
        txtend.setText("");
        txtusu.setText("");
        txtsenha.setText("");
        txtid.requestFocus();
    }//GEN-LAST:event_btnnovoregActionPerformed

    private void btngravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngravarActionPerformed

        
        String nome = txtnome.getText();
        String telefone = txtfone.getText();
        String email = txtemail.getText();
        String rg = txtrg.getText();
        String cpf = txtcpf.getText();
        String end = txtend.getText();
        String usuario = txtnome.getText();
        String senha = txtnome.getText();

        try {
            String insert_sql = "insert into cliente (nome, telefone, email, rg, cpf, endereco, usuario, senha) values ('" + nome + "', '" + telefone + "', '" + email + "', '" + rg + "','" + cpf +"','" + end +"','" + usuario + "', '" + senha + "')";
            con_cliente.statement.executeUpdate(insert_sql);
            JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!", "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);

            con_cliente.executaSQL("select * from cliente order by ID_CLIENTE");
            preencherTabela();

        }catch(SQLException errosql){
            JOptionPane.showMessageDialog(null, "\n Erro na gravação: \n " + errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_btngravarActionPerformed

    private void btnalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalterarActionPerformed
        
        
        String nome = txtnome.getText();
        String telefone = txtfone.getText();
        String email = txtemail.getText();
        String rg = txtrg.getText();
        String cpf = txtcpf.getText();
        String end = txtend.getText();
        String usuario = txtusu.getText();
        String senha = txtsenha.getText();
        String sql;
        String msg="";

        try {
            if(txtid.getText().equals("")){
                sql = "insert into cliente (nome, telefone, email, rg, cpf, endereco, usuario, senha, ) values ('" + nome + "','" + telefone + "','" + email + "','" + rg + "','" + cpf + "','" + end + "''" + usuario + "', '" + senha + "')";
                msg = "Gravação de um novo registro";
            }
            else {
                sql = "update cliente set  nome='" + nome + "', telefone = '" + telefone + "', email = '" + email + "', rg = '" + rg + "', cpf = '" + cpf + "', endereco = '" + end + "' usuario = '" +usuario+ "', senha='" +senha+ "' where ID_CLIENTE = " + txtid.getText();
                msg = "Alteração de registro";
            }

            con_cliente.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);

            con_cliente.executaSQL("select * from cliente order by ID_CLIENTE");
            preencherTabela();

        }catch(SQLException errosql){
            JOptionPane.showMessageDialog(null, "\n Erro na gravação: \n " + errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_btnalterarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    frmMenuVendedor mostra = new frmMenuVendedor();
    mostra.setVisible(true);
    dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
    String sql="";
        try {
            int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o registro: ","Confirmar Exclusão", JOptionPane.YES_NO_OPTION,3);
            if (resposta==0){
                sql="delete from cliente where ID_CLIENTE = " + txtid.getText();

                int excluir = con_cliente.statement.executeUpdate(sql);

                if (excluir==1){
                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!!","Mensagem do Programa" , JOptionPane.INFORMATION_MESSAGE);

                    con_cliente.executaSQL("select * from cliente order by ID_CLIENTE");
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

     private void tblclienteMouseClicked(java.awt.event.MouseEvent evt) {                                         
        int linha_selecionada = tblcliente.getSelectedRow();

        txtid.setText(tblcliente.getValueAt(linha_selecionada,0).toString());
        txtnome.setText(tblcliente.getValueAt(linha_selecionada,1).toString());
        txtfone.setText(tblcliente.getValueAt(linha_selecionada,2).toString());;
        txtemail.setText(tblcliente.getValueAt(linha_selecionada,3).toString());
        txtrg.setText(tblcliente.getValueAt(linha_selecionada,4).toString());
        txtcpf.setText(tblcliente.getValueAt(linha_selecionada,5).toString());
        txtend.setText(tblcliente.getValueAt(linha_selecionada,6).toString());
        txtusu.setText(tblcliente.getValueAt(linha_selecionada,7).toString());
        txtsenha.setText(tblcliente.getValueAt(linha_selecionada,8).toString());
    }      
     
    private void tblclientesKeyPressed(java.awt.event.KeyEvent evt) {                                       
        int linha_selecionada = tblcliente.getSelectedRow();

        txtid.setText(tblcliente.getValueAt(linha_selecionada,0).toString());
        txtnome.setText(tblcliente.getValueAt(linha_selecionada,1).toString());
        txtfone.setText(tblcliente.getValueAt(linha_selecionada,2).toString());;
        txtemail.setText(tblcliente.getValueAt(linha_selecionada,3).toString());
        txtrg.setText(tblcliente.getValueAt(linha_selecionada,4).toString());
        txtcpf.setText(tblcliente.getValueAt(linha_selecionada,5).toString());
        txtend.setText(tblcliente.getValueAt(linha_selecionada,6).toString());
        txtusu.setText(tblcliente.getValueAt(linha_selecionada,7).toString());
        txtsenha.setText(tblcliente.getValueAt(linha_selecionada,8).toString());

    }                      
     
 public void preencherTabela(){
        tblcliente.getColumnModel().getColumn(0).setPreferredWidth(80);
        tblcliente.getColumnModel().getColumn(1).setPreferredWidth(80);
        tblcliente.getColumnModel().getColumn(2).setPreferredWidth(80);
        tblcliente.getColumnModel().getColumn(3).setPreferredWidth(80);
        tblcliente.getColumnModel().getColumn(4).setPreferredWidth(80);
        tblcliente.getColumnModel().getColumn(5).setPreferredWidth(80);
        tblcliente.getColumnModel().getColumn(6).setPreferredWidth(80);
        tblcliente.getColumnModel().getColumn(7).setPreferredWidth(80);
        tblcliente.getColumnModel().getColumn(8).setPreferredWidth(80);
        
        DefaultTableModel modelo = (DefaultTableModel) tblcliente.getModel();
        
        modelo.setNumRows(0);
        
        try
        {
            con_cliente.resultset.beforeFirst();
            while(con_cliente.resultset.next())
            {
                modelo.addRow(new Object[]
                {
                    con_cliente.resultset.getString("ID_CLIENTE"), 
                    con_cliente.resultset.getString("NOME"), 
                    con_cliente.resultset.getString("TELEFONE"),
                    con_cliente.resultset.getString("EMAIL"),
                    con_cliente.resultset.getString("RG"),
                    con_cliente.resultset.getString("CPF"),
                    con_cliente.resultset.getString("ENDERECO"),
                    con_cliente.resultset.getString("USUARIO"),
                    con_cliente.resultset.getString("SENHA"),
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
            txtid.setText(con_cliente.resultset.getString("ID_CLIENTE"));
            txtusu.setText(con_cliente.resultset.getString("USUARIO"));
            txtsenha.setText(con_cliente.resultset.getString("SENHA"));
            txtnome.setText(con_cliente.resultset.getString("NOME"));
            txtfone.setText(con_cliente.resultset.getString("TELEFONE"));
            txtemail.setText(con_cliente.resultset.getString("EMAIL"));
            txtrg.setText(con_cliente.resultset.getString("RG"));
            txtcpf.setText(con_cliente.resultset.getString("CPF"));
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
            java.util.logging.Logger.getLogger(frmDadosClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDadosClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDadosClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDadosClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDadosClientes().setVisible(true);
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblcliente;
    private javax.swing.JTextField txtcpf;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtend;
    private javax.swing.JTextField txtfone;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtrg;
    private javax.swing.JTextField txtsenha;
    private javax.swing.JTextField txtusu;
    // End of variables declaration//GEN-END:variables
}
