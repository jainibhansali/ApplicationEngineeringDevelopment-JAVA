/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.Customer.CustomerAccount;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.RetailOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Create_Loan_Mortgage_Soc_WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jaini
 */
public class RequestMortgageJPanel extends javax.swing.JPanel {
JPanel userProcessContainer;
Enterprise enterprise;
EcoSystem business;
UserAccount account;


    /**
     * Creates new form RequestMortgageJPanel
     */
    public RequestMortgageJPanel(JPanel userProcessContainer,Enterprise enterprise,EcoSystem business,UserAccount account) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        this.business=business;
        this.account=account;
        txtmessage.setText("Mortgage Request");
        
        
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
        txtprincipalAmount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtinterestRate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtdownPayment = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtassetType = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtassetValue = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtmonthlyPayment = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTerm = new javax.swing.JTextField();
        txtfinalAmount = new javax.swing.JTextField();
        btnfinalAmount = new javax.swing.JButton();
        btnmonthlyPayment = new javax.swing.JButton();
        btnRequest = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btninterestRate = new javax.swing.JButton();
        btnTerm = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtmessage = new javax.swing.JTextField();
        jCheckBox1home = new javax.swing.JCheckBox();
        jCheckBox2car = new javax.swing.JCheckBox();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Principal Mortagage Amount");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));
        add(txtprincipalAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 80, -1));

        jLabel2.setText("Interest Rate");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));
        add(txtinterestRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 75, -1));

        jLabel3.setText("DownPayment");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));
        add(txtdownPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 75, -1));

        jLabel4.setText("Asset Type");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));
        add(txtassetType, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 75, -1));

        jLabel5.setText("Asset Value");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));
        add(txtassetValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 75, -1));

        jLabel6.setText("MonthlyPayment");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));
        add(txtmonthlyPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 75, -1));

        jLabel7.setText("Final Amount");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        jLabel9.setText("Term");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));
        add(txtTerm, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 75, -1));
        add(txtfinalAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 75, -1));

        btnfinalAmount.setText("Calculate Final Amount");
        btnfinalAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinalAmountActionPerformed(evt);
            }
        });
        add(btnfinalAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, -1, -1));

        btnmonthlyPayment.setText("Calculate Monthly Payment");
        btnmonthlyPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmonthlyPaymentActionPerformed(evt);
            }
        });
        add(btnmonthlyPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 347, -1, -1));

        btnRequest.setText("Request");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });
        add(btnRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 432, -1, -1));

        jLabel8.setText("Mortgage Request");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 35, -1, -1));

        btninterestRate.setText("Interest Rate Offered");
        btninterestRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninterestRateActionPerformed(evt);
            }
        });
        add(btninterestRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, -1, -1));

        btnTerm.setText("Get Term for repayment");
        btnTerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTermActionPerformed(evt);
            }
        });
        add(btnTerm, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, -1));

        jLabel10.setText("Mortgage Type");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        jLabel11.setText("Message");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, -1, -1));
        add(txtmessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 80, -1));

        jCheckBox1home.setText("Home");
        add(jCheckBox1home, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        jCheckBox2car.setText("Car");
        add(jCheckBox2car, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btninterestRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninterestRateActionPerformed
        // TODO add your handling code here:
       
        if(jCheckBox1home.isSelected()==true)
        {
          
           txtinterestRate.setText(String.valueOf(4.41));           
        }
        else if(jCheckBox2car.isSelected()==true)
        {
          
           txtinterestRate.setText(String.valueOf(5.41));  
        }
        else if(jCheckBox1home.isSelected()==true&&jCheckBox2car.isSelected()==true)
        {
              JOptionPane.showMessageDialog(null,"We can only offer one mortgage at a time");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"We offer only Home or Car loans");
        }
    }//GEN-LAST:event_btninterestRateActionPerformed

    private void btnTermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTermActionPerformed
        // TODO add your handling code here:
        
        
        
         if(jCheckBox1home.isSelected()==true)
        {
          
           txtTerm.setText(String.valueOf(30));           
        }
        else if(jCheckBox2car.isSelected()==true)
        {
          
           txtTerm.setText(String.valueOf(20));  
        }
        else if(jCheckBox1home.isSelected()==true&&jCheckBox2car.isSelected()==true)
        {
              JOptionPane.showMessageDialog(null,"We can only offer one mortgage at a time");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"We offer only Home or Car loans");
        }
    }//GEN-LAST:event_btnTermActionPerformed

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        String message = "Mortgage Request";
        txtmessage.setText(message);
        
        
         for(Customer c: enterprise.getCustomerDirectory().getCustomerList() )
        {    System.out.println("requestId"+account.getPerson().getId());
                System.out.println("CustId"+c.getId());
            if(account.getPerson().getId()==c.getId())
            { 
        
        Create_Loan_Mortgage_Soc_WorkRequest request = new Create_Loan_Mortgage_Soc_WorkRequest();
        request.setMessage(message);
        request.setSender(account);
        request.setStatus("Sent");
        System.out.println("1"+request.getStatus());
        
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof RetailOrganization)
                
                {
                org = organization;
                break;
            
        }}
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            account.getWorkQueue().getWorkRequestList().add(request);
            JOptionPane.showMessageDialog(null, "Request generated");
        }
        request.setPrincipalMorgageAmount(Double.parseDouble(txtprincipalAmount.getText()));
          if(jCheckBox1home.isSelected()==true)
          {
              request.setIsHome(jCheckBox1home.getText());
              request.setMortgageType("Home");
          }
          else if(jCheckBox2car.isSelected()==true)
          {
              request.setIsCar(jCheckBox2car.getText());
                request.setMortgageType("Car");
          }
          else if(jCheckBox1home.isSelected()==true&&jCheckBox2car.isSelected()==true)
          {
              JOptionPane.showMessageDialog(null,"Please apply for one mortgage at a time");
          }
             
       else
          {
              JOptionPane.showMessageDialog(null, "PLease select a check box");
          }
                
        //request.setIsHome(jCheckBox1home.getText());
        //request.setIsCar(jCheckBox2car.getText());
                System.out.println("Home:"+ jCheckBox1home.getText());
                System.out.println("Car:"+ jCheckBox2car.getText());
                
        
        
            
        
        System.out.println("MortgageTye1"+request.getMortgageType());
       
        
        request.setAssetType((txtassetType.getText()));
        request.setTermTime((Double.parseDouble(txtTerm.getText())));
        request.setAmountInterestCharged((Double.parseDouble(txtfinalAmount.getText())));
        request.setAssetValue((Double.parseDouble(txtassetValue.getText())));
        request.setDownPayment((Double.parseDouble(txtdownPayment.getText())));
        request.setInterest((Double.parseDouble(txtinterestRate.getText())));
        request.setMessage(message);
        request.setMonthlyMortgagePayment(Double.parseDouble(txtmonthlyPayment.getText()));
        request.setId(account.getPerson().getId());
                System.out.println("original:"+request.getId());
                System.out.println("original2:"+account.getPerson().getId());
                
                
        
                System.out.println("MONTHLY PAYMENT FINAL"+txtmonthlyPayment.getText());
                
                System.out.println("REquest value"+ request.getMonthlyMortgagePayment());
            }
        }
    }//GEN-LAST:event_btnRequestActionPerformed

    private void btnfinalAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinalAmountActionPerformed
        // TODO add your handling code here:
        double downPayment=(Double.parseDouble(txtdownPayment.getText()));
        double principal=(Double.parseDouble(txtprincipalAmount.getText()));
        double finalAmount=0.0;
        finalAmount =principal-downPayment;        
        if(downPayment<principal && downPayment>0)
        {
            txtfinalAmount.setText(String.valueOf(finalAmount));
        }
        else if(downPayment>principal && downPayment>0)
        {
            JOptionPane.showMessageDialog(null, "Invalid");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please enter valid downpayment");
        }
    }//GEN-LAST:event_btnfinalAmountActionPerformed

    private void btnmonthlyPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmonthlyPaymentActionPerformed
        // TODO add your handling code here:
        Double asset=(Double.parseDouble(txtassetValue.getText()));
        double principalAmount=Double.parseDouble(txtprincipalAmount.getText());
        double finalValue=Double.parseDouble(txtfinalAmount.getText().trim());
       
        for(Customer c: enterprise.getCustomerDirectory().getCustomerList())
        {
            if(c.getId()==account.getPerson().getId())
           {
                for(CustomerAccount ca:c.getCustomerAccountDirectory().getCustomerAccountList())
                { 
                    if(ca.getSavingsMoney()+asset>finalValue)
                    {
         double monthlyPayment;
        
        double interest=Double.parseDouble(txtinterestRate.getText());
       System.out.println("Interest"+interest);
       double interest1=interest/100;
        double newInterest=interest1/12;
        System.out.println("newInterest"+newInterest);
        double term=Double.parseDouble(txtTerm.getText());
        System.out.println("term"+term);
        double newTerm=term*12;
        System.out.println("newTerm"+newTerm);
       // String type=txtmortgageType.getText();
        double amount=Double.parseDouble(txtfinalAmount.getText());
        
        double part1=(1 + newInterest);
        System.out.println("part1"+part1);
        double final1=Math.pow(part1, newTerm);
        System.out.println("final1"+final1);
        
        
        
        monthlyPayment = amount*(newInterest*(final1))/(final1- 1);
        System.out.println("mpayment"+monthlyPayment);
        txtmonthlyPayment.setText(String.valueOf(monthlyPayment));
         
        
            }
                    else
                    {
                       JOptionPane.showMessageDialog(null, "Cannot sanction mortgage due to insufficient balance"); 
                    }
            }
        
            
        } 
            
        } 
    }//GEN-LAST:event_btnmonthlyPaymentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRequest;
    private javax.swing.JButton btnTerm;
    private javax.swing.JButton btnfinalAmount;
    private javax.swing.JButton btninterestRate;
    private javax.swing.JButton btnmonthlyPayment;
    private javax.swing.JCheckBox jCheckBox1home;
    private javax.swing.JCheckBox jCheckBox2car;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtTerm;
    private javax.swing.JTextField txtassetType;
    private javax.swing.JTextField txtassetValue;
    private javax.swing.JTextField txtdownPayment;
    private javax.swing.JTextField txtfinalAmount;
    private javax.swing.JTextField txtinterestRate;
    private javax.swing.JTextField txtmessage;
    private javax.swing.JTextField txtmonthlyPayment;
    private javax.swing.JTextField txtprincipalAmount;
    // End of variables declaration//GEN-END:variables
}
