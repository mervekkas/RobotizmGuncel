package com.example.robotizm.testler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.robotizm.R;

public class IkinciTest_Activity extends AppCompatActivity {

    TextView soru21Text;
    TextView dogru21Text;
    TextView yanlis21Text;

    TextView soru22Text;
    TextView dogru22Text;
    TextView yanlis22Text;

    TextView soru23Text;
    TextView dogru23Text;
    TextView yanlis23Text;

    TextView soru24Text;
    TextView dogru24Text;
    TextView yanlis24Text;

    TextView soru25Text;
    TextView dogru25Text;
    TextView yanlis25Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikinci_test_);

        soru21Text = findViewById(R.id.soru21Text);
        soru21Text.setText("1-)Aşağıdakilerden hangisi bilgisayar kullanımından kaynaklı olarak oluşabilecek sağlık sorunlarından değildir?");

        dogru21Text = findViewById(R.id.dogru21Text);
        yanlis21Text = findViewById(R.id.yanlis21Text);

        soru22Text = findViewById(R.id.soru22Text);
        soru22Text.setText("2-)Aşağıdakilerden hangisi yapay zeka örneklerinden değildir?");

        dogru22Text = findViewById(R.id.dogru22Text);
        yanlis22Text = findViewById(R.id.yanlis22Text);

        soru23Text = findViewById(R.id.soru23Text);
        soru23Text.setText("3-)Aşadakilerden hangisi bilgisayarımızı zararlı yazılımlardan ( virüslerden) korumak için kullanmamız gereken yöntemlerden değildir?");

        dogru23Text = findViewById(R.id.dogru23Text);
        yanlis23Text = findViewById(R.id.yanlis23Text);

        soru24Text = findViewById(R.id.soru24Text);
        soru24Text.setText("4-)Aşağıdakilerden hangisi bilgi ve iletişim teknolojilerinin faydalarından değildir?");

        dogru24Text = findViewById(R.id.dogru24Text);
        yanlis24Text = findViewById(R.id.yanlis24Text);

        soru25Text = findViewById(R.id.soru25Text);
        soru25Text.setText("5-)Aşağıdakilerden hangisi bilgi ve iletişim teknolojilerinin faydalarından değildir?");

        dogru25Text = findViewById(R.id.dogru25Text);
        yanlis25Text = findViewById(R.id.yanlis25Text);
    }
    public void soru21dogru(View view){

        dogru21Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis21Text.setText("");
    }
    public void soru21yanlis(View view){

        yanlis21Text.setText("Yanlış Cevap :(");
        dogru21Text.setText("");
    }
    public void soru22dogru(View view){

        dogru22Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis22Text.setText("");
    }
    public void soru22yanlis(View view){

        yanlis22Text.setText("Yanlış Cevap :(");
        dogru22Text.setText("");
    }
    public void soru23dogru(View view){

        dogru23Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis23Text.setText("");
    }
    public void soru23yanlis(View view){

        yanlis23Text.setText("Yanlış Cevap :(");
        dogru23Text.setText("");
    }
    public void soru24dogru(View view){

        dogru24Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis24Text.setText("");
    }
    public void soru24yanlis(View view) {

        yanlis24Text.setText("Yanlış Cevap :(");
        dogru24Text.setText("");
    }
    public void soru25dogru(View view){

        dogru25Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis25Text.setText("");
    }
    public void soru25yanlis(View view) {

        yanlis25Text.setText("Yanlış Cevap :(");
        dogru25Text.setText("");
    }

}
