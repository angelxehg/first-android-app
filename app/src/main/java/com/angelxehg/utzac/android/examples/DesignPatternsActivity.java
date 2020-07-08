package com.angelxehg.utzac.android.examples;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.angelxehg.utzac.android.examples.android.app.R;

public class DesignPatternsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design_patterns);
        LinearLayout ly = new LinearLayout(getApplicationContext());
        ly.setOrientation(LinearLayout.VERTICAL);
        ly.setBackgroundColor(Color.GRAY);
        setContentView(ly);
        
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        TextView tv1 = new TextView(getApplicationContext());
        tv1.setText("Hello world");
        ly.addView(tv1, params);
    }
}
