package com.example.admen_carrental;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {

    private ImageButton addCarButton, removeCarButton, updateCarButton, displayCarButton, addAdminButton, logoutButton, rentedCarsButton, viewAsCustomerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addCarButton = findViewById(R.id.addCarButton);
        removeCarButton = findViewById(R.id.removeCarButton);
        updateCarButton = findViewById(R.id.updateCarButton);
        displayCarButton = findViewById(R.id.displayCarButton);
        addAdminButton = findViewById(R.id.addAdminButton);
        logoutButton = findViewById(R.id.logoutButton);
        rentedCarsButton = findViewById(R.id.rentedCarsButton);
        viewAsCustomerButton = findViewById(R.id.viewAsCustomerButton);

        addCarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AddCarActivity.class));
            }
        });

        removeCarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RemoveCarActivity.class));
            }
        });

        updateCarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, UpdateCarActivity.class));
            }
        });

        displayCarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DisplayCarActivity.class));
            }
        });

        addAdminButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AddAdminActivity.class));
            }
        });

        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        rentedCarsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RentedCarsActivity.class));
            }
        });

        viewAsCustomerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CustomerActivity.class));
            }
        });
    }
}
