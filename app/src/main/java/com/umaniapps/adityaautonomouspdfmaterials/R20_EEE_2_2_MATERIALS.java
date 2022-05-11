package com.umaniapps.adityaautonomouspdfmaterials;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class R20_EEE_2_2_MATERIALS extends AppCompatActivity {
    CardView NUMERICAL,APPLIED,PYTHON,PYTHON_LAB,DS_C,DS_C_LAB,DIGITAL,APPLIED_LAB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r20_eee22_materials);




        NUMERICAL = findViewById(R.id.NUMERICAL);

        NUMERICAL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://aecaditya.blogspot.com/p/r20-ai-ml-1-2-semester-materials.html");
            }
        });

        APPLIED = findViewById(R.id.APPLIED);

        APPLIED.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl2("https://aecaditya.blogspot.com/p/r20-ai-ml-1-2-semester-materials.html");

            }
        });
        PYTHON = findViewById(R.id.PYTHON);

        PYTHON.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl3("https://aecaditya.blogspot.com/p/r20-ai-ml-1-2-semester-materials.html");

            }
        });

        PYTHON_LAB = findViewById(R.id.PYTHON_LAB);

        PYTHON_LAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl4("https://aecaditya.blogspot.com/p/r20-ai-ml-1-2-semester-materials.html");

            }
        });

        DS_C = findViewById(R.id.DS_C);

        DS_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl5("https://aecaditya.blogspot.com/p/r20-de-la-m-i.html");

            }
        });

        DS_C_LAB = findViewById(R.id.DS_C_LAB);

        DS_C_LAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl6("https://aecaditya.blogspot.com/p/r20-ai-ml-1-2-semester-materials.html");

            }
        });

        DIGITAL = findViewById(R.id.DIGITAL);

        DIGITAL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl7("https://aecaditya.blogspot.com/p/r20-ai-ml-1-2-semester-materials.html");

            }
        });

        APPLIED_LAB = findViewById(R.id.APPLIED_LAB);

        APPLIED_LAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl8("https://aecaditya.blogspot.com/p/r20-ai-ml-1-2-semester-materials.html");

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