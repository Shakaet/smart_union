package com.example.smart_union;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class login extends AppCompatActivity {

    EditText email,ward,nid,password;

    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email=findViewById(R.id.email);
        ward=findViewById(R.id.ward);
        nid=findViewById(R.id.nid);
        password=findViewById(R.id.password);
        login=findViewById(R.id.log);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = email.getText().toString().trim();
                String b = ward.getText().toString().trim();
                String c = nid.getText().toString().trim();
                String d = password.getText().toString().trim();

                if (a.equals("emon@gmail.com") && b.equals("02") && c.equals("2404098465") && d.equals("12345678")){

                    Toast.makeText(login.this, "Login Successful", Toast.LENGTH_SHORT).show();

                    Intent ii = new Intent(login.this, homepage.class);

                    Bundle translatebundle= ActivityOptions.makeCustomAnimation(login.this,
                            R.anim.slide_in_right,
                            R.anim.slide_out_left).toBundle();



                    startActivity(ii,translatebundle);

                }
                else if(a.equals("habib@gmail.com") && b.equals("03") && c.equals("123456") && d.equals("12345678")){

                    Toast.makeText(login.this, "Login Successful", Toast.LENGTH_SHORT).show();

                    Intent ii = new Intent(login.this, homepage.class);

                    Bundle translatebundle= ActivityOptions.makeCustomAnimation(login.this,
                            R.anim.slide_in_right,
                            R.anim.slide_out_left).toBundle();



                    startActivity(ii,translatebundle);

                }
                else if(a.equals("oni@gmail.com") && b.equals("04") && c.equals("123456") && d.equals("12345678")){

                    Toast.makeText(login.this, "Login Successful", Toast.LENGTH_SHORT).show();

                    Intent ii = new Intent(login.this, homepage.class);

                    Bundle translatebundle= ActivityOptions.makeCustomAnimation(login.this,
                            R.anim.slide_in_right,
                            R.anim.slide_out_left).toBundle();



                    startActivity(ii,translatebundle);

                }

                else {
                    Toast.makeText(login.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });







    }
}