package com.arcaya.labexercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void TheOne(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://theone.com.ph/"));
        startActivity(i);
    }

    public void WingVibe(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://riaebueza.blogspot.com/2018/01/wing-vibes.html"));
        startActivity(i);
    }

    public void RoqueRuano(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://foursquare.com/v/roque-rua%C3%B1o-building/4d4ede8a9d662d43d6a94b00"));
        startActivity(i);
    }

    public void MainBldg(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://varsitarian.net/20180102/circle/ust-main-building-at-90"));
        startActivity(i);
    }
}
