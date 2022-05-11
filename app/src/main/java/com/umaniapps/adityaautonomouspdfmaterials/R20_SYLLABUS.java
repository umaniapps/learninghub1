package com.umaniapps.adityaautonomouspdfmaterials;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.parser.ColorParser;

public class R20_SYLLABUS extends AppCompatActivity {

    CardView AIML,CSE,ECE,IT,EEE,MECH,CIVIL,AGRI,MINING,PETROLEUM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r20_syllabus);




        AIML = findViewById(R.id.AIML);

        AIML.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://aecaditya.blogspot.com/p/blog-page_91.html");
            }
        });

        CSE = findViewById(R.id.CSE);

        CSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl1("https://aecaditya.blogspot.com/p/blog-page_14.html");
            }
        });
        ECE = findViewById(R.id.ECE);

        ECE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl2("https://aecaditya.blogspot.com/p/blog-page_78.html");
            }
        });
        IT = findViewById(R.id.IT);

        IT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl3("https://aecaditya.blogspot.com/p/blog-page_95.html");
            }
        });
        EEE = findViewById(R.id.EEE);

        EEE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl4("https://aecaditya.blogspot.com/p/blog-page_27.html");
            }
        });
        MECH = findViewById(R.id.MECH);

        MECH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl5("https://aecaditya.blogspot.com/p/blog-page_3.html");
            }
        });
        CIVIL = findViewById(R.id.CIVIL);

        CIVIL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl6("https://aecaditya.blogspot.com/p/blog-page_31.html");
            }
        });
        AGRI = findViewById(R.id.AGRI);

        AGRI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl7("https://aecaditya.blogspot.com/p/blog-page_74.html");
            }
        });
        MINING = findViewById(R.id.MINING);

        MINING.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl8("https://aecaditya.blogspot.com/p/blog-page_99.html");
            }
        });
        PETROLEUM = findViewById(R.id.PETROLEUM);

        PETROLEUM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl9("https://aecaditya.blogspot.com/p/blog-page_72.html");
            }
        });


    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
    private void gotoUrl1(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
    private void gotoUrl2(String s) {
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
    private void gotoUrl9(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}