package com.company;

public class Guest {
    private int id;
    private String name;
    private Room room; // Eller ska en person kunna ha flera rum bokade samtidigt?
    private double bill;

    // Konstruktor 

    Guest(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Guest() {
        
    }

    public void menu() {
        // "Enter your choice:"
        // "1. Book" // Detaljer om ens egen bokning
        // "2. Display booking details"
        // "3. Order food"
        // "4. Checkout"
        // "0. Exit"
    }

    private void bookRoom() {
        // 
        // "1. Display room availability" // skickas till Room.showAvailability()
    }

    private void orderFood() {
        
    }

    private void checkout() {

    }
    
}
