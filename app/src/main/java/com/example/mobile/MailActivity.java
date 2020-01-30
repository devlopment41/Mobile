package com.example.mobile;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.example.mobile.R;

public class MailActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail);

        Button startBtn = (Button) findViewById(R.id.sendEmail);
        startBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sendEmail();
            }
        });
    }

    protected void sendEmail() {
//        Log.i("Send email", "");
//        String[] TO = {"chaya1724@gmail.com"};
//        String[] CC = {""};
//        Intent emailIntent = new Intent(Intent.ACTION_SEND);
//
//        emailIntent.setData(Uri.parse("mailto:"));
//        emailIntent.setType("text/plain");
//        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
//        emailIntent.putExtra(Intent.EXTRA_CC, CC);
//        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Your subject");
//        emailIntent.putExtra(Intent.EXTRA_TEXT, "Email message goes here");
//
//


        Intent mailIntent = new Intent(Intent.ACTION_VIEW);
        Uri data = Uri.parse("mailto:?subject=" + "subject text"+ "&body=" + "body text " + "&to=" + "destination@mail.com");
        mailIntent.setData(data);
        System.out.println("hjggjgkkkkjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
        startActivity(Intent.createChooser(mailIntent, "Send mail..."));

//        try {
//            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
//            finish();
//            Log.i("Finished email...", "");
//        } catch (android.content.ActivityNotFoundException ex) {
//            Toast.makeText(MailActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
//        }
    }
}
