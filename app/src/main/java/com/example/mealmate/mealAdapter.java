package com.example.mealmate;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

import java.util.ArrayList;

public class mealAdapter extends RecyclerView.Adapter<mealAdapter.mealViewHolder> {

    ArrayList<datamodel> dataholder;

    public mealAdapter(ArrayList<datamodel> dataholder) {
        this.dataholder = dataholder;
    }


    @NonNull
    @Override
    public mealViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d("view", "onBindViewHolder:vdsfdsfdsfsdfdsfdsfdsfdsfdsf ");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.meal_card, parent, false);
        return new mealViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull mealViewHolder holder, int position) {
        Log.d("bindinf", "onBindViewHolder:bdsfdsfdsfsdfdsfdsfdsfdsfdsf ");
        holder.mealImg.setImageResource(dataholder.get(position).getMealImage());
        holder.mealName.setText(dataholder.get(position).getMealName());
        holder.mealPrice.setText(dataholder.get(position).getMealPrice());
        holder.mealDesc.setText(dataholder.get(position).getMealDesc());
    }

    @Override
    public int getItemCount() {
        Log.d("size", "onBindViewHolder:sewr");
        return dataholder.size();
    }

    class mealViewHolder extends RecyclerView.ViewHolder {
        ImageView mealImg;
        TextView mealName, mealPrice, mealDesc;
        public mealViewHolder(@NonNull View itemView) {
            super(itemView);

            mealImg = itemView.findViewById(R.id.mealImage);
            mealName = itemView.findViewById(R.id.mealName);
            mealPrice = itemView.findViewById(R.id.mealPrice);
            mealDesc = itemView.findViewById(R.id.mealDescription);
        }
    }
}
