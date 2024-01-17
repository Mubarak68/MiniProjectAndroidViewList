package com.example.miniprojectandroid1.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.ArrayList;
import com.example.miniprojectandroid1.R;
import com.example.miniprojectandroid1.model.Transaction;

import java.util.Date;

public class DetailsActivity extends AppCompatActivity  {
    TextView transactionIdTextView;
    TextView transactionTypeTextView;
    TextView  transactionDateTextView;
    TextView transactionAmountTextView;
    TextView currentBalanceTextView;
    TextView accountTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //here we will created new transaction name

        Transaction transactionName = getIntent().getSerializableExtra("TRANSACTION_KEY",Transaction.class);

        transactionIdTextView = findViewById(R.id.textViewId);
        transactionTypeTextView = findViewById(R.id.textViewType);
        transactionDateTextView = findViewById(R.id.textViewDate);
        transactionAmountTextView = findViewById(R.id.textViewAmount);
        currentBalanceTextView = findViewById(R.id.textViewBalance);
        accountTextView = findViewById(R.id.textViewAccount);

        Transaction transaction = getIntent().getSerializableExtra("TRANSACTION_KEY",Transaction.class);
        if (transaction != null) {

            transactionIdTextView.setText("ID number: " + String.valueOf(transactionName.getId()));

            transactionTypeTextView.setText("Type of Transaction: " + String.valueOf(transactionName.getTransType()));

            transactionDateTextView.setText("Transaction Date: " + String.valueOf(transactionName.getDate()));

            transactionAmountTextView.setText("The Amount: " + String.valueOf(transactionName.getAmount()));

            currentBalanceTextView.setText("The Current Balance is: " + String.valueOf(transactionName.getBalance()));

            accountTextView.setText("The Account is: " + String.valueOf(transactionName.getAccount()));
        }

    }

}
