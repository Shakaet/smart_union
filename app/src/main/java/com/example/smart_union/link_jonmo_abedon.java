package com.example.smart_union;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class link_jonmo_abedon extends AppCompatActivity {

    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_link_jonmo_abedon);

        webview=findViewById(R.id.webview);

        WebSettings webSettings=webview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webview.loadUrl("https://bdris.gov.bd/br/application");

    }
}