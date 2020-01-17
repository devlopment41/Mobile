package com.example.mobile;

import android.content.Context;
import android.content.Intent;
import android.opengl.Visibility;
import android.view.View;
import android.widget.*;
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
        setContentView(R.layout.activity_locating_doctors);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Spinner dropdown = findViewById(R.id.name);
        String[] items = new String[]{"Nomi", "Chaya", "Libi"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
        Spinner dropdown1 = findViewById(R.id.treatment);
        String[] items1 = new String[]{"Eyes", "Children", "Ortoped"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items1);
        dropdown1.setAdapter(adapter1);        //get the spinner from the xml.
        Spinner dropdown2 = findViewById(R.id.city);
        String[] items2 = new String[]{"Jerusalem", "Beitar", "Tel aviv"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items2);
        dropdown2.setAdapter(adapter2);        //get the spinner from the xml.
        Spinner dropdown3 = findViewById(R.id.Area);
        //create a list of items for the spinner.
        String[] items3 = new String[]{"Central Israel", "Jerusalem and the surrounding area", "north", "South"};
        ArrayAdapter<String> adapter3= new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items3);
        dropdown3.setAdapter(adapter3);
        Spinner dropdown4 = findViewById(R.id.Languages);
        String[] items4 = new String[]{"Central Israel", "Jerusalem and the surrounding area", "north", "South"};
        ArrayAdapter<String> adapter4= new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items4);
        dropdown4.setAdapter(adapter4);
        System.out.println(adapter4);

        openSearch = (Button) findViewById(R.id.openSearch);
        openSearch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                upLinear1.setVisibility(View.VISIBLE);
                openSearch.setVisibility(View.INVISIBLE);
                close.setVisibility(View.VISIBLE);

            }
        });
        IB = (ImageButton) findViewById(R.id.bake);
        IB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(LocatingDoctorsActivity.this, LocatingServicesActivity.class);
                startActivity(intent);
            }
        });
        search  = (Button) findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(LocatingDoctorsActivity.this, DoctorsActivity.class);
                startActivity(intent);
            }
        });
        close  = (Button) findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                upLinear1.setVisibility(View.INVISIBLE);
                openSearch.setVisibility(View.VISIBLE);
            }
        });

    }
}
