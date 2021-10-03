package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    // Username
    private static final String USERNAME = "root";
    // password
    private static final String PASSWORD = "mysql12345!";
    // link till min databas
    private static final String LINK = "jdbc:mysql://localhost:3306/hotelTransylvania";

    private static Statement sqlStatement = null;

    public static void main(String[] args) throws SQLException {

        System.out.println("Hej Robert, testar Git //Mio");
        System.out.println("hej mio tack för hjälpen");

        Connection connect = null;
       
        try {
      
            connect = DriverManager.getConnection(LINK, USERNAME, PASSWORD);
            System.out.println("Connected to database");
        
            sqlStatement = connect.createStatement();

            startMenu();
        
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
      
        if (connect != null) {
            connect.close();
        }
        
    }

    public static void startMenu() {
        boolean exit = false;

        System.out.println("\nWelcome");

        while (!exit) { // Jag har vant mig vid databas-Fredriks struktur för att loopa och bryta loopar i menyer, kan göras på annat sätt
            
            System.out.println(
                "\nChoose view"+
                "\n1. Guest"+
                "\n2. Management"+
                "\n0. Exit" // Praktiskt att alltid ha Exit/Go back som alternativ 0
            );
            String key = sc.nextLine();
            // Borde input i menyvalen egentligen parseas till ints (och felhanteras) eller ska vi köra Strings med siffror?
            // Detta är ett enkelt och fungerande koncept men kanske inte best practice

            switch (key) {
                case "1":
                    guestLogin();
                    break;
                case "2":
                    receptionLogin();
                default:
                    exit = true;
                    break;
            }
        }
    }

    public static void guestLogin() {

        System.out.println("Log in with ID:");
        // <input>

        // Hämta från databasen och lägg i Guest-objekt?
        Guest guest = new Guest();

        guest.menu();
    }

    private static void receptionLogin() {
        
        // "Staff password:"
        // <input>

        // Hämta
    }

    // Metoder som är gemensamma för Reception och GuestView kan läggas här
    // T.ex execution av bokning och ändringar i databas och filer
    // T.ex felhantering av input

}