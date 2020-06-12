package com.example.robotizm.testler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.robotizm.R;

public class AltinciTest_Activity extends AppCompatActivity {

    TextView soru61Text, dogru61Text, yanlis61Text;
    TextView soru62Text, dogru62Text, yanlis62Text;
    TextView soru63Text, dogru63Text, yanlis63Text;
    TextView soru64Text, dogru64Text, yanlis64Text;
    TextView soru65Text, dogru65Text, yanlis65Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altinci_test_);

        soru61Text = findViewById(R.id.soru61Text);
        soru61Text.setText("1-)Bilgisayarın çalışması için gerekli gücü sağlayan donanım birimi hangisidir?");

        dogru61Text = findViewById(R.id.dogru61Text);
        yanlis61Text = findViewById(R.id.yanlis61Text);

        soru62Text = findViewById(R.id.soru62Text);
        soru62Text.setText("2-)Kasa içerisinde yer alan ve işlemcinin ısınmasını önleyen donanım birimi hangisidir?");

        dogru62Text = findViewById(R.id.dogru62Text);
        yanlis62Text = findViewById(R.id.yanlis62Text);

        soru63Text = findViewById(R.id.soru63Text);
        soru63Text.setText("3-)HDD hangi donanım biriminin kısaltmasıdır?");

        dogru63Text = findViewById(R.id.dogru63Text);
        yanlis63Text = findViewById(R.id.yanlis63Text);

        soru64Text = findViewById(R.id.soru64Text);
        soru64Text.setText("4-)CPU hangi donanım biriminin kısaltmasıdır?");

        dogru64Text = findViewById(R.id.dogru64Text);
        yanlis64Text = findViewById(R.id.yanlis64Text);

        soru65Text = findViewById(R.id.soru65Text);
        soru65Text.setText("5-)Bilgisayardaki tüm her şeyi kalıcı olarak depolayan donanım birimi hangisidir?");

        dogru65Text = findViewById(R.id.dogru65Text);
        yanlis65Text = findViewById(R.id.yanlis65Text);
    }
    public void soru61dogru(View view){

        dogru61Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis61Text.setText("");
    }
    public void soru61yanlis(View view){

        yanlis61Text.setText("Yanlış Cevap :(");
        dogru61Text.setText("");
    }
    public void soru62dogru(View view){

        dogru62Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis62Text.setText("");
    }
    public void soru62yanlis(View view){

        yanlis62Text.setText("Yanlış Cevap :(");
        dogru62Text.setText("");
    }
    public void soru63dogru(View view){

        dogru63Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis63Text.setText("");
    }
    public void soru63yanlis(View view){

        yanlis63Text.setText("Yanlış Cevap :(");
        dogru63Text.setText("");
    }
    public void soru64dogru(View view){

        dogru64Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis64Text.setText("");
    }
    public void soru64yanlis(View view){

        yanlis64Text.setText("Yanlış Cevap :(");
        dogru64Text.setText("");
    }
    public void soru65dogru(View view){

        dogru65Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis65Text.setText("");
    }
    public void soru65yanlis(View view){

        yanlis65Text.setText("Yanlış Cevap :(");
        dogru65Text.setText("");
    }
}
