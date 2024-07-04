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

public class button2Page extends AppCompatActivity {

    Button b1,b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2_page);
        b1=findViewById(R.id.but1);
        b2=findViewById(R.id.but2);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ii=new Intent(getApplicationContext(), former_chairman_info.class);

                Bundle translatebundle= ActivityOptions.makeCustomAnimation(getApplicationContext(),
                        R.anim.slide_in_right,
                        R.anim.slide_out_left).toBundle();



                startActivity(ii,translatebundle);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ii=new Intent(getApplicationContext(), present_chairman_info.class);

                Bundle translatebundle= ActivityOptions.makeCustomAnimation(getApplicationContext(),
                        R.anim.slide_in_left,
                        R.anim.slide_out_right).toBundle();



                startActivity(ii,translatebundle);
            }
        });

    }
}