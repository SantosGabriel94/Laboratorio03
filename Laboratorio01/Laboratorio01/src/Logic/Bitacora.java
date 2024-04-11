/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author User
 */
import java.time.LocalDateTime;

public class Bitacora {
    // Attributes
    private int eventId;
    private String event;
    private double amount;
    private LocalDateTime date;
    private double previousBalance;
    private double currentBalance;
    private Account account;

   
    private static int nextId = 1;

   
     public Bitacora(String event, double amount, double previousBalance, double currentBalance, Account account) {
        this.eventId = nextId++;
        this.event = event;
        this.amount = amount;
        this.date = LocalDateTime.now();
        this.previousBalance = previousBalance;
        this.currentBalance = currentBalance;
        this.account = account;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Bitacora.nextId = nextId;
    }
    
     
     

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public double getPreviousBalance() {
        return previousBalance;
    }

    public void setPreviousBalance(double previousBalance) {
        this.previousBalance = previousBalance;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    // Override toString method to provide a string representation of the object
    @Override
    public String toString() {
        return "Bitacora: " + "\n" +
                "EventId: " + eventId + "\n" +
                "Event: " + event + "\n" +
                "Amount: "+ amount + "\n" +
                "Date: " + date + "\n" +
                "PreviousBalance: " + previousBalance +"\n" +
                "CurrentBalance: " + currentBalance +"\n" +
                "Account: " + account +"\n"+
                "-------------------------------------"; 
    }
}
