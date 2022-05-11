package com.umaniapps.adityaautonomouspdfmaterials;

import androidx.appcompat.app.AppCompatActivity;

public class ItemsModel4 extends AppCompatActivity {
    private String name;

    private  int image;

    public ItemsModel4(String name, int image){
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