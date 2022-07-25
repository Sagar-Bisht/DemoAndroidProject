package com.example.android.foodorderapp.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.foodorderapp.Models.OrderModel;
import com.example.android.foodorderapp.R;

import java.util.ArrayList;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.myViewHolder> {

    ArrayList<OrderModel> list ;
    public OrderAdapter(ArrayList<OrderModel> list )
    {
        this.list = list ;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.oreder_sample,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        final OrderModel model = list.get(position);
        holder.orderImage.setImageResource(model.getOrderImage());
        holder.orderItemName.setText(model.getSoldItemName());
        holder.orderNumber.setText(model.getOrderNumber());
        holder.itemOrderPrice.setText(model.getPrice());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {

        ImageView orderImage ;
        TextView orderItemName ,orderNumber ,itemOrderPrice ;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);

           orderImage = itemView.findViewById(R.id.orderImage);
           orderItemName = itemView.findViewById(R.id.orderItemName);
           orderNumber = itemView.findViewById(R.id.orderNumber);
           itemOrderPrice = itemView.findViewById(R.id.itemOrderPrice);

        }
    }
}
