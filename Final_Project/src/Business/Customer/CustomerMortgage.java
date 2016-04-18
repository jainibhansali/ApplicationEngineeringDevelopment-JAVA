/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

/**
 *
 * @author jaini
 */
public class CustomerMortgage {
    private double principalAmount;
    
    private double interest;
    private double downPayment;
    private String assetType;
    private double assetValue;
    private double monthlyPayment;
    private double amountInterestCharged;
    //calculates the value after of amount on which interest is charged after deducting downpayment
    private double termTime;
    private String mortgageType;

    public double getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(double principalAmount) {
        this.principalAmount = principalAmount;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public double getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(double assetValue) {
        this.assetValue = assetValue;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public double getAmountInterestCharged() {
        return amountInterestCharged;
    }

    public void setAmountInterestCharged(double amountInterestCharged) {
        this.amountInterestCharged = amountInterestCharged;
    }

    public double getTermTime() {
        return termTime;
    }

    public void setTermTime(double termTime) {
        this.termTime = termTime;
    }

    public String getMortgageType() {
        return mortgageType;
    }

    public void setMortgageType(String mortgageType) {
        this.mortgageType = mortgageType;
    }
    
    
}
