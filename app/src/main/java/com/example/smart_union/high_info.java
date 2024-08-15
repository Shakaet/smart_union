package com.example.smart_union;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class high_info extends AppCompatActivity {

    ListView l1;

    String[] title={"গশ্চি উচ্চ বিদ্যালয়","পাচঁখাইন সম্মেলনী উচ্চ বিদ্যালয়","কোয়েপাড়া বালিকা উচ্চ বিদ্যালয়","কোয়েপাড়া উচ্চ বিদ্যালয়"};
    String [] details={"স্থাপিত-১৯৮৬","স্থাপিত-১৯৯০","স্থাপিত-১৯৮৬","স্থাপিত-১৯৮৭"};

    String[] info={"গ্রাম-গশ্চি,ওয়ার্ড-২ নং","গ্রাম-পাচঁখাইন,ওয়ার্ড-৪ নং","গ্রাম-কোয়েপাড়া,ওয়ার্ড-৮ নং","গ্রাম-কোয়েপাড়া,ওয়ার্ড-৭ নং"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_high_info);


        l1=findViewById(R.id.listview);

        customAdapter2 adapter=new customAdapter2(high_info.this,title,details,info);

        l1.setAdapter(adapter);

    }
}