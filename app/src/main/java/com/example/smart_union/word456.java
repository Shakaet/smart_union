package com.example.smart_union;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class word456 extends AppCompatActivity {

    ListView l1;

    String[] title={"মনি বেগম"};
    String [] details={"(২০২৩-বর্তমান)"};

    String[] year={"০১৭......."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_word456);

        l1=findViewById(R.id.listview1);

        customAdapter1 customAdapter1=new customAdapter1(word456.this,title,details,year);

        l1.setAdapter(customAdapter1);

    }
}