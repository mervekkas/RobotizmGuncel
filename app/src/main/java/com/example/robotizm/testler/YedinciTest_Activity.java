package com.example.robotizm.testler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.robotizm.R;

public class YedinciTest_Activity extends AppCompatActivity {

    TextView soru71Text, dogru71Text, yanlis71Text;
    TextView soru72Text, dogru72Text, yanlis72Text;
    TextView soru73Text, dogru73Text, yanlis73Text;
    TextView soru74Text, dogru74Text, yanlis74Text;
    TextView soru75Text, dogru75Text, yanlis75Text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yedinci_test_);


        soru71Text = findViewById(R.id.soru71Text);
        soru71Text.setText("1-)İşletim sistemi ile ilgili aşağıda verilen bilgilerden hangisi yanlıştır?");

        dogru71Text = findViewById(R.id.dogru71Text);
        yanlis71Text = findViewById(R.id.yanlis71Text);

        soru72Text = findViewById(R.id.soru72Text);
        soru72Text.setText("2-)Windows işletim sistemi ile ilgili aşağıda verilen bilgilerden hangisi yanlıştır?");

        dogru72Text = findViewById(R.id.dogru72Text);
        yanlis72Text = findViewById(R.id.yanlis72Text);

        soru73Text = findViewById(R.id.soru73Text);
        soru73Text.setText("3-)Aşağıdaki işletim sistemlerinden hangisi bilgisayarlarda kullanılan işletim sistemlerinden değildir?");

        dogru73Text = findViewById(R.id.dogru73Text);
        yanlis73Text = findViewById(R.id.yanlis73Text);

        soru74Text = findViewById(R.id.soru74Text);
        soru74Text.setText("4-)Apple tarafından geliştirilen işletim sistemi aşağıdakilerden hangisidir?");

        dogru74Text = findViewById(R.id.dogru74Text);
        yanlis74Text = findViewById(R.id.yanlis74Text);

        soru75Text = findViewById(R.id.soru75Text);
        soru75Text.setText("5-)Aşağıdaki işletim sistemlerinden hangisi mobil işletim sistemlerinden değildir?");

        dogru75Text = findViewById(R.id.dogru75Text);
        yanlis75Text = findViewById(R.id.yanlis75Text);



    }
    public void soru71dogru(View view){

        dogru71Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis71Text.setText("");
    }
    public void soru71yanlis(View view){

        yanlis71Text.setText("Yanlış Cevap :(");
        dogru71Text.setText("");
    }
    public void soru72dogru(View view){

        dogru72Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis72Text.setText("");
    }
    public void soru72yanlis(View view){

        yanlis72Text.setText("Yanlış Cevap :(");
        dogru72Text.setText("");
    }
    public void soru73dogru(View view){

        dogru73Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis73Text.setText("");
    }
    public void soru73yanlis(View view){

        yanlis73Text.setText("Yanlış Cevap :(");
        dogru73Text.setText("");
    }
    public void soru74dogru(View view){

        dogru74Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis74Text.setText("");
    }
    public void soru74yanlis(View view){

        yanlis74Text.setText("Yanlış Cevap :(");
        dogru74Text.setText("");
    }
    public void soru75dogru(View view){

        dogru75Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis75Text.setText("");
    }
    public void soru75yanlis(View view){

        yanlis75Text.setText("Yanlış Cevap :(");
        dogru75Text.setText("");
    }
}
