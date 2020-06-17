package com.angelxehg.utzac.android.examples;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.angelxehg.utzac.android.examples.android.app.R;

public class DataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        Intent i = getIntent();
        String value = i.getStringExtra(DataMenuActivity.data);
        TextView tv1 = findViewById(R.id.textView);
        tv1.setText(value);
    }
}
