package com.example.smart_union;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class buttonPage extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,but_women;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_page);
        b1=findViewById(R.id.but1);
        b2=findViewById(R.id.but2);
        b3=findViewById(R.id.but3);
        b4=findViewById(R.id.but4);
        b5=findViewById(R.id.but5);
        b6=findViewById(R.id.but6);
        but_women=findViewById(R.id.but_women);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii=new Intent(getApplicationContext(), button2Page.class);

                Bundle translatebundle= ActivityOptions.makeCustomAnimation(buttonPage.this,
                        R.anim.slide_in_left,
                        R.anim.slide_out_right).toBundle();



                startActivity(ii,translatebundle);


            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii=new Intent(getApplicationContext(), button3Page.class);

                Bundle translatebundle= ActivityOptions.makeCustomAnimation(buttonPage.this,
                        R.anim.slide_in_right,
                        R.anim.slide_out_left).toBundle();



                startActivity(ii,translatebundle);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii=new Intent(getApplicationContext(), shocib_info.class);

                Bundle translatebundle= ActivityOptions.makeCustomAnimation(buttonPage.this,
                        R.anim.slide_in_left,
                        R.anim.slide_out_right).toBundle();



                startActivity(ii,translatebundle);

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii=new Intent(getApplicationContext(), police_info.class);

                Bundle translatebundle= ActivityOptions.makeCustomAnimation(buttonPage.this,
                        R.anim.slide_in_right,
                        R.anim.slide_out_left).toBundle();



                startActivity(ii,translatebundle);

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii=new Intent(getApplicationContext(), agriculture_info.class);

                Bundle translatebundle= ActivityOptions.makeCustomAnimation(buttonPage.this,
                        R.anim.slide_in_left,
                        R.anim.slide_out_right).toBundle();



                startActivity(ii,translatebundle);

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii=new Intent(getApplicationContext(), citizen_info.class);

                Bundle translatebundle= ActivityOptions.makeCustomAnimation(buttonPage.this,
                        R.anim.slide_in_right,
                        R.anim.slide_out_left).toBundle();



                startActivity(ii,translatebundle);

            }
        });

        but_women.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii=new Intent(getApplicationContext(), button_women.class);

                Bundle translatebundle= ActivityOptions.makeCustomAnimation(buttonPage.this,
                        R.anim.slide_in_right,
                        R.anim.slide_out_left).toBundle();



                startActivity(ii,translatebundle);

            }
        });








    }
}