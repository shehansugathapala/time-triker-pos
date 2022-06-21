/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

/**
 *
 * @author buddh
 */
public class frmCashierHome extends javax.swing.JFrame {

    /**
     * Creates new form frmAdminHome
     */
    public frmCashierHome() {
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

        dpHome = new javax.swing.JDesktopPane();
        btnInvoice = new javax.swing.JButton();
        btnRepair = new javax.swing.JButton();
        btnCustomer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dpHomeLayout = new javax.swing.GroupLayout(dpHome);
        dpHome.setLayout(dpHomeLayout);
        dpHomeLayout.setHorizontalGroup(
            dpHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1392, Short.MAX_VALUE)
        );
        dpHomeLayout.setVerticalGroup(
            dpHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnInvoice.setText("Invoice");
        btnInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvoiceActionPerformed(evt);
            }
        });

        btnRepair.setText("Repair Jobs");
        btnRepair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepairActionPerformed(evt);
            }
        });

        btnCustomer.setText("Customer");
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRepair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dpHome)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dpHome)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRepair, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 660, Short.MAX_VALUE)))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1544, 857));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvoiceActionPerformed
        dpHome.removeAll();
        pnlInvoice invoice = new pnlInvoice();
        invoice.setSize(dpHome.getWidth(), dpHome.getHeight());
        dpHome.add("Invoice", invoice);
        invoice.setVisible(true);
    }//GEN-LAST:event_btnInvoiceActionPerformed

    private void btnRepairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepairActionPerformed
        dpHome.removeAll();
        pnlRepaiJobs repaiJobs = new pnlRepaiJobs();
        repaiJobs.setSize(dpHome.getWidth(), dpHome.getHeight());
        dpHome.add("Invoice", repaiJobs);
        repaiJobs.setVisible(true);
    }//GEN-LAST:event_btnRepairActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        new frmCustomers().setVisible(true);
    }//GEN-LAST:event_btnCustomerActionPerformed

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
            java.util.logging.Logger.getLogger(frmCashierHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCashierHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCashierHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCashierHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCashierHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnInvoice;
    private javax.swing.JButton btnRepair;
    private javax.swing.JDesktopPane dpHome;
    // End of variables declaration//GEN-END:variables
}
