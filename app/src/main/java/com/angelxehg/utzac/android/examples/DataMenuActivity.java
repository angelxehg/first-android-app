package com.angelxehg.utzac.android.examples;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.angelxehg.utzac.android.examples.android.app.R;

public class DataMenuActivity extends AppCompatActivity {

    public static final String data = "com.angelxehg.first.android.app.DATA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_menu);
    }

    public void showData(View view){
        Intent i = new Intent(this, DataActivity.class);
        EditText edt1 = findViewById(R.id.editText);
        String value = edt1.getText().toString();
        i.putExtra(data, value);
        startActivity(i);
    }
}
