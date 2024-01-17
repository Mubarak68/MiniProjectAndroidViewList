package com.example.miniprojectandroid1.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.miniprojectandroid1.R;
import com.example.miniprojectandroid1.model.Transaction;

public class DetailsActivity extends AppCompatActivity {
    TextView transactionIdTextView,
            transactionTypeTextView,
            transactionDateTextView,
            transactionAmountTextView,
            currentBalanceTextView,
            accountTextView;
//    textViewId,
//    textViewDate,
//    textViewType,
//    textViewAmount,
//    textViewBalance,
//    textViewAccount,
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        transactionIdTextView = findViewById(R.id.textViewId);
        transactionTypeTextView = findViewById(R.id.textViewType);
        transactionDateTextView = findViewById(R.id.textViewDate);
        transactionAmountTextView = findViewById(R.id.textViewAmount);
        currentBalanceTextView = findViewById(R.id.textViewBalance);
        accountTextView = findViewById(R.id.textViewAccount);
        Transaction transaction =  getIntent().getSerializableExtra("TRANSACTION_KEY", Transaction.class);
        if (transaction != null){
            transactionIdTextView.setText(transaction.getId());
            transactionTypeTextView.setText(String.valueOf(transaction.getTransType()));
            transactionDateTextView.setText(transaction.getDate());
            transactionAmountTextView.setText(String.valueOf(transaction.getAmount()));
            currentBalanceTextView.setText(String.valueOf(transaction.getBalance()));
            accountTextView.setText(transaction.getAccount());

        }
    }


    //    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_details);
//    }
//}

}
