package com.example.miniprojectandroid1.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.miniprojectandroid1.R;

public class MainActivity extends AppCompatActivity {
RecyclerView transactioncard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        transactioncard = findViewById(R.id.TransactionCardRV);

    }
}