package com.example.news;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class webView extends AppCompatActivity {

    Toolbar toolbar;
    WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        toolbar=findViewById(R.id.toolbar);
        webView=findViewById(R.id.webview);
        Intent intent=getIntent();
        String url=intent.getStringExtra("url");
        webView.loadUrl(url);
    }
}