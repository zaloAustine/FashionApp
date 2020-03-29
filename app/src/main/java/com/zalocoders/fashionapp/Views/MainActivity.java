package com.zalocoders.fashionapp.Views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.appbar.MaterialToolbar;
import com.zalocoders.fashionapp.Adapters.RecentViewCoursesAdapter;
import com.zalocoders.fashionapp.Models.FashionGroup;
import com.zalocoders.fashionapp.Models.RecentViewCourses;
import com.zalocoders.fashionapp.R;
import com.zalocoders.fashionapp.Repo.FashionRepository;
import com.zalocoders.fashionapp.Response.GroupResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    MaterialToolbar materialToolbar;
    List<FashionGroup> recentViewCourses;
    RecentViewCoursesAdapter adapter;
    RecyclerView recentRecyclerview;
    CardView clothes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        materialToolbar = findViewById(R.id.materialToolbar);
        setSupportActionBar(materialToolbar);
        recentRecyclerview = findViewById(R.id.recentRecyclerview);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        recentRecyclerview.setLayoutManager(gridLayoutManager);

        recentViewCourses = new ArrayList<>();
        adapter = new RecentViewCoursesAdapter(recentViewCourses,this);
        recentRecyclerview.setAdapter(adapter);
        fetch();

        clothes = findViewById(R.id.clothes);
        clothes.setOnClickListener(this);

    }

        public void fetch(){
            FashionRepository re = new FashionRepository();

            re.getFashionGroups().observe(this, new Observer<GroupResponse>() {
                @Override
                public void onChanged(GroupResponse groupResponse) {
                    recentViewCourses.addAll(groupResponse.getFashionGroups());
                    adapter.notifyDataSetChanged();
                }
            });
        }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.clothes:
               Intent i = new Intent(MainActivity.this,CategoryActivity.class);
               i.putExtra("id","1");
        }
    }
}


