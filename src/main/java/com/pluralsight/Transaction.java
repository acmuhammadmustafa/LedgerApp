package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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
        return date +"|" + time +"|" + desc + "|" + vendor + "|" + amount;
    }
}
