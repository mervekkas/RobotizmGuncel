package com.example.robotizm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SoruIsaretiActivity extends AppCompatActivity {

    TextView kullanimText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soru_isartei);

        kullanimText = findViewById(R.id.kullanimText);

        kullanimText.setText("Öncelikle hoşgeldiniz, içinde bulunduğunuz uygulama çocukları " +
                "robotik kodlama eğitimine yönlendirmek ve bu sistemi onlara sevdirmektir. " +
                "Uygulamamız kodlama öğrenmek isteyen her yaştaki çocuğa uygundur. " +
                "Çocukların kodlama eğitimine destek vermek ve yardımcı olmak amaçlı yapılmıştır. " +
                "Ana sayfada belirtilen seçeneklerden istediğinize tıklayarak test, video, " +
                "ödev gibi etkinliklere ulaşabilirsiniz. İyi Kodlamalar Çocuklar!");

    }
}
