package com.example.mobile;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

public class SettingsActivity extends AppCompatActivity {

    Button OK;
    Context context=this;
    ImageButton IB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        IB = (ImageButton) findViewById(R.id.bake);
        IB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(SettingsActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
        OK = (Button) findViewById(R.id.updateUserInformation);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent = new Intent(SettingsActivity.this, UpdateUserInformationActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.passwordChange);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent = new Intent(SettingsActivity.this, PasswordChangeActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.updatingMailing);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent = new Intent(SettingsActivity.this, UpdatingMailingPreferencesActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.accessibilityStatement);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent = new Intent(SettingsActivity.this, AccessibilityStatementActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.orderMagneticCard);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent = new Intent(SettingsActivity.this, OrderMagneticCardActivity.class);
                startActivity(intent);

            }


        });
        OK = (Button) findViewById(R.id.disengagementFromPersonalArea);
        OK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent = new Intent(SettingsActivity.this, DisengagementFromPersonalAreaActivity.class);
                startActivity(intent);

            }


        });

    }
}
