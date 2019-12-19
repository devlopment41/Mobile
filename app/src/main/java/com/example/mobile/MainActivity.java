package com.example.mobile;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.model.Account;

public class MainActivity extends AppCompatActivity {
    Button OK;
    Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Account account = new Account();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        
        OK = (Button) findViewById(R.id.login);
        OK.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v)
            {
                EditText passwordField = (EditText) findViewById(R.id.editPassword);
                EditText userNameField = (EditText) findViewById(R.id.editUserName);
                
                String password = passwordField.getText().toString();
                String userName = userNameField.getText().toString();
                
                if(password.length()==0||userName.length()==0)
                {
                    AlertDialog.Builder ad = new AlertDialog.Builder(context);

                    ad.setTitle( "נא למלאות את כל פרטים" + userName);

                    ad.show();
                    return;

                }
                
            }




        });
    }
}
