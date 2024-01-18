package com.example.miniprojectandroid1.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import com.example.miniprojectandroid1.R;
import com.example.miniprojectandroid1.adapter.TransactionAdapter;
import com.example.miniprojectandroid1.model.Transaction;
import com.example.miniprojectandroid1.transactionRepo.TransactionRepo;
import com.example.miniprojectandroid1.transactioninterface.InterFaceTransaction;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements InterFaceTransaction {
    RecyclerView bankcard;
    ArrayList<Transaction> transactionsLists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bankcard = findViewById(R.id.TransactionCardRV);
        bankcard.setLayoutManager(new LinearLayoutManager(this));
        transactionsLists = TransactionRepo.getInstance().generateDummyData(5);
        bankcard.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL));
        TransactionAdapter transactionsAdapter = new TransactionAdapter(transactionsLists, this);

        bankcard.setAdapter(transactionsAdapter);

    }

    @Override
    public void onAccountItemClicker(Transaction transaction) {
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra("TRANSACTION_KEY", transaction);
        startActivity(intent);
    }

    private void startActivities(Intent intent) {
    }

}