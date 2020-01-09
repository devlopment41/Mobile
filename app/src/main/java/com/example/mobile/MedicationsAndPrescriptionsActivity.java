package com.example.mobile;

import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import entities.model.Doctor;

import java.util.*;

public class MedicationsAndPrescriptionsActivity extends AppCompatActivity {
    Doctor d = new Doctor();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medications_and_prescriptions);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        d.setName("shani");
        d.setAddress("beitar");
        d.setPhone(25);

        TextView name = (TextView) findViewById(R.id.name);
        TextView phone = (TextView) findViewById(R.id.phone);
        TextView address = (TextView) findViewById(R.id.address);


        name.setText(d.getName());
        phone.setText("" + d.getPhone());
        address.setText(d.getAddress());
    }


    

}
