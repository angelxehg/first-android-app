package com.angelxehg.first.android.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.console();
    }

    private void console() {
        Log.i("console", "Este es un mensaje de información");
        Log.e("console", "Este es un mensaje de error");
        Log.w("console", "Este es un mensaje de advertencia");
    }
}
