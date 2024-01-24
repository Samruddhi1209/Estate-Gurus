package com.example.estategurus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class rent_image extends AppCompatActivity  implements AdapterView.OnItemSelectedListener {
    ImageView VIEWMORE,VIEWMORE1,VIEWMORE2,VIEWMORE3,VIEWMORE4,VIEWMORE5,VIEWMORE6,VIEWMORE7,VIEWMORE8,VIEWMORE9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent_image);
        Spinner spinner  = findViewById(R.id.spinner);
        Spinner spinner2  = findViewById(R.id.spinner2);
        Spinner spinner3  = findViewById(R.id.spinner3);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.BHKS, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.TYPE, android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.PRICE, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner2.setAdapter(adapter1);
        spinner3.setAdapter(adapter2);
        spinner.setOnItemSelectedListener(this);
        spinner2.setOnItemSelectedListener(this);
        spinner3.setOnItemSelectedListener(this);

        VIEWMORE = (ImageView) findViewById(R.id.VIEWMORE);
        VIEWMORE1 = (ImageView) findViewById(R.id.VIEWMORE1);
        VIEWMORE2 = (ImageView) findViewById(R.id.VIEWMORE2);
        VIEWMORE3 = (ImageView) findViewById(R.id.VIEWMORE3);
        VIEWMORE4 = (ImageView) findViewById(R.id.VIEWMORE4);
        VIEWMORE5 = (ImageView) findViewById(R.id.VIEWMORE5);
        VIEWMORE6 = (ImageView) findViewById(R.id.VIEWMORE6);
        VIEWMORE7 = (ImageView) findViewById(R.id.VIEWMORE7);
        VIEWMORE8 = (ImageView) findViewById(R.id.VIEWMORE8);
        VIEWMORE9 = (ImageView) findViewById(R.id.VIEWMORE9);

        VIEWMORE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActvity = new Intent(com.example.estategurus.rent_image.this,swati.class);
                startActivity(intentLoadNewActvity);
            }
        });
        VIEWMORE1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActvity = new Intent(com.example.estategurus.rent_image.this,SMacumen.class);
                startActivity(intentLoadNewActvity);
            }
        });

        VIEWMORE2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActvity = new Intent(com.example.estategurus.rent_image.this,archanasoc.class);
                startActivity(intentLoadNewActvity);
            }
        });

        VIEWMORE3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActvity = new Intent(com.example.estategurus.rent_image.this,bewise.class);
                startActivity(intentLoadNewActvity);
            }
        });

        VIEWMORE4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActvity = new Intent(com.example.estategurus.rent_image.this,rajeshsoc.class);
                startActivity(intentLoadNewActvity);
            }
        });

        VIEWMORE5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActvity = new Intent(com.example.estategurus.rent_image.this,vedant.class);
                startActivity(intentLoadNewActvity);
            }
        });

        VIEWMORE6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActvity = new Intent(com.example.estategurus.rent_image.this,rajsoc.class);
                startActivity(intentLoadNewActvity);
            }
        });
        VIEWMORE7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActvity = new Intent(com.example.estategurus.rent_image.this,amara.class);
                startActivity(intentLoadNewActvity);
            }
        });

        VIEWMORE8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActvity = new Intent(com.example.estategurus.rent_image.this,hiranandani_details.class);
                startActivity(intentLoadNewActvity);
            }
        });

        VIEWMORE9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActvity = new Intent(com.example.estategurus.rent_image.this,naharamriti.class);
                startActivity(intentLoadNewActvity);
            }
        });
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(),text,Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}