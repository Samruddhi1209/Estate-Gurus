
package com.example.estategurus;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {
    Button b, b1;
    EditText email, password;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        b = findViewById(R.id.register);
        b1 = findViewById(R.id.login);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        mAuth = FirebaseAuth.getInstance();
        b1.setOnClickListener(view -> {
            loginUser();
        });


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this,signup.class);
                startActivity(intent);
            }
        });

    }

    private void loginUser() {
        String email_id = email.getText().toString();
        String pass = password.getText().toString();
        if (TextUtils.isEmpty(email_id)) {
            email.setError("E-Mail Cannot Be Empty");
            email.requestFocus();
        } else if (TextUtils.isEmpty(pass)) {
            password.setError("Password cannot be empty");
            password.requestFocus();
        }else {
            mAuth.signInWithEmailAndPassword(email_id,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(login.this, "User Logged in Successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(login.this, dashboard.class));
                    }else{
                        Toast.makeText(login.this, "Login Error"+ task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}