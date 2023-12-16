package com.example.foodrecipe;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class foodAdapter extends RecyclerView.Adapter<foodAdapter.viewholder> {

    public foodAdapter(List<foodModel> foodModelList) {
        this.foodModelList = foodModelList;
    }

    List<foodModel> foodModelList;
    @NonNull
    @Override
    public foodAdapter.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_item,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull foodAdapter.viewholder holder, int position) {
    int foodid = foodModelList.get(position).getId();
    int foodimg = foodModelList.get(position).getFoodimage();
    String foodtittle = foodModelList.get(position).getFoodtittle();
    String fooddes = foodModelList.get(position).getFooddescription();

    holder.setData(foodid,foodimg,foodtittle,fooddes);
   }

    @Override
    public int getItemCount() {
        return foodModelList.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {

        ImageView foodImage;
        TextView foodTittle,foodDescription;

        public viewholder(@NonNull View itemView) {
            super(itemView);
            foodImage =itemView.findViewById(R.id.foodimage);
            foodTittle =itemView.findViewById(R.id.foodtittle);
            foodDescription =itemView.findViewById(R.id.fooddes);
        }

        public void setData(int foodid, int foodimg, String tittle, String description){
            foodImage.setImageResource(foodimg);
            foodTittle.setText(tittle);
            foodDescription.setText(description);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(itemView.getContext(),FoodDetailsActivity.class);
                    intent.putExtra("id",foodid);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
