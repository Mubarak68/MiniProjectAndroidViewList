package com.example.miniprojectandroid1.transactionRepo;

import com.example.miniprojectandroid1.model.Transaction;
import com.example.miniprojectandroid1.model.TransactionType;

import java.util.ArrayList;

public class TransactionRepo {


    private static TransactionRepo instance;
    private TransactionRepo(){

    }

    public static TransactionRepo getInstance() {
        if (instance == null){
            instance = new TransactionRepo();
        }
        return instance;
        }
    public ArrayList<Transaction> generateDummyData(int nameOfItems){
        ArrayList<Transaction> transactionsDetails = new ArrayList<>();
        for(int i = 0; i < nameOfItems;i++){
            Transaction transaction = new Transaction(1112,"date",TransactionType.DIPOSIT,231.312,399108.3,112);
            transactionsDetails.add(transaction);

        }
        return transactionsDetails;


    }






}
