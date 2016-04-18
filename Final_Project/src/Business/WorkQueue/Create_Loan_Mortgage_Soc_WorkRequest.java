/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author jaini
 */
public class Create_Loan_Mortgage_Soc_WorkRequest extends WorkRequest {
   private String requestMessage;
   private String customerName;
   private int Id;
   private long number;
   private String address;
   private int zip;
   private long ssn;
   private Date dob;
   private double savingsMoney;
   private double checkinMoney;
    private String debit;
   private String isSavings;
   private String isCheckin;
   //Loan Request
   
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
//Mortagage request
    
    private double principalMorgageAmount;
    private double interest;
    private double downPayment;
    private String assetType;
    private double assetValue;
    private double monthlyMortgagePayment;
    private double amountInterestCharged;
    //calculates the value after of amount on which interest is charged after deducting downpayment
    private double termTime;
    private String mortgageType;
    private String isHome;
    private String isCar;
    
   //Soc request
    
    private String socMessage;
    private UserAccount employeeSender;
    private UserAccount managerSender;
    private UserAccount managerReceiver;
    
    private UserAccount socSender;
    private int employeeFlag;
    private int managerFlag;
    private int socFlag;

    public String getSocMessage() {
        return socMessage;
    }

    public void setSocMessage(String socMessage) {
        this.socMessage = socMessage;
    }

    public UserAccount getManagerReceiver() {
        return managerReceiver;
    }

    public void setManagerReceiver(UserAccount managerReceiver) {
        this.managerReceiver = managerReceiver;
    }

   

    public UserAccount getEmployeeSender() {
        return employeeSender;
    }

    public void setEmployeeSender(UserAccount employeeSender) {
        this.employeeSender = employeeSender;
    }

    public UserAccount getManagerSender() {
        return managerSender;
    }

    public void setManagerSender(UserAccount managerSender) {
        this.managerSender = managerSender;
    }

    public UserAccount getSocSender() {
        return socSender;
    }

    public void setSocSender(UserAccount socSender) {
        this.socSender = socSender;
    }

    public int getEmployeeFlag() {
        return employeeFlag;
    }

    public void setEmployeeFlag(int employeeFlag) {
        this.employeeFlag = employeeFlag;
    }

    public int getManagerFlag() {
        return managerFlag;
    }

    public void setManagerFlag(int managerFlag) {
        this.managerFlag = managerFlag;
    }

    public int getSocFlag() {
        return socFlag;
    }

    public void setSocFlag(int socFlag) {
        this.socFlag = socFlag;
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
    
  
    public String getRequestMessage() {
        return requestMessage;
    }

    public void setRequestMessage(String requestMessage) {
        this.requestMessage = requestMessage;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
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

    public String getDebit() {
        return debit;
    }

    public void setDebit(String debit) {
        this.debit = debit;
    }

    public String getIsSavings() {
        return isSavings;
    }

    public void setIsSavings(String isSavings) {
        this.isSavings = isSavings;
    }

    public String getIsCheckin() {
        return isCheckin;
    }

    public void setIsCheckin(String isCheckin) {
        this.isCheckin = isCheckin;
    }
    
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

    public double getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(double loanTerm) {
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

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public double getPrincipalMorgageAmount() {
        return principalMorgageAmount;
    }

    public void setPrincipalMorgageAmount(double principalMorgageAmount) {
        this.principalMorgageAmount = principalMorgageAmount;
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

    public double getMonthlyMortgagePayment() {
        return monthlyMortgagePayment;
    }

    public void setMonthlyMortgagePayment(double monthlyMortgagePayment) {
        this.monthlyMortgagePayment = monthlyMortgagePayment;
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

    public String getIsHome() {
        return isHome;
    }

    public void setIsHome(String isHome) {
        this.isHome = isHome;
    }

    public String getIsCar() {
        return isCar;
    }

    public void setIsCar(String isCar) {
        this.isCar = isCar;
    }

   
    

  
    
   
 @Override
  public String toString()
{
return requestMessage;   
}   
}
