package com.zalocoders.fashionapp.Views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

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

public class MainActivity extends AppCompatActivity {
    MaterialToolbar materialToolbar;
    List<FashionGroup> recentViewCourses;
    RecentViewCoursesAdapter adapter;
    RecyclerView recentRecyclerview;
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

    }


