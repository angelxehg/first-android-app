package com.angelxehg.first.android.app;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

public class DesignPatternsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design_patterns);
        LinearLayout ly = new LinearLayout(getApplicationContext());
        ly.setOrientation(LinearLayout.VERTICAL);
        ly.setBackgroundColor(Color.GRAY);
        setContentView(ly);
    }
}
