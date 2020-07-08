package com.angelxehg.utzac.android.examples;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.angelxehg.utzac.android.examples.android.app.R;

public class IntentActivity extends AppCompatActivity {

    private EditText myURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        myURL = findViewById(R.id.edtURL);
    }

    public void openBrowser(View view) {
        String url =myURL.getText().toString();
        Uri page = Uri.parse(url);
        Intent web = new Intent(Intent.ACTION_VIEW, page);
        if(web.resolveActivity(getPackageManager()) != null) {
            startActivity(web);
        } else {
            Log.e("error", "No default app for web");
        }
    }
}
