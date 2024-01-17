package com.example.miniprojectandroid1.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.miniprojectandroid1.R;
import com.example.miniprojectandroid1.adapter.TransactionAdapter;
import com.example.miniprojectandroid1.model.Transaction;
import com.example.miniprojectandroid1.model.TransactionType;
import com.example.miniprojectandroid1.transactionRepo.TransactionRepo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    RecyclerView bankcard;
    private ArrayList<Transaction> transactionsLists = new ArrayList<>();

    public static final String TRANSACTION_KEY = "TRANSACTION_KEY";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bankcard = findViewById(R.id.TransactionCardRV);
        TRANSACTION_KEY = findViewById(R.id.)


        TransactionAdapter transactionAdapter = new TransactionAdapter(transactionsLists);
        bankcard.setAdapter(transactionAdapter);

        bankcard.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL));
        bankcard.setLayoutManager(new LinearLayoutManager(this));

        getSupportActionBar().setTitle("TRANSACTION_KEY");


        bankcard = findViewById(R.id.TransactionCardRV);
        bankcard.setLayoutManager(new LinearLayoutManager(this));
        TransactionAdapter transactionsAdapter = new TransactionAdapter(TransactionRepo.getInstance());


    }
}