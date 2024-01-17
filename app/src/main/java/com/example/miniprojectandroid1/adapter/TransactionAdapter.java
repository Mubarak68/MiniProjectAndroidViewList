package com.example.miniprojectandroid1.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.miniprojectandroid1.R;
import com.example.miniprojectandroid1.model.Transaction;

import java.util.ArrayList;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.ViewHolder> {

    private ArrayList<Transaction> transactionsLists;

    TextView dateTextView,typeTextView,amountTextView,balanceTextView;

    public TransactionAdapter(ArrayList<Transaction> transactionsLists){
        this.transactionsLists=transactionsLists;
    }


    @NonNull
    @Override
    public TransactionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.
                layout.
                transactioncard,
                parent,
                false);

        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull TransactionAdapter.ViewHolder holder, int position) {
        Transaction transaction = transactionsLists.get(position);



    holder.balanceTextView.setText(String.valueOf(transaction.getBalance()));
    holder.amountTextView.setText(String.valueOf(transaction.getAmount()));
    holder.dateTextView.setText(String.valueOf(transaction.getDate()));
    holder.typeTextView.setText(String.valueOf(transaction.getTransType()));

        }

    @Override
    public int getItemCount() {
        return transactionsLists.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView dateTextView,typeTextView,amountTextView,balanceTextView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            dateTextView = itemView.findViewById(R.id.date);
            typeTextView = itemView.findViewById(R.id.type);
            amountTextView = itemView.findViewById(R.id.amount);
            balanceTextView = itemView.findViewById(R.id.balance);
        }
    }
//    public View getView(int position, View convertView, ViewGroup parent){
//
//    }
}
