package com.example.smart_union;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class clg_info extends AppCompatActivity {

    ListView l1;


    String[] title={"গশ্চি শিশুবাগ স্কুল এন্ড কলেজ"};
    String [] details={"স্থাপিত-২০০১ সাল"};

    String[] info={"গ্রাম-গশ্চি,ওয়ার্ড-2 নং"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_clg_info);

        l1=findViewById(R.id.listview);

        customAdapter2 adapter=new customAdapter2(clg_info.this,title,details,info);

        l1.setAdapter(adapter);


    }
}