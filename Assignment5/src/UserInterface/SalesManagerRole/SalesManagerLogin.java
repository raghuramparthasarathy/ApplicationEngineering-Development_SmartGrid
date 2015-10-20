/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SalesManagerRole;

import Business.CustomerDirectory;
import Business.Employee;
import Business.EmployeeDirectory;
import Business.MasterOrderCatalog;
import Business.Order;
import Business.SupplierDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Raghuram
 */
public class SalesManagerLogin extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EmployeeDirectory employeeDirectory;
    private SupplierDirectory supplierDirectory;
    private MasterOrderCatalog moc;
    private Order order;
    private Employee employee;

    /**
     * Creates new form SalesManagerLogin
     */
    public SalesManagerLogin(Employee employee,EmployeeDirectory employeeDirectory, SupplierDirectory supplierDirectory, MasterOrderCatalog moc, Order order, JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.employeeDirectory = employeeDirectory;
        this.employee = employee;
        this.supplierDirectory = supplierDirectory;
        this.moc = moc;
        this.order = order;
        employeeComboBox.removeAllItems();
        for (Employee E : employeeDirectory.getEmployeeList()) {
            employeeComboBox.addItem(E);
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

        jLabel1 = new javax.swing.JLabel();
        btnFind = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        employeeComboBox = new javax.swing.JComboBox();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Employee Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 130, 40));

        btnFind.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        btnFind.setText("GO>>");
        btnFind.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 50, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("SALES MANAGER LOGIN");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        employeeComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        employeeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        employeeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeComboBoxActionPerformed(evt);
            }
        });
        add(employeeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 150, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        Employee employee = (Employee) employeeComboBox.getSelectedItem();
        ManageCustomers supplierWorkArea = new ManageCustomers(employee,supplierDirectory, moc, order, userProcessContainer);
        userProcessContainer.add("supplierWorkArea", supplierWorkArea);
        CardLayout Layout = (CardLayout) userProcessContainer.getLayout();
        Layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFindActionPerformed

    private void employeeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeComboBoxActionPerformed

    }//GEN-LAST:event_employeeComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFind;
    private javax.swing.JComboBox employeeComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
