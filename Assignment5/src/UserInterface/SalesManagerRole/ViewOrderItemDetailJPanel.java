/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SalesManagerRole;


import Business.OrderItem;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Zerel
 */
public class ViewOrderItemDetailJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    OrderItem orderItem;
    
    /**
     * Creates new form ViewOrderItemDetailJPanel
     */
    public ViewOrderItemDetailJPanel(JPanel upc, OrderItem oi) {
        initComponents();
        userProcessContainer = upc;
        orderItem = oi;
        txtProductName.setText(orderItem.getProduct().getProdName());
        txtProductId.setText(Integer.toString(orderItem.getProduct().getModelNumber()));
        txtSalesPrice.setText(Integer.toString(orderItem.getProduct().getPrice()));
        txtQuantity.setText(Integer.toString(orderItem.getQuantity()));
        txtPaidPrice.setText(Integer.toString(orderItem.getSalesPrice()));
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
        jLabel2 = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        backButton1 = new javax.swing.JButton();
        txtProductId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSalesPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPaidPrice = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("VIEW ORDER ITEM DETAIL");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 66, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Product Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, 30));

        txtProductName.setEditable(false);
        txtProductName.setBackground(new java.awt.Color(255, 255, 255));
        txtProductName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtProductName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 159, -1));

        backButton1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        backButton1.setText("<< BACK");
        backButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        add(backButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 110, -1));

        txtProductId.setEditable(false);
        txtProductId.setBackground(new java.awt.Color(255, 255, 255));
        txtProductId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtProductId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 159, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Product ID:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Price:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 50, 40));

        txtSalesPrice.setEditable(false);
        txtSalesPrice.setBackground(new java.awt.Color(255, 255, 255));
        txtSalesPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSalesPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtSalesPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 160, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Quantity");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 70, -1));

        txtQuantity.setEditable(false);
        txtQuantity.setBackground(new java.awt.Color(255, 255, 255));
        txtQuantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtQuantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 160, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Paid Price");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 80, -1));

        txtPaidPrice.setEditable(false);
        txtPaidPrice.setBackground(new java.awt.Color(255, 255, 255));
        txtPaidPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPaidPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPaidPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaidPriceActionPerformed(evt);
            }
        });
        add(txtPaidPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 160, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButton1ActionPerformed

    private void txtPaidPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaidPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaidPriceActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtPaidPrice;
    private javax.swing.JTextField txtProductId;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSalesPrice;
    // End of variables declaration//GEN-END:variables
}
