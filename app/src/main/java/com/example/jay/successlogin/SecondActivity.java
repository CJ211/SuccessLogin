package com.example.jay.successlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        t1 = (TextView) findViewById(R.id.s_username);

        Intent intent = getIntent();

        String usr = intent.getStringExtra("username");

        t1.setText("Welcome "+usr);
    }
}
