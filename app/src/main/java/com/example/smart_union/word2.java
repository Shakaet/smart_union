package com.example.smart_union;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class word2 extends AppCompatActivity {

    ListView l1;

    String[] title={"উদয় দত্ত অর্ক"};
    String [] details={"(২০১৮-বর্তমান)"};

    String[] year={"০১৮......"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_word2);

        l1=findViewById(R.id.listview1);

        customAdapter1 customAdapter1=new customAdapter1(word2.this,title,details,year);

        l1.setAdapter(customAdapter1);

    }
}