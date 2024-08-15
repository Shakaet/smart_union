package com.example.smart_union;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class primary_info extends AppCompatActivity {

    ListView l1;

    String[] title={"গশ্চি বোর্ড সরকারি প্রাথমিক বিদ্যালয়","গশ্চি ভানুমতী সরকারি প্রাথমিক বিদ্যালয়","গশ্চি পাঠানপাড়া সরকারি প্রাথমিক বিদ্যালয় ",
            "গরীবুল্লাহপাড়া সরকারি প্রাথমিক বিদ্যালয়","পূর্ব নোয়াপাড়া সরকারি প্রাথমিক বিদ্যালয়","পাচঁখাইন দরগাহ সরকারি প্রাথমিক বিদ্যালয়","ছালে আহমদ সরকারী প্রাথমিক বিদ্যালয়",
            "বাগোয়ান সরকারি প্রাথমিক বিদ্যালয়","কোয়েপাড়া সরকারি প্রাথমিক বিদ্যালয়","উত্তর বাগোয়ান সরকারি প্রাথমিক বিদ্যালয়"};
    String [] details={"স্থাপিত-১৯৭৮","স্থাপিত-১৯৭৯","স্থাপিত-১৯৮৬","স্থাপিত-১৯৯৮","স্থাপিত-১৯৮৮","স্থাপিত-১৯৯৯","স্থাপিত-১৯৯১","স্থাপিত-১৯৯৩","স্থাপিত-২০০১"
            ,"স্থাপিত-২০০২"};

    String[] info={"গ্রাম-গশ্চি,ওয়ার্ড-১ নং","গ্রাম-গশ্চি ওয়ার্ড-২ নং","গ্রাম-গশ্চি,ওয়ার্ড-২ নং","গ্রাম-গশ্চি,ওয়ার্ড-২ নং","গ্রাম-পাচঁখাইন,ওয়ার্ড-৪ নং",
            "গ্রাম-পাচঁখাইন,ওয়ার্ড-৫ নং","গ্রাম-বাগোয়ান,ওয়ার্ড-৬ নং","গ্রাম-বাগোয়ান,ওয়ার্ড-৭ নং","গ্রাম-কোয়েপাড়া,ওয়ার্ড-৮ নং","গ্রাম-কোয়েপাড়া,ওয়ার্ড-৯ নং"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_primary_info);


        l1=findViewById(R.id.listview);

        customAdapter2 adapter=new customAdapter2(primary_info.this,title,details,info);

        l1.setAdapter(adapter);

    }
}