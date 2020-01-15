package com.example.mobile;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class TipatChalavActivity extends AppCompatActivity {

    Button OK;
    Context context=this;
    ImageButton IB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipat_chalav);
        IB = (ImageButton) findViewById(R.id.bake);
        IB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(TipatChalavActivity.this, LocatingServicesActivity.class);
                startActivity(intent);
            }
        });

    }
}
