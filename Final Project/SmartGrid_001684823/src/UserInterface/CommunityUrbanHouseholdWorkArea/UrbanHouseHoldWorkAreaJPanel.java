/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CommunityUrbanHouseholdWorkArea;

import Business.Appliances.Appliance;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Raghuram
 */
public class UrbanHouseHoldWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Organization organization;
    private Person person;
    private Appliance appliance;

    /**
     * Creates new form HouseHoldWorkAreaJPanel
     */
    public UrbanHouseHoldWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount account,
            Organization organization) {
        initComponents();
        System.out.print("Organization" + organization);
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = organization;
        this.userAccount = account;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        btnAccess = new javax.swing.JButton();
        reqEBill = new javax.swing.JButton();
        sensorInput = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("URBAN HOUSEHOLD WORKAREA ");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 280, -1));

        backJButton.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 70, 30));

        btnAccess.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        btnAccess.setText("Request Access");
        btnAccess.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccessActionPerformed(evt);
            }
        });
        add(btnAccess, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 240, 40));

        reqEBill.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        reqEBill.setText("Input Appliances");
        reqEBill.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        reqEBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqEBillActionPerformed(evt);
            }
        });
        add(reqEBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 240, 40));

        sensorInput.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        sensorInput.setText("Sensor Input");
        sensorInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sensorInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sensorInputActionPerformed(evt);
            }
        });
        add(sensorInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 240, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccessActionPerformed
        RequestAccessJPanel requestAccessJPanel = new RequestAccessJPanel(userProcessContainer, enterprise, userAccount, organization, person);
        userProcessContainer.add("requestAccessJPanel", requestAccessJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAccessActionPerformed

    private void reqEBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqEBillActionPerformed
        for (Person p : organization.getPersonDirectory().getPersonList()) {
            if (p.getName().equals(userAccount.getPerson().getName())) {
                person = p;
            }
        }
        System.out.println("person inside " + person);
        InputAppliancesJPanel aawj = new InputAppliancesJPanel(userProcessContainer, userAccount, organization, enterprise, appliance, person);
        userProcessContainer.add("aawj", aawj);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_reqEBillActionPerformed

    private void sensorInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sensorInputActionPerformed
        SensorInputJPanel sensorInput = new SensorInputJPanel(userProcessContainer);
        userProcessContainer.add("SensorInput", sensorInput);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_sensorInputActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnAccess;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton reqEBill;
    private javax.swing.JButton sensorInput;
    // End of variables declaration//GEN-END:variables
}