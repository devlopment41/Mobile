package com.example.mobile;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.api.ApiDao;
import com.fasterxml.jackson.core.type.TypeReference;
import entities.model.Doctor;
import entities.model.User;

import java.util.*;

public class MedicationsAndPrescriptionsActivity extends AppCompatActivity {


    Button OK;
    Context context=this;
    ImageButton IB;

    Doctor d = new Doctor();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medications_and_prescriptions);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        IB = (ImageButton) findViewById(R.id.bake);
        IB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MedicationsAndPrescriptionsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        OK = (Button) findViewById(R.id.DrugApprovals);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MedicationsAndPrescriptionsActivity.this, DrugApprovalsActivity.class);
                startActivity(intent);

            }


        });        OK = (Button) findViewById(R.id.ItemsYouPurchased);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MedicationsAndPrescriptionsActivity.this, ItemsYouPurchasedActivity.class);
                startActivity(intent);

            }


        });        OK = (Button) findViewById(R.id.RegularMedications);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MedicationsAndPrescriptionsActivity.this, RegularMedicationsActivity.class);
                startActivity(intent);

            }


        });




        final TextView name = (TextView) findViewById(R.id.name);
        TextView phone = (TextView) findViewById(R.id.phone);
        TextView address = (TextView) findViewById(R.id.address);
        ApiDao.launch("user", new TypeReference<List<User>>() {
        }, new ApiDao.ToDo() {

            @Override
            public void doSome(Object in) {

                List<User> users = (List<User>) in;

                for (User user : users)

                    name.setText(user.getUser_name());

            }
        },this);

        phone.setText("" + d.getPhone());
        address.setText(d.getAddress());
    }


    

}
