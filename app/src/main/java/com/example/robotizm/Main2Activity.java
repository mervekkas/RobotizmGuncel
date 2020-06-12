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

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{


    FirebaseAuth mAuth;
    EditText editTextEmail,editTextPassword;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editTextEmail=(EditText)findViewById(R.id.editTextEmail);
        editTextPassword=(EditText)findViewById(R.id.editTextPassword);
        progressBar=findViewById(R.id.progressbar_login_progress);

        mAuth=FirebaseAuth.getInstance();


        findViewById(R.id.üyeOlbutton).setOnClickListener(this);
        findViewById(R.id.loginButton).setOnClickListener(this);


    }


    private void userLogin(){



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


        mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                progressBar.setVisibility(View.GONE);
                if(task.isSuccessful()){

                    Intent intent=new Intent(Main2Activity.this,AnaSayfaActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }
                else{
                    Toast.makeText(getApplicationContext(),"Hatalı e-mail adresi yada parola.Lütfen tekrar deneyiniz!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    @Override
    public void onClick(View view){
        switch (view.getId()){

            case R.id.üyeOlbutton:


                startActivity(new Intent(Main2Activity.this,uyeOlButtonActivity.class));
                break;

            case R.id.loginButton:
                userLogin();
        }


    }


}
