package com.umaniapps.adityaautonomouspdfmaterials;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class RoadMaps extends AppCompatActivity
{
    BottomNavigationView bottomNavigationView;



    private ImageSlider imageSlider;
    Toolbar toolbar2;
    CardView frontend;
    CardView workshop,math,chemistry,english,physics,QP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_road_maps);




        toolbar2 = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar2.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnBackPress();
            }
        });




        frontend = findViewById(R.id.frontend);

        frontend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });

        imageSlider = findViewById(R.id.slider);

        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.rp1, ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://i.picsum.photos/id/445/4256/2819.jpg?hmac=99qT1IPidZrzaXTgG1ixRRVwElWXUlNepU2k692G44c", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://i.picsum.photos/id/20/3670/2462.jpg?hmac=CmQ0ln-k5ZqkdtLvVO23LjVAEabZQx2wOaT4pyeG10I", ScaleTypes.FIT));



        imageSlider.setImageList(slideModels,ScaleTypes.FIT);






    }
    private void openActivity1() {
        Intent intent= new Intent(this, FrontEndDev.class);
        startActivity(intent);
    }
    private  void OnBackPress(){
        Intent intent= new Intent(this, Home.class);
        startActivity(intent);

    }
}