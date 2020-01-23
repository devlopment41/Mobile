package com.example.mobile;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.text.Html;
import android.view.*;
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

public class Main2Activity extends AppCompatActivity {


    Button OK;
    Context context=this;
    ImageButton IB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);

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
                Intent intent = new Intent(Main2Activity.this, MailActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.Contact);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, SignupUserActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.MedicationsAndPrescriptions);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, MedicationsAndPrescriptionsActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.visit);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, VisitActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.Tests);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, TestsActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.services);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, LocatingServicesActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.medicalFile);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, MedicalFileActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.Commitments);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, CommitmentsActivity.class);
                startActivity(intent);

            }


        });
        IB = (ImageButton) findViewById(R.id.settings);
        IB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, SettingsActivity.class);
                startActivity(intent);

            }


        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.game_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.new_game:
                return true;
            case R.id.help:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
