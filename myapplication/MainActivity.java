package com.example.englishname.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count=0;
    //TextView textview = new TextView(getApplicationContext());
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void my (android.view.View view)
    {
        count++;
        textview = (TextView) findViewById(R.id.textView);
        textview.setText(Integer.toString(count));
        Toast.makeText(this, "Зачем вы нажали это?", Toast.LENGTH_SHORT).show();
    }
}
