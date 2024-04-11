/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;
import java.time.LocalDate;
/**
 *
 * @author User
 */
public abstract class Account {
   
    protected String number;
    protected double balance;
    protected String accountHolder;

    
    public Account(String number, double balance, String accountHolder) {
        this.number = number;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double calculateInterest(int months, double interestRate);
    
    public void addInterest(double interest) {
        balance += interest;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    @Override
    public String toString() {
        return "Account: " + "number=" + number +"\n"+ 
                "Balance: " + balance + "\n"+
                "AccountHolder: " + accountHolder ;
    }
    
    
}
