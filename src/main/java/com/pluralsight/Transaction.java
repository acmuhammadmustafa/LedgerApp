package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private final LocalDate date;
    private final LocalTime time;
    private final String desc; // Contains the description of the transaction.
    private final String vendor; // Contains the vendor of the transaction.
    private final double amount; // Contains the amount of the transaction.




    public Transaction(LocalDate date, LocalTime time, String desc, String vendor, double amount){
        this.date = date;
        this.time = time;
        this.desc = desc;
        this.vendor = vendor;
        this.amount = amount;

    }
    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
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
        return date.format(dateFormatter) + "|" + time.format(timeFormatter) + "|" + desc + "|" + vendor + "|" + String.format("%.2f", amount);
    }
}
