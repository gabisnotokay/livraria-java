
package controle;

import conexao.Conexao; 
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel; 
import java.sql.*;

public class frmDadosLivro extends javax.swing.JFrame {

    Conexao con_cliente;
    
    public frmDadosLivro() {
        initComponents();
        con_cliente = new Conexao(); // inicialização do objeto
        con_cliente.conecta(); // chama o método que conecta
        con_cliente.executaSQL("select * from livro order by ID_LIVRO");
        tblcliente.setAutoCreateRowSorter(true);
        preencherTabela();
        posicionarRegistro();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblid = new javax.swing.JLabel();
        lbltit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblqtd = new javax.swing.JLabel();
        lblqtdest = new javax.swing.JLabel();
        lblminesto = new javax.swing.JLabel();
        lblgen = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txttit = new javax.swing.JTextField();
        txtaut = new javax.swing.JTextField();
        txtpag = new javax.swing.JTextField();
        txtest = new javax.swing.JTextField();
        txtminest = new javax.swing.JTextField();
        txtgen = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcliente = new javax.swing.JTable();
        btnprimeiro = new javax.swing.JButton();
        btnultimo = new javax.swing.JButton();
        btnproximo = new javax.swing.JButton();
        btnanterior = new javax.swing.JButton();
        btnnovoreg = new javax.swing.JButton();
        btngravar = new javax.swing.JButton();
        btnalterar = new javax.swing.JButton();
        btnexcluir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lbledi = new javax.swing.JLabel();
        lblpreco = new javax.swing.JLabel();
        txtidedi = new javax.swing.JTextField();
        txtpreco = new javax.swing.JTextField();
        lblautor = new javax.swing.JLabel();
        txtidaut = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(24, 74, 170));

        lblid.setBackground(new java.awt.Color(255, 255, 255));
        lblid.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lblid.setForeground(new java.awt.Color(255, 255, 255));
        lblid.setText("ID do Livro:");

        lbltit.setBackground(new java.awt.Color(255, 255, 255));
        lbltit.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lbltit.setForeground(new java.awt.Color(255, 255, 255));
        lbltit.setText("Título:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Autor:");

        lblqtd.setBackground(new java.awt.Color(255, 255, 255));
        lblqtd.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lblqtd.setForeground(new java.awt.Color(255, 255, 255));
        lblqtd.setText("Qtd Páginas:");

        lblqtdest.setBackground(new java.awt.Color(255, 255, 255));
        lblqtdest.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lblqtdest.setForeground(new java.awt.Color(255, 255, 255));
        lblqtdest.setText("Qtd Estoque:");

        lblminesto.setBackground(new java.awt.Color(255, 255, 255));
        lblminesto.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lblminesto.setForeground(new java.awt.Color(255, 255, 255));
        lblminesto.setText("Qtd Min Estoque:");

        lblgen.setBackground(new java.awt.Color(255, 255, 255));
        lblgen.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lblgen.setForeground(new java.awt.Color(255, 255, 255));
        lblgen.setText("Gênero:");

        txtid.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        txttit.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        txtaut.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        txtpag.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        txtest.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        txtminest.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        txtgen.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        tblcliente.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        tblcliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "TÍTULO", "AUTOR", "QTD PÁGINAS", "QTD ESTOQUE", "QTD MIN ESTOQUE", "GÊNERO", "PREÇO", "ID EDITORA", "ID AUTOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblcliente);

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

        lbledi.setBackground(new java.awt.Color(255, 255, 255));
        lbledi.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lbledi.setForeground(new java.awt.Color(255, 255, 255));
        lbledi.setText("ID da Editora:");

        lblpreco.setBackground(new java.awt.Color(255, 255, 255));
        lblpreco.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lblpreco.setForeground(new java.awt.Color(255, 255, 255));
        lblpreco.setText("Preço:");

        txtidedi.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        txtpreco.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        lblautor.setBackground(new java.awt.Color(255, 255, 255));
        lblautor.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lblautor.setForeground(new java.awt.Color(255, 255, 255));
        lblautor.setText("ID do Autor:");

        txtidaut.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblid)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbltit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txttit, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtaut))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblqtd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtpag, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblqtdest)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtest, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(113, 113, 113)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblgen)
                                        .addGap(22, 22, 22)
                                        .addComponent(txtgen, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbledi)
                                        .addGap(22, 22, 22)
                                        .addComponent(txtidedi, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblpreco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblautor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtidaut, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblminesto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtminest)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnprimeiro)
                                .addGap(18, 18, 18)
                                .addComponent(btnultimo)
                                .addGap(18, 18, 18)
                                .addComponent(btnproximo)
                                .addGap(18, 18, 18)
                                .addComponent(btnanterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnnovoreg)
                                .addGap(18, 18, 18)
                                .addComponent(btngravar)
                                .addGap(18, 18, 18)
                                .addComponent(btnalterar)
                                .addGap(18, 18, 18)
                                .addComponent(btnexcluir)))
                        .addContainerGap(39, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblid)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbltit)
                            .addComponent(txttit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtaut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblqtd)
                            .addComponent(txtpag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblqtdest)
                            .addComponent(txtest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblminesto)
                            .addComponent(txtminest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblgen))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblpreco)
                            .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtidedi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbledi))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblautor)
                            .addComponent(txtidaut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnprimeiro)
                    .addComponent(btnultimo)
                    .addComponent(btnproximo)
                    .addComponent(btnanterior)
                    .addComponent(btnalterar)
                    .addComponent(btnexcluir)
                    .addComponent(btngravar)
                    .addComponent(btnnovoreg))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        txttit.setText("");
        txtaut.setText("");
        txtpag.setText("");
        txtest.setText("");
        txtminest.setText("");
        txtgen.setText("");
        txtid.requestFocus();
    }//GEN-LAST:event_btnnovoregActionPerformed

    private void btngravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngravarActionPerformed

        String tit = txttit.getText();
        String aut = txtaut.getText();
        String pag = txtpag.getText();
        String est = txtest.getText();
        String minest = txtminest.getText();
        String gen = txtgen.getText();
        String preco = txtpreco.getText();
        String idedi = txtidedi.getText();
        String idaut = txtidaut.getText();
        

        try {
            String insert_sql = "insert into livro (TITULO, AUTOR, QTD_PAGINAS, QTD_ESTOQUE, QTD_MINIMA_ESTOQUE, GENERO, PRECO, ID_EDITORA, ID_AUTOR) values "
            + "('" + tit + "', '" + aut + "', '" + pag + "', '" + est + "','" + minest +"','" + gen +"','" + preco + "','" + idedi + "','" + idaut +"')";
            con_cliente.statement.executeUpdate(insert_sql);
            JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!", "Mensagem do programa", JOptionPane.INFORMATION_MESSAGE);

            con_cliente.executaSQL("select * from livro order by ID_LIVRO");
            preencherTabela();

        }catch(SQLException errosql){
            JOptionPane.showMessageDialog(null, "\n Erro na gravação: \n " + errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_btngravarActionPerformed

    private void btnalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalterarActionPerformed
        String tit = txttit.getText();
        String aut = txtaut.getText();
        String pag = txtpag.getText();
        String est = txtest.getText();
        String minest = txtminest.getText();
        String gen = txtgen.getText();
        String preco = txtpreco.getText();
        String idedi = txtidedi.getText();
        String idaut = txtidaut.getText();
        String sql;
        String msg="";

        try {
            if(txtid.getText().equals("")){
                sql = "insert into livro (TITULO, AUTOR, QTD_PAGINAS, QTD_ESTOQUE, QTD_MINIMA_ESTOQUE, GENERO, PRECO, ID_EDITORA, ID_AUTOR) values "
            + "('" + tit + "', '" + aut + "', '" + pag + "', '" + est + "','" + minest +"','" + gen +"','" + preco + "','" + idedi + "','" + idaut +"')";
                msg = "Gravação de um novo registro";
            }
            else {
                sql = "update livro set TITULO = '" + tit + "', AUTOR = '" + aut + "', QTD_PAGINAS = '" + pag + "', QTD_ESTOQUE = '" + est + "', QTD_MINIMA_ESTOQUE = '" + minest + "', GENERO = '" + gen + "', PRECO = '" + preco + "', ID_EDITORA = '" + idedi + "', ID_AUTOR = '" + idaut + "' where ID_LIVRO = " + txtid.getText();
                msg = "Alteração de registro";
            }

            con_cliente.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);

            con_cliente.executaSQL("select * from livro order by ID_LIVRO");
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
                sql="delete from livro where ID_LIVRO = " + txtid.getText();

                int excluir = con_cliente.statement.executeUpdate(sql);

                if (excluir==1){
                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!!","Mensagem do Programa" , JOptionPane.INFORMATION_MESSAGE);

                    con_cliente.executaSQL("select * from livro order by ID_LIVRO");
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
        tblcliente.getColumnModel().getColumn(5).setPreferredWidth(80);
        tblcliente.getColumnModel().getColumn(6).setPreferredWidth(80);
        tblcliente.getColumnModel().getColumn(7).setPreferredWidth(80);
        tblcliente.getColumnModel().getColumn(8).setPreferredWidth(80);
        tblcliente.getColumnModel().getColumn(9).setPreferredWidth(80);
        
        
        DefaultTableModel modelo = (DefaultTableModel) tblcliente.getModel();
        
        modelo.setNumRows(0);
        
        try
        {
            con_cliente.resultset.beforeFirst();
            while(con_cliente.resultset.next())
            {
                modelo.addRow(new Object[]
                {
                    con_cliente.resultset.getString("ID_LIVRO"), 
                    con_cliente.resultset.getString("TITULO"), 
                    con_cliente.resultset.getString("AUTOR"),
                    con_cliente.resultset.getString("QTD_PAGINAS"),
                    con_cliente.resultset.getString("QTD_ESTOQUE"),
                    con_cliente.resultset.getString("QTD_MINIMA_ESTOQUE"),
                    con_cliente.resultset.getString("GENERO"),
                    con_cliente.resultset.getString("PRECO"),
                    con_cliente.resultset.getString("ID_EDITORA"),
                    con_cliente.resultset.getString("ID_AUTOR"),
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
            txtid.setText(con_cliente.resultset.getString("ID_LIVRO"));
            txttit.setText(con_cliente.resultset.getString("TITULO"));
            txtaut.setText(con_cliente.resultset.getString("AUTOR"));
            txtpag.setText(con_cliente.resultset.getString("QTD_PAGINAS"));
            txtest.setText(con_cliente.resultset.getString("QTD_ESTOQUE"));
            txtminest.setText(con_cliente.resultset.getString("QTD_MINIMA_ESTOQUE"));
            txtgen.setText(con_cliente.resultset.getString("GENERO"));
            txtpreco.setText(con_cliente.resultset.getString("PRECO"));
            txtidedi.setText(con_cliente.resultset.getString("ID_EDITORA"));
            txtidaut.setText(con_cliente.resultset.getString("ID_AUTOR"));
            
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Não localizou dados: "
            + erro, "Mensagemdo Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }
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
            java.util.logging.Logger.getLogger(frmDadosLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDadosLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDadosLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDadosLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDadosLivro().setVisible(true);
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblautor;
    private javax.swing.JLabel lbledi;
    private javax.swing.JLabel lblgen;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblminesto;
    private javax.swing.JLabel lblpreco;
    private javax.swing.JLabel lblqtd;
    private javax.swing.JLabel lblqtdest;
    private javax.swing.JLabel lbltit;
    private javax.swing.JTable tblcliente;
    private javax.swing.JTextField txtaut;
    private javax.swing.JTextField txtest;
    private javax.swing.JTextField txtgen;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtidaut;
    private javax.swing.JTextField txtidedi;
    private javax.swing.JTextField txtminest;
    private javax.swing.JTextField txtpag;
    private javax.swing.JTextField txtpreco;
    private javax.swing.JTextField txttit;
    // End of variables declaration//GEN-END:variables
}
