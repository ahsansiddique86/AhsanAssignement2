package com.example.ahsan.ahsanassignement2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Ahsan on 1/18/2017.
 */

public class Display extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        final EditText Un = (EditText) findViewById(R.id.etdusername);
        final EditText pass = (EditText) findViewById(R.id.etdpassword);
        final EditText email = (EditText) findViewById(R.id.etdemail);
        Button register = (Button) findViewById(R.id.btnRegister);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences sharedPreferences = getSharedPreferences("MYPREF", 0);
                String Username = Un.getText().toString();
                String Password = pass.getText().toString();
                String EMAIL = email.getText().toString();

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(Username + Password + "data", Username + "/n" + EMAIL);
                editor.commit();

                Intent loginscreen = new Intent(Display.this, MainActivity.class);
                startActivity(loginscreen);
            }
        });


    }
}
