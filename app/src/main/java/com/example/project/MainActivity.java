package com.example.project;

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
    public void asosiyBet(View view) {
        Intent intent = new Intent(this, AsosiyBet.class);
        startActivity(intent);
    }
    public void testlar(View view) {
        Intent intent = new Intent(this, Testlat.class);
        startActivity(intent);
    }
    public void davomad(View view) {
        Intent intent = new Intent(this, Davomad.class);
        startActivity(intent);
    }
    public void ozlashtirish(View view) {
        Intent intent = new Intent(this, Ozlashtirish.class);
        startActivity(intent);
    }
    public void darsJadvali(View view) {
        Intent intent = new Intent(this, Darsjadvali.class);
        startActivity(intent);
    }

    public void oquvQollanma(View view) {
        Intent intent = new Intent(this, Qollanma.class);
        startActivity(intent);
    }

}
