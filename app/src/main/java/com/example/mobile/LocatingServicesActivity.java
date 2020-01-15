package com.example.mobile;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

public class LocatingServicesActivity extends AppCompatActivity {

    Button OK;
    Context context = this;
    ImageButton IB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locating_services);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        IB = (ImageButton) findViewById(R.id.bake);
        IB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(LocatingServicesActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        OK = (Button) findViewById(R.id.Clinics);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(LocatingServicesActivity.this, ClinicsActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.Therapists);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(LocatingServicesActivity.this, TherapistsActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.Doctors);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(LocatingServicesActivity.this, LocatingDoctorsActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.socialWrkers);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(LocatingServicesActivity.this, SocialWrkersActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.Dietitians);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(LocatingServicesActivity.this, DietitiansActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.hospitals);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(LocatingServicesActivity.this, HospitalsActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.Nurses);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(LocatingServicesActivity.this, NursesActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.Institutes);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(LocatingServicesActivity.this, InstitutesActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.Laboratories);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(LocatingServicesActivity.this, LaboratoryTestHistoryActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.SupplementalPOS);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(LocatingServicesActivity.this, SupplementalPOSActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.EmergencyMedicine);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(LocatingServicesActivity.this, EmergencyMedicineActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.Pharmacies);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(LocatingServicesActivity.this, PharmaciesActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.Psychologists);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(LocatingServicesActivity.this, LocatingPsychologistsActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.DentalClinics);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(LocatingServicesActivity.this, DentalClinicsActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.TipaChalav);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(LocatingServicesActivity.this, TipatChalavActivity.class);
                startActivity(intent);

            }


        });

    }

}

