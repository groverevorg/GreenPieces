package com.outdatedhuman.greenpieces;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_biography extends AppCompatActivity {
    private TextView mBioText;
    private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_biography);
        String name = getIntent().getStringExtra("name");
        mBioText = (TextView) findViewById(R.id.txtBio);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"DK Crayon Crumble.ttf");
        mBioText.setTypeface(typeface);
        switch (name) {
            case "Lucas":
                mBioText.setText("Caring, kind, helpful, and friendly. Brother of 2 holy terrors. Lover of baseball,football,and soccer.Who feels happy,sand,angry, and silly.Who needs a little more friends,who fears darkness and big lakes etc. And who would like to go to " +
                        "world in lego robotics when it's my first year");
                break;
            case "Luca":
                mBioText.setText("I like Lego programming\n I love math\n favorite food is chocolate pie.");
                break;
            case "Gabby":
                mBioText.setText("I am a girl on the green pieces FLL team\nI like video games and ice cream cake\nI like superheros, hoodies, and masks\nI am also a derp \n（。々°）\nI have an interest in creepy pasta");
                break;
            case "Adrian":
                mBioText.setText("I have once visited France on a business meeting with Microsoft. I am learning to program professionally, and have some friends in the business.");
                break;
            case "Aidan":
                mBioText.setText("I am Aidan Gaskill, I like video games,mental puzzles,and hanging out with friends.");
                break;
            case "Cullen":
                mBioText.setText("Master video gamer\nLoves Legos\nVery silly personality");
                break;
            case "Thomas":
                mBioText.setText("Master builder\nI always have fun and my friend Cullen and I will play video games all day, we are master video gamers");
                break;
            case "Santana":
                mBioText.setText("Hi. I am a girl on the Green Pieces FLL team. I am shy and quiet. I love wearing hoodies. My favorite food is cheesecake. I love the Internet. I love Creepypasta. I like to draw. Yep that's life.");
                break;
            case "Adam":
                mBioText.setText("I am a video game lover\nMy favorite game is Fallout 4\nMy favorite food is McDonalds chicken nuggets and ranch.");
                break;
        }
        mButton = (Button) findViewById(R.id.backButton);
        mButton.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           finish();
                                       }
                                   }
        );

    }
}
