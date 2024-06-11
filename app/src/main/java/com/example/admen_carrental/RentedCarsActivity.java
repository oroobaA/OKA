package com.example.admen_carrental;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class RentedCarsActivity extends Activity {

    private ListView rentedCarsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rented_cars);

        rentedCarsListView = findViewById(R.id.rentedCarsListView);

        // Implement logic to display rented cars
    }
}
