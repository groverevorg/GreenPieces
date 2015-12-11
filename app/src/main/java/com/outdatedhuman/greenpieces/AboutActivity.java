package com.outdatedhuman.greenpieces;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity {
    private Button mBtnLucas;
    private Button mBtnThomas;
    private Button mBtnAdam;
    private Button mBtnAidan;
    private Button mBtnCullen;
    private Button mBtnAdrian;
    private Button mBtnLuca;
    private Button mBtnSantana;
    private Button mBtnGabby;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        mBtnLucas = (Button) findViewById(R.id.btnLucas);
        mBtnThomas= (Button) findViewById(R.id.btnThomas);
        mBtnAdam = (Button) findViewById(R.id.btnAdam);
        mBtnAidan= (Button) findViewById(R.id.btnAidan);
        mBtnCullen = (Button) findViewById(R.id.btnCullen);
        mBtnAdrian = (Button) findViewById(R.id.btnAdrian);
        mBtnLuca = (Button) findViewById(R.id.btnLuca);
        mBtnSantana = (Button) findViewById(R.id.btnSantana);
        mBtnGabby = (Button) findViewById(R.id.btnGabby);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"DK Crayon Crumble.ttf");
        mBtnGabby.setTypeface(typeface);
        mBtnSantana.setTypeface(typeface);
        mBtnLuca.setTypeface(typeface);
        mBtnAdrian.setTypeface(typeface);
        mBtnCullen.setTypeface(typeface);
        mBtnAidan.setTypeface(typeface);
        mBtnAdam.setTypeface(typeface);
        mBtnThomas.setTypeface(typeface);
        mBtnLucas.setTypeface(typeface);
        mBtnLucas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AboutActivity.this, activity_biography.class);
                i.putExtra("name", "Lucas");
                startActivity(i);
            }
        });
        mBtnThomas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AboutActivity.this, activity_biography.class);
                i.putExtra("name","Thomas");
                startActivity(i);
            }
        });
        mBtnAdam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AboutActivity.this, activity_biography.class);
                i.putExtra("name","Adam");
                startActivity(i);
            }
        });
        mBtnAidan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AboutActivity.this, activity_biography.class);
                i.putExtra("name","Aidan");
                startActivity(i);
            }
        });
        mBtnCullen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AboutActivity.this, activity_biography.class);
                i.putExtra("name","Cullen");
                startActivity(i);
            }
        });
        mBtnAdrian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AboutActivity.this, activity_biography.class);
                i.putExtra("name","Adrian");
                startActivity(i);
            }
        });
        mBtnLuca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AboutActivity.this, activity_biography.class);
                i.putExtra("name","Luca");
                startActivity(i);
            }
        });
        mBtnSantana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AboutActivity.this, activity_biography.class);
                i.putExtra("name","Santana");
                startActivity(i);
            }
        });
        mBtnGabby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AboutActivity.this, activity_biography.class);
                i.putExtra("name","Gabby");
                startActivity(i);
            }
        });
    }
}
