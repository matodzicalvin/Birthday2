package com.example.codetribe.birthday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.webkit.WebView;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private WebView browser;
    TextView Click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        browser = (WebView)findViewById(R.id.webView1);
        browser.getSettings().setJavaScriptEnabled(true);
        browser.loadUrl("file:///android_asset/customer/index.html");

        Click = (TextView) findViewById(R.id.textView4);
        Click.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this,Details.class);
                startActivity(i);
            }
        });

    }
}
