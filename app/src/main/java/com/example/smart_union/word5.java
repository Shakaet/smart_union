package com.example.smart_union;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class word5 extends AppCompatActivity {

    ListView l1;

    String[] title={"মোঃ খালেক"};
    String [] details={"(২০১৮-বর্তমান)"};

    String[] year={"০১৮......"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_word5);

        l1=findViewById(R.id.listview1);

        customAdapter1 customAdapter1=new customAdapter1(word5.this,title,details,year);

        l1.setAdapter(customAdapter1);

    }
}