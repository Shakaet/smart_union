package com.example.smart_union;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ovijog_link_doc extends AppCompatActivity {

    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ovijog_link_doc);

        webview=findViewById(R.id.webview);

        WebSettings webSettings=webview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webview.loadUrl("https://forms.gle/K7BbdCcDLzzuckEK6");
    }
}