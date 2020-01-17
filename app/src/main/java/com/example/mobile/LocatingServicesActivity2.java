package com.example.mobile;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

public class LocatingServicesActivity2 extends AppCompatActivity {

    Button OK;
    Context context = this;
    ImageButton IB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locating_doctors2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        IB = (ImageButton) findViewById(R.id.bake);
        IB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(LocatingServicesActivity2.this, LocatingServicesActivity.class);
                startActivity(intent);
            }
        });
    }
}
