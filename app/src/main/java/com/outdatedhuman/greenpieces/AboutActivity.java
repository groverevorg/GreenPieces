package com.outdatedhuman.greenpieces;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    }
}
