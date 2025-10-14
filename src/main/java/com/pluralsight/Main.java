package com.pluralsight;

import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class Main {
    public static ArrayList<Transaction> transactions = getTransactionsFromFile();
    // Creating an ArrayList to get transactions/information from the transactions.csv file.



    public static void main(String[] args) {
        System.out.println("=======================");
        System.out.println("Welcome to Ledger Pro!");
        System.out.println("=======================");
        System.out.println();
        String command;
        do {
            String homeMenu = "What would you like to do?\n D) Add Deposit\n P) Make Payment (Debit)\n L) Ledger\n X) Exit\n";
            System.out.println(homeMenu);

            command = ConsoleHelper.promptForString("Enter your command").toLowerCase();
            switch (command) {
                case "d":
                    addDeposit();
                    System.out.println("======================");
                    break;

                case "p":
                    makePayment();
                    System.out.println("======================");
                    break;

                case "l":
                    ledgerMenu();
                    System.out.println("======================");
                    break;

                case "x":
                    return;

                default:
                    System.out.println("Invalid input. Please enter a valid option.");
                    System.out.println("======================");
            }
        } while (command !="x");
        }


    private static void addDeposit() {
        String depositDesc = ConsoleHelper.promptForString("Enter deposit information");
        String depositVendor = ConsoleHelper.promptForString("Enter vendor");
        double depositAmount = ConsoleHelper.promptForDouble("Enter amount");
        System.out.println("Thank you, information has been added.");
        Transaction newDeposit = new Transaction(LocalDate.now(),LocalTime.now(),depositDesc,depositVendor,depositAmount);
        Main.transactions.add(newDeposit);

//        Formatting the recorded time.
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        String formattedDate = newDeposit.getDate().format(dateFormatter);
        String formattedTime = newDeposit.getTime().format(timeFormatter);

        try  {
            FileWriter fw = new FileWriter("transactions.csv",true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write(formattedDate + "|" + formattedTime + "|" + newDeposit.getDesc() + "|" + newDeposit.getVendor() + "|" + newDeposit.getAmount());
            bw.close();
        } catch (IOException e) {
            System.out.println("Something is wrong with addProduct()...");
        }
    }

    private static void makePayment() {
        LocalDateTime.now();
        String paymentDesc = ConsoleHelper.promptForString("Enter payment description");
        String paymentVendor = ConsoleHelper.promptForString("Enter vendor");
        double paymentAmount = ConsoleHelper.promptForDouble("Enter amount");
        System.out.println("Thank you, payment has been confirmed.");
        Transaction newPayment = new Transaction(LocalDate.now(),LocalTime.now(),paymentDesc,paymentVendor,-paymentAmount);
        Main.transactions.add(newPayment);
        //        Formatting the recorded time.
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        String formattedDate = newPayment.getDate().format(dateFormatter);
        String formattedTime = newPayment.getTime().format(timeFormatter);

        try  {
            FileWriter fw = new FileWriter("transactions.csv",true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write(formattedDate + "|" + formattedTime + "|" + newPayment.getDesc() + "|" + newPayment.getVendor() + "|" + newPayment.getAmount());
            bw.close();
        } catch (IOException e) {
            System.out.println("Something is wrong with addProduct()...");
        }
    }
// Ledgers Menu: ------------------------------------------------------------------------------------------------------------------------------------
    private static void ledgerMenu() {
        System.out.println("Loading ledger: ");
        String ledgerMenu = "Choose an option: \n A) All\n D) Deposits\n P) Payments\n R) Reports\n H) Home\n";
        String ledgerCommand;
        do{
            System.out.println(ledgerMenu);
            ledgerCommand = ConsoleHelper.promptForString("Enter your command").toUpperCase();
            switch (ledgerCommand){
                case "A":
                    displayEntries();
                    System.out.println("======================");
                    break;

                case "D":
                    displayDEntries();
                    System.out.println("======================");
                    break;

                case "P":
                    displayNegativeEntries();
                    System.out.println("======================");
                    break;

                case "R":
                    reportsMenu();
                    System.out.println("======================");
                    break;

                case "H":
                    return;
            }


        } while (ledgerCommand != "H");
    }

    private static void displayEntries() {
        System.out.println("All entries: ");
        for (Transaction e : transactions){
            System.out.println(e);
        }
    }

    private static void displayDEntries() {
        System.out.println("displayDEntries works.");
    }

    private static void displayNegativeEntries() {
        System.out.println("displayNegativeEntries works.");
    }
// -----------------------------------------------------------------------------------------------------------------------------------------------------
    // Reports Menu:
    private static void reportsMenu() {
        System.out.println("Loading ledger: ");
        String reportMenu = "Choose an option: \n 1) Month to Date\n 2) Previous Month\n 3) Year to Date\n 4) Previous Year\n 5) Search by Vendor\n 0) Back";
        int reportCommand;
        do{
            System.out.println(reportMenu);
            reportCommand = ConsoleHelper.promptForInt("Enter your command");
            switch (reportCommand){
                case 1:
                    monthToDate();
                    System.out.println("======================");
                    break;

                case 2:
                    previousMonth();
                    System.out.println("======================");
                    break;

                case 3:
                    yearToDate();
                    System.out.println("======================");
                    break;

                case 4:
                    previousYear();
                    System.out.println("======================");
                    break;

                case 5:
                    searchByVendor();
                    System.out.println("======================");
                    break;

                case 0:
                    return;
            }


        } while (reportCommand != 0);
    }

    private static void monthToDate() {
        System.out.println("Month to Date works.");
    }

    private static void previousMonth() {
        System.out.println("Previous month works.");
    }

    private static void yearToDate() {
        System.out.println("Year to date works.");
    }

    private static void previousYear() {
        System.out.println("Previous year works.");
    }

    private static void searchByVendor() {
        System.out.println("Search by vendor works.");
    }
// --------------------------------------------------------------------------------------------------------------------------------------------

    public static ArrayList<Transaction>getTransactionsFromFile(){
        ArrayList<Transaction>transactions = new ArrayList<Transaction>();
        try{
            FileReader fileReader = new FileReader("transactions.csv");
            BufferedReader br = new BufferedReader(fileReader);

            String lineFromString;

            while((lineFromString = br.readLine()) != null){
                String[] parts = lineFromString.split("\\|"); // Splits the total information given at the "|":
                LocalDate date = LocalDate.parse(parts[0]);
                LocalTime time = LocalTime.parse(parts[1]);
                String desc = parts[2]; // First part that's split.
                String vendor = parts[3]; // Second part that's split.
                double amount = Double.parseDouble(parts[4]); // Third part that's split.

                Transaction t = new Transaction(date,time,desc, vendor, amount); // Puts the split information in order.
                transactions.add(t);
            }
            // Close both the FileReader and BufferedReader.
            br.close();
            fileReader.close();

        } catch (IOException e) {
            System.out.println("Something is wrong..");
        }

    return transactions; // Change from null to transactions after changing line 6 from private static to public static.
    }

    public static ArrayList<Transaction>addTransactionToFile(){



    return transactions;
}


}
