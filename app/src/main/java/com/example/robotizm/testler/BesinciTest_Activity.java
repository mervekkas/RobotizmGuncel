package com.example.robotizm.testler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.robotizm.R;

import org.w3c.dom.Text;

public class BesinciTest_Activity extends AppCompatActivity {

    TextView soru51Text, dogru51Text, yanlis51Text;
    TextView soru52Text, dogru52Text, yanlis52Text;
    TextView soru53Text, dogru53Text, yanlis53Text;
    TextView soru54Text, dogru54Text, yanlis54Text;
    TextView soru55Text, dogru55Text, yanlis55Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_besinci_test_);

        soru51Text = findViewById(R.id.soru51Text);
        soru51Text.setText("1-)Aşağıdakilerden hangisi bir donanım birimi değildir?");

        dogru51Text = findViewById(R.id.dogru51Text);
        yanlis51Text = findViewById(R.id.yanlis51Text);

        soru52Text = findViewById(R.id.soru52Text);
        soru52Text.setText("2-)Aşağıdakilerden hangisi bir donanım birimi değildir?");

        dogru52Text = findViewById(R.id.dogru52Text);
        yanlis52Text = findViewById(R.id.yanlis52Text);

        soru53Text = findViewById(R.id.soru53Text);
        soru53Text.setText("3-)Kasa içerisinde en çok yer kaplayan donanım olan ve üzerine diğer kartların takıldığı donanım birimi hangisidir?");

        dogru53Text = findViewById(R.id.dogru53Text);
        yanlis53Text = findViewById(R.id.yanlis53Text);

        soru54Text = findViewById(R.id.soru54Text);
        soru54Text.setText("4-)Bilgisayarlarda bulunan, resimleri, yazıları ve grafikleri kağıda aktarmaya yarayan donanım birimi nedir?");

        dogru54Text = findViewById(R.id.dogru54Text);
        yanlis54Text = findViewById(R.id.yanlis54Text);

        soru55Text = findViewById(R.id.soru55Text);
        soru55Text.setText("5-)Bilgisayarların internete bağlanmasını sağlayan donanım birimi hangisidir?");

        dogru55Text = findViewById(R.id.dogru55Text);
        yanlis55Text = findViewById(R.id.yanlis55Text);


    }
    public void soru51dogru(View view){

        dogru51Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis51Text.setText("");
    }
    public void soru51yanlis(View view){

        yanlis51Text.setText("Yanlış Cevap :(");
        dogru51Text.setText("");
    }
    public void soru52dogru(View view){

        dogru52Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis52Text.setText("");
    }
    public void soru52yanlis(View view){

        yanlis52Text.setText("Yanlış Cevap :(");
        dogru52Text.setText("");
    }
    public void soru53dogru(View view){

        dogru53Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis53Text.setText("");
    }
    public void soru53yanlis(View view){

        yanlis53Text.setText("Yanlış Cevap :(");
        dogru53Text.setText("");
    }
    public void soru54dogru(View view){

        dogru54Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis54Text.setText("");
    }
    public void soru54yanlis(View view){

        yanlis54Text.setText("Yanlış Cevap :(");
        dogru54Text.setText("");
    }
    public void soru55dogru(View view){

        dogru55Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis55Text.setText("");
    }
    public void soru55yanlis(View view){

        yanlis55Text.setText("Yanlış Cevap :(");
        dogru55Text.setText("");
    }
}
