package com.example.smart_union;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class madrasha_info extends AppCompatActivity {

    ListView l1;

    String[] title={"গশ্চি হাঁছি ফকির সুন্নিয়া মাদ্রাসা","গশ্চি মোহাম্মদ জামান মাদ্রাসা","উত্তর দেওয়ানপুর মাদ্রাসা"};
    String [] details={"স্থাপিত-২০০১ সাল","স্থাপিত-২০১০","স্থাপিত-২০০৪"};

    String[] info={"গ্রাম-গশ্চি,ওয়ার্ড-১ নং","গ্রাম-গশ্চি,ওয়ার্ড-৩ নং","গ্রাম-বাগওয়ান,ওয়ার্ড-৬ নং"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_madrasha_info);

        l1=findViewById(R.id.listview);

        customAdapter2 adapter=new customAdapter2(madrasha_info.this,title,details,info);

        l1.setAdapter(adapter);

    }
}