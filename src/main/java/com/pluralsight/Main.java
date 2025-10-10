package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Transaction> transactions = getTransactionsFromFile();
    // Creating an ArrayList to get transactions/information from the transactions.csv file.

    public static void main(String[] args) {
        String command;
        do {
            System.out.println("What would you like to do?");
            System.out.println(" D) Add Deposit"); // Will prompt for debit info and save it to the csv file.
            System.out.println(" P) Make Payment (Debit)"); // Will prompt for debit info and save it to the csv file.
            System.out.println(" L) Ledger"); // Displays ledger menu.
            System.out.println(" X) Exit"); // Quits/Exits application.
            command = ConsoleHelper.promptForString("Enter your command");
            switch (command) {
                case "D":
                    addDeposit();
                    System.out.println("======================");
                    break;

                case "d":
                    addDeposit();
                    System.out.println("======================");
                    break;

                case "P":
                    makePayment();
                    System.out.println("======================");
                    break;

                case "p":
                    makePayment();
                    System.out.println("======================");
                    break;

                case "L":
                    ledgerMenu();
                    System.out.println("======================");
                    break;

                case "l":
                    ledgerMenu();
                    System.out.println("======================");
                    break;

                case "X":
                    return;

                case "x":
                    return;

                default:
                    System.out.println("Invalid input. Please enter a valid option.");
                    System.out.println("======================");
            }
        } while (command != "X");
        }


    private static void addDeposit() {
        System.out.println("addDeposit works.");
    }

    private static void makePayment() {
        System.out.println("makePayment works.");
    }

    private static void ledgerMenu() {
        System.out.println("ledgerMenu works.");
    }



    public static ArrayList<Transaction>getTransactionsFromFile(){
        ArrayList<Transaction>transactions = new ArrayList<Transaction>();


    return transactions; // Change from null to transactions after changing line 6 from private static to public static.
    }

}
