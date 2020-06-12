package com.example.robotizm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseUser;

public class uyeOlButtonActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editTextEmail, editTextPassword;
    private FirebaseAuth mAuth;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uye_ol_button);

        editTextEmail=(EditText)findViewById(R.id.editTextEmail);
        editTextPassword=(EditText)findViewById(R.id.editTextPassword);
        mAuth = FirebaseAuth.getInstance();

        findViewById(R.id.ÜyeOlButton).setOnClickListener(this);
        findViewById(R.id.girisButton).setOnClickListener(this);

        progressBar=findViewById(R.id.progressbar_login_progress);
    }

    private void registerUser() {
        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

        if (email.isEmpty()) {
            editTextEmail.setError("E-maili giriniz!");
            editTextEmail.requestFocus();

            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {

            editTextEmail.setError("Lütfen geçerli bir e-mail giriniz!");
            editTextEmail.requestFocus();

            return;

        }

        if (password.isEmpty()) {
            editTextPassword.setError("Bir şifre giriniz!");
            editTextPassword.requestFocus();
            return;
        }

        if (password.length() < 6) {
            editTextPassword.setError("Şifre minimum 6 rakam olmalı!");
            editTextEmail.requestFocus();
            return;
        }

        progressBar.setVisibility(View.VISIBLE);

        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                progressBar.setVisibility(View.GONE);
                if (task.isSuccessful()) {

                    Toast.makeText(getApplicationContext(),"Üyelik başarıyla gerçekleştirildi.", Toast.LENGTH_LONG).show();
                    finish();
                    Intent intent=new Intent(uyeOlButtonActivity.this,AnaSayfaActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                }
                else {
                    if(task.getException() instanceof FirebaseAuthUserCollisionException){
                        Toast.makeText(getApplicationContext(),"Zaten kayıtlısınız, giriş yapmayı deneyin.", Toast.LENGTH_LONG).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(),task.getException().getMessage(),Toast.LENGTH_LONG).show();
                    }
                }
            }

        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ÜyeOlButton:
                registerUser();

                break;

            case R.id.girisButton:
                finish();
                startActivity(new Intent(this, Main2Activity.class));
                break;



        }
    }
}