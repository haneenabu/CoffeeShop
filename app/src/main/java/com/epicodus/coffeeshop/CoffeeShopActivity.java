package com.epicodus.coffeeshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class CoffeeShopActivity extends AppCompatActivity {

    private TextView mLocationTextView;
    private ListView mListView;
    private String[] coffeeShops = new String[] {"Spella", "Starbucks",
            "Public Domain", "Water Avenue"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_shop);

        mLocationTextView = (TextView) findViewById(R.id.locationTextView);

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationTextView.setText("Here are all the coffee shops near: " + location);

        mListView = (ListView) findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, coffeeShops);
        mListView.setAdapter(adapter);
    }
}
