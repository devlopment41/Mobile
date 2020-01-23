package com.example.mobile;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import entities.model.User;

public class DentalClinicsActivity extends AppCompatActivity {

    Button OK;
    Context context=this;
    ImageButton IB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dental_clinics);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        IB = (ImageButton) findViewById(R.id.bake);
        IB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(DentalClinicsActivity.this, LocatingServicesActivity.class);
                startActivity(intent);
            }
        });
        System.out.println("ghghjjbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
        resizeBitmap("drawable/settings.png", 100, 80);
    }
        public Bitmap resizeBitmap(String photoPath, int targetW, int targetH) {
            System.out.println(photoPath);

            BitmapFactory.Options bmOptions = new BitmapFactory.Options();
            bmOptions.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(photoPath, bmOptions);
            int photoW = bmOptions.outWidth;
            int photoH = bmOptions.outHeight;
            System.out.println("ghghjjbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");

            int scaleFactor = 1;
            if ((targetW > 0) || (targetH > 0)) {
                scaleFactor = Math.min(photoW/targetW, photoH/targetH);
            }

            bmOptions.inJustDecodeBounds = false;
            bmOptions.inSampleSize = scaleFactor;
            bmOptions.inPurgeable = true; //Deprecated API 21

            return BitmapFactory.decodeFile(photoPath, bmOptions);
        }

    }
