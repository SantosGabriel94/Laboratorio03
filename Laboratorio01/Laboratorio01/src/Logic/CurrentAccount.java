 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import Logic.Account;

/**
 *
 * @author User
 */
public class CurrentAccount extends Account{
     
    private double interestRate;
    
    public CurrentAccount(String number, double balance, String accountHolder,double interestRate) {
        super(number, balance, accountHolder);
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
        double interest = (balance * interestRate) / 12.0;
        addInterest(interest); 
        return interest;
    }
    
    
    public void depositToCurrent(double amount) {
        deposit(amount);
    }
    
    public void withdrawFromCurrent(double amount) {
        withdraw(amount);
    }

    @Override
    public String toString() {
        return "CurrentAccount: " + "\n"+
                "interestRate: " + interestRate ;
    }
    
    
}
