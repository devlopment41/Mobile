package com.example.mobile;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;
import java.util.Arrays;
import android.widget.ArrayAdapter;
import android.widget.ListView;
public class CommitmentsActivity extends AppCompatActivity {
    Button OK;
    Context context=this;
    ImageButton IB;
    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X","Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commitments);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        IB = (ImageButton) findViewById(R.id.bake);
        IB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(CommitmentsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview,R.id.label,mobileArray);

        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
    }
}
