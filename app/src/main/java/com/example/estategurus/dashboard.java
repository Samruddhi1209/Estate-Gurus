package com.example.estategurus;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.estategurus.HelperClasses.HomeAdapter.FeaturedAdapter;
import com.example.estategurus.HelperClasses.HomeAdapter.FeaturedHelperClass;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class dashboard extends AppCompatActivity {

    RecyclerView featuredRecycler;
    RecyclerView.Adapter adapter;
    private ImageView imageView26,imageView27,imageView28,imageView29;
    private ImageButton imageButton,imageButton2;
    Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        imageButton =  findViewById(R.id.imageButton);
        imageButton2 = findViewById( R.id.imageButton2 );
        imageView26 = findViewById(R.id.imageView26);
        imageView27 = findViewById(R.id.imageView27);
        imageView28 = findViewById(R.id.imageView28);
        imageView29 = findViewById(R.id.imageView29);
        button2 = findViewById(R.id.button2);


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(dashboard.this,sell_page.class);
                startActivity(intentLoadNewActivity);
            }
        });
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActvity = new Intent( dashboard.this,rent_image.class);
                startActivity(intentLoadNewActvity);
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActvity = new Intent( dashboard.this,buy_page.class);
                startActivity(intentLoadNewActvity);
            }
        });




        //hooks
        featuredRecycler = findViewById(R.id.featured_recycler);
        featuredRecycler();
    }
    private void featuredRecycler() {

        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(this
                , LinearLayoutManager.HORIZONTAL, false));

        ArrayList<FeaturedHelperClass> featuredLocations = new ArrayList<>();
        featuredLocations.add(new FeaturedHelperClass(R.drawable.runwal, "Runwal Bliss", "Kanjurmarg(E),Mumbai\n" +
                "₹ 1.15Cr - ₹ 3.29Cr\n" +
                "1,2,3 BHK Apartment"));

        featuredLocations.add(new FeaturedHelperClass(R.drawable.dosti2, "Dosti West County", "Balkum,Mumbai Thane\n" +
                "₹ 65 L - ₹ 1.43 Cr\n" +
                "1,2,3 BHK Apartment"));

        featuredLocations.add(new FeaturedHelperClass(R.drawable.apex, "Apex D Rio ", "Ahinsa Khand 2,Ghaziabad\n" +
                "₹ 1.71 Cr - ₹ 2.41 Cr\n" +
                "3,4 BHK Apartment"));

        featuredLocations.add(new FeaturedHelperClass(R.drawable.piramal, "Piramal Vaikunth", "Balkum,Mumbai Thane\n" +
                " ₹ 1.25 Cr - ₹ 1.9 Cr\n" +
                " 2,3,4 BHK Apartment"));


        featuredLocations.add(new FeaturedHelperClass(R.drawable.lodha3, "Lodha Codename Crown Jewel", "Kolshet Road,Mumbai Thane\n" +
                " ₹ 50 L - ₹ 1.7 Cr\n" +
                " 1,2,3 BHK Apartment"));

        featuredLocations.add(new FeaturedHelperClass(R.drawable.tata, "Tata La Vida", "Sector-113,Gurgaon\n" +
                "₹ 1.5 Cr - ₹ 1.55 Cr\n" +
                "2,3 BHK Apartment"));

        featuredLocations.add(new FeaturedHelperClass(R.drawable.panchshil, "Panchshil Towers", "Kharadi,Pune\n" +
                "₹ 3.68 Cr - ₹ 5.01 Cr \n" +
                "3,4 BHK Apartment"));


        adapter = new FeaturedAdapter(featuredLocations);
        featuredRecycler.setAdapter(adapter);



        imageView26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActvity = new Intent(com.example.estategurus.dashboard.this,regency_sarvam.class);
                startActivity(intentLoadNewActvity);
            }
        });

        imageView27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActvity = new Intent(com.example.estategurus.dashboard.this,avant.class);
                startActivity(intentLoadNewActvity);
            }
        });

        imageView28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActvity = new Intent(com.example.estategurus.dashboard.this,acme.class);
                startActivity(intentLoadNewActvity);
            }
        });


        imageView29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActvity = new Intent(com.example.estategurus.dashboard.this,sunteck.class);
                startActivity(intentLoadNewActvity);
            }
        });

    }

}