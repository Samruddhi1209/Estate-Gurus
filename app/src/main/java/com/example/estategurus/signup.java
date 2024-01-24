package com.example.estategurus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class signup extends AppCompatActivity {
    EditText email, fullname, number, password;
    Button b;
    AwesomeValidation awesomeValidation;
    FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        email = findViewById(R.id.email);
        fullname = findViewById(R.id.fullname);
        number = findViewById(R.id.phone);
        password = findViewById(R.id.password);
        b = findViewById(R.id.button);
        mAuth = FirebaseAuth.getInstance();
        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);
        awesomeValidation.addValidation(this, R.id.fullname, RegexTemplate.NOT_EMPTY, R.string.invalid_name);
        awesomeValidation.addValidation(this, R.id.phone, "[5-9]{1}[0-9]{9}$", R.string.invalid_phone);
        awesomeValidation.addValidation(this, R.id.email, Patterns.EMAIL_ADDRESS, R.string.invalid_email);
        awesomeValidation.addValidation(this, R.id.password, ".{6,}", R.string.invalid_password);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (awesomeValidation.validate()) {
                    Toast.makeText(getApplicationContext(), "Form Validate Successfulyy....", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Form Validate Failed....", Toast.LENGTH_LONG).show();
                }
            }
        });
        b.setOnClickListener(view -> {
            createUser();
        });
    }
    private void createUser() {
        String email_id = email.getText().toString();
        String pass = password.getText().toString();
        if (TextUtils.isEmpty(email_id)){
            email.setError("E-Mail Cannot Be Empty");
            email.requestFocus();
        }else if(TextUtils.isEmpty(pass)){
            password.setError("Password cannot be empty");
            password.requestFocus();
        }else {
            mAuth.createUserWithEmailAndPassword(email_id,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(signup.this, "User Registered Successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(signup.this, login.class));
                    }else{
                        Toast.makeText(signup.this, "Registeration Error"+ task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }


    }
}