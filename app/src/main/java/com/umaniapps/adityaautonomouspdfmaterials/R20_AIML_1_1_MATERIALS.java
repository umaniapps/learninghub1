package com.umaniapps.adityaautonomouspdfmaterials;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.DownloadManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class R20_AIML_1_1_MATERIALS extends AppCompatActivity {

    CardView engineering_chemistry,communicative_english,CEW,PPSC,DE,PPSC_LAB,EC_LAB,CE_LAB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r20_aiml11_materials);




        engineering_chemistry = findViewById(R.id.engineering_chemistry);

        engineering_chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://aecaditya.blogspot.com/p/r20-applied-chemistry-1-11-2.html");
            }
        });

        communicative_english = findViewById(R.id.communicative_english);

        communicative_english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl2("https://aecaditya.blogspot.com/p/r20-communicative-english.html");

            }
        });
        CEW = findViewById(R.id.CEW);

        CEW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl3("https://aecaditya.blogspot.com/p/r20-compute-engineeing-work-shop.html");

            }
        });

        PPSC = findViewById(R.id.PPSC);

        PPSC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl4("https://aecaditya.blogspot.com/p/r20-programming-for-problem-solving.html");

            }
        });

        DE = findViewById(R.id.DE);

        DE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl5("https://aecaditya.blogspot.com/p/r20-de-la-m-i.html");

            }
        });

        PPSC_LAB = findViewById(R.id.PPSC_LAB);

        PPSC_LAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl6("https://aecaditya.blogspot.com/p/blog-page_278.html");

            }
        });

        EC_LAB = findViewById(R.id.EC_LAB);

        EC_LAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl7("https://aecaditya.blogspot.com/p/engineering-chemistry-lab.html");

            }
        });

        CE_LAB = findViewById(R.id.CE_LAB);

        CE_LAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl8("https://aecaditya.blogspot.com/p/blog-page_511.html");

            }
        });




    }

    private void gotoUrl2(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    private void gotoUrl3(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    private void gotoUrl4(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    private void gotoUrl5(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    private void gotoUrl6(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    private void gotoUrl7(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    private void gotoUrl8(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}