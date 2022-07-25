package com.example.android.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.android.foodorderapp.Adapters.MainAdapter;
import com.example.android.foodorderapp.Models.MainModel;
import com.example.android.foodorderapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        ArrayList<MainModel> list = new ArrayList<>();
        list.add(new MainModel(R.drawable.burger,"Burger","5","Chicken burger with extra cheese"));
        list.add(new MainModel(R.drawable.classic,"Classic","5","Chicken burger with extra cheese"));
        list.add(new MainModel(R.drawable.momos,"Momo's","5","Chicken burger with extra cheese"));
        list.add(new MainModel(R.drawable.pizza,"Pizza","5","Chicken burger with extra cheese"));
        list.add(new MainModel(R.drawable.burger,"Burger","5","Chicken burger with extra cheese"));
        list.add(new MainModel(R.drawable.classic,"Classic","5","Chicken burger with extra cheese"));
        list.add(new MainModel(R.drawable.momos,"Momo's","5","Chicken burger with extra cheese"));
        list.add(new MainModel(R.drawable.pizza,"Pizza","5","Chicken burger with extra cheese"));
        list.add(new MainModel(R.drawable.burger,"Burger","5","Chicken burger with extra cheese"));
        list.add(new MainModel(R.drawable.classic,"Classic","5","Chicken burger with extra cheese"));
        list.add(new MainModel(R.drawable.momos,"Momo's","5","Chicken burger with extra cheese"));
        list.add(new MainModel(R.drawable.pizza,"Pizza","5","Chicken burger with extra cheese"));


        MainAdapter mainAdapter = new MainAdapter(list ,MainActivity.this);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        binding.recyclerView.setAdapter(mainAdapter);


    }
}