package com.example.robotizm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.robotizm.testler.ProfilActivity;
import com.google.firebase.auth.FirebaseAuth;

public class AnaSayfaActivity extends AppCompatActivity {

    Button oyunButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_sayfa);


    }
    public void robotbeymer(View view){

        Toast.makeText(getApplicationContext(),"Sevgili Dostum, Sana Yardım Edebilmem İçin Lütfen Soru İşaretine Tıkla",
                4000).show();
    }
    public void soruisareti(View view){

        Intent intent = new Intent(AnaSayfaActivity.this,SoruIsaretiActivity.class);
        startActivity(intent);
    }
    public void minitestler(View view){

        Intent intent = new Intent(AnaSayfaActivity.this,MiniTestActivity.class);
        startActivity(intent);
    }
    public void profilButton(View view){

        Intent intent = new Intent(AnaSayfaActivity.this, ProfilActivity.class);
        startActivity(intent);
    }
    public void signOut(View view){
        FirebaseAuth.getInstance().signOut();
        finish();
        startActivity(new Intent(this,Main2Activity.class));

    }
    public void makale(View view){
        Intent intent=new Intent(AnaSayfaActivity.this,makaleActivity.class);
        startActivity(intent);

    }
    public void videolar(View view){
        Intent intent=new Intent(AnaSayfaActivity.this,videolarActivity.class);
        startActivity(intent);

    }
    public void odevler(View view){
        Intent intent=new Intent(AnaSayfaActivity.this,Odevler_Activity.class);
        startActivity(intent);

    }

}
