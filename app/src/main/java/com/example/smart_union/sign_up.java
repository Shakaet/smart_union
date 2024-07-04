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

public class sign_up extends AppCompatActivity {

    EditText fname,lname,email,ward,nid,holding,password,confirm_password;

    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        fname=findViewById(R.id.fname);
        lname=findViewById(R.id.lname);
        email=findViewById(R.id.email);
        ward=findViewById(R.id.ward);
        nid=findViewById(R.id.nid);
        holding=findViewById(R.id.holding);
        password=findViewById(R.id.pass);
        confirm_password=findViewById(R.id.conpass);
        signup=findViewById(R.id.signup);


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = fname.getText().toString().trim();
                String b = lname.getText().toString().trim();
                String c = email.getText().toString().trim();
                String d = ward.getText().toString().trim();
                String e = nid.getText().toString().trim();
                String f = holding.getText().toString().trim();
                String g = password.getText().toString().trim();
                String h = confirm_password.getText().toString().trim();


                if (c.equals("emon@gmail.com") && d.equals("password") && e.equals("password")) {

                    Toast.makeText(sign_up.this, "Signup Successful", Toast.LENGTH_SHORT).show();

                    Intent ii = new Intent(sign_up.this, login.class);

                    Bundle translatebundle= ActivityOptions.makeCustomAnimation(sign_up.this,
                            R.anim.slide_in_left,
                            R.anim.slide_out_right).toBundle();



                    startActivity(ii,translatebundle);

                }
                else {
                    Toast.makeText(sign_up.this, "Authentic Error", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}