package com.example.smart_union;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class link_e_namjari extends AppCompatActivity {

    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_link_enamjari);

        webview=findViewById(R.id.webview);

        WebSettings webSettings=webview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webview.loadUrl("https://land.gov.bd/%" +
                "E0%A6%A8%E0%A6%BE%E0%A6%AE%E0%A6%9C%E0%A6%BE%E0%A6" +
                "%B0%E0%A6%BF-%E0%A6%B8%E0%A7%87%E0%A6%AC%E0%A6%BE/");

    }
}