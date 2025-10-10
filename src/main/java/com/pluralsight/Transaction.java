package com.pluralsight;

import java.time.LocalDateTime;

public class Transaction {
    private String desc; // Contains the description of the transaction.
    private String vendor; // Contains the vendor of the transaction.
    private double amount; // Contains the amount of the transaction.

    public Transaction(String desc, String vendor, double amount){
        this.desc = desc;
        this.vendor = vendor;
        this.amount = amount;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
