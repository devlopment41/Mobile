package com.example.mobile;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.api.ApiDao;
import com.fasterxml.jackson.core.type.TypeReference;
import entities.model.Doctor;

import java.util.List;

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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        IB = (ImageButton) findViewById(R.id.bake);
        IB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(DoctorsActivity.this, LocatingDoctorsActivity.class);
                startActivity(intent);
            }
        });
        search = (Button) findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ApiDao.launch("doctor", new TypeReference<List<Doctor>>() {

                }, new ApiDao.ToDo() {

                    @Override
                    public void doSome(Object in) {
                        List<Doctor> doctors = (List<Doctor>) in;


                    }
                }, context);
            }
        });




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
}
