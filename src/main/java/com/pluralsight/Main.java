package com.pluralsight;

import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    // Creating an ArrayList to get transactions/information from the transactions.csv file:
    public static ArrayList<Transaction> transactions = getTransactionsFromFile();

    public static void main(String[] args) {
        System.out.println("=======================");
        System.out.println("Welcome to Ledger Pro!");
        System.out.println("=======================");
        System.out.println();
        String command;
        do {
            // Prompt user with Home Menu Options:
            System.out.println();
            System.out.println();
            System.out.println("====== Home Menu ======");
            String homeMenu = "What would you like to do?\n D) Add Deposit\n P) Make Payment (Debit)\n L) Ledger\n X) Exit\n";
            System.out.println(homeMenu);

            // Gather the input of the user and call upon a method based on the input:
            command = ConsoleHelper.promptForString("Enter your command").toLowerCase().trim();
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
                    break;

                case "x":
                    return;

                default:
                    System.out.println("Invalid input. Please enter a valid option.");
                    System.out.println("======================");
            }
        } while (!command.equalsIgnoreCase("X"));
        }

        // Method for the input "D" to add a deposit.
    private static void addDeposit() {
        String depositDesc = ConsoleHelper.promptForString("Enter deposit information");
        String depositVendor = ConsoleHelper.promptForString("Enter vendor");
        double depositAmount = ConsoleHelper.promptForDouble("Enter amount");
        System.out.println("Thank you, information has been added.");
        Transaction newDeposit = new Transaction(LocalDate.now(),LocalTime.now(),depositDesc,depositVendor,depositAmount);
        Main.transactions.add(newDeposit);
        addTransactionToFile(newDeposit);
    }

        // Method for the input "P" to add a payment.
    private static void makePayment() {
        String paymentDesc = ConsoleHelper.promptForString("Enter payment description");
        String paymentVendor = ConsoleHelper.promptForString("Enter vendor");
        double paymentAmount = ConsoleHelper.promptForDouble("Enter amount");
        System.out.println("Thank you, payment has been confirmed.");

        // Puts all the prompted information into one variable for it to be called upon when adding the transaction to the file.
        Transaction newPayment = new Transaction(LocalDate.now(),LocalTime.now(),paymentDesc,paymentVendor,-paymentAmount);

        // Uses the variable made above and adds it to the list of all transactions that the app is gathering.
        Main.transactions.add(newPayment);
        addTransactionToFile(newPayment);
    }

// Ledgers Menu: ------------------------------------------------------------------------------------------------------------------------------------

    private static void ledgerMenu() {
        System.out.println();
        System.out.println();
        System.out.println("====== Ledger Menu ======");
        String ledgerMenu = "Choose an option: \n A) All\n D) Deposits\n P) Payments\n R) Reports\n H) Home\n";
        String ledgerCommand;
        do{
            System.out.println(ledgerMenu);
            ledgerCommand = ConsoleHelper.promptForString("Enter your command").toUpperCase().trim();
            switch (ledgerCommand){
                case "A":
                    displayEntries();
                    System.out.println("======================");
                    break;

                case "D":
                    displayDeposits();
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

                default:
                    System.out.println("Invalid input. Please enter a valid option.");
                    System.out.println("======================");
            }
        } while (!ledgerCommand.equalsIgnoreCase("H"));
    }

    private static void displayEntries() {
        System.out.println("All entries: ");
        for (Transaction e : transactions){
            System.out.println(e);
        }
    }

    public static void displayDeposits() {
        for (Transaction transaction : transactions){
            if (transaction.getAmount() >= 0){
                System.out.println(transaction);
            }

        }
    }

    private static void displayNegativeEntries() {
        for (Transaction transaction : transactions){
            if (transaction.getAmount() <= 0){
                System.out.println(transaction);
            }
        }
    }
