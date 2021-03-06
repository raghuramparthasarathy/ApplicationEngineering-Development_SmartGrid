/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminstrativeRole;

import Business.Product;
import Business.Supplier;
import Business.SupplierDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raghuram
 */
public class AddProductPriceJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private SupplierDirectory supplierDirectory;
    private Product product;

    /**
     * Creates new form AddProductPriceJPanel
     */
    public AddProductPriceJPanel(JPanel userProcessContainer, SupplierDirectory supplierDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.supplierDirectory = supplierDirectory;
        populateSupplierCombo();
        refreshTable();

    }

    private void populateSupplierCombo() {
        supplierCombo.removeAllItems();

        for (Supplier supplier : supplierDirectory.getSupplierlist()) {

            supplierCombo.addItem(supplier);
        }

    }

    public void refreshTable() {
        Supplier supplier = (Supplier) supplierCombo.getSelectedItem();
        int rowCount = productTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        for (Product p : supplier.getProductCatalog().getProductcatalog()) {
            Object row[] = new Object[3];
            row[0] = p;
            row[1] = p.getModelNumber();
            row[2] = p.getPrice();
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAvail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFPrice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        supplierCombo = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtTPrice = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Product ID", "Target Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 375, 140));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Product ID:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 100, 30));

        idField.setEditable(false);
        idField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        idField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 160, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Product Price:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 110, 30));

        priceField.setEditable(false);
        priceField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        priceField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(priceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 160, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Product Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, 30));

        nameField.setEditable(false);
        nameField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 160, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Availability:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        txtAvail.setEditable(false);
        txtAvail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAvail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtAvail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAvailActionPerformed(evt);
            }
        });
        add(txtAvail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 160, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Ceiling Price:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 110, 30));

        txtCPrice.setEditable(false);
        txtCPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtCPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 160, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Floor Price:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 110, 30));

        txtFPrice.setEditable(false);
        txtFPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtFPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtFPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 160, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Supplier:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 170, -1));

        btnUpdate.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        btnUpdate.setText("Update Product");
        btnUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 176, -1));

        btnSave.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, 70, -1));

        btnView.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        btnView.setText("View Product Detail >>");
        btnView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 260, -1));

        supplierCombo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        supplierCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierComboActionPerformed(evt);
            }
        });
        add(supplierCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 150, 30));

        btnBack.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 80, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Target Price:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 110, 30));

        txtTPrice.setEditable(false);
        txtTPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtTPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 160, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void txtAvailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAvailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvailActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        //txtId.setEditable(true);
        txtTPrice.setEditable(true);
        txtCPrice.setEditable(true);
        txtFPrice.setEditable(true);
        btnUpdate.setEnabled(false);
        btnSave.setEnabled(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        int row = productTable.getSelectedRow();

        Product p = (Product) productTable.getValueAt(row, 0);
        if (!txtCPrice.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Enter a Ceiling Price");
            return;
        } else if (!txtTPrice.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Enter a Target Price");
            return;
        } else if (!txtFPrice.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Enter a Floor Price");
            return;
        }
        p.setTargetPrice(Integer.parseInt(txtTPrice.getText()));
        p.setCeilingPrice(Integer.parseInt(txtCPrice.getText()));
        p.setFloorPrice(Integer.parseInt(txtFPrice.getText()));

        JOptionPane.showMessageDialog(null, "Sales price details saved successfully",
                "Information", JOptionPane.INFORMATION_MESSAGE);
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
        txtCPrice.setEditable(false);
        txtTPrice.setEditable(false);
        txtFPrice.setEditable(false);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed

        int row = productTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        Product p = (Product) productTable.getValueAt(row, 0);
        nameField.setText(p.getProdName());
        idField.setText(String.valueOf(p.getModelNumber()));
        priceField.setText(String.valueOf(p.getPrice()));
        txtAvail.setText(String.valueOf(p.getAvail()));
        txtTPrice.setText(String.valueOf(p.getTargetPrice()));
        txtCPrice.setText(String.valueOf(p.getCeilingPrice()));
        txtFPrice.setText(String.valueOf(p.getFloorPrice()));
    }//GEN-LAST:event_btnViewActionPerformed

    private void supplierComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierComboActionPerformed
        // TODO add your handling code here:
        refreshTable();
    }//GEN-LAST:event_supplierComboActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField priceField;
    private javax.swing.JTable productTable;
    private javax.swing.JComboBox supplierCombo;
    private javax.swing.JTextField txtAvail;
    private javax.swing.JTextField txtCPrice;
    private javax.swing.JTextField txtFPrice;
    private javax.swing.JTextField txtTPrice;
    // End of variables declaration//GEN-END:variables
}
