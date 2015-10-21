package UserInterface;

import Business.Business;
import Business.CustomerDirectory;
import Business.EmployeeDirectory;
import Business.Init;
import Business.MasterOrderCatalog;
import Business.Order;
import Business.SupplierDirectory;
import UserInterface.AdminstrativeRole.AdminWorkAreaJPanel;
import UserInterface.ReportGeneration.ReportJPanel;

import UserInterface.SalesManagerRole.SalesManagerWorkAreaJPanel;
import UserInterface.SupplierRole.LoginSupplier;
import java.awt.CardLayout;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private Business business;
    private SupplierDirectory supplierDirectory;
    private CustomerDirectory customerDirectory;
    private EmployeeDirectory employeeDirectory;
    private MasterOrderCatalog moc;
    private Order order;
    private Init init;

    public MainJFrame() {
        initComponents();
        //supplierDirectory = new SupplierDirectory();
        setSize(1000, 800);
        business = new Business();
        order = business.getOrder();
        customerDirectory = business.getCustomerDirectory();
        employeeDirectory = business.getEmployeeDirectory();
        supplierDirectory = business.getSupplierDirectory();
        moc = business.getMasterOrderCatalog();
        init = new Init();
        supplierDirectory = init.populateFields();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnAdmin = new javax.swing.JButton();
        btnSupplierManager = new javax.swing.JButton();
        btnSalesManager = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(200);

        btnAdmin.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        btnAdmin.setText("Administrator");
        btnAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnSupplierManager.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        btnSupplierManager.setText("Supplier Manager");
        btnSupplierManager.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSupplierManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierManagerActionPerformed(evt);
            }
        });

        btnSalesManager.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        btnSalesManager.setText("Sales Manager");
        btnSalesManager.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSalesManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalesManagerActionPerformed(evt);
            }
        });

        btnReport.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N
        btnReport.setText("Report Generation");
        btnReport.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnSupplierManager, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                        .addComponent(btnAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalesManager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSupplierManager, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalesManager, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        userProcessContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(userProcessContainer);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed

        AdminWorkAreaJPanel awajp = new AdminWorkAreaJPanel(userProcessContainer, employeeDirectory, supplierDirectory);
        userProcessContainer.add("AdminWorkAreaJPanel", awajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnSupplierManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierManagerActionPerformed

        LoginSupplier ls = new LoginSupplier(userProcessContainer, supplierDirectory);
        userProcessContainer.add("LoginSupplierJPanel", ls);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSupplierManagerActionPerformed

    private void btnSalesManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesManagerActionPerformed
        SalesManagerWorkAreaJPanel smwajp = new SalesManagerWorkAreaJPanel(employeeDirectory, supplierDirectory, moc, order, userProcessContainer);
        userProcessContainer.add("smwajp", smwajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalesManagerActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        ReportJPanel smwajp = new ReportJPanel(employeeDirectory, moc, userProcessContainer);
        userProcessContainer.add("smwajp", smwajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnSalesManager;
    private javax.swing.JButton btnSupplierManager;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables

}