// -----------------------------------------------------------------------------------------------------------------------------------------------------
    // Reports Menu:
    private static void reportsMenu() {
        System.out.println();
        System.out.println();
        System.out.println("====== Reports Menu ======");
        String reportMenu = "Choose an option: \n 1) Month to Date\n 2) Previous Month\n 3) Year to Date\n 4) Previous Year\n 5) Search by Vendor\n 0) Back";
        int reportCommand;
        do{
            System.out.println(reportMenu);


                reportCommand = ConsoleHelper.promptForInt("Enter your command".trim());
                switch (reportCommand) {
                    case 1:
                        monthToDate();
                        System.out.println();
                        System.out.println("======================");
                        System.out.println();
                        break;

                    case 2:
                        previousMonth();
                        System.out.println();
                        System.out.println("======================");
                        System.out.println();
                        break;

                    case 3:
                        yearToDate();
                        System.out.println();
                        System.out.println("======================");
                        System.out.println();
                        break;

                    case 4:
                        previousYear();
                        System.out.println();
                        System.out.println("======================");
                        System.out.println();
                        break;

                    case 5:
                        searchByVendor();
                        System.out.println();
                        System.out.println("======================");
                        System.out.println();
                        break;

                    case 0:
                        return;

                    default:
                        System.out.println("Invalid input. Please enter a valid option.");
                        System.out.println("======================");
                }
        } while (true);
    }

    private static void monthToDate() {
    LocalDate today = LocalDate.now();
    LocalDate startOfMonth = today.withDayOfMonth(1);
        System.out.println("====== Month to Date ======");
    // The following goes through the transactions and locates the current day and checks if the transaction date is before the start of the month and prints if the conditions are true.
        for (Transaction transaction : transactions) {
            if (!transaction.getDate().isBefore(startOfMonth)){ // ! = makes it so the app checks if the transaction is on or after the month rather than before.
                System.out.println(transaction);
            }
        }
    }

    private static void previousMonth() {
        LocalDate today = LocalDate.now(); // Gathers today's date.
        LocalDate startOfCurrentMonth = today.withDayOfMonth(1); // Gathers the first of the month in this instance:     2025-10-01.
        LocalDate startOfPreviousMonth = startOfCurrentMonth.minusMonths(1); // Gathers the first of the previous month: 2025-09-01 (minusMonths(1) = subtracts one month)

        System.out.println("====== Previous Month ======");

        for (Transaction transaction : transactions) {
            LocalDate previousDates = transaction.getDate();
            if ((previousDates.isEqual(startOfPreviousMonth) || previousDates.isAfter(startOfPreviousMonth)) && previousDates.isBefore(startOfCurrentMonth)){
                System.out.println(transaction);
            }
        }
    }

    private static void yearToDate() {
        LocalDate today = LocalDate.now();
        LocalDate startOfYear = today.withDayOfYear(1);

        System.out.println("====== Year to Date Transactions ======");

        for (Transaction transaction : transactions){
            if (!transaction.getDate().isBefore(startOfYear)){
                System.out.println(transaction);
            }
        }
    }

    private static void previousYear() {
        int currentYear = LocalDate.now().getYear(); // Not LocalDate because what will be returned is an integer value, LocalDate wants a full date.
        LocalDate startOfPreviousYear = LocalDate.of(currentYear-1,1,1); // (1, 1, 1 is the equivalent of saying January 1st of the previous year)

        System.out.println("====== Previous Year Transactions ======");

        for (Transaction transaction : transactions){
            LocalDate transactionDate = transaction.getDate();
            if ((transactionDate.isEqual(startOfPreviousYear) || transactionDate.isAfter(startOfPreviousYear)) && (transactionDate.isBefore(LocalDate.of(currentYear, 1, 1)))){
                System.out.println(transaction);
            }
        }
    }

    private static void searchByVendor() {
        java.lang.String lookupVendor = ConsoleHelper.promptForString("Please enter the vendor");
        for (Transaction transaction : transactions){
            if (transaction == null){
                continue;
            }
            if (Objects.equals(transaction.getVendor(), lookupVendor)){
                displayItem(transaction);
            }
        }
    }
    private static void displayItem(Transaction transaction){
        System.out.println(transaction.getDate()+ " | " + transaction.getTime() + " | " + transaction.getDesc() + " | " + transaction.getVendor() + " | " + transaction.getAmount());
    }

// --------------------------------------------------------------------------------------------------------------------------------------------

    public static ArrayList<Transaction>getTransactionsFromFile(){
        ArrayList<Transaction>transactions = new ArrayList<>();
        try{
            FileReader fileReader = new FileReader("transactions.csv");
            BufferedReader br = new BufferedReader(fileReader);

            String lineFromString;

            while((lineFromString = br.readLine()) != null){
                // Splits the information into parts when it notices a "|".
                String[] parts = lineFromString.split("\\|");
                LocalDate date = LocalDate.parse(parts[0]);
                LocalTime time = LocalTime.parse(parts[1]);
                String desc = parts[2];
                String vendor = parts[3];
                double amount = Double.parseDouble(parts[4]);

                Transaction t = new Transaction(date,time,desc, vendor, amount); // Puts the split information in order.
                transactions.add(t);
            }
            // Close both the FileReader and BufferedReader.
            br.close();
            fileReader.close();

        } catch (IOException e) {
            System.out.println("Something is wrong..");
        }

    return transactions; // Change from null to transactions after changing getTransactionsFromFile ArrayList from private static to public static.
    }

    private static void addTransactionToFile(Transaction transaction){
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        String formattedDate = transaction.getDate().format(dateFormatter);
        String formattedTime = transaction.getTime().format(timeFormatter);

        try  {
            FileWriter fw = new FileWriter("transactions.csv",true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write(formattedDate + "|" + formattedTime + "|" + transaction.getDesc() + "|" + transaction.getVendor() + "|" + transaction.getAmount());
            bw.close();
        } catch (IOException e) {
            System.out.println("Something is wrong...");
        }
    }
}
