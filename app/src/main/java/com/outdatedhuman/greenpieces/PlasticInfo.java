package com.outdatedhuman.greenpieces;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by grove on 11/18/2015.
 */
public class PlasticInfo extends Activity {
    private TextView mAboutPlastics;
    private TextView mPlasticInfo;
    private Button mButtonNumber1;
    private Button mButtonNumber2;
    private Button mButtonNumber3;
    private Button mButtonNumber4;
    private Button mButtonNumber5;
    private Button mButtonNumber6;
    private Button mButtonNumber7;
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.plastic_information);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"DK Crayon Crumble.ttf");
        mAboutPlastics = (TextView) findViewById(R.id.about_plastics_txt);
        mAboutPlastics.setTypeface(typeface);
        mPlasticInfo = (TextView) findViewById(R.id.plastic_info_text);
        mPlasticInfo.setTypeface(typeface);
        mPlasticInfo.setTextSize(32);
        mButtonNumber1 = (Button) findViewById(R.id.number1_button);
        mButtonNumber2 = (Button) findViewById(R.id.number2_button);
        mButtonNumber3 = (Button) findViewById(R.id.number3_button);
        mButtonNumber4 = (Button) findViewById(R.id.number4_button);
        mButtonNumber5 = (Button) findViewById(R.id.number5_button);
        mButtonNumber6 = (Button) findViewById(R.id.number6_button);
        mButtonNumber7 = (Button) findViewById(R.id.number7_button);
        mButtonNumber1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlasticInfo.setText(R.string.code1);
            }
        });
        mButtonNumber2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlasticInfo.setText(R.string.code2);
            }
        });
        mButtonNumber3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlasticInfo.setText(R.string.code3);
            }
        });
        mButtonNumber4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlasticInfo.setText(R.string.code4);
            }
        });
        mButtonNumber5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlasticInfo.setText(R.string.code5);
            }
        });
        mButtonNumber6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPlasticInfo.setText(R.string.code6);
            }
        });
        mButtonNumber7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*DBAdapter db = new DBAdapter(PlasticInfo.this);
                db.open();
                long id;
                //id = db.insertUPC("2345345","Test UPC2","2");
                //id = db.insertUPC("2223553","Test Stuff","1");
                Cursor c = db.getAllUPCs();
                if(c.moveToNext())
                    mPlasticInfo.setText("id:" + c.getString(0) + "\nUPC: " + c.getString(1) + "\nProduct: " + c.getString(2)
                        + "Plastic #: " + c.getString(3));
                */
                mPlasticInfo.setText(R.string.code7);
            }
        });
    }
}
