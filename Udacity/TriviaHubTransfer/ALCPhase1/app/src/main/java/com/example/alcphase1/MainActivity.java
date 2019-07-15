package com.example.alcphase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lunch_activity_b(View view) {
        Intent i = new Intent(this, About_ALC.class);
        startActivity(i);
    }

    public void lunch_activity_c(View view) {
        Intent i = new Intent(this, My_Profile.class);
        startActivity(i);
    }
}
