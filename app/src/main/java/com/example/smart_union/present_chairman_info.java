package com.example.smart_union;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class present_chairman_info extends AppCompatActivity {

    ListView l1;

    String[] title={"ভূপোষ বড়ুয়া"};
    String [] details={"চেয়ারম্যান"};

    String[] year={"(২০১২-বর্তমান) ০১৮......"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_present_chairman_info);
        l1=findViewById(R.id.listview1);

        customAdapter1 customAdapter1=new customAdapter1(present_chairman_info.this,title,details,year);

        l1.setAdapter(customAdapter1);

    }
}