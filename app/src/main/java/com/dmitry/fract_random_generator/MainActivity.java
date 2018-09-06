package com.dmitry.fractrandom_generator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.dmitry.random_generator.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null)
            getSupportFragmentManager().beginTransaction().add(R.id.container, new RandomGeneratorFragment()).commit();
    }
}