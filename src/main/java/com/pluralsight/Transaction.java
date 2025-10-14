package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Transaction {
    private LocalDate date;
    private LocalTime time;
    private String desc; // Contains the description of the transaction.
    private String vendor; // Contains the vendor of the transaction.
    private double amount; // Contains the amount of the transaction.




    public Transaction(LocalDate date, LocalTime time, String desc, String vendor, double amount){
        this.date = date;
        this.time = time;
        this.desc = desc;
        this.vendor = vendor;
        this.amount = amount;

    }
    public LocalDate getDate() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return date;
    }

    public LocalTime getTime() {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return time;
    }

    public String getDesc() {
        return desc;
    }

    public String getVendor() {
        return vendor;
    }

    public double getAmount() {
        return amount;
    }



    @Override
    public String toString() {
        // public String toString() {
        //        return String.format("%d %s $%.2f", itemID,itemName,itemPrice);
        //  }

        // Changed the following above due to output in ledger displaying all entries to be "2025-10-14|11:36:51.086372900|Amazon Refund|Amazon|$2024.20"
        // while transactions.csv resulting in "2025-10-14|11:36:51|Amazon Refund|Amazon|2024.2"

        // Following this, we format the date, time, and then use date and time.format to bring in the formatted date and time with all the other info given.
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return date.format(dateFormatter) + "|" +
                time.format(timeFormatter) + "|" +
                desc + "|" +
                vendor + "|" +
                String.format("%.2f", amount);
    }
}
