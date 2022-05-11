package com.umaniapps.adityaautonomouspdfmaterials;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ItemsModel2 extends AppCompatActivity {
    private String name;

    private  int image;

    public ItemsModel2(String name,int image){
        this.name = name;

        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}