package com.zalocoders.fashionapp.Views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.appbar.MaterialToolbar;
import com.zalocoders.fashionapp.Adapters.CategoryItemsAdapter;
import com.zalocoders.fashionapp.Adapters.FashionCategoryAdapter;
import com.zalocoders.fashionapp.Models.FashionCategory;
import com.zalocoders.fashionapp.Models.FashionItemCategory;
import com.zalocoders.fashionapp.Models.SharedPreferenceHelper;
import com.zalocoders.fashionapp.R;
import com.zalocoders.fashionapp.Repo.FashionRepository;
import com.zalocoders.fashionapp.Response.FashionCategoryItemsResponse;

import java.util.ArrayList;
import java.util.List;

public class CategoryListActivity extends AppCompatActivity {
    MaterialToolbar materialToolbar;
    FashionRepository repository;
    List<FashionItemCategory> fashionCategoryList;
    CategoryItemsAdapter adapter;
    RecyclerView category_recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_list_page);

        materialToolbar = findViewById(R.id.materialToolbar);
       setSupportActionBar(materialToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        category_recyclerview =findViewById(R.id.category_items_ecyclerview);

        repository = new FashionRepository();
        fetch();
        fashionCategoryList = new ArrayList<>();
        adapter = new CategoryItemsAdapter(fashionCategoryList,this);
        category_recyclerview.setAdapter(adapter);

        findViewById(R.id.card).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CategoryListActivity.this,CategoryItemActivity.class));
            }
        });

    }

    public void fetch(){
        repository.getCategoryListItems("1").observe(this, new Observer<FashionCategoryItemsResponse>() {
            @Override
            public void onChanged(FashionCategoryItemsResponse fashionCategoryItemsResponse) {
                fashionCategoryList.addAll(fashionCategoryItemsResponse.getFashionItemCategory());
                adapter.notifyDataSetChanged();
            }
        });
    }
}
