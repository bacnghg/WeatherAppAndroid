package com.example.admin.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText editSearch;
    Button btnSearch, btnChangeActivity;
    TextView txtName, txtCountry, txtTemp, txtStatus, txtHuminity, txtCloud, txtWind, txtDay;

    ImageView imgIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();

    }

    private void Anhxa() {
        editSearch = (EditText) findViewById(R.id.edittextSearch);
        btnSearch = (Button) findViewById(R.id.buttonSearch);
        btnChangeActivity = (Button) findViewById(R.id.buttonChangeActivity);
        txtName = (TextView) findViewById(R.id.textviewName);
        txtCountry = (TextView) findViewById(R.id.textviewCountry);
        txtTemp = (TextView) findViewById(R.id.textviewName);
        txtStatus = (TextView) findViewById(R.id.textviewStatus);
        txtHuminity = (TextView) findViewById(R.id.textviewHumidity);
        txtCloud = (TextView) findViewById(R.id.textviewCloud);
        txtDay = (TextView) findViewById(R.id.textviewDay);
        txtWind = (TextView) findViewById(R.id.textviewWind);



    }
}
