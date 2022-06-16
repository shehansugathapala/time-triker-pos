/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author buddh
 */
public class frmUser extends javax.swing.JFrame {

    PreparedStatement pst;
    Connection conn;
    int empId = 0;

    public frmUser() {
        initComponents();
        conn = ConnectDB.getConn();

        fillUserTypeCombo(cmbEmpName);
        filltblUser();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbEmpName = new javax.swing.JComboBox<>();
        txtUserName = new javax.swing.JTextField();
        pfPassword = new javax.swing.JTextField();
        cmbUserType = new javax.swing.JComboBox<>();
        cmbStatus = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClearAll = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(5, 2, 0, 5));

        cmbEmpName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        cmbEmpName.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmbEmpNamePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel1.add(cmbEmpName);
        jPanel1.add(txtUserName);
        jPanel1.add(pfPassword);

        cmbUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Store Keeper", "Cashier", "Wotch Wekers" }));
        jPanel1.add(cmbUserType);

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Deactive" }));
        jPanel1.add(cmbStatus);

        jPanel2.setLayout(new java.awt.GridLayout(5, 1, 5, 5));

        jLabel1.setText("Employee Name");
        jPanel2.add(jLabel1);

        jLabel3.setText("User Name");
        jPanel2.add(jLabel3);

        jLabel2.setText("Password");
        jPanel2.add(jLabel2);

        jLabel4.setText("User Type");
        jPanel2.add(jLabel4);

        jLabel5.setText("Status");
        jPanel2.add(jLabel5);

        jPanel3.setLayout(new java.awt.GridLayout(1, 3, 5, 5));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnSave);

        btnDelete.setText("Delete");
        jPanel3.add(btnDelete);

        btnClearAll.setText("Clear All");
        btnClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAllActionPerformed(evt);
            }
        });
        jPanel3.add(btnClearAll);

        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Employee Name", "User Name", "User Type", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUser);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                        .addGap(63, 63, 63)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 96, Short.MAX_VALUE)))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1179, 388));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fillUserTypeCombo(JComboBox cmbEmpName) {
        ResultSet rs = null;
        cmbEmpName.removeAllItems();
        try {
            pst = conn.prepareStatement("SELECT name FROM employers");
            rs = pst.executeQuery();
//            if (!rs.isBeforeFirst()) {
//                userType.resetAll();
//            }
            while (rs.next()) {
                cmbEmpName.addItem(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                pst.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void getEmpIdByName() {
        ResultSet rs = null;
        try {
            pst = conn.prepareStatement("SELECT id FROM employers WHERE name = ?");
            pst.setString(1, cmbEmpName.getSelectedItem().toString());
            rs = pst.executeQuery();

//            if (!rs.isBeforeFirst()) {
//                userType.resetAll();
//            }
            while (rs.next()) {
                empId = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
            //alerts.getErrorAlert(e);
        } finally {
            try {
                pst.close();
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
                //alerts.getErrorAlert(e);
            }
        }
    }

    private void filltblUser() {
        ResultSet rs = null;
        try {
            pst = conn.prepareStatement("SELECT user.id AS 'Id',employers.name AS 'Emp Name',user.user_name AS 'User Name',user.user_type AS 'User Type',user.status AS 'Status' FROM user INNER JOIN employers ON user.employers_id = employers.id");
            rs = pst.executeQuery();

            //To remove previously added rows
            while (tblUser.getRowCount() > 0) {
                ((DefaultTableModel) tblUser.getModel()).removeRow(0);
            }

            // Fill data to tblUser
            tblUser.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pst.close();
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
                //alerts.getErrorAlert(e);
            }
        }
    }

    private int saveUser() {
        int saveDone = 0;
        try {
            pst = conn.prepareStatement("INSERT INTO user(user_name, password, user_type, status, employers_id) VALUES (?,?,?,?,?)");
            pst.setString(1, txtUserName.getText());
            pst.setString(2, pfPassword.getText());
            pst.setString(3, cmbUserType.getSelectedItem().toString());
            pst.setString(4, cmbStatus.getSelectedItem().toString());
            pst.setInt(5, empId);

            saveDone = pst.executeUpdate();
            // saveDone = Statement.RETURN_GENERATED_KEYS;
        } catch (Exception e) {
            e.printStackTrace();
            //alerts.getErrorAlert(e);
        } finally {
            try {
                pst.close();
            } catch (Exception e) {
                e.printStackTrace();
                //alerts.getErrorAlert(e);
            }
        }
        return saveDone;
    }

    private void resetAll() {
        cmbEmpName.setSelectedIndex(0);
        txtUserName.setText("");
        pfPassword.setText("");
        cmbUserType.setSelectedIndex(0);
        cmbStatus.setSelectedIndex(0);
    }

    private void getUserDataByName(String userName) {
        ResultSet rs = null;
        try {
            pst = conn.prepareStatement("SELECT  employers.name, user.user_name, user.password, user.user_type, user.status FROM user INNER JOIN employers ON user.employers_id = employers.id WHERE user.user_name = ?");
            pst.setString(1, userName);
            rs = pst.executeQuery();

//            if (!rs.isBeforeFirst()) {
//                userType.resetAll();
//            }
            if (rs.next()) {
                cmbEmpName.getModel().setSelectedItem(rs.getString(1));
                txtUserName.setText(rs.getString(2));
                pfPassword.setText(rs.getString(3));
                cmbUserType.getModel().setSelectedItem(rs.getString(4));
                cmbStatus.getModel().setSelectedItem(rs.getString(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pst.close();
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
                //alerts.getErrorAlert(e);
            }
        }
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (!cmbEmpName.getSelectedItem().equals("")) {
            if (!txtUserName.getText().isEmpty()) {
                if (!pfPassword.getText().isEmpty()) {
                    if (!cmbUserType.getSelectedItem().equals("")) {
                        int saveUser = saveUser();
                        if (saveUser > 0) {
                            resetAll();
                            JOptionPane.showMessageDialog(this, "Data Save Done ", "User Save", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {

                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Password is Empty. ", "Validation Error", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "User Name is Empty. ", "Validation Error", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Emp Name is Empty. ", "Validation Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cmbEmpNamePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbEmpNamePopupMenuWillBecomeInvisible
        getEmpIdByName();
        System.out.println("Emp Id : " + empId);
    }//GEN-LAST:event_cmbEmpNamePopupMenuWillBecomeInvisible

    private void tblUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUserMouseClicked
        try {
            int row = tblUser.getSelectedRow();
            String userName = tblUser.getModel().getValueAt(row, 2).toString();
            getUserDataByName(userName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblUserMouseClicked

    private void btnClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAllActionPerformed
        resetAll();
    }//GEN-LAST:event_btnClearAllActionPerformed

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
            java.util.logging.Logger.getLogger(frmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearAll;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbEmpName;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JComboBox<String> cmbUserType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pfPassword;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
