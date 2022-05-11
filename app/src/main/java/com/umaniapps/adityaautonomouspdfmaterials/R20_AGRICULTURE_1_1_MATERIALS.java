package com.umaniapps.adityaautonomouspdfmaterials;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class R20_AGRICULTURE_1_1_MATERIALS extends AppCompatActivity {


    CardView EG,CE,EP,DE,PRINCIPLES,EP_LAB,CE_LAB,SOIL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r20_agriculture11_materials);



        EG = findViewById(R.id.EG);

        EG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://aecaditya.blogspot.com/p/blog-page_246.html");
            }
        });

        CE = findViewById(R.id.CE);

        CE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl2("https://aecaditya.blogspot.com/p/r20-communicative-english.html");

            }
        });
        EP = findViewById(R.id.EP);

        EP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl3("https://aecaditya.blogspot.com/p/blog-page_191.html");

            }
        });

        PRINCIPLES = findViewById(R.id.PRINCIPLES);

        PRINCIPLES.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl4("https://aecaditya.blogspot.com/p/blog-page_309.html");

            }
        });

        DE = findViewById(R.id.DE);

        DE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl5("https://aecaditya.blogspot.com/p/r20-de-la-m-i.html");

            }
        });

        SOIL = findViewById(R.id.SOIL);

        SOIL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl6("https://aecaditya.blogspot.com/p/blog-page_825.html");

            }
        });

        EP_LAB = findViewById(R.id.EP_LAB);

        EP_LAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl7("https://aecaditya.blogspot.com/p/blog-page_663.html");

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