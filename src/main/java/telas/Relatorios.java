/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.awt.Color;

/**
 *
 * @author Camilly
 */
public class Relatorios extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Relatorios() {
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

        MnuInterno = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmpNome = new javax.swing.JFormattedTextField();
        cmpCPF = new javax.swing.JFormattedTextField();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        btnAnalitico = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnSintetico1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Relatórios");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Nome:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, 57, -1));

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CPF:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 74, 57, -1));

        jLabel10.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Data inicio:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, -1, -1));

        jLabel11.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Data fim:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, -1, -1));

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
        jPanel2.add(cmpNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 450, 30));

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
        jPanel2.add(cmpCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 240, 30));
        jPanel2.add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, -1, -1));
        jPanel2.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, -1, -1));

        btnAnalitico.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnAnalitico.setText("Analítico");
        btnAnalitico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnaliticoActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnSintetico1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnSintetico1.setText("Sintético");
        btnSintetico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSintetico1ActionPerformed(evt);
            }
        });

        MnuInterno.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MnuInterno.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MnuInterno.setLayer(btnAnalitico, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MnuInterno.setLayer(btnSair, javax.swing.JLayeredPane.DEFAULT_LAYER);
        MnuInterno.setLayer(btnSintetico1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout MnuInternoLayout = new javax.swing.GroupLayout(MnuInterno);
        MnuInterno.setLayout(MnuInternoLayout);
        MnuInternoLayout.setHorizontalGroup(
            MnuInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MnuInternoLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MnuInternoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MnuInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MnuInternoLayout.createSequentialGroup()
                        .addComponent(btnAnalitico, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(btnSintetico1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MnuInternoLayout.createSequentialGroup()
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(335, 335, 335))))
        );
        MnuInternoLayout.setVerticalGroup(
            MnuInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MnuInternoLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MnuInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnalitico, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSintetico1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 198, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MnuInterno)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MnuInterno)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSintetico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSintetico1ActionPerformed
        RelatorioSintetico obj = new RelatorioSintetico();
        obj.setVisible(true);
    }//GEN-LAST:event_btnSintetico1ActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        telaInicial obj = new telaInicial();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void cmpCPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpCPFKeyTyped
        String letra = "1234567890!@#$%&*()";

        if (!letra.contains(evt.getKeyChar() + "")) {
            evt.consume();
            this.cmpCPF.setBackground(Color.red);
        } else {
            this.cmpCPF.setBackground(Color.white);
        }
    }//GEN-LAST:event_cmpCPFKeyTyped

    private void cmpCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpCPFActionPerformed

    }//GEN-LAST:event_cmpCPFActionPerformed

    private void cmpNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpNomeKeyTyped
        String numero = "1234567890!@#$%&*()";

        if (numero.contains(evt.getKeyChar() + "")) {
            evt.consume();
            this.cmpNome.setBackground(Color.red);
        } else {
            this.cmpNome.setBackground(Color.white);
        }
    }//GEN-LAST:event_cmpNomeKeyTyped

    private void cmpNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmpNomeActionPerformed

    }//GEN-LAST:event_cmpNomeActionPerformed

    private void btnAnaliticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnaliticoActionPerformed
        RelatorioAnalitico obj = new RelatorioAnalitico();
        obj.setVisible(true);
    }//GEN-LAST:event_btnAnaliticoActionPerformed

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
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane MnuInterno;
    private javax.swing.JButton btnAnalitico;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSintetico1;
    private javax.swing.JFormattedTextField cmpCPF;
    private javax.swing.JFormattedTextField cmpNome;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}