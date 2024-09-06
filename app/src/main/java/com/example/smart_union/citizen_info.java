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


    Button but3,but4,but5,but6,but7,but20,but2,but8,but9,but10,but1,but19,but12;



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
        but2=findViewById(R.id.but2);
        but8=findViewById(R.id.but8);
        but9=findViewById(R.id.but9);
        but10=findViewById(R.id.but10);
        but1=findViewById(R.id.but1);
        but19=findViewById(R.id.but19);
        but12=findViewById(R.id.but12);



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

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ii=new Intent(getApplicationContext(), paybill.class);

                Bundle translatebundle= ActivityOptions.makeCustomAnimation(getApplicationContext(),
                        R.anim.slide_in_left,
                        R.anim.slide_out_right).toBundle();



                startActivity(ii,translatebundle);
            }
        });


        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ii=new Intent(getApplicationContext(), passport_App.class);

                Bundle translatebundle= ActivityOptions.makeCustomAnimation(getApplicationContext(),
                        R.anim.slide_in_right,
                        R.anim.slide_out_left).toBundle();



                startActivity(ii,translatebundle);
            }
        });

        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ii=new Intent(getApplicationContext(), passport_situation.class);

                Bundle translatebundle= ActivityOptions.makeCustomAnimation(getApplicationContext(),
                        R.anim.slide_in_left,
                        R.anim.slide_out_right).toBundle();



                startActivity(ii,translatebundle);
            }
        });

        but10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ii=new Intent(getApplicationContext(), police_clearence.class);

                Bundle translatebundle= ActivityOptions.makeCustomAnimation(getApplicationContext(),
                        R.anim.slide_in_right,
                        R.anim.slide_out_left).toBundle();



                startActivity(ii,translatebundle);
            }
        });


        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ii=new Intent(getApplicationContext(), ovijog_link_doc.class);

                Bundle translatebundle= ActivityOptions.makeCustomAnimation(getApplicationContext(),
                        R.anim.slide_in_left,
                        R.anim.slide_out_right).toBundle();



                startActivity(ii,translatebundle);
            }
        });

        but19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ii=new Intent(getApplicationContext(), all_sonod.class);

                Bundle translatebundle= ActivityOptions.makeCustomAnimation(getApplicationContext(),
                        R.anim.slide_in_right,
                        R.anim.slide_out_left).toBundle();



                startActivity(ii,translatebundle);
            }
        });

        but12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ii=new Intent(getApplicationContext(), govt_vata.class);

                Bundle translatebundle= ActivityOptions.makeCustomAnimation(getApplicationContext(),
                        R.anim.slide_in_left,
                        R.anim.slide_out_right).toBundle();



                startActivity(ii,translatebundle);
            }
        });










    }
}