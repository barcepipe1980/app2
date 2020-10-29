package com.example.reseasdepeliculas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity2 extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        webView=findViewById(R.id.WBpelicula);
        String pelicula=getIntent().getStringExtra("pelicula");
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.filmaffinity.com/ec/search.php?stext="+pelicula);
    }
}