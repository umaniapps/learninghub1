package com.umaniapps.adityaautonomouspdfmaterials;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class About extends AppCompatActivity {

    int images[] = {R.drawable.harry, R.drawable.harry, R.drawable.harry, R.drawable.harry,
            R.drawable.harry, R.drawable.harry,R.drawable.harry, R.drawable.harry};
    String fruitlist[] = {"Harry", "Harry", "Harry", "Harry", "Harry", "Harry",
            "Harry", "Harry"};
    String fruitlist2[] = {"Programmer", "Programmer", "Programmer", "Programmer", "Programmer", "Programmer",
            "Programmer", "Programmer"};

    ListView listView;
    CustomBaseAdapter customBaseAdapter;

    Toolbar toolbar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        toolbar2 = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Contributors");

        toolbar2.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnBackPress();
            }
        });

        listView=findViewById(R.id.customListView);
        CustomBaseAdapter customBaseAdapter=new CustomBaseAdapter(getApplicationContext(),fruitlist,fruitlist2,images);
        listView.setAdapter(customBaseAdapter);

    }
    private  void OnBackPress(){
        Intent intent= new Intent(this, Home.class);
        startActivity(intent);

    }
}