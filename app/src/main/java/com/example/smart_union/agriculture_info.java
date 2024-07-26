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

public class agriculture_info extends AppCompatActivity {

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_agriculture_info);

        b1=findViewById(R.id.but1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii=new Intent(getApplicationContext(), agriculture_info_2.class);

                Bundle translatebundle= ActivityOptions.makeCustomAnimation(agriculture_info.this,
                        R.anim.slide_in_right,
                        R.anim.slide_out_left).toBundle();



                startActivity(ii,translatebundle);

            }
        });

    }
}