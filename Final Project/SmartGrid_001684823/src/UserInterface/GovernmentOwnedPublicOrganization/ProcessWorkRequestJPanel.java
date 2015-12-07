/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.GovernmentOwnedPublicOrganization;

import Business.WorkQueue.RequestAccessWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Raghuram
 */
public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    RequestAccessWorkRequest request;

    /**
     * Creates new form ProcessWorkRequest
     */
    public ProcessWorkRequestJPanel(JPanel userProcessContainer, RequestAccessWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCID = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("PROCESS WORK REQUEST");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        submitJButton.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        submitJButton.setText("Submit Result");
        submitJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 120, 30));

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel1.setText("Customer ID");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 110, 30));

        txtCID.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        txtCID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtCID, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 120, 30));

        backJButton.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        backJButton.setText("Back");
        backJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 90, 30));

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel5.setText("Result");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 100, 30));

        resultJTextField.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        resultJTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(resultJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 120, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        if (resultJTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter the Result");
            return;

        } else if (txtCID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter a Valid Customer ID");
            return;
        }
        Date d = new Date();
        String resolveDate = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(d);
        request.setResult(resultJTextField.getText());
        request.setResolveDate(d);
        request.setId(Integer.parseInt(txtCID.getText()));
        request.setStatus("Completed");
        JOptionPane.showMessageDialog(null, "Message processed");
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        GrantUserAccessWorkAreaJPanel lwjp = (GrantUserAccessWorkAreaJPanel) component;
        lwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField txtCID;
    // End of variables declaration//GEN-END:variables
}