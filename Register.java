package com.example.ahsan.ahsanassignement2;

import android.support.v7.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.os.Bundle;

import android.widget.TextView;


/**
 * Created by Ahsan on 1/18/2017.
 */

public class Register extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);

        SharedPreferences sharedPreferences = getSharedPreferences("MYPREF", MODE_PRIVATE);
        String display = sharedPreferences.getString("display", " ");

        TextView displayinfo = (TextView) findViewById(R.id.txtshow);
        displayinfo.setText(display);
    }
}