package com.umaniapps.adityaautonomouspdfmaterials;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class R20_AGRICULTURE_1_2_MATERIALS extends AppCompatActivity {
    CardView PPSC,PPSCL,PCSL,PARTIAL,COM,EM,EW,CADL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r20_agriculture12_materials);




        PPSC = findViewById(R.id.PPSC);

        PPSC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://aecaditya.blogspot.com/p/r20-agriculture-1-2-semester-materials.html");
            }
        });

        PPSCL = findViewById(R.id.PPSCL);

        PPSCL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl2("https://aecaditya.blogspot.com/p/r20-agriculture-1-2-semester-materials.html");

            }
        });
        PCSL = findViewById(R.id.PCSL);

        PCSL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl3("https://aecaditya.blogspot.com/p/r20-agriculture-1-2-semester-materials.html");

            }
        });

        PARTIAL = findViewById(R.id.PARTIAL);

        PARTIAL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl4("https://aecaditya.blogspot.com/p/r20-agriculture-1-2-semester-materials.html");

            }
        });

        COM = findViewById(R.id.COM);

        COM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl5("https://aecaditya.blogspot.com/p/r20-agriculture-1-2-semester-materials.html");

            }
        });

        CADL = findViewById(R.id.CADL);

        CADL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl6("https://aecaditya.blogspot.com/p/r20-agriculture-1-2-semester-materials.html");

            }
        });

        EM = findViewById(R.id.EM);

        EM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl7("https://aecaditya.blogspot.com/p/r20-agriculture-1-2-semester-materials.html");

            }
        });

        EW = findViewById(R.id.EW);

        EW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl8("https://aecaditya.blogspot.com/p/r20-agriculture-1-2-semester-materials.html");

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