package com.example.yugappforsatmathprep;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PT3 extends AppCompatActivity {

    private Button button;

    ViewPager viewPager;
    CustomSwipeAdapterpt3 adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pt3);

        button = (Button) findViewById(R.id.submitbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    openMainActiviity();
            }
        });
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        adapter = new CustomSwipeAdapterpt3(this);
        viewPager.setAdapter(adapter);
    }
    public void openMainActiviity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}