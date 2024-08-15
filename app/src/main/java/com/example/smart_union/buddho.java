package com.example.smart_union;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class buddho extends AppCompatActivity {

    ListView l1;

    String[] title={"বাগওয়ান করাচি বৌদ্ধ\nবিহার"};
    String [] details={"স্থাপিত-১৯৭৭"};

    String[] info={"গ্রাম-বাগোয়ান,ওয়ার্ড-৪ নং"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_buddho);

        l1=findViewById(R.id.listview);

        customAdapter2 adapter=new customAdapter2(buddho.this,title,details,info);

        l1.setAdapter(adapter);

    }
}