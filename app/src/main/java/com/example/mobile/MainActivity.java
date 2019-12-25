package com.example.mobile;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    Button OK;
    Context context=this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OK = (Button) findViewById(R.id.QueueReservation);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, QueueActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.Contact);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, InquiriesActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.MedicationsAndPrescriptions);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MedicationsAndPrescriptionsActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.visit);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, VisitActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.Tests);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TestsActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.services);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LocatingServicesActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.medicalFile);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MedicalFileActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.Commitments);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CommitmentsActivity.class);
                startActivity(intent);

            }


        });

    }
}
