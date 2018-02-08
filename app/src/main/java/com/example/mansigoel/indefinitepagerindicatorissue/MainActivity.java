package com.example.mansigoel.indefinitepagerindicatorissue;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.rbrooks.indefinitepagerindicator.IndefinitePagerIndicator;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;
    @BindView(R.id.recyclerview_pager_indicator)
    IndefinitePagerIndicator recyclerviewPagerIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(new Adapter(getBaseContext()));
        recyclerviewPagerIndicator.attachToRecyclerView(recyclerView);
    }
}
