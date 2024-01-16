package com.example.miniprojectandroid1.model;

public class TransactionModel {
    private int id;
    private String date;
    private EnumType transType;
    private double amount;
    private double balance;
    private int account;

    public TransactionModel(int id, String date, EnumType transType, double amount, double balance, int account) {
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

    public EnumType getTransType() {
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
