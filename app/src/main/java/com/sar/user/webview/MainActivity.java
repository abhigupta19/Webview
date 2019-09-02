package com.sar.user.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView=findViewById(R.id.ee);
        webView.loadUrl("http://www.gggoe.com");
        webView.canGoBack();
        webView.setWebViewClient(new WebViewClient());

    }
}
