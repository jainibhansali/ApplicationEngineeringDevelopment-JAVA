/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SecurityPersonnelRole;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.Create_Loan_Mortgage_Soc_WorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JPanel;

/**
 *
 * @author jaini
 */
public class FinalRequestJPanel extends javax.swing.JPanel {
JPanel userProcessContainer;
Create_Loan_Mortgage_Soc_WorkRequest request;
UserAccount account;
    /**
     * Creates new form FinalRequestJPanel
     */
    public FinalRequestJPanel(JPanel userProcessContainer, Create_Loan_Mortgage_Soc_WorkRequest request,UserAccount account) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.request=request;
        this.account=account;
        txtfaMessage.setText(request.getMessage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtfaMessage = new javax.swing.JTextField();
        btnApprove = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnReject = new javax.swing.JButton();

        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        jLabel1.setText("Access Request");

        jLabel2.setText("Reason");

        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(52, 52, 52)
                                .addComponent(txtfaMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btnApprove)
                                .addGap(93, 93, 93)
                                .addComponent(btnReject))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel1)))
                .addContainerGap(339, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtfaMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApprove)
                    .addComponent(btnReject))
                .addContainerGap(185, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        request.setEmployeeFlag(1);
        request.setManagerFlag(1);
        request.setSocFlag(1);
        request.setStatus("Approved.Complete");
        request.setManagerSender(account);
        request.setMessage(txtfaMessage.getText().trim());

    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        request.setEmployeeFlag(0);
        request.setManagerFlag(0);
        request.setSocFlag(0);
        request.setStatus("Reject.Complete");
        request.setManagerSender(account);
        request.setMessage(txtfaMessage.getText().trim());
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtfaMessage;
    // End of variables declaration//GEN-END:variables
}
