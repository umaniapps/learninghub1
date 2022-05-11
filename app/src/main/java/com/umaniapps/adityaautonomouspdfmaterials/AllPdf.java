package com.umaniapps.adityaautonomouspdfmaterials;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class AllPdf extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    private ImageSlider imageSlider;
    Toolbar toolbar2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_pdf);

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

        slideModels.add(new SlideModel(R.drawable.rp1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.rp1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.rp1, ScaleTypes.FIT));


        imageSlider.setImageList(slideModels,ScaleTypes.FIT);






    }
    private  void OnBackPress(){
        Intent intent= new Intent(this, Home.class);
        startActivity(intent);

    }
}