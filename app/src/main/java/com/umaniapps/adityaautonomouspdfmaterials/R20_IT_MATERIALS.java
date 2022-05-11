package com.umaniapps.adityaautonomouspdfmaterials;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class R20_IT_MATERIALS extends AppCompatActivity {

    CardView r20_it_1_1_sem,r20_it_1_2_sem,r20_it_2_1_sem,r20_it_2_2_sem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r20_it_materials);



        r20_it_1_1_sem = findViewById(R.id.r20_it_1_1_sem);

        r20_it_1_1_sem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();

            }


        });

        r20_it_1_2_sem = findViewById(R.id.r20_it_1_2_sem);

        r20_it_1_2_sem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();

            }


        });

        r20_it_2_1_sem = findViewById(R.id.r20_it_2_1_sem);

        r20_it_2_1_sem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();

            }


        });

        r20_it_2_2_sem = findViewById(R.id.r20_it_2_2_sem);

        r20_it_2_2_sem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();

            }


        });
    }

    private void openActivity1() {
        Intent intent= new Intent(this, R20_IT_1_1_MATERIALS.class);
        startActivity(intent);
    }

    private void openActivity2() {
        Intent intent= new Intent(this, R20_IT_1_2_MATERIALS.class);
        startActivity(intent);
    }

    private void openActivity3() {
        Intent intent= new Intent(this, R20_IT_2_1_MATERIALS.class);
        startActivity(intent);
    }

    private void openActivity4() {
        Intent intent= new Intent(this, R20_IT_2_2_MATERIALS.class);
        startActivity(intent);
    }
}