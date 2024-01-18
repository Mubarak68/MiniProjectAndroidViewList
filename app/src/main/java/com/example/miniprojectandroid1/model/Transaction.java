package com.example.miniprojectandroid1.model;

import java.io.Serializable;
import java.util.Date;

public class Transaction implements Serializable {
    private int id;
    private String date;
    private TransactionType transType;
    private double amount;
    private double balance;
    private int account;

    public Transaction(int id, String date, TransactionType transType, double amount, double balance, int account) {
        this.id = id;
        this.date = date;
        this.transType = transType;
        this.amount = amount;
        this.balance = balance;
        this.account = account;
    }

    public int getId() {

        return id;
    }

    public String getDate() {

        return date;
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
