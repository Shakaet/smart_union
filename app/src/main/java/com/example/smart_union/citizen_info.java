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

public class citizen_info extends AppCompatActivity {


    Button but3,but4,but5,but6,but7,but20;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_citizen_info);

        but3=findViewById(R.id.but3);
        but4=findViewById(R.id.but4);
        but5=findViewById(R.id.but5);
        but6=findViewById(R.id.but6);
        but7=findViewById(R.id.but7);
        but20=findViewById(R.id.but20);



        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ii=new Intent(getApplicationContext(), link_jonmo_abedon.class);

                Bundle translatebundle= ActivityOptions.makeCustomAnimation(getApplicationContext(),
                        R.anim.slide_in_left,
                        R.anim.slide_out_right).toBundle();



                startActivity(ii,translatebundle);
            }
        });

        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ii=new Intent(getApplicationContext(), link_jonmo_songshodhon.class);

                Bundle translatebundle= ActivityOptions.makeCustomAnimation(getApplicationContext(),
                        R.anim.slide_in_right,
                        R.anim.slide_out_left).toBundle();



                startActivity(ii,translatebundle);
            }
        });


        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ii=new Intent(getApplicationContext(), link_nid_abedon.class);

                Bundle translatebundle= ActivityOptions.makeCustomAnimation(getApplicationContext(),
                        R.anim.slide_in_left,
                        R.anim.slide_out_right).toBundle();



                startActivity(ii,translatebundle);
            }
        });

        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ii=new Intent(getApplicationContext(), link_nid_shongshodhon.class);

                Bundle translatebundle= ActivityOptions.makeCustomAnimation(getApplicationContext(),
                        R.anim.slide_in_right,
                        R.anim.slide_out_left).toBundle();



                startActivity(ii,translatebundle);
            }
        });

        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ii=new Intent(getApplicationContext(), link_smart_card.class);

                Bundle translatebundle= ActivityOptions.makeCustomAnimation(getApplicationContext(),
                        R.anim.slide_in_left,
                        R.anim.slide_out_right).toBundle();



                startActivity(ii,translatebundle);
            }
        });

        but20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ii=new Intent(getApplicationContext(), link_jon_jachai.class);

                Bundle translatebundle= ActivityOptions.makeCustomAnimation(getApplicationContext(),
                        R.anim.slide_in_right,
                        R.anim.slide_out_left).toBundle();



                startActivity(ii,translatebundle);
            }
        });








    }
}