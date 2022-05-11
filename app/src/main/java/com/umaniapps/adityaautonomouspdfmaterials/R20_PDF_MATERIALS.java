package com.umaniapps.adityaautonomouspdfmaterials;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


import com.etebarian.meowbottomnavigation.MeowBottomNavigation;




public class R20_PDF_MATERIALS extends AppCompatActivity {

    Toolbar toolbar2;


    CardView SYLLABUS,R20_MATERIALS,MANI,KUMAR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r20_pdf_materials);

        toolbar2 = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        toolbar2.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnBackPress();
            }
        });

        SYLLABUS = findViewById(R.id.SYLLABUS);
        SYLLABUS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();

            }
        });
        R20_MATERIALS = findViewById(R.id.R20_MATERIALS);
        R20_MATERIALS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        MANI = findViewById(R.id.questions);
        MANI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open1();
            }
        });



    }
    private void openActivity1() {
        Intent intent= new Intent(this, R20_SYLLABUS.class);
        startActivity(intent);
    }
    private void openActivity2() {
        Intent intent= new Intent(this, R20_MATERIALS.class);
        startActivity(intent);
    }

    private  void open1(){
        Intent intent= new Intent(this, R20QUESTION_PAPERS.class);
        startActivity(intent);

    }
    private  void OnBackPress(){
        Intent intent= new Intent(this, Home.class);
        startActivity(intent);

    }



}