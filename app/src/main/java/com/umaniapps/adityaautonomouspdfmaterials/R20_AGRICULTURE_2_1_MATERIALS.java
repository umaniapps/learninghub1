package com.umaniapps.adityaautonomouspdfmaterials;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class R20_AGRICULTURE_2_1_MATERIALS extends AppCompatActivity {
    CardView INTEGRAL,SURVEYING,FLUID,FLUID_L,THERMO,THERMO_L,STRENGTH,SURVEYING_L;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r20_agriculture21_materials);




        INTEGRAL = findViewById(R.id.INTEGRAL);

        INTEGRAL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://aecaditya.blogspot.com/p/r20-agriculture-2-1-semester-materials.html");
            }
        });

        SURVEYING = findViewById(R.id.SURVEYING);

        SURVEYING.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl2("https://aecaditya.blogspot.com/p/r20-agriculture-2-1-semester-materials.html");

            }
        });
        FLUID = findViewById(R.id.FLUID);

        FLUID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl3("https://aecaditya.blogspot.com/p/r20-agriculture-2-1-semester-materials.html");

            }
        });

        FLUID_L = findViewById(R.id.FLUID_L);

        FLUID_L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl4("https://aecaditya.blogspot.com/p/r20-agriculture-2-1-semester-materials.html");

            }
        });

        THERMO = findViewById(R.id.THERMO);

        THERMO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl5("https://aecaditya.blogspot.com/p/r20-agriculture-2-1-semester-materials.html");

            }
        });

        THERMO_L = findViewById(R.id.THERMO_L);

        THERMO_L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl6("https://aecaditya.blogspot.com/p/r20-agriculture-2-1-semester-materials.html");

            }
        });

        STRENGTH = findViewById(R.id.STRENGTH);

        STRENGTH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl7("https://aecaditya.blogspot.com/p/r20-agriculture-2-1-semester-materials.html");

            }
        });

        SURVEYING_L = findViewById(R.id.SURVEYING_L);

        SURVEYING_L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl8("https://aecaditya.blogspot.com/p/r20-agriculture-2-1-semester-materials.html");

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