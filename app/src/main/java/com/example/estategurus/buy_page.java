package com.example.estategurus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class buy_page extends AppCompatActivity {
    ImageView imageView2,imageView3,imageView4,imageView7,imageView8,imageView9,imageView10,imageView11,imageView12,imageView13,imageView16,imageView19,imageView22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_page);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView7 = (ImageView) findViewById(R.id.imageView7);
        imageView8 = (ImageView) findViewById(R.id.imageView8);
        imageView9 = (ImageView) findViewById(R.id.imageView9);
        imageView10 = (ImageView)findViewById(R.id.imageView10);
        imageView13 = (ImageView)findViewById(R.id.imageView13);
        imageView16 = (ImageView)findViewById(R.id.imageView16);
        imageView19 = (ImageView)findViewById(R.id.imageView19);
        imageView22 = (ImageView)findViewById(R.id.imageView22);

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActvity = new Intent(com.example.estategurus.buy_page.this,lodha_details.class);
                startActivity(intentLoadNewActvity);
            }
        });
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActvity = new Intent(com.example.estategurus.buy_page.this,hiranandani_details.class);
                startActivity(intentLoadNewActvity);
            }
        });
        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActvity = new Intent(com.example.estategurus.buy_page.this,dosti_details.class);
                startActivity(intentLoadNewActvity);
            }
        });
        imageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActvity = new Intent(com.example.estategurus.buy_page.this,k_raheja_details.class);
                startActivity(intentLoadNewActvity);
            }
        });
        imageView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActvity = new Intent(com.example.estategurus.buy_page.this,indiabulls.class);
                startActivity(intentLoadNewActvity);
            }
        });
        imageView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActvity = new Intent(com.example.estategurus.buy_page.this,sobha.class);
                startActivity(intentLoadNewActvity);
            }
        });
        imageView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActvity = new Intent(com.example.estategurus.buy_page.this,runwal_group_details.class);
                startActivity(intentLoadNewActvity);
            }
        });

    }
}