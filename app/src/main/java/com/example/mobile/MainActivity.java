package com.example.mobile;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.text.Html;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import com.api.ApiDao;
import com.fasterxml.jackson.core.type.TypeReference;
import entities.model.User;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    Button OK;
    Context context=this;
    ImageButton IB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


//        ApiDao.launch("user", new TypeReference<List<User>>() {
//        }, new ApiDao.ToDo() {
//
//            @Override
//            public void doSome(Object in) {
//
//                List<User> users = (List<User>) in;
//
//                for (User user : users)
//
//                    System.out.println(user.getUser_name());
//
//            }
//        },this);

        OK = (Button) findViewById(R.id.QueueReservation);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginUserActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.Contact);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SignupUserActivity.class);
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
        IB = (ImageButton) findViewById(R.id.settings);
        IB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);

            }


        });
    }
}
