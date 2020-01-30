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
import entities.model.Form;
import entities.model.User;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main2Activity extends AppCompatActivity {


    Button OK;
    Context context=this;
    ImageButton IB;


    public  Main2Activity() throws ParseException {
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        OK = (Button) findViewById(R.id.QueueReservation);


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
                Intent intent = new Intent(Main2Activity.this, UpLoadToServer1Activity.class);
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
            case R.id.Login:
                Intent intent = new Intent(Main2Activity.this, LoginUserActivity.class);
                startActivity(intent);
                return true;
            case R.id.SignUp:
                Intent intent1 = new Intent(Main2Activity.this, SignupUserActivity.class);
                startActivity(intent1);
                return true;
            case R.id.Contact:
                Intent intent2 = new Intent(Main2Activity.this, DigitalActivity.class);
                startActivity(intent2);
                return true;
            case R.id.About:
                Intent intent3 = new Intent(Main2Activity.this, AboutActivity.class);
                startActivity(intent3);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
