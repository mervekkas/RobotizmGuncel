package com.example.robotizm.testler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.robotizm.R;

public class DorduncuTest_Acitivity extends AppCompatActivity {


    TextView soru41Text, dogru41Text, yanlis41Text;
    TextView soru42Text, dogru42Text, yanlis42Text;
    TextView soru43Text, dogru43Text, yanlis43Text;
    TextView soru44Text, dogru44Text, yanlis44Text;
    TextView soru45Text, dogru45Text, yanlis45Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dorduncu_test__acitivity);


        soru41Text = findViewById(R.id.soru41Text);
        soru41Text.setText("1-)Akış diyagramlarında akışı başlatan ve bitiren şekil hangisidir? ");

        dogru41Text = findViewById(R.id.dogru41Text);
        yanlis41Text = findViewById(R.id.yanlis41Text);

        soru42Text = findViewById(R.id.soru42Text);
        soru42Text.setText("2-)Kullanıcının girdiği bir değeri 2 ile çarpan ve sonucu ekranda gösteren bir algoritma oluşturmak için aşağıdaki" +
                "algoritmanın hangi 2 adımının yerini değiştirmek gerekir?\n"+
                "1-Başla\n"+
                "2-Girilen sayıyı ikiyle çarp\n" +
                "3-Kullanıcından bir sayı iste\n" +
                "4-Sonucu ekranda göster\n" +
                "Bitir");

        dogru42Text = findViewById(R.id.dogru42Text);
        yanlis42Text = findViewById(R.id.yanlis42Text);

        soru43Text = findViewById(R.id.soru43Text);
        soru43Text.setText("3-)Aşadıda akış şemaları ile ilgili verilen bilgilerden hangisi yanlıştır?");

        dogru43Text = findViewById(R.id.dogru43Text);
        yanlis43Text = findViewById(R.id.yanlis43Text);

        soru44Text = findViewById(R.id.soru44Text);
        soru44Text.setText("4-)Akış diyagramlarında karar verme merkezi olarak kullanılan şekil hangisidir?");

        dogru44Text = findViewById(R.id.dogru44Text);
        yanlis44Text = findViewById(R.id.yanlis44Text);

        soru45Text = findViewById(R.id.soru45Text);
        soru45Text.setText("5-)Belirli bir işin yapılabilmesi için, bsit işlemlerle şema halinde gösterilmesine ne ad verilir?");

        dogru45Text = findViewById(R.id.dogru45Text);
        yanlis45Text = findViewById(R.id.yanlis45Text);

    }
    public void soru41dogru(View view){

        dogru41Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis41Text.setText("");
    }
    public void soru41yanlis(View view){

        yanlis41Text.setText("Yanlış Cevap :(");
        dogru41Text.setText("");
    }
    public void soru42dogru(View view){

        dogru42Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis42Text.setText("");
    }
    public void soru42yanlis(View view){

        yanlis42Text.setText("Yanlış Cevap :(");
        dogru42Text.setText("");
    }
    public void soru43dogru(View view){

        dogru43Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis43Text.setText("");
    }
    public void soru43yanlis(View view){

        yanlis43Text.setText("Yanlış Cevap :(");
        dogru43Text.setText("");
    }
    public void soru44dogru(View view){

        dogru44Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis44Text.setText("");
    }
    public void soru44yanlis(View view){

        yanlis44Text.setText("Yanlış Cevap :(");
        dogru44Text.setText("");
    }
    public void soru45dogru(View view){

        dogru45Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis45Text.setText("");
    }
    public void soru45yanlis(View view){

        yanlis45Text.setText("Yanlış Cevap :(");
        dogru45Text.setText("");
    }
}
