/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface_StoreAdminRole;

import Business.Drug;
import Business.Store;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raghuram
 */
public class ManageStoreDrugCatalogJPanel extends javax.swing.JPanel {

    private Store store;
    private JPanel userProcessContainer;

    /**
     * Creates new form ManageDrugCatalogJPanel
     */
    public ManageStoreDrugCatalogJPanel(Store store, JPanel userProcessContainer) {
        initComponents();
        this.store = store;
        this.userProcessContainer = userProcessContainer;
        txtSName.setText(store.getStoreName());
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) drugTable.getModel();
        dtm.setRowCount(0);
        for (Drug d : store.getDrugCatalog().getDrugList()) {
            Object row[] = new Object[3];
            row[0] = d;
            row[1] = d.getDrugID();
            row[2] = d.getDrugPrice();
            dtm.addRow(row);
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
        drugTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtSName = new javax.swing.JTextField();
        btnDrug = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        drugTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug Name", "Drug ID", "Drug Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(drugTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, 100));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Store");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 170, -1));

        txtSName.setEditable(false);
        txtSName.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        txtSName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(102, 102, 102), null, null));
        add(txtSName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 150, 30));

        btnDrug.setText("Add Drug");
        btnDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrugActionPerformed(evt);
            }
        });
        add(btnDrug, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        btnRemove.setText("Remove Drugs");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        btnView.setText("View Drug Details");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed

        int row = drugTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a drug from the table",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Drug d = (Drug) drugTable.getValueAt(row, 0);
        store.getDrugCatalog().removeDrug(d);
        JOptionPane.showMessageDialog(null, "Drug removed successfully",
                "Information", JOptionPane.INFORMATION_MESSAGE);
        populateTable();
// TODO add your handling code here:
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrugActionPerformed

        CreateNewStoreDrugJPanel CNP = new CreateNewStoreDrugJPanel(userProcessContainer,store.getDrugCatalog());
        userProcessContainer.add("CNP", CNP);
        CardLayout Layout = (CardLayout) userProcessContainer.getLayout();
        Layout.next(userProcessContainer);
// TODO add your handling code here:
    }//GEN-LAST:event_btnDrugActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
     int row = drugTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a product from the table",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            return;
    } 
      Drug d = (Drug) drugTable.getValueAt(row, 0);
        ViewStoreDrugDetailsJPanel VPD = new ViewStoreDrugDetailsJPanel(d, userProcessContainer);
        userProcessContainer.add("VPD", VPD);
        CardLayout Layout = (CardLayout) userProcessContainer.getLayout();
        Layout.next(userProcessContainer);
          
        
// TODO add your handling code here:
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout Layout = (CardLayout) userProcessContainer.getLayout();
        Layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDrug;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnView;
    private javax.swing.JTable drugTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtSName;
    // End of variables declaration//GEN-END:variables
}
