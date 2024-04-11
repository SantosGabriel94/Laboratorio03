/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;
import Logic.Account;
import java.time.LocalDate;
/**
 *
 * @author User
 */
public class SavingsAccount  extends Account{
    
    private LocalDate startDate;
    private int termMonths;
    private double interestRate;
  
    public SavingsAccount(String number, double balance, String accountHolder,  LocalDate startDate, int termMonths, double interestRate) {
        super(number, balance, accountHolder);
        this.startDate = startDate;
        this.termMonths = termMonths;
        this.interestRate = interestRate;
    }

    
    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    @Override
    public double calculateInterest(int months, double interestRate) {
        double interest = balance * interestRate * months;
        addInterest(interest); 
        return interest;
    }
    
    
    public void depositToSavings(double amount) {
        deposit(amount);
    }
    
    public void withdrawFromSavings(double amount) {
        withdraw(amount);
    }

    @Override
    public String toString() {
        return "SavingsAccount: " + "\n"+
                "TtartDate: " + startDate + "\n"+
                "TermMonths: " + termMonths + "\n"+
                "InterestRate: " + interestRate  ;
    }
    
    
    
}
