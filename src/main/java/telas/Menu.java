/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import aplicacao.MnuInternoRelatorioSintetico;

/**
 *
 * @author Camilly
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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
        mnuConsProd = new javax.swing.JMenuBar();
        mnuCliente = new javax.swing.JMenu();
        mnuInternoConsCli = new javax.swing.JMenuItem();
        mnuInternoInsCli = new javax.swing.JMenuItem();
        mnuProduto = new javax.swing.JMenu();
        mnuInternoConsProd = new javax.swing.JMenuItem();
        mnuInternoInsProd = new javax.swing.JMenuItem();
        mnuPedido = new javax.swing.JMenu();
        mnuInternoInserirPedido = new javax.swing.JMenuItem();
        mnuInternoConsultarPedido = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout MnuInternoLayout = new javax.swing.GroupLayout(MnuInterno);
        MnuInterno.setLayout(MnuInternoLayout);
        MnuInternoLayout.setHorizontalGroup(
            MnuInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        MnuInternoLayout.setVerticalGroup(
            MnuInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        mnuCliente.setText("Cliente");

        mnuInternoConsCli.setText("Consultar");
        mnuInternoConsCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuInternoConsCliActionPerformed(evt);
            }
        });
        mnuCliente.add(mnuInternoConsCli);

        mnuInternoInsCli.setText("Inserir");
        mnuInternoInsCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuInternoInsCliActionPerformed(evt);
            }
        });
        mnuCliente.add(mnuInternoInsCli);

        mnuConsProd.add(mnuCliente);

        mnuProduto.setText("Produto");

        mnuInternoConsProd.setText("Consultar");
        mnuInternoConsProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuInternoConsProdActionPerformed(evt);
            }
        });
        mnuProduto.add(mnuInternoConsProd);

        mnuInternoInsProd.setText("Inserir");
        mnuInternoInsProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuInternoInsProdActionPerformed(evt);
            }
        });
        mnuProduto.add(mnuInternoInsProd);

        mnuConsProd.add(mnuProduto);

        mnuPedido.setText("Pedido");

        mnuInternoInserirPedido.setText("Inserir");
        mnuInternoInserirPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuInternoInserirPedidoActionPerformed(evt);
            }
        });
        mnuPedido.add(mnuInternoInserirPedido);

        mnuInternoConsultarPedido.setText("Consultar");
        mnuInternoConsultarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuInternoConsultarPedidoActionPerformed(evt);
            }
        });
        mnuPedido.add(mnuInternoConsultarPedido);

        mnuConsProd.add(mnuPedido);

        setJMenuBar(mnuConsProd);

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

    private void mnuInternoConsCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuInternoConsCliActionPerformed
        MnuInternoConsCliente tela = new MnuInternoConsCliente();
        tela.setVisible(true);
        
        this.MnuInterno.add(tela);
    }//GEN-LAST:event_mnuInternoConsCliActionPerformed

    private void mnuInternoInsCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuInternoInsCliActionPerformed
        MnuInternoInsCliente tela = new MnuInternoInsCliente();
        tela.setVisible(true);
        
        this.MnuInterno.add(tela);
    }//GEN-LAST:event_mnuInternoInsCliActionPerformed

    private void mnuInternoConsProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuInternoConsProdActionPerformed
        MnuInternoConsProduto tela = new MnuInternoConsProduto();
        tela.setVisible(true);
        
        this.MnuInterno.add(tela);
    }//GEN-LAST:event_mnuInternoConsProdActionPerformed

    private void mnuInternoInsProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuInternoInsProdActionPerformed
        MnuInternoInsProduto tela = new MnuInternoInsProduto();
        tela.setVisible(true);
        
        this.MnuInterno.add(tela);
    }//GEN-LAST:event_mnuInternoInsProdActionPerformed

    private void mnuInternoConsultarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuInternoConsultarPedidoActionPerformed
        MnuInternoConsultarPedido tela = new MnuInternoConsultarPedido();
        tela.setVisible(true);

        this.MnuInterno.add(tela);
    }//GEN-LAST:event_mnuInternoConsultarPedidoActionPerformed

    private void mnuInternoInserirPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuInternoInserirPedidoActionPerformed
        MnuInternoRelatorioSintetico tela = new MnuInternoRelatorioSintetico();
        tela.setVisible(true);

        this.MnuInterno.add(tela);    // TODO add your handling code here:
    }//GEN-LAST:event_mnuInternoInserirPedidoActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane MnuInterno;
    private javax.swing.JMenu mnuCliente;
    private javax.swing.JMenuBar mnuConsProd;
    private javax.swing.JMenuItem mnuInternoConsCli;
    private javax.swing.JMenuItem mnuInternoConsProd;
    private javax.swing.JMenuItem mnuInternoConsultarPedido;
    private javax.swing.JMenuItem mnuInternoInsCli;
    private javax.swing.JMenuItem mnuInternoInsProd;
    private javax.swing.JMenuItem mnuInternoInserirPedido;
    private javax.swing.JMenu mnuPedido;
    private javax.swing.JMenu mnuProduto;
    // End of variables declaration//GEN-END:variables
}
