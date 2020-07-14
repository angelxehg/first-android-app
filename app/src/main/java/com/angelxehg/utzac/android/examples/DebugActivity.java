package com.angelxehg.utzac.android.examples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.angelxehg.utzac.android.examples.android.app.R;

public class DebugActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debug);
    }

    public void debugMe(View view) {
        String text = "";
    }
}
