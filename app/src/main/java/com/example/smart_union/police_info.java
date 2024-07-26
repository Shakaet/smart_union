package com.example.smart_union;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class police_info extends AppCompatActivity {

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_police_info);
        b1=findViewById(R.id.but1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ii=new Intent(getApplicationContext(), police_info_2.class);

                Bundle translatebundle= ActivityOptions.makeCustomAnimation(police_info.this,
                        R.anim.slide_in_left,
                        R.anim.slide_out_right).toBundle();



                startActivity(ii,translatebundle);
            }
        });

    }
}