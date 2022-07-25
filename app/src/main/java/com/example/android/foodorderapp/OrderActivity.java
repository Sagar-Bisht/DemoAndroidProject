package com.example.android.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.android.foodorderapp.Adapters.OrderAdapter;
import com.example.android.foodorderapp.Models.OrderModel;
import com.example.android.foodorderapp.databinding.ActivityOrderBinding;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    ActivityOrderBinding binding ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        ArrayList<OrderModel> list = new ArrayList<>();
        list.add(new OrderModel(R.drawable.burger,"Burger","5","1234567"));
        list.add(new OrderModel(R.drawable.classic,"Classic","5","1234567"));
        list.add(new OrderModel(R.drawable.momos,"Momo's","5","1234567"));
        list.add(new OrderModel(R.drawable.pizza,"Pizza","5","1234567"));
        list.add(new OrderModel(R.drawable.burger,"Burger","5","1234567"));
        OrderAdapter orderAdapter = new OrderAdapter(list);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(OrderActivity.this));
        binding.recyclerView.setAdapter(orderAdapter);

    }
}