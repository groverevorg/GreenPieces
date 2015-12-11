package com.outdatedhuman.greenpieces;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class EmailActivity extends Activity {
    Button buttonSend;
    EditText textTo;
    EditText textSubject;
    EditText textMessage;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        String barcode = getIntent().getStringExtra("barcode");
        buttonSend = (Button) findViewById(R.id.buttonSend);
        textTo = (EditText) findViewById(R.id.editTextTo);
        textSubject = (EditText) findViewById(R.id.editTextSubject);
        textMessage = (EditText) findViewById(R.id.editTextMessage);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"DK Crayon Crumble.ttf");
        buttonSend.setTypeface(typeface);
        textTo.setTypeface(typeface);
        textSubject.setTypeface(typeface);
        textMessage.setTypeface(typeface);
        if(barcode.equals("713733818001"))
        {
            textTo.setText("CustomerService@meijer.com");

            textSubject.setText("Meijer Brand Cosmic Stars Cereal -- Missing Resin ID");
            textMessage.setText("Hello,\n\tI am writing to inform you that your product \"Meijer Brand Cosmic Stars " +
                    "Cereal\" (UPC# " + barcode + ") does not have a Resin ID number printed on it. This means that" +
                    " this packaging will not be recycled in most counties in Indiana. I would like to encourage you " +
                    "to please start labeling these, as it is an easy way to do the right thing for the environment");
        }
        else if (barcode.equals("096619998876")) {
            textTo.setText("costcocare@costco.com");

            textSubject.setText("Kirkland Brand Drinking Water -- Missing Resin ID");
            textMessage.setText("Hello,\n\tI am writing to inform you that your product \"Kirkland Brand Drinking Water\" " +
                    "(UPC# " + barcode + ") does not have a Resin ID number printed on it. This means that" +
                    " this packaging will not be recycled in most counties in Indiana. I would like to encourage you " +
                    "to please start labeling these, as it is an easy way to do the right thing for the environment");
        }
        buttonSend.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String to = textTo.getText().toString();
                String subject = textSubject.getText().toString();
                String message = textMessage.getText().toString();
                String cc = "lgaskill83@gmail.com";

                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{ to});
                email.putExtra(Intent.EXTRA_CC, new String[]{ cc});
                //email.putExtra(Intent.EXTRA_BCC, new String[]{to});
                email.putExtra(Intent.EXTRA_SUBJECT, subject);
                email.putExtra(Intent.EXTRA_TEXT, message);

                //need this to prompts email client only
                email.setType("message/rfc822");

                startActivity(Intent.createChooser(email, "Choose an Email client :"));
                finish();
            }
        });
    }
}
