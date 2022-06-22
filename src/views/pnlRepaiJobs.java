/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import com.mxrck.autocompleter.TextAutoCompleter;
import controllers.ConnectDB;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import models.LoggingSession;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author buddh
 */
public class pnlRepaiJobs extends javax.swing.JPanel {

    private PreparedStatement pst;
    private Connection conn;
    int cusId, jobID;

    /**
     * Creates new form pnlRepaiJobs
     */
    public pnlRepaiJobs() {
        initComponents();

        conn = ConnectDB.getConn();

        autocompletePCode();
        autocompletePName();
        autocompleteCusName();
        filltblJobs();
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
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblJobs = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnLineReset = new javax.swing.JButton();
        btnAddCart = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItems = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtPCode = new javax.swing.JTextField();
        txtPName = new javax.swing.JTextField();
        txtUnitPrice = new javax.swing.JTextField();
        lblQty = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        btnRemoveAll = new javax.swing.JButton();
        btnRemoveItem = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btnFinish = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtCusName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        dcStart = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        tpStart = new com.github.lgooddatepicker.components.TimePicker();
        jLabel2 = new javax.swing.JLabel();
        dcEnd = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        tpEnd = new com.github.lgooddatepicker.components.TimePicker();
        jLabel7 = new javax.swing.JLabel();
        txtJobCost = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtItemCost = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTotalCost = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox<>();

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));

        tblJobs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job Id", "Customer Name", "Start Date", "End Date", "Job Cost", "Item Cost", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblJobs.getTableHeader().setReorderingAllowed(false);
        tblJobs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblJobsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblJobs);

        jPanel3.setLayout(new java.awt.GridLayout(1, 2, 5, 5));

        btnLineReset.setText("Reset");
        btnLineReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineResetActionPerformed(evt);
            }
        });
        jPanel3.add(btnLineReset);

        btnAddCart.setText("ADD");
        jPanel3.add(btnAddCart);

        tblItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Code", "Product Name", "Price", "Quantity", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblItems.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblItems);

        jPanel2.setLayout(new java.awt.GridLayout(2, 6, 20, 5));

        jLabel11.setText("Product Code");
        jPanel2.add(jLabel11);

        jLabel10.setText("Product Name");
        jPanel2.add(jLabel10);

        jLabel13.setText("Unit Price");
        jPanel2.add(jLabel13);

        jLabel15.setText("Avelable Qty");
        jPanel2.add(jLabel15);

        jLabel12.setText("Quantity");
        jPanel2.add(jLabel12);

        jLabel14.setText("Amount");
        jPanel2.add(jLabel14);

        txtPCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPCodeKeyReleased(evt);
            }
        });
        jPanel2.add(txtPCode);

        txtPName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPNameKeyReleased(evt);
            }
        });
        jPanel2.add(txtPName);
        jPanel2.add(txtUnitPrice);

        lblQty.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblQty.setText("0");
        jPanel2.add(lblQty);

        txtQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQtyKeyReleased(evt);
            }
        });
        jPanel2.add(txtQty);
        jPanel2.add(txtAmount);

        jPanel8.setLayout(new java.awt.GridLayout(1, 2, 10, 5));

        btnRemoveAll.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRemoveAll.setText("Remove All");
        btnRemoveAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveAllActionPerformed(evt);
            }
        });
        jPanel8.add(btnRemoveAll);

        btnRemoveItem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRemoveItem.setText("Remove Item");
        btnRemoveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveItemActionPerformed(evt);
            }
        });
        jPanel8.add(btnRemoveItem);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1122, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));

        btnFinish.setText("Job FInish");

        jPanel6.setLayout(new java.awt.GridLayout(1, 3, 5, 5));

        btnAdd.setText("Submit");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel6.add(btnAdd);

        btnReset.setText("Reset");
        jPanel6.add(btnReset);

        jPanel5.setLayout(new java.awt.GridLayout(18, 1, 5, 5));

        jLabel4.setText("Customer Name");
        jPanel5.add(jLabel4);

        txtCusName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCusNameKeyReleased(evt);
            }
        });
        jPanel5.add(txtCusName);

        jLabel1.setText("Start Date");
        jPanel5.add(jLabel1);

        dcStart.setDateFormatString("yyyy-MM-dd");
        jPanel5.add(dcStart);

        jLabel5.setText("Start Time");
        jPanel5.add(jLabel5);
        jPanel5.add(tpStart);

        jLabel2.setText("End Date");
        jPanel5.add(jLabel2);

        dcEnd.setDateFormatString("yyyy-MM-dd");
        jPanel5.add(dcEnd);

        jLabel6.setText("End Time");
        jPanel5.add(jLabel6);
        jPanel5.add(tpEnd);

        jLabel7.setText("Job Cost");
        jPanel5.add(jLabel7);

        txtJobCost.setText("0");
        txtJobCost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtJobCostKeyReleased(evt);
            }
        });
        jPanel5.add(txtJobCost);

        jLabel9.setText("Item Cost");
        jPanel5.add(jLabel9);

        txtItemCost.setText("0");
        txtItemCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemCostActionPerformed(evt);
            }
        });
        jPanel5.add(txtItemCost);

        jLabel8.setText("Total Cost");
        jPanel5.add(jLabel8);

        txtTotalCost.setText("0");
        jPanel5.add(txtTotalCost);

        jLabel3.setText("Status");
        jPanel5.add(jLabel3);

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Repairing", "Finish" }));
        jPanel5.add(cmbStatus);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void resetAll() {

        txtCusName.setText("");
        txtJobCost.setText("0");
        txtItemCost.setText("0");
        txtTotalCost.setText("0");

        cusId = 0;
        removeAllItems();
        filltblJobs();
    }

    private void autocompletePCode() {
        ResultSet rs = null;
        try {
            TextAutoCompleter autoCompleter = new TextAutoCompleter(txtPCode);
            if (autoCompleter.getItems() != null) {
                autoCompleter.removeAllItems();
            }

            pst = conn.prepareStatement("SELECT code FROM product");
            rs = pst.executeQuery();

            while (rs.next()) {
                autoCompleter.addItem(rs.getString(1));
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

    private void autocompletePName() {
        ResultSet rs = null;
        try {
            TextAutoCompleter autoCompleter = new TextAutoCompleter(txtPName);
            if (autoCompleter.getItems() != null) {
                autoCompleter.removeAllItems();
            }

            pst = conn.prepareStatement("SELECT name FROM product");
            rs = pst.executeQuery();

            while (rs.next()) {
                autoCompleter.addItem(rs.getString(1));
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

    private void autocompleteCusName() {
        ResultSet rs = null;
        try {
            TextAutoCompleter autoCompleter = new TextAutoCompleter(txtCusName);
            if (autoCompleter.getItems() != null) {
                autoCompleter.removeAllItems();
            }

            pst = conn.prepareStatement("SELECT name FROM customer");
            rs = pst.executeQuery();

            while (rs.next()) {
                autoCompleter.addItem(rs.getString(1));
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

    private void getProductDataByCode(String pCode) {
        ResultSet rs = null;
        try {
            pst = conn.prepareStatement("SELECT product.name, stock.sale_price, stock.qty, stock.id FROM product INNER JOIN stock ON product.code = stock.product_code  WHERE product.code = ?");
            pst.setString(1, pCode);
            rs = pst.executeQuery();

            if (rs.next()) {
                txtPName.setText(rs.getString(1));
                txtUnitPrice.setText(rs.getString(2));
                lblQty.setText(rs.getString(3));
                //stockId = rs.getInt(4);
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

    private void getProductDataByName(String pName) {
        ResultSet rs = null;
        try {
            pst = conn.prepareStatement("SELECT product.code, stock.sale_price, stock.qty, stock.id FROM product INNER JOIN stock ON product.code = stock.product_code  WHERE product.name = ?");
            pst.setString(1, pName);
            rs = pst.executeQuery();

            if (rs.next()) {
                txtPCode.setText(rs.getString(1));
                txtUnitPrice.setText(rs.getString(2));
                lblQty.setText(rs.getString(3));
                //stockId = rs.getInt(4);
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

    private void getCustomerDataByName(String cusName) {
        ResultSet rs = null;
        try {
            pst = conn.prepareStatement("SELECT id, name FROM customer WHERE name = ?");
            pst.setString(1, cusName);
            rs = pst.executeQuery();

            if (rs.next()) {
                cusId = rs.getInt(1);
                txtCusName.setText(rs.getString(2));
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

    private void increasItemCost() {
        try {
            double itemCost = Double.parseDouble(txtItemCost.getText());
            double totalCost = Double.parseDouble(txtTotalCost.getText());
            double amount = Double.parseDouble(txtAmount.getText());

            itemCost += amount;
            totalCost += amount;

            txtItemCost.setText(String.valueOf(itemCost));
            txtTotalCost.setText(String.valueOf(totalCost));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void decreasItemCost() {
        try {
            double itemCost = Double.parseDouble(txtItemCost.getText());
            double totalCost = Double.parseDouble(txtTotalCost.getText());
            double amount = Double.parseDouble(tblItems.getValueAt(tblItems.getSelectedRow(), 4).toString());

            itemCost -= amount;
            totalCost -= amount;

            txtItemCost.setText(String.valueOf(itemCost));
            txtTotalCost.setText(String.valueOf(totalCost));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void resetLine() {
        txtPCode.setText("");
        txtPName.setText("");
        txtUnitPrice.setText("0");
        txtQty.setText("0");
        txtAmount.setText("0");
        lblQty.setText("0");
    }

    private void addItem() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) tblItems.getModel();

            Vector<String> itenm = new Vector<>();
            itenm.add(txtPCode.getText());
            itenm.add(txtPName.getText());
            itenm.add(txtUnitPrice.getText());
            itenm.add(txtQty.getText());
            itenm.add(txtAmount.getText());

            dtm.addRow(itenm);
            //txtItemCost.setText(String.valueOf(tblItems.getRowCount()));
            resetLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void removeAllItems() {
        try {
            while (tblItems.getRowCount() > 0) {
                ((DefaultTableModel) tblItems.getModel()).removeRow(0);
            }
            //txtInteCount.setText(String.valueOf(tblItems.getRowCount()));
            txtItemCost.setText("0");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void removeItem() {
        try {
            if (tblItems.getRowCount() > 0) {

                //txtInteCount.setText(String.valueOf(tblItems.getRowCount()));
                decreasItemCost();

                ((DefaultTableModel) tblItems.getModel()).removeRow(tblItems.getSelectedRow());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void calAmount() {
        try {

            double qty = 0;
            double unitPrice = 0;
            double amount = 0;

            if (txtQty.getText().equals("")) {
                txtQty.setText("0");
            }

            qty = Double.parseDouble(txtQty.getText());
            unitPrice = Double.parseDouble(txtUnitPrice.getText());

            amount = (qty * unitPrice);

            txtAmount.setText(String.valueOf(amount));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void calToatlCost() {
        try {

            double itemCost = 0;
            double jobCost = 0;
            double totalCost = 0;

            if (txtJobCost.getText().equals("")) {
                txtJobCost.setText("0");
            }

            itemCost = Double.parseDouble(txtItemCost.getText());
            jobCost = Double.parseDouble(txtJobCost.getText());

            totalCost = (itemCost + jobCost);

            txtTotalCost.setText(String.valueOf(totalCost));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int saveJob() {
        int saveDone = 0;
        ResultSet rs = null;
        try {
            pst = conn.prepareStatement("INSERT INTO repair_jobs(employers_id, customer_id, start_date, start_time, end_date, end_time, job_cost, item_cost, status, user_id) VALUES(?,?,?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            pst.setInt(1, LoggingSession.getUserId());
            pst.setInt(2, cusId);
            pst.setString(3, ((JTextField) dcStart.getDateEditor().getUiComponent()).getText());
            pst.setString(4, tpStart.getText());
            pst.setString(5, ((JTextField) dcEnd.getDateEditor().getUiComponent()).getText());
            pst.setString(6, tpEnd.getText());
            pst.setString(7, txtJobCost.getText());
            pst.setString(8, txtItemCost.getText());
            pst.setString(9, cmbStatus.getModel().getSelectedItem().toString());
            pst.setInt(10, LoggingSession.getUserId());

            pst.executeUpdate();

            rs = pst.getGeneratedKeys();
            if (rs.next()) {
                saveDone = rs.getInt(1);
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
        return saveDone;
    }

    private int saveJobItems(int jobId) {
        int saveDone = 0;
        try {

            conn.setAutoCommit(false);
            pst = conn.prepareStatement("INSERT INTO job_items(repair_job_id, product_code, unit_price, quantity) VALUES(?,?,?,?)");

            for (int i = 0; i < tblItems.getRowCount(); i++) {
                pst.setInt(1, jobId);
                pst.setString(2, tblItems.getValueAt(i, 0).toString());
                pst.setString(3, tblItems.getValueAt(i, 2).toString());
                pst.setString(4, tblItems.getValueAt(i, 3).toString());

                pst.addBatch();
            }

            int[] executeBatch = pst.executeBatch();
            saveDone = executeBatch.length;
            conn.commit();
            conn.setAutoCommit(true);

        } catch (Exception e) {
            e.printStackTrace();
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

    private int updateStock() {
        int saveDone = 0;
        try {

            conn.setAutoCommit(false);
            pst = conn.prepareStatement("UPDATE stock SET qty = (qty - ?) WHERE product_code = ?");

            for (int i = 0; i < tblItems.getRowCount(); i++) {

                pst.setDouble(1, Double.parseDouble(tblItems.getValueAt(i, 3).toString()));
                pst.setString(2, tblItems.getValueAt(i, 0).toString());

                pst.addBatch();
            }

            int[] executeBatch = pst.executeBatch();
            saveDone = executeBatch.length;
            conn.commit();
            conn.setAutoCommit(true);

        } catch (Exception e) {
            e.printStackTrace();
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

    private void filltblJobs() {
        ResultSet rs = null;
        try {
            pst = conn.prepareStatement("SELECT rb.job_id AS 'Job Id', cus.name AS 'Cus Name', rb.start_date AS 'Start Date', rb.start_time AS 'Start Time', rb.end_date AS 'End Date', rb.end_time AS 'End Time', (rb.job_cost + rb.item_cost) AS 'Total Cost', rb.status AS 'Status'  FROM repair_jobs rb INNER JOIN customer cus ON rb.customer_id = cus.id");
            rs = pst.executeQuery();

            //To remove previously added rows
            while (tblJobs.getRowCount() > 0) {
                ((DefaultTableModel) tblJobs.getModel()).removeRow(0);
            }

            // Fill data to tblUser
            tblJobs.setModel(DbUtils.resultSetToTableModel(rs));

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

    private void getJobDataById(int jobId) {
        ResultSet rs = null;
        try {
            pst = conn.prepareStatement("SELECT repair_jobs.job_id, customer.name, repair_jobs.start_date, repair_jobs.start_time, repair_jobs.end_date, repair_jobs.end_time, repair_jobs.job_cost, repair_jobs.item_cost,(repair_jobs.job_cost + repair_jobs.item_cost), repair_jobs.status FROM repair_jobs INNER JOIN customer ON repair_jobs.customer_id = customer.id WHERE repair_jobs.job_id = ?");
            pst.setInt(1, jobId);
            rs = pst.executeQuery();

            if (rs.next()) {
                jobID = rs.getInt(1);
                txtCusName.setText(rs.getString(2));
                dcStart.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString(3)));
                tpStart.setText(rs.getString(4));
                dcEnd.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString(5)));
                tpEnd.setText(rs.getString(6));
                txtJobCost.setText(rs.getString(7));
                txtItemCost.setText(rs.getString(8));
                txtTotalCost.setText(rs.getString(9));
                cmbStatus.getModel().setSelectedItem(rs.getString(10));
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

    private void txtCusNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCusNameKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            getCustomerDataByName(txtCusName.getText());
            txtPCode.requestFocus(true);
        }
    }//GEN-LAST:event_txtCusNameKeyReleased

    private void txtJobCostKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJobCostKeyReleased
        calToatlCost();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            saveJob();
        }
    }//GEN-LAST:event_txtJobCostKeyReleased

    private void txtItemCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemCostActionPerformed

    private void btnLineResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLineResetActionPerformed
        increasItemCost();
        addItem();
        txtQty.requestFocus(true);
    }//GEN-LAST:event_btnLineResetActionPerformed

    private void txtPCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPCodeKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            getProductDataByCode(txtPCode.getText());
            txtQty.requestFocus(true);
        }
    }//GEN-LAST:event_txtPCodeKeyReleased

    private void txtPNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPNameKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            getProductDataByName(txtPName.getText());
            txtQty.requestFocus(true);
        }
    }//GEN-LAST:event_txtPNameKeyReleased

    private void txtQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyReleased
        if (lblQty.getText().equals(txtQty.getText()) || Double.parseDouble(lblQty.getText()) < Double.parseDouble(txtQty.getText())) {
            JOptionPane.showMessageDialog(this, "Qty is not enoghud", "Product Stock", JOptionPane.INFORMATION_MESSAGE);
            txtQty.setText(lblQty.getText());
        }

        calAmount();

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            increasItemCost();
            addItem();
            txtPCode.requestFocus(true);
        }
    }//GEN-LAST:event_txtQtyKeyReleased

    private void btnRemoveAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveAllActionPerformed
        removeAllItems();
    }//GEN-LAST:event_btnRemoveAllActionPerformed

    private void btnRemoveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveItemActionPerformed
        removeItem();
    }//GEN-LAST:event_btnRemoveItemActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        int saveJob = saveJob();
        if (saveJob > 0) {
            int saveJobItems = saveJobItems(saveJob);
            if (saveJobItems > 0) {
                int updateStock = updateStock();
                if (updateStock > 0) {
                    resetAll();
                    removeAllItems();
                    JOptionPane.showMessageDialog(this, "Job Save Done ", "Job Pay", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void tblJobsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblJobsMouseClicked
        if (tblJobs.getModel().getRowCount() > 0) {
            try {
                int row = tblJobs.getSelectedRow();
                jobID = Integer.parseInt(tblJobs.getModel().getValueAt(row, 0).toString());
                getJobDataById(jobID);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_tblJobsMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddCart;
    private javax.swing.JButton btnFinish;
    private javax.swing.JButton btnLineReset;
    private javax.swing.JButton btnRemoveAll;
    private javax.swing.JButton btnRemoveItem;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cmbStatus;
    private com.toedter.calendar.JDateChooser dcEnd;
    private com.toedter.calendar.JDateChooser dcStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblQty;
    private javax.swing.JTable tblItems;
    private javax.swing.JTable tblJobs;
    private com.github.lgooddatepicker.components.TimePicker tpEnd;
    private com.github.lgooddatepicker.components.TimePicker tpStart;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtCusName;
    private javax.swing.JTextField txtItemCost;
    private javax.swing.JTextField txtJobCost;
    private javax.swing.JTextField txtPCode;
    private javax.swing.JTextField txtPName;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtTotalCost;
    private javax.swing.JTextField txtUnitPrice;
    // End of variables declaration//GEN-END:variables
}
