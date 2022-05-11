package com.umaniapps.adityaautonomouspdfmaterials;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class R20_MATERIALS extends AppCompatActivity {

    CardView r20_ai_ml_materials,r20_cse_materials,r20_it_materials,r20_ece_materials,
    r20_eee_materials,r20_mech_materials,r20_civil_materials,r20_mining_materials,r20_agri_materials,
            r20_petroleum_materials;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r20_materials);



        r20_ai_ml_materials = findViewById(R.id.r20_ai_ml_materials);

        r20_ai_ml_materials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();

            }


        });

        r20_cse_materials = findViewById(R.id.r20_cse_materials);

        r20_cse_materials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();

            }


        });

        r20_it_materials = findViewById(R.id.r20_it_materials);

        r20_it_materials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();

            }


        });

        r20_ece_materials = findViewById(R.id.r20_ece_materials);

        r20_ece_materials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();

            }


        });

        r20_eee_materials = findViewById(R.id.r20_eee_materials);

        r20_eee_materials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();

            }


        });

        r20_mech_materials = findViewById(R.id.r20_mech_materials);

        r20_mech_materials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity6();

            }


        });

        r20_civil_materials = findViewById(R.id.r20_civil_materials);

        r20_civil_materials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity7();

            }


        });

        r20_agri_materials = findViewById(R.id.r20_agri_materials);

        r20_agri_materials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity8();

            }


        });

        r20_mining_materials = findViewById(R.id.r20_mining_materials);

        r20_mining_materials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity9();

            }


        });

        r20_petroleum_materials = findViewById(R.id.r20_petroleum_materials);

        r20_petroleum_materials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity10();

            }


        });

    }
    private void openActivity1() {
        Intent intent= new Intent(this, R20_AIML_MATERIALS.class);
        startActivity(intent);
}
    private void openActivity2() {
        Intent intent= new Intent(this, R20_CSE_MATERIALS.class);
        startActivity(intent);
    }

    private void openActivity3() {
        Intent intent= new Intent(this, R20_IT_MATERIALS.class);
        startActivity(intent);
    }

    private void openActivity4() {
        Intent intent= new Intent(this, R20_ECE_MATERIALS.class);
        startActivity(intent);
    }

    private void openActivity5() {
        Intent intent= new Intent(this, R20_EEE_MATERIALS.class);
        startActivity(intent);
    }

    private void openActivity6() {
        Intent intent= new Intent(this, R20_MECH_MATERIALS.class);
        startActivity(intent);
    }

    private void openActivity7() {
        Intent intent= new Intent(this, R20_CIVIL_MATERIALS.class);
        startActivity(intent);
    }

    private void openActivity8() {
        Intent intent= new Intent(this, R20_AGRICULURE_MATERIALS.class);
        startActivity(intent);
    }

    private void openActivity9() {
        Intent intent= new Intent(this, R20_MINING_MATERIALS.class);
        startActivity(intent);
    }

    private void openActivity10() {
        Intent intent= new Intent(this, R20_PETROLEUM_MATERIALS.class);
        startActivity(intent);
    }
}