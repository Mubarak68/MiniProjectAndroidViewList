package com.example.miniprojectandroid1.transactionRepo;

import com.example.miniprojectandroid1.model.Transaction;
import com.example.miniprojectandroid1.model.TransactionType;

import java.util.ArrayList;
import java.util.Calendar;

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
            Transaction transaction = new Transaction(1112,String.valueOf(Calendar.getInstance().get(Calendar.YEAR)) +"/"+String.valueOf(Calendar.getInstance().get(Calendar.MONTH)+1)+"/"+String.valueOf(Calendar.getInstance().get(Calendar.DAY_OF_MONTH)),TransactionType.DIPOSIT,231.312,399108.3,112);
            transactionsDetails.add(transaction);

        }
        return transactionsDetails;


    }






}
