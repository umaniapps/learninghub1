package com.umaniapps.adityaautonomouspdfmaterials;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class R20QUESTION_PAPERS extends AppCompatActivity {

    Toolbar toolbar2;
    private ImageSlider imageSlider;

    CardView QAIML,QCSE,QECE,QIT,QEEE,QMECH,QCIVIL,QAGRI,QMINING,QPETROLEUM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r20_question_papers);


        toolbar2 = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        toolbar2.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnBackPress();
            }
        });









        imageSlider = findViewById(R.id.slider);

        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.questionmark, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.questionmark, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.rp1, ScaleTypes.FIT));


        imageSlider.setImageList(slideModels, ScaleTypes.FIT);


        QAIML = findViewById(R.id.QAIML);

        QAIML.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://aecaditya.blogspot.com/p/blog-page_50.html");
            }
        });

        QCSE = findViewById(R.id.QCSE);

        QCSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl1("https://aecaditya.blogspot.com/p/blog-page_85.html");
            }
        });
        QECE = findViewById(R.id.QECE);

        QECE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl2("https://aecaditya.blogspot.com/p/blog-page_11.html");
            }
        });
        QIT = findViewById(R.id.QIT);

        QIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl3("https://aecaditya.blogspot.com/p/blog-page_33.html");
            }
        });
        QEEE = findViewById(R.id.QEEE);

        QEEE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl4("https://aecaditya.blogspot.com/p/blog-page_97.html");
            }
        });
        QMECH = findViewById(R.id.QMECH);

        QMECH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl5("https://aecaditya.blogspot.com/p/blog-page_40.html");
            }
        });
        QCIVIL = findViewById(R.id.QCIVIL);

        QCIVIL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl6("https://aecaditya.blogspot.com/p/blog-page_22.html");
            }
        });
        QAGRI = findViewById(R.id.QAGRI);

        QAGRI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl7("https://aecaditya.blogspot.com/p/blog-page_81.html");
            }
        });
        QMINING = findViewById(R.id.QMINING);

        QMINING.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl8("https://aecaditya.blogspot.com/p/blog-page_28.html");
            }
        });
        QPETROLEUM = findViewById(R.id.QPETROLEUM);

        QPETROLEUM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl9("https://aecaditya.blogspot.com/p/blog-page_26.html");
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
    private void OnBackPress() {
        Intent intent = new Intent(this, R20_PDF_MATERIALS.class);
        startActivity(intent);
    }

}