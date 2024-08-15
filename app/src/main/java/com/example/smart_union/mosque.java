package com.example.smart_union;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class mosque extends AppCompatActivity {

    ListView l1;

    String[] title={"মওলানা হাসান আলী জামে মসজিদ","গশ্চি জামে মসজিদ","গরীবউল্লাহপাড়া জামে মসজিদ","হযরত বড় পীর (রঃ) জামে মসজিদ"
            ,"মাঝিপাড়া জামে মসজিদ","লামুরহাট জামে মসজিদ","পূর্ব বাগোয়ান জামে \nমসজিদ","কোয়েপাড়া জামে মসজিদ"};
    String [] details={"স্থাপিত-১৯৯৫","স্থাপিত-১৯৭৭","স্থাপিত-১৯৮৮","স্থাপিত-১৯৮৮","স্থাপিত-১৯৭৩","স্থাপিত-১৯৮৯","স্থাপিত-১৯৯১","স্থাপিত-১৯৭৬"};

    String[] info={"গ্রাম-গশ্চি,ওয়ার্ড-১ নং","গ্রাম-গশ্চি,ওয়ার্ড-২ নং","গ্রাম-গশ্চি,ওয়ার্ড-৩ নং","গ্রাম-পাচঁখাইন,ওয়ার্ড-৫ নং","গ্রাম-পাচঁখাইন,ওয়ার্ড-৪ নং"
            ,"গ্রাম-বাগোয়ান,ওয়ার্ড-৬ নং","গ্রাম-বাগোয়ান,ওয়ার্ড-৭ নং","গ্রাম-কোয়েপাড়া,ওয়ার্ড-৮ নং"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mosque);


        l1=findViewById(R.id.listview);

        customAdapter2 adapter=new customAdapter2(mosque.this,title,details,info);

        l1.setAdapter(adapter);

    }
}