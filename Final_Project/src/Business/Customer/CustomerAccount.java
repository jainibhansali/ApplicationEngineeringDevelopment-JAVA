/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.Date;

/**
 *
 * @author jaini
 */
public class CustomerAccount {
    private String accountType;
    private String hasDebitCard;
    private long debitCardNumber;
    private int cvv;
    private Date validThrough;
    private boolean hasAccount=false;
    private String type;
    private double savingsMoney;
    private double checkinMoney;
  
    
  
    public CustomerAccount()
    {
        hasAccount=true;
        
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String isHasDebitCard() {
        return hasDebitCard;
    }

    public void setHasDebitCard(String hasDebitCard) {
        this.hasDebitCard = hasDebitCard;
    }

    public long getDebitCardNumber() {
        return debitCardNumber;
    }

    public void setDebitCardNumber(long debitCardNumber) {
        this.debitCardNumber = debitCardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public Date getValidThrough() {
        return validThrough;
    }

    public void setValidThrough(Date validThrough) {
        this.validThrough = validThrough;
    }

    public boolean isHasAccount() {
        return hasAccount;
    }

    public void setHasAccount(boolean hasAccount) {
        this.hasAccount = hasAccount;
    }
    
    
    
// public void identifyAccount()
// {
//     if(accountType.equals("Savings Account"))
//     {
//         type.equals("S");
//     }
//     else if(accountType.equals("Checkin Account"))
//     {
//         type.equals("C"); 
//     }
//     else if(accountType.equals("Savings Account") && accountType.equals("Checkin Account")) 
//             {
//                 type.equals("SC");
//             }
// }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSavingsMoney() {
        return savingsMoney;
    }

    public void setSavingsMoney(double savingsMoney) {
        this.savingsMoney = savingsMoney;
    }

    public double getCheckinMoney() {
        return checkinMoney;
    }

    public void setCheckinMoney(double checkinMoney) {
        this.checkinMoney = checkinMoney;
    }

   
 
     
    }
    
    

