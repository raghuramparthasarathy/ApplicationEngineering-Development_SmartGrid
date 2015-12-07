/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.IndustryEmployeeWorkArea;

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
public class IndustryEmployeeWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Organization organization;
    private Person person;
    private Appliance appliance;

    /**
     * Creates new form HouseHoldWorkAreaJPanel
     */
    public IndustryEmployeeWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount account,Organization organization) {
        initComponents();
        System.out.print("Organization"+organization);
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = organization;
        this.userAccount = account;
        
     System.out.println("person inside workarea" + person);
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
        btnInputAppliances = new javax.swing.JButton();
        payEBill = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("INDUSTRY EMPLOYEE WORKAREA ");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        backJButton.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 70, 30));

        btnAccess.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        btnAccess.setText("Request Access");
        btnAccess.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccessActionPerformed(evt);
            }
        });
        add(btnAccess, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 240, 40));

        btnInputAppliances.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        btnInputAppliances.setText("Input Appliances");
        btnInputAppliances.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnInputAppliances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputAppliancesActionPerformed(evt);
            }
        });
        add(btnInputAppliances, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 240, 40));

        payEBill.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        payEBill.setText("Sensor Input");
        payEBill.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        payEBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payEBillActionPerformed(evt);
            }
        });
        add(payEBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 240, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccessActionPerformed
        RequestAccessJPanel requestAccessJPanel = new RequestAccessJPanel(userProcessContainer,enterprise,userAccount, organization,person);
        userProcessContainer.add("requestAccessJPanel", requestAccessJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAccessActionPerformed

    private void btnInputAppliancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputAppliancesActionPerformed
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

//         TODO add your handling code here:
    }//GEN-LAST:event_btnInputAppliancesActionPerformed

    private void payEBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payEBillActionPerformed
        SensorInputJPanel sensorInput = new SensorInputJPanel(userProcessContainer);
        userProcessContainer.add("SensorInput", sensorInput);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_payEBillActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnAccess;
    private javax.swing.JButton btnInputAppliances;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton payEBill;
    // End of variables declaration//GEN-END:variables
}