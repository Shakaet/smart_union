package com.example.smart_union;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class homepage extends AppCompatActivity {

    ImageButton menubar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        menubar=findViewById(R.id.menu);


        menubar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii= new Intent(getApplicationContext(),buttonPage.class);

                startActivity(ii);
            }
        });




    }
}