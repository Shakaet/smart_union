package com.example.smart_union;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button login,signup;

    TextView textView;

    Animation blink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login=findViewById(R.id.login);
        signup=findViewById(R.id.signup);
        textView=findViewById(R.id.textview);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii=new Intent(MainActivity.this,login.class);

                Bundle translatebundle= ActivityOptions.makeCustomAnimation(MainActivity.this,
                        R.anim.slide_in_left,
                        R.anim.slide_out_right).toBundle();



                startActivity(ii,translatebundle);
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii=new Intent(MainActivity.this,sign_up.class);

                Bundle translatebundle= ActivityOptions.makeCustomAnimation(MainActivity.this,
                        R.anim.slide_in_right,
                        R.anim.slide_out_left).toBundle();
                startActivity(ii,translatebundle);
            }
        });


        blink= AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.blink);

        textView.startAnimation(blink);



    }
}