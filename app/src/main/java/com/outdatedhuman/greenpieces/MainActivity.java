package com.outdatedhuman.greenpieces;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import java.util.Scanner;

public class MainActivity extends Activity {
    private Button mPlasticButton;
    private Button mScannerButton;
    private Button mAboutButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        Button scan=(Button) findViewById(R.id.scan_button);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"DK Crayon Crumble.ttf");
        scan.setTypeface(typeface);
        Button about=(Button) findViewById(R.id.about_button);
        about.setTypeface(typeface);
        Button plastic=(Button) findViewById(R.id.plastic_button);
        plastic.setTypeface(typeface);
        mPlasticButton = (Button) findViewById(R.id.plastic_button);
        mPlasticButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PlasticInfo.class);
                startActivity(i);
            }
        });
        mScannerButton = (Button) findViewById(R.id.scan_button);
        mScannerButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(MainActivity.this, scannerActivity.class);
                startActivity(i);
            }
        });
        mAboutButton = (Button) findViewById(R.id.about_button);
        mAboutButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
