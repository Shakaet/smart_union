package com.example.smart_union;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class word8 extends AppCompatActivity {

    ListView l1;

    String[] title={"চম্পক মিত্র"};
    String [] details={"(২০১৮-বর্তমান)"};

    String[] year={"০১৮......"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_word8);

        l1=findViewById(R.id.listview1);

        customAdapter1 customAdapter1=new customAdapter1(word8.this,title,details,year);

        l1.setAdapter(customAdapter1);

    }
}