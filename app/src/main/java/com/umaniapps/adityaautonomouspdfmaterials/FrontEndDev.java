package com.umaniapps.adityaautonomouspdfmaterials;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

public class FrontEndDev extends AppCompatActivity
{
    Toolbar toolbar2;
    ListView pdfListView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_end_dev);

        toolbar2 = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        toolbar2.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnBackPress();
            }
        });


        pdfListView = (ListView) findViewById(R.id.pdfListView);

        String[] pdfFiles = {"FrontEnd"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,pdfFiles){
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {



                View view = super.getView(position, convertView, parent);

                TextView myText = (TextView) view.findViewById(android.R.id.text1);



                return  view;
            }
        };

        pdfListView.setAdapter(adapter);

        pdfListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {

                String item = pdfListView.getItemAtPosition(i).toString();

                Intent start = new Intent(getApplicationContext(), PDFOpener.class);
                start.putExtra("pdfFileName",item);
                startActivity(start);
            }
        });







    }
    private  void OnBackPress(){
        Intent intent= new Intent(this, RoadMaps.class);
        startActivity(intent);

    }
}