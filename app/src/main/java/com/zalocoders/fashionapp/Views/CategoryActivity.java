package com.zalocoders.fashionapp.Views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.appbar.MaterialToolbar;
import com.zalocoders.fashionapp.Adapters.FashionCategoryAdapter;
import com.zalocoders.fashionapp.Models.FashionCategory;
import com.zalocoders.fashionapp.Models.SharedPreferenceHelper;
import com.zalocoders.fashionapp.R;
import com.zalocoders.fashionapp.Repo.FashionRepository;
import com.zalocoders.fashionapp.Response.CategoryResponse;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity {
    MaterialToolbar materialToolbar;
    String fashion_Group_id;
    FashionRepository repository;
    List<FashionCategory> fashionCategoryList;
    FashionCategoryAdapter adapter;
    RecyclerView category_recyclerview;
    Bundle b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_page);

        materialToolbar = findViewById(R.id.materialToolbar);
        setSupportActionBar(materialToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent iin= getIntent();
        if(iin.getStringExtra("id")==null){
            fashion_Group_id = SharedPreferenceHelper.getId();
        }else {
            b = iin.getExtras();
            fashion_Group_id= b.getString("id");
            SharedPreferenceHelper.setID(fashion_Group_id);
        }

        category_recyclerview =findViewById(R.id.category_recyclerview);

        repository = new FashionRepository();
        fetch();
        fashionCategoryList = new ArrayList<>();
        adapter = new FashionCategoryAdapter(fashionCategoryList,this);
        category_recyclerview.setAdapter(adapter);



        findViewById(R.id.card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CategoryActivity.this,CategoryListActivity.class));
            }
        });

    }


    public void fetch(){
        repository.getFashionCategories(fashion_Group_id).observe(this, new Observer<CategoryResponse>() {
            @Override
            public void onChanged(CategoryResponse categoryResponse) {

                fashionCategoryList.addAll(categoryResponse.getFashionCategory());
                adapter.notifyDataSetChanged();

            }
        });
    }
}
