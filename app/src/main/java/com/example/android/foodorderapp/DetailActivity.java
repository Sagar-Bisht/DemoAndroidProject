package com.example.android.foodorderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.android.foodorderapp.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {

    ActivityDetailBinding binding ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


         int image = getIntent().getIntExtra("image",0);
         int price =Integer.parseInt(getIntent().getStringExtra("price"));
         String desc =getIntent().getStringExtra("desc");
         String FoodName = getIntent().getStringExtra("name");

        binding.detailImage.setImageResource(image);
        binding.detailDescription.setText(desc);
        binding.detailName.setText(FoodName);
        binding.detailPrice.setText(String.format("%d",price));

        MyDbHelper dbHelper = new MyDbHelper(DetailActivity.this);

        binding.insertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               boolean isInserted = dbHelper.insertData(
                        binding.customerName.getText().toString(),
                        binding.customerNumber.getText().toString(),
                        image ,
                        price ,
                        desc,
                        FoodName);

                if(isInserted){
                    Toast.makeText(DetailActivity.this, "inserted", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(DetailActivity.this, "failed", Toast.LENGTH_SHORT).show();
                }

                binding.customerName.setText("");
                binding.customerNumber.setText("");
            }
        });
    }
}