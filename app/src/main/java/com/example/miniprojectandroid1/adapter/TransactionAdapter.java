package com.example.miniprojectandroid1.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.miniprojectandroid1.R;
import com.example.miniprojectandroid1.model.Transaction;
import com.example.miniprojectandroid1.transactioninterface.InterFaceTransaction;

import java.util.ArrayList;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.TransactionViewHolder> {
    private ArrayList<Transaction> transactionsLists;
    private InterFaceTransaction interFaceTransaction;
    public TransactionAdapter(ArrayList<Transaction> transactionsLists, InterFaceTransaction interFaceTransaction){
        this.transactionsLists=transactionsLists;
        this.interFaceTransaction=interFaceTransaction;
    }
    @NonNull
    @Override
    public TransactionAdapter.TransactionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.
                layout.
                transactioncard,
                parent,
                false);

        return new TransactionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionViewHolder holder, int position) {
        Transaction transaction = transactionsLists.get(position);
        holder.balanceTextView.setText(String.valueOf(transaction.getBalance()));
        holder.typeTextView.setText(String.valueOf(transaction.getTransType()));
        holder.amountTextView.setText(String.valueOf(transaction.getAmount()));
        holder.dateTextView.setText(transaction.getDate());
        holder.itemView.setOnClickListener(v -> {
            interFaceTransaction.onAccountItemClicker(transaction);
                }
        );
    }

    @Override
    public int getItemCount() {
        return transactionsLists.size();
    }

    public static class TransactionViewHolder extends RecyclerView.ViewHolder {
        TextView dateTextView,typeTextView,amountTextView,balanceTextView,transactionTextView,itemView;

        public TransactionViewHolder (@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(v -> {
            dateTextView = itemView.findViewById(R.id.date);
            typeTextView = itemView.findViewById(R.id.type);
            amountTextView = itemView.findViewById(R.id.amount);
            balanceTextView = itemView.findViewById(R.id.balance);
            transactionTextView = itemView.findViewById(R.id.transactioncard);
        })

        ;}

    }
}
