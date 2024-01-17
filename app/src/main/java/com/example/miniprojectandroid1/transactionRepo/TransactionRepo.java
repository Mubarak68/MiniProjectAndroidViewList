package com.example.miniprojectandroid1.transactionRepo;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.miniprojectandroid1.R;
import com.example.miniprojectandroid1.adapter.TransactionAdapter;
import com.example.miniprojectandroid1.model.Transaction;
import com.example.miniprojectandroid1.model.TransactionType;

import java.util.ArrayList;
import java.util.Date;

public class TransactionRepo {


    private static TransactionRepo instance;


    public static TransactionRepo getInstance() {
        if (instance == null){
            instance = new TransactionRepo();
        }
        return instance;
        }
    public ArrayList<Transaction> generateDummyTransaction(int nameOfItems){
        RecyclerView bankcard;
        ArrayList<Transaction> transactions = new ArrayList<>();
       for (int i = 0; i < nameOfItems;i ++){
           Transaction transaction = new Transaction(112,"date",TransactionType.WITHDRAWAL,25.21,3412,554);

           transactions.add(transaction);
       }
       return transactions;


    }



//        bankcard.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL));
//    bankcard = findViewById(R.id.TransactionCardRV);
//        bankcard.setLayoutManager(new LinearLayoutManager(this));

//
//        transactionsLists.add(new Transaction(123,today, TransactionType.DIPOSIT,34324.4234,23.2,112));
//        transactionsLists.add(new Transaction(123,today, TransactionType.DIPOSIT,34324.4234,23.2,112));
//        transactionsLists.add(new Transaction(123,today, TransactionType.DIPOSIT,34324.4234,23.2,112));
//        transactionsLists.add(new Transaction(123,today, TransactionType.DIPOSIT,34324.4234,23.2,112));
//        transactionsLists.add(new Transaction(123,today, TransactionType.DIPOSIT,34324.4234,23.2,112));
//



}
