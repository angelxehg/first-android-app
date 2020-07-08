package com.angelxehg.utzac.android.examples;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.provider.CalendarContract;
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

    public void openAlarm(View view) {
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, "Example Alarm")
                .putExtra(AlarmClock.EXTRA_HOUR, 23)
                .putExtra(AlarmClock.EXTRA_MINUTES, 30);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.e("error", "Can't setup alarm");
        }
    }

    public void openCalendar(View view) {
        Intent intent = new Intent(Intent.ACTION_INSERT)
                .setData(CalendarContract.Events.CONTENT_URI)
                .putExtra(CalendarContract.Events.TITLE, "Example Event");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.e("error", "Can't setup calendar");
        }
    }

    public void openSearch(View view) {

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
