package com.example.smart_union;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class police_info_2 extends AppCompatActivity {

    ListView l1;

    String[] title={"মো:ইমরান","মো:দিদার","মোঃ ইরফান","অজয় দাশ","রিমন বড়ুয়া"};
    String [] details={"বর্তমান,","বর্তমান,","বর্তমান,","বর্তমান,","বর্তমান,"};

    String[] year={"017...........","018.............","018.............","018.............","016............"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_police_info2);

        l1=findViewById(R.id.listview1);

        customAdapter1 customAdapter1=new customAdapter1(police_info_2.this,title,details,year);

        l1.setAdapter(customAdapter1);

    }
}