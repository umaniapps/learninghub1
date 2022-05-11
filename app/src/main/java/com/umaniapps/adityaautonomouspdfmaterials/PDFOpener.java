package com.umaniapps.adityaautonomouspdfmaterials;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

public class PDFOpener extends AppCompatActivity {
    Toolbar toolbar2;

    Integer savedPage;
    Integer pageNumber;
    Integer PageNumber;
    PDFView myPDFViewer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfopener);

        toolbar2 = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        toolbar2.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnBackPress();
            }
        });


        SharedPreferences mySharedPreferences = getPreferences(Context.MODE_PRIVATE);

        savedPage = mySharedPreferences.getInt("retrievedPage",0);

        pageNumber = savedPage;

        myPDFViewer =(PDFView) findViewById(R.id.PDFView);

        String getitem = getIntent().getStringExtra("pdfFileName");

        if(getitem.equals("FrontEnd")){

            myPDFViewer.fromAsset("FullStackDeveloper.pdf")
                    .scrollHandle(new DefaultScrollHandle(this))
                    .load();

        }

    }
    private  void OnBackPress(){
        Intent intent= new Intent(this, FrontEndDev.class);
        startActivity(intent);

    }
}