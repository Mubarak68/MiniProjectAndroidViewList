package com.example.miniprojectandroid1.model;

import java.util.Date;

public class Transaction {
    private int id;
    private String Date;
    private TransactionType transType;
    private double amount;
    private double balance;
    private int account;

    public Transaction(int id, String date, TransactionType transType, double amount, double balance, int account) {
        this.id = id;
        Date = date;
        this.transType = transType;
        this.amount = amount;
        this.balance = balance;
        this.account = account;
    }

    public int getId() {
        return id;
    }

    public String getDate() {

        return Date;
    }

    public TransactionType getTransType() {
        return transType;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccount() {
        return account;
    }
}
