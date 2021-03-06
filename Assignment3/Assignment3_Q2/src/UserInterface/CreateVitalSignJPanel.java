/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Person;
import Business.VitalSign;
import Business.VitalSignHistory;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Raghuram
 */
public class CreateVitalSignJPanel extends javax.swing.JPanel {

    private Person person;
    private JPanel userProcessContainer;

    /**
     * Creates new form CreateVitalSignJPanel
     */
    public CreateVitalSignJPanel(Person person, JPanel userProcessContainer) {
        initComponents();
        this.person = person;
        this.userProcessContainer = userProcessContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRespiiratoryRate = new javax.swing.JLabel();
        txtRespiratoryRate = new javax.swing.JTextField();
        lblHeartRate = new javax.swing.JLabel();
        lblBP = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        btnCreateVitalSign = new javax.swing.JButton();
        txtHeartRate = new javax.swing.JTextField();
        txtBP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRespiiratoryRate.setText("Respiratory Rate");
        add(lblRespiiratoryRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, 20));

        txtRespiratoryRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRespiratoryRateActionPerformed(evt);
            }
        });
        add(txtRespiratoryRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 110, -1));

        lblHeartRate.setText("Heart Rate");
        add(lblHeartRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        lblBP.setText("Systolic Blood Pressure");
        add(lblBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        lblWeight.setText("Weight in pounds");
        add(lblWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        btnCreateVitalSign.setText("Create Vital Sign");
        btnCreateVitalSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateVitalSignActionPerformed(evt);
            }
        });
        add(btnCreateVitalSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, 20));

        txtHeartRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeartRateActionPerformed(evt);
            }
        });
        add(txtHeartRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 110, -1));

        txtBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBPActionPerformed(evt);
            }
        });
        add(txtBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 110, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("CREATE VITAL SIGN");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        txtWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeightActionPerformed(evt);
            }
        });
        add(txtWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 110, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void txtRespiratoryRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRespiratoryRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRespiratoryRateActionPerformed

    private void btnCreateVitalSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateVitalSignActionPerformed

        if (!txtRespiratoryRate.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Enter a valid Respiratory Rate");
            return;
        } else if (!txtHeartRate.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Enter a valid Heart Rate");
            return;
        } else if (!txtBP.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Enter a valid Blood Pressure");
            return;
        } else if (!txtWeight.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Enter a valid the Weight");
            return;
        }
        float respiratoryRate = Float.parseFloat(txtRespiratoryRate.getText().trim());
        float heartRate = Float.parseFloat(txtHeartRate.getText().trim());
        float bloodPressure = Float.parseFloat(txtBP.getText().trim());
        float weight = Float.parseFloat(txtWeight.getText().trim());
        VitalSignHistory vitalSignHistory = person.getPatient().getVitalSignHistory();
        VitalSign vs = vitalSignHistory.addVitalSign();
        vs.setRespiratoryRate(respiratoryRate);
        vs.setHeartRate(heartRate);
        vs.setBloodPressure(bloodPressure);
        vs.setWeight(weight);
        String timeStamp = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(new Date());
        vs.setTimeStamp(timeStamp);
        //        java.util.Date date= new java.util.Date();
        //        Timestamp1 = String.valueOf(new Timestamp(date.getTime()));

        JOptionPane.showMessageDialog(null, "Vital Sign has been saved successfully!!!", "Information", JOptionPane.INFORMATION_MESSAGE);
        resetFields();
        
        
    }
    public void resetFields() {
        txtRespiratoryRate.setText("");
        txtHeartRate.setText("");
        txtBP.setText("");
        txtWeight.setText("");
    

    // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateVitalSignActionPerformed

    private void txtHeartRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeartRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeartRateActionPerformed

    private void txtBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBPActionPerformed

    private void txtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout Layout = (CardLayout) userProcessContainer.getLayout();
        Layout.previous(userProcessContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateVitalSign;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblBP;
    private javax.swing.JLabel lblHeartRate;
    private javax.swing.JLabel lblRespiiratoryRate;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JTextField txtBP;
    private javax.swing.JTextField txtHeartRate;
    private javax.swing.JTextField txtRespiratoryRate;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
