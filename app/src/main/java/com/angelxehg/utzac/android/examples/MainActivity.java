package com.angelxehg.utzac.android.examples;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.angelxehg.utzac.android.examples.android.app.R;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openDataMenuActivity(View view) {
        Intent i = new Intent(this, DataMenuActivity.class);
        startActivity(i);
    }

    public void openDesignPatternsActivity(View view) {
        Intent i = new Intent(this, DesignPatternsActivity.class);
        startActivity(i);
    }

    public void openIntentActivity(View view) {
        Intent i = new Intent(this, IntentActivity.class);
        startActivity(i);
    }

    public void setDarkTheme(View view) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
    }

    public void setLightTheme(View view) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
    }

    public void setAutoTheme(View view) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO_BATTERY);
    }

    public void openDebugActivity(View view) {
        Intent i = new Intent(this, DebugActivity.class);
        startActivity(i);
    }

    public void openAssetMenuActivity(View view) {
        Intent i = new Intent(this, BasicActivity.class);
        startActivity(i);
    }
}
