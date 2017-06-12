package com.example.codetribe.birthday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

public class Details extends AppCompatActivity {
    private WebView browser;
    TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        browser = (WebView)findViewById(R.id.webView1);
        browser.loadUrl("file:///android_asset/AboutUs.html");

        textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Toast.makeText(getApplicationContext(), "Bring Your Own Beer...",Toast.LENGTH_SHORT).show();
                Intent z = new Intent(Details.this,Last.class);
                startActivity(z);

            }
        });

    }
}