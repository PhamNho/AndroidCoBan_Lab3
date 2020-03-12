package com.fpoly.androidcoban_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void intentBai1(View view) {
        startActivity(new Intent(MainActivity.this, Bai1Activity.class));
    }

    public void intentBai2(View view) {
        startActivity(new Intent(this, Bai2Activity.class));
    }

    public void intentBai3(View view) {
        startActivity(new Intent(getApplicationContext(), Bai3Activity.class));
    }
}
