/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package View;
import Logic.Bitacora;
import Logic.CurrentAccount;
import Logic.SavingsAccount;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Laboratorio01 {

    public static void main(String[] args) {
        // Creating vectors to store accounts and transactions
        ArrayList<Bitacora> savingsTransactions = new ArrayList<>();
        ArrayList<Bitacora> currentTransactions = new ArrayList<>();

        // Creating savings accounts
        SavingsAccount savingsAccount1 = new SavingsAccount("SA001", 1000.0, "John Doe", LocalDate.now(), 12, 0.05);
        SavingsAccount savingsAccount2 = new SavingsAccount("SA002", 2000.0, "Jane Smith", LocalDate.now(), 12, 0.05);

        // Creating current accounts
        CurrentAccount currentAccount1 = new CurrentAccount("CA001", 2000.0, "Jack Johnson", 0.02);
        CurrentAccount currentAccount2 = new CurrentAccount("CA002", 3000.0, "Emily Brown", 0.02);

        // Performing transactions on savings account 1
        double previousSavingsBalance1 = savingsAccount1.getBalance();
        double depositAmount1 = 500.0;
        savingsAccount1.deposit(depositAmount1);
        double currentSavingsBalance1 = savingsAccount1.getBalance();
        savingsTransactions.add(new Bitacora("Deposit", depositAmount1, previousSavingsBalance1, currentSavingsBalance1, savingsAccount1));

        previousSavingsBalance1 = currentSavingsBalance1;
        double withdrawAmount1 = 200.0;
        savingsAccount1.withdraw(withdrawAmount1);
        currentSavingsBalance1 = savingsAccount1.getBalance();
        savingsTransactions.add(new Bitacora("Withdrawal", withdrawAmount1, previousSavingsBalance1, currentSavingsBalance1, savingsAccount1));

        // Performing transactions on current account 1
        double previousCurrentBalance1 = currentAccount1.getBalance();
        double depositAmount2 = 1000.0;
        currentAccount1.deposit(depositAmount2);
        double currentCurrentBalance1 = currentAccount1.getBalance();
        currentTransactions.add(new Bitacora("Deposit", depositAmount2, previousCurrentBalance1, currentCurrentBalance1, currentAccount1));

        previousCurrentBalance1 = currentCurrentBalance1;
        double withdrawAmount2 = 500.0;
        currentAccount1.withdraw(withdrawAmount2);
        currentCurrentBalance1 = currentAccount1.getBalance();
        currentTransactions.add(new Bitacora("Withdrawal", withdrawAmount2, previousCurrentBalance1, currentCurrentBalance1, currentAccount1));

        // Printing out the logs for savings account transactions
        System.out.println("Transactions for Savings Accounts:");
        for (Bitacora transaction : savingsTransactions) {
            System.out.println(transaction);
        }

        // Printing out the logs for current account transactions
        System.out.println("\nTransactions for Current Accounts:");
        for (Bitacora transaction : currentTransactions) {
            System.out.println(transaction);
        }
    }
}

    
    
    
    
    
    
    
    
    
    

