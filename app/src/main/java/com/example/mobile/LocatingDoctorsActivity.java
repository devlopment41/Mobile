package com.example.mobile;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.api.ApiDao;
import com.fasterxml.jackson.core.type.TypeReference;
import entities.model.Doctor;
import entities.model.User;

import java.util.List;

public class LocatingDoctorsActivity extends AppCompatActivity {

    Button OK;
    Context context=this;
    ImageButton IB;
    String searchDoctors;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locating_doctors);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        IB = (ImageButton) findViewById(R.id.bake);
        IB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(LocatingDoctorsActivity.this, LocatingServicesActivity.class);
                startActivity(intent);
            }
        });
        final EditText searchDoctors = (EditText) findViewById(R.id.searchDoctors);
        System.out.println(searchDoctors);

        ApiDao.launch("doctor", new TypeReference<List<Doctor>>() {

        }, new ApiDao.ToDo() {

            @Override
            public void doSome(Object in) {
                System.out.println("cfghjklkjhgvfcghjklkjhbvccvghjklkjhgfdfghjk");

                List<Doctor> doctors = (List<Doctor>) in;

                for (Doctor doctor : doctors)
                    System.out.println(doctor.getCity());




            }
        },this);

        OK = (Button) findViewById(R.id.bSearch);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            }
        });
    }
}
