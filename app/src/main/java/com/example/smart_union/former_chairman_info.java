package com.example.smart_union;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class former_chairman_info extends AppCompatActivity {

    ListView l1;

    String[] title={"আবুল বশর","আবু জাফর","অছিমিয়া খান","কামাল উদ্দীন"};
    String [] details={"ভারপ্রাপ্ত,চেয়ারম্যান","চেয়ারম্যান","চেয়ারম্যান","চেয়ারম্যান"};

    String[] year={"(২০০৮-২০১০)","(২০০৩-২০০৮)","(১৯৯৯-২০০৩)","(১৯৯৫-১৯৯৯)"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_former_chairman_info);
        l1=findViewById(R.id.listview);

       customAdapter1 adapter=new customAdapter1(former_chairman_info.this,title,details,year);

        l1.setAdapter(adapter);



    }
}