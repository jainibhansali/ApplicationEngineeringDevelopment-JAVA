/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import javax.swing.JOptionPane;

/**
 *
 * @author jaini
 */
public class CustomerLoan {
    private double principalAmount;
    private String loanType;
    private double interestRate;
    private double loanTerm;
    private double total;
    private int count;
    private double collateralValue;
    private String collateralType;
    private double monthlyPayment;
    private String isSchool;
    private String isCollege;

    public double getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(double principalAmount) {
        this.principalAmount = principalAmount;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getloanTerm() {
        return loanTerm;
    }

    public void setloanTerm(double loanTerm) {
        this.loanTerm = loanTerm;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getCollateralValue() {
        return collateralValue;
    }

    public void setCollateralValue(double collateralValue) {
        this.collateralValue = collateralValue;
    }

    public String getCollateralType() {
        return collateralType;
    }

    public void setCollateralType(String collateralType) {
        this.collateralType = collateralType;
    }

    public double getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(double loanTerm) {
        this.loanTerm = loanTerm;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public String getIsSchool() {
        return isSchool;
    }

    public void setIsSchool(String isSchool) {
        this.isSchool = isSchool;
    }

    public String getIsCollege() {
        return isCollege;
    }

    public void setIsCollege(String isCollege) {
        this.isCollege = isCollege;
    }
  
    public double calculateCustomerLoan(Customer c,double principalAmount)
    {   
       // CustomerLoan loan=new CustomerLoan();
        if(loanType.equals("School"))
        {
            loanTerm=5;
            interestRate=0.068;
            double interestAmount=(principalAmount*interestRate*loanTerm/100);
            total=interestAmount+principalAmount;
            monthlyPayment=total/12;
            return monthlyPayment;
                         
        } else
        {
            JOptionPane.showMessageDialog(null, "We offer only student and college loans");
        }
    return monthlyPayment;
    }
    public double calculateCollegeCustomerLoan(Customer c,double principalAmount,Double collateralValue )
    {
        if(loanType.equals("College"))
        {  
           for(CustomerAccount ca: c.getCustomerAccountDirectory().getCustomerAccountList())
           {
              if(ca.getSavingsMoney()+collateralValue>principalAmount)
              {
                loanTerm=5;
                interestRate=0.068;
                double interestAmount=(principalAmount*interestRate*loanTerm/100);
                total=interestAmount+principalAmount;
                monthlyPayment=total/12;  
                return monthlyPayment;
              }
              else
              {
                  JOptionPane.showMessageDialog(null, "Collateral or savings account amount must be greater");
              }
           }
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "We offer only student and college loans");
        }
    return monthlyPayment;
    }
    
} 

