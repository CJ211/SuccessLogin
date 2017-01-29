package com.example.jay.successlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mLogin;
    EditText mUsername, mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLogin = (Button) findViewById(R.id.b1);
        mUsername = (EditText) findViewById(R.id.etusername);
        mPassword = (EditText) findViewById(R.id.etpassword);

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String u = mUsername.getText().toString();
                String p = mPassword.getText().toString();

                Intent intent = new Intent(MainActivity.this , SecondActivity.class);
                intent.putExtra("username",u);

                startActivity(intent);
            }
        });


    }
}