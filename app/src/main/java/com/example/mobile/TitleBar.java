package com.example.mobile;

import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class TitleBar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final boolean customTitleSupported =
                requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        if (customTitleSupported) {
            getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE,
                    R.layout.title_bar);
        }
        final TextView myTitleText = (TextView) findViewById(R.id.myTitle);
        if (myTitleText != null) {
            myTitleText.setText("NEW TITLE");
            // user can also set color using "Color" and then
            // "Color value constant"
            // myTitleText.setBackgroundColor(Color.GREEN);
        }
    }
}
