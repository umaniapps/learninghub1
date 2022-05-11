package com.umaniapps.adityaautonomouspdfmaterials;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class R20_AIML_MATERIALS extends AppCompatActivity {

    CardView R20_AIML_1_1,R20_AIML_1_2,R20_AIML_2_1,R20_AIML_2_2,R20_AIML_3_1,R20_AIML_3_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r20_aiml_materials);


        R20_AIML_1_1 = findViewById(R.id.R20_AIML_1_1);

        R20_AIML_1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();

            }


        });

        R20_AIML_1_2 = findViewById(R.id.R20_AIML_1_2);

        R20_AIML_1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();

            }


        });

        R20_AIML_2_1 = findViewById(R.id.R20_AIML_2_1);

        R20_AIML_2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();

            }


        });

        R20_AIML_2_2 = findViewById(R.id.R20_AIML_2_2);

        R20_AIML_2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();

            }


        });
    }
    private void openActivity1() {
        Intent intent= new Intent(this, R20_AIML_1_1_MATERIALS.class);
        startActivity(intent);
    }

    private void openActivity2() {
        Intent intent= new Intent(this, R20_AIML_1_2_MATERIALS.class);
        startActivity(intent);
    }

    private void openActivity3() {
        Intent intent= new Intent(this, R20_AIML_2_1_MATERIALS.class);
        startActivity(intent);
    }

    private void openActivity4() {
        Intent intent= new Intent(this, R20_AIML_2_2_MATERIALS.class);
        startActivity(intent);
    }
}