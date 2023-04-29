package com.example.propertyapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PropertyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.property_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Property> properties = new ArrayList<>();
        properties.add(new Property("Box Hill Central", "123 Main St.", "https://www.realestate.com.au/blog/images/1200x674-fit,progressive,format=webp/2019/06/29000307/capi_26a7154de5c7cbeaaabf300e75b0bc51_b4b4c71f05466dd2a58dbfd52668deda.jpeg"));
        properties.add(new Property("Melbourne Central", "456 Oak St.", "https://fastly.4sqi.net/img/general/width960/7056389_68XLY70RKqMEsJFPC74_jouzVlfyEYIoglPEabLppzY.jpg"));
        properties.add(new Property("Flinder Street Station", "789 Maple St.", "https://cdn.getyourguide.com/img/tour/641c14ae02eb0.jpeg/145.jpg"));

        adapter = new PropertyAdapter(properties);
        recyclerView.setAdapter(adapter);
    }
}