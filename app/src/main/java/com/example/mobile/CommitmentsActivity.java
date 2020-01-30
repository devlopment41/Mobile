package com.example.mobile;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.*;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import android.widget.ListView;
import entities.model.Form;

public class CommitmentsActivity extends AppCompatActivity {
    Button OK,show;
    Context context=this;
    ImageButton IB;
    LinearLayout layoutForm;

    public Date date1;
//    public class ex{
//        public String
//    }
    public String[] formsTemp = new String[5];
    public String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X","Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X"};
    public ArrayList<Form> forms = new ArrayList<Form>();
    Form f1,f2,f3,f4,f5,f6,f7,f8,f9;

    DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String dateString = "2014-02-11";
    Date dateObject = sdf.parse(dateString);

    public CommitmentsActivity() throws ParseException {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commitments);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        f1=new Form("Commitment","Checking Orthopedist",dateObject,12345,1);
        f2=new Form("Commitment","Checking Orthopedist",dateObject,12345,1);
        f3=new Form("Commitment","Checking Orthopedist",dateObject,12345,0);
        f4=new Form("Commitment","Checking Orthopedist",dateObject,12345,0);
        f5=new Form("Commitment","Checking Orthopedist",dateObject,12345,1);
        f6=new Form("Commitment","Checking Orthopedist",dateObject,12345,1);
        f7=new Form("Commitment","Checking Orthopedist",dateObject,12345,1);
        f8=new Form("Commitment","Checking Orthopedist",dateObject,12345,0);
        f9=new Form("Commitment","Orthopedist",dateObject,12345,1);
        forms.add(f1);
        forms.add(f2);
        forms.add(f3);
        forms.add(f5);
        forms.add(f6);
        forms.add(f7);
        forms.add(f8);
        forms.add(f9);

        IB = (ImageButton) findViewById(R.id.bake);
        IB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(CommitmentsActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
        layoutForm = findViewById(R.id.layoutForm);


        CustomListAdapter adapter = new CustomListAdapter(this, forms);

        ListView listView = (ListView) findViewById(R.id.commitment_forms_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(CommitmentsActivity.this, CommitmentFormActivity.class);
                startActivity(i);
            }
        });
    }

    public void goTo(View view) {
        Intent i = new Intent(CommitmentsActivity.this, CommitmentFormActivity.class);
        startActivity(i);
    }
}
