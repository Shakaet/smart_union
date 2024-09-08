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

public class govt_vata extends AppCompatActivity {

    Button but1,but2,but3,but4,but5,but6,but7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_govt_vata);
        but1=findViewById(R.id.but1);
        but2=findViewById(R.id.but2);
        but3=findViewById(R.id.but3);
        but4=findViewById(R.id.but4);
        but5=findViewById(R.id.but5);
        but6=findViewById(R.id.but6);
        but7=findViewById(R.id.but7);

        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ii=new Intent(getApplicationContext(), boyosko_vata.class);

                Bundle translatebundle= ActivityOptions.makeCustomAnimation(getApplicationContext(),
                        R.anim.slide_in_left,
                        R.anim.slide_out_right).toBundle();



                startActivity(ii,translatebundle);
            }
        });

        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ii=new Intent(getApplicationContext(), bidhoba_vata.class);

                Bundle translatebundle= ActivityOptions.makeCustomAnimation(getApplicationContext(),
                        R.anim.slide_in_right,
                        R.anim.slide_out_left).toBundle();



                startActivity(ii,translatebundle);
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ii=new Intent(getApplicationContext(), pritibondhi_vata.class);

                Bundle translatebundle= ActivityOptions.makeCustomAnimation(getApplicationContext(),
                        R.anim.slide_in_left,
                        R.anim.slide_out_right).toBundle();



                startActivity(ii,translatebundle);
            }
        });

        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ii=new Intent(getApplicationContext(), matritto_vata.class);

                Bundle translatebundle= ActivityOptions.makeCustomAnimation(getApplicationContext(),
                        R.anim.slide_in_right,
                        R.anim.slide_out_left).toBundle();



                startActivity(ii,translatebundle);
            }
        });

        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ii=new Intent(getApplicationContext(), vgd.class);

                Bundle translatebundle= ActivityOptions.makeCustomAnimation(getApplicationContext(),
                        R.anim.slide_in_left,
                        R.anim.slide_out_right).toBundle();



                startActivity(ii,translatebundle);
            }
        });

        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ii=new Intent(getApplicationContext(), vgf.class);

                Bundle translatebundle= ActivityOptions.makeCustomAnimation(getApplicationContext(),
                        R.anim.slide_in_right,
                        R.anim.slide_out_left).toBundle();



                startActivity(ii,translatebundle);
            }
        });



    }
}