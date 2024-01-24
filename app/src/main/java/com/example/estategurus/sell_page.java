package com.example.estategurus;


import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class sell_page extends AppCompatActivity {
    private EditText name,address,buildarea,carpetarea,bathroom,bedroom,parking,playarea;
    ImageView uploadimage;
    Button uploadbutton,submitbutton;
    Intent intent;


        private static final int IMAGE_PICK_CODE=1000;
        private static final int PERMISSION_CODE=1001;
        public static final int RequestPermissionCode = 1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_page);
        name = (EditText)findViewById(R.id.name);
        address = (EditText)findViewById(R.id.address);
        buildarea = (EditText)findViewById(R.id.build_area);
        carpetarea = (EditText)findViewById(R.id.carpet_area);

        playarea = (EditText) findViewById(R.id.playarea);

        parking = (EditText) findViewById(R.id.parking);

        bedroom = (EditText) findViewById(R.id.bedroom);
        bathroom=(EditText) findViewById(R.id.bathroom);

        uploadimage=(ImageView)findViewById(R.id.uploadimage);
        uploadbutton=(Button)findViewById(R.id.uploadbutton);
        submitbutton = (Button) findViewById(R.id.submitbutton);
        EnableRuntimePermission();

        uploadbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 7);
            }
        });
        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActvity = new Intent(sell_page.this,aadhar_upload.class);
                startActivity(intentLoadNewActvity);
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 7 && resultCode == RESULT_OK) {
            Bitmap bitmap = (Bitmap) data.getExtras().get("data");
            uploadimage.setImageBitmap(bitmap);
        }
    }
    public void EnableRuntimePermission(){
        if (ActivityCompat.shouldShowRequestPermissionRationale(sell_page.this,
                Manifest.permission.CAMERA))
        {
            Toast.makeText(sell_page.this,"CAMERA permission allows us to Access CAMERA app",
                    Toast.LENGTH_LONG).show();
        } else {
            ActivityCompat.requestPermissions(sell_page.this,new String[]{
                    Manifest.permission.CAMERA}, RequestPermissionCode);
        }
    }
    @Override
    public void onRequestPermissionsResult(int RC, String per[], int[] PResult) {
        super.onRequestPermissionsResult(RC, per, PResult);
        switch (RC) {
            case RequestPermissionCode:
                if (PResult.length > 0 && PResult[0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(sell_page.this, "Permission Granted...", Toast.LENGTH_LONG).show();
                }
                break;
        }
    }
}