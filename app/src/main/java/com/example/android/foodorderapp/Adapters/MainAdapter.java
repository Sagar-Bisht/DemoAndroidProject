package com.example.android.foodorderapp.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.foodorderapp.DetailActivity;
import com.example.android.foodorderapp.Models.MainModel;
import com.example.android.foodorderapp.R;

import java.util.ArrayList;


public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyViewHolder>{

    ArrayList<MainModel> list ;
    Context context ;
    public MainAdapter(ArrayList<MainModel> list ,Context context){
        this.list = list ;
        this.context = context ;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.sample_mainfood,parent,false);
       MyViewHolder myViewHolder = new MyViewHolder(view) ;
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

       final MainModel model =list.get(position);

        holder.imageView.setImageResource(model.getImage());
        holder.name.setText(model.getName());
        holder.orderPrice.setText(model.getPrice());
        holder.description.setText(model.getDescription());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context , DetailActivity.class);
                intent.putExtra("image",model.getImage());
                intent.putExtra("name",model.getName());
                intent.putExtra("desc",model.getDescription());
                intent.putExtra("price",model.getPrice());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView ;
        TextView name , orderPrice ,description ;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.name);
            orderPrice = itemView.findViewById(R.id.orderPrice);
            description = itemView.findViewById(R.id.description);


        }
    }
}
