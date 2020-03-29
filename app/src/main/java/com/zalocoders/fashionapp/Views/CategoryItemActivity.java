package com.zalocoders.fashionapp.Views;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.Observer;

import android.view.View;
import android.widget.TextView;

import com.zalocoders.fashionapp.Models.SharedPreferenceHelper;
import com.zalocoders.fashionapp.Models.SingleItem;
import com.zalocoders.fashionapp.R;
import com.zalocoders.fashionapp.Repo.FashionRepository;
import com.zalocoders.fashionapp.Response.SingleItemResponse;

public class CategoryItemActivity extends AppCompatActivity {
    FashionRepository repository;
    TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_item);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Item");

        description = findViewById(R.id.description);
        repository = new FashionRepository();


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Fetch();
    }

    public void Fetch(){
        repository.getSingleItem(SharedPreferenceHelper.getId()).observe(this, new Observer<SingleItemResponse>() {
            @Override
            public void onChanged(SingleItemResponse singleItemResponse) {
                SingleItem item = singleItemResponse.getSingleItem();
                description.setText(item.getName()+"\n"+item.getPhone());

            }
        });

    }
}
