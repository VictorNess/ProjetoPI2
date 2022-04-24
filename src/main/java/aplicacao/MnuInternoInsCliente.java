/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package aplicacao;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Camilly
 */
public class MnuInternoInsCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form popUpInserir2
     */
    public MnuInternoInsCliente() {
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

        btnInserir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmpNome = new javax.swing.JTextField();
        cmpEmail = new javax.swing.JTextField();
        cmpTelefone = new javax.swing.JFormattedTextField();
        cmpCPF = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        cmpEndereço = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmpDataNasc = new javax.swing.JFormattedTextField();
        sexoMasc = new javax.swing.JCheckBox();
        sexoFem = new javax.swing.JCheckBox();
        sexoOutros = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        cmpEstCivil = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Inserir Cliente");

        btnInserir.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setText("CPF :");

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setText("Telefone:");

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setText("E-mail:");

        cmpNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpNomeActionPerformed(evt);
            }
        });
        cmpNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmpNomeKeyTyped(evt);
            }
        });

        try {
            cmpTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cmpTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpTelefoneActionPerformed(evt);
            }
        });
        cmpTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmpTelefoneKeyTyped(evt);
            }
        });

        try {
            cmpCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cmpCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpCPFActionPerformed(evt);
            }
        });
        cmpCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmpCPFKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setText("Endereço:");

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel6.setText("Data de Nascimento:");

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel7.setText("Sexo:");

        try {
            cmpDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cmpDataNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmpDataNascActionPerformed(evt);
            }
        });
        cmpDataNasc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmpDataNascKeyTyped(evt);
            }
        });

        sexoMasc.setText("Masculino");

        sexoFem.setText("Feminino");

        sexoOutros.setText("Outros");

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel8.setText("Estado Cívil:");

        cmpEstCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Solterio(a)", "Casado(a)", "Víuvo(a)", "Divorciado(a)", "Separado(a)" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmpEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmpTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmpCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmpNome, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmpDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmpEstCivil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sexoMasc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sexoFem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sexoOutros)))
                        .addGap(31, 31, 31)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmpNome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmpDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(sexoMasc)
                    .addComponent(sexoFem)
                    .addComponent(sexoOutros))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmpCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cmpEstCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmpTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmpEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(54, 54, 54)
                .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        JOptionPane.showMessageDialog(this, "Cliente inserido com sucesso!");  
        MnuInternoConsCliente popUp2 = new MnuInternoConsCliente();
        popUp2.setVisible(true);
        
        //Fecha o JFrame de trás
        dispose();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void cmpNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpNomeActionPerformed
       if(cmpNome.getText().trim().equals("")){//trim tira os espaços em branco
         JOptionPane.showMessageDialog(this, "O campo é obrigatório: ");
        }
    }//GEN-LAST:event_cmpNomeActionPerformed

    private void cmpNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpNomeKeyTyped
        String numero = "1234567890!@#$%&*()";

        if (numero.contains(evt.getKeyChar() + "")) {
            evt.consume();
            this.cmpNome.setBackground(Color.red);
        } else {
            this.cmpNome.setBackground(Color.white);
        }
    }//GEN-LAST:event_cmpNomeKeyTyped

    private void cmpCPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpCPFKeyTyped
         
        String letra = "1234567890!@#$%&*()";

        if (!letra.contains(evt.getKeyChar() + "")) {
            evt.consume();
            this.cmpCPF.setBackground(Color.red);
        } else {
            this.cmpCPF.setBackground(Color.white);
        }
    }//GEN-LAST:event_cmpCPFKeyTyped

    private void cmpTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpTelefoneKeyTyped
         String letra = "1234567890!@#$%&*()";

        if (!letra.contains(evt.getKeyChar() + "")) {
            evt.consume();
            this.cmpTelefone.setBackground(Color.red);
        } else {
            this.cmpTelefone.setBackground(Color.white);
        }
        
        
    }//GEN-LAST:event_cmpTelefoneKeyTyped

    private void cmpCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpCPFActionPerformed
      
    }//GEN-LAST:event_cmpCPFActionPerformed

    private void cmpTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpTelefoneActionPerformed
//        if(cmpTelefone.getText().length() < 11 ){
//               JOptionPane.showMessageDialog(this, "Máximo de 10 caracteres para o Login !");
//       }
    }//GEN-LAST:event_cmpTelefoneActionPerformed

    private void cmpDataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpDataNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmpDataNascActionPerformed

    private void cmpDataNascKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpDataNascKeyTyped
//        String letra = "1234567890!@#$%&*()";
//
//        if (!letra.contains(evt.getKeyChar() + "")) {
//            evt.consume();
//            this.cmpDataNasc.setBackground(Color.red);
//        } else {
//            this.cmpDataNasc.setBackground(Color.white);
//        }
    }//GEN-LAST:event_cmpDataNascKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInserir;
    private javax.swing.JFormattedTextField cmpCPF;
    private javax.swing.JFormattedTextField cmpDataNasc;
    private javax.swing.JTextField cmpEmail;
    private javax.swing.JTextField cmpEndereço;
    private javax.swing.JComboBox<String> cmpEstCivil;
    private javax.swing.JTextField cmpNome;
    private javax.swing.JFormattedTextField cmpTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JCheckBox sexoFem;
    private javax.swing.JCheckBox sexoMasc;
    private javax.swing.JCheckBox sexoOutros;
    // End of variables declaration//GEN-END:variables
}
