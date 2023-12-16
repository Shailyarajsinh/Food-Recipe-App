package com.example.foodrecipe;

import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class messageAdapter extends  RecyclerView.Adapter<messageAdapter.myviweholder>{

    List<message> messagelist;
    public messageAdapter(List<message> meassagelist) {
        this.messagelist = meassagelist;


    }

    @NonNull
    @Override
    public myviweholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View chatview = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_item,null);
        myviweholder  myviweholder = new myviweholder(chatview);
        return myviweholder;
    }

    @Override
    public void onBindViewHolder(@NonNull myviweholder holder, int position) {

        message message = messagelist.get(position);
        if(message.getSentby().equals(message.sent_by_me)){
           holder.leftchat.setVisibility(View.GONE);
           holder.rightchat.setVisibility(View.VISIBLE);
           holder.righttext.setText(message.getMessage());
        }
        else {
            holder.rightchat.setVisibility(View.GONE);
            holder.leftchat.setVisibility(View.VISIBLE);
            holder.lefttext.setText(message.getMessage());

        }

    }

    @Override
    public int getItemCount() {
        return messagelist.size();
    }

    public  class myviweholder extends RecyclerView.ViewHolder{
LinearLayout leftchat,rightchat;
TextView lefttext, righttext;

        public myviweholder(@NonNull View itemView) {
            super(itemView);
            leftchat = itemView.findViewById(R.id.left_chat_view);
            rightchat = itemView.findViewById(R.id.right_chat_view);
            lefttext = itemView.findViewById(R.id.left_chat_text_view);
            righttext = itemView.findViewById(R.id.right_chat_text_view);
        }
    }
}
