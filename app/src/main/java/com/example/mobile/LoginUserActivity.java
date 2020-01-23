package com.example.mobile;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.core.widget.TextViewCompat;

public class LoginUserActivity extends AppCompatActivity {
    boolean valid = true;
TextView _emailText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user);

    }
}
