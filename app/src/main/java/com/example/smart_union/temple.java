package com.example.smart_union;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class temple extends AppCompatActivity {

    ListView l1;

    String[] title={"শ্রী শ্রী গঙ্গা মন্দির","কোয়েপাড়া জগৎ সেন মন্দির"};
    String [] details={"স্থাপিত-১৯৯৬","স্থাপিত-১৯৮৬"};

    String[] info={"গ্রাম-গশ্চি,ওয়ার্ড-৩ নং","গ্রাম-কোয়েপাড়া,ওয়ার্ড-৭ নং"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_temple);


        l1=findViewById(R.id.listview);

        customAdapter2 adapter=new customAdapter2(temple.this,title,details,info);

        l1.setAdapter(adapter);


    }
}