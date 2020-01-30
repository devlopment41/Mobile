package com.example.mobile;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import entities.model.Doctor;
import entities.model.Form;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DoctorsActivity extends AppCompatActivity {
    Button OK;
    Button openSearch,close, search;
    Context context=this;
    ImageButton IB;
    String searchDoctors;
    String doctorName2,searchDoctors2,city,cityDB,Specialty,SpecialtyDB;
    String [] arraySearchDoctors2 = new String [5];
    String pic = ",";
    LinearLayout upLinear1;
    String value;
    public ArrayList<Doctor> doctors = new ArrayList<Doctor>();

    Doctor d1;
    Doctor d2;
    Doctor d3;
    Doctor d4;
    Doctor d5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors);
        String nameDoctor = getIntent().getStringExtra("nameDoctor");
        d1 = new Doctor("nomi1", "nomi@gmail.com", 05276, "Jerusalem", "male", "dateString", "Sunday", "hebrew", "Eyes", "aaa", "BnayBrack", "hhhhh");
        d2 = new Doctor("nomi", "nomi@gmail.com", 05276, "Jerusalem", "male", "dateString", "Sunday", "hebrew", "Eyes", "aaa", "BnayBrack", "hhhhh");
        d3 = new Doctor("nomi", "nomi@gmail.com", 05276, "Jerusalem", "male", "dateString", "Sunday", "hebrew", "Eyes", "aaa", "BnayBrack", "hhhhh");
        d4 = new Doctor("nomi", "nomi@gmail.com", 05276, "Jerusalem", "male", "dateString", "Sunday", "hebrew", "Eyes", "aaa", "BnayBrack", "hhhhh");
        d5 = new Doctor("nomi", "nomi@gmail.com", 05276, "Jerusalem", "male", "dateString", "Sunday", "hebrew", "Eyes", "aaa", "BnayBrack", "hhhhh");
        doctors.add(d1);
        doctors.add(d2);
        doctors.add(d3);
        doctors.add(d5);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        IB = (ImageButton) findViewById(R.id.bake);
        IB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(DoctorsActivity.this, LocatingDoctorsActivity.class);
                startActivity(intent);
            }
        });
        CustomListDoctorAdapter adapter = new CustomListDoctorAdapter(this, doctors);

        ListView listView = (ListView) findViewById(R.id.doctors_list);
        listView.setAdapter((ListAdapter) adapter);
    }
        public void goToDoctor(View view) {
            Intent i = new Intent(DoctorsActivity.this, CommitmentFormActivity.class);
            startActivity(i);
        }










//        search = (Button) findViewById(R.id.search);
//        search.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                ApiDao.launch("doctor", new TypeReference<List<Doctor>>() {
//
//                }, new ApiDao.ToDo() {
//
//                    @Override
//                    public void doSome(Object in) {
//                        List<Doctor> doctors = (List<Doctor>) in;
//
//
//                    }
//                }, context);
//            }
//        });




//                    OK = (Button) findViewById(R.id.bSearch);
//                    OK.setOnClickListener(new View.OnClickListener() {
//                        public void onClick(View view) {
//                            ApiDao.launch("doctor", new TypeReference<List<Doctor>>() {
//
//                            }, new ApiDao.ToDo() {
//
//                                @Override
//                                public void doSome(Object in) {
//                                    List<Doctor> doctors = (List<Doctor>) in;
//                                    for (Doctor doctor : doctors) {
//                                        cityDB = doctor.getCity();
//                                        SpecialtyDB = doctor.getField_treatment();
//                                        EditText searchDoctors1 = (EditText) findViewById(R.id.searchDoctors);
//                                        searchDoctors2 = searchDoctors1.getEditableText().toString();
//                                        arraySearchDoctors2 = searchDoctors2.split(pic);
//                                        System.out.println(searchDoctors2);
//                                        System.out.println(arraySearchDoctors2);
//                                        city = arraySearchDoctors2[0];
////                                        Specialty = arraySearchDoctors2[1];
//                                        System.out.println(city);
//                                        System.out.println(cityDB);
//                                        System.out.println(Specialty);
//                                        System.out.println(SpecialtyDB);
//                                        if (city == cityDB || Specialty == SpecialtyDB) {
//                                            doctorName2 = doctor.getName();
//                                            TextView doctorName = (TextView) findViewById(R.id.doctorName);
//                                            doctorName.setText(doctorName2);
//
//
//                                        } else {
//                                            System.out.println("not find");
//
//                                        }
//
//                                    }
//                                }
//                            }, context);
//
//                        }
//            });



    }


