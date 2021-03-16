package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AsosiyBet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asosiy_bet);
    }
    public void orqaga(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
