package com.example.mobile;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

public class DigitalActivity extends AppCompatActivity {

    Button OK;
    Context context=this;
    ImageButton IB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        IB = (ImageButton) findViewById(R.id.bake);
        IB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(DigitalActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
        OK = (Button) findViewById(R.id.email);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(DigitalActivity.this, MailActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.whatsApp);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(DigitalActivity.this, WhatsAppActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.chat);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(DigitalActivity.this, ChatActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.call);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(DigitalActivity.this, CallActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.messenger);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(DigitalActivity.this, MessengerActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.chatWithANurse);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(DigitalActivity.this, ChatActivity.class);
                startActivity(intent);

            }


        });
    }
}
