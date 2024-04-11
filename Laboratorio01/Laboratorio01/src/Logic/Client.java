/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author User
 */
public class Client {
    
    private String idNumber;
    private String name;
    private String phoneNumber;
    private String address;

   
    public Client(String idNumber, String name, String phoneNumber, String address) {
        this.idNumber = idNumber;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // Getters and Setters
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public String toString() {
        return "Client: " + "\n" +
                "IdNumber: " + idNumber +  "\n" +
                "Name: " + name +  "\n" +
                "PhoneNumber: " + phoneNumber +  "\n" +
                "Address: " + address + "\n" +
                "---------------------------------------"
                ;
    }
    
}
