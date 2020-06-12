package com.example.robotizm.testler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.robotizm.R;

public class BirinciTest_Activity extends AppCompatActivity {

    TextView soru11Text;
    TextView yanlis11Text;
    TextView dogru11Text;
    TextView soru12Text;
    TextView yanlis12Text;
    TextView dogru12Text;
    TextView soru13Text;
    TextView dogru13Text;
    TextView yanlis13Text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birinci_test_);

        soru11Text = findViewById(R.id.soru11Text);
        soru11Text.setText("1-) Kuşun domuza ulaşması için hangi yolu izlemesi gerekir?");

        yanlis11Text = findViewById(R.id.yanlis11Text);
        dogru11Text = findViewById(R.id.dogru11Text);

        soru12Text = findViewById(R.id.soru12Text);
        soru12Text.setText("2-)\n Üçgen ile başlayın\n Üçgenin altına kare yerleştirin\n Karenin altına başka bir üçgen yerleştirin\n" +
                " Yukarıdaki komutların görüntüsü aşağıdakilerden hangisi değildir?");

        yanlis12Text = findViewById(R.id.yanlis12Text);
        dogru12Text = findViewById(R.id.dogru12Text);

        soru13Text = findViewById(R.id.soru13Text);
        soru13Text.setText("3-)\n Kare ile başlayın\n Karenin altına üçgen yerleştirin\n Karenin altına üstteki üçgenin simetriğini yerleştirin\n"
        +"Yukarıdaki komutların görüntüsü aşağıdakilerden hangisidir?");

        yanlis13Text = findViewById(R.id.yanlis13Text);
        dogru13Text = findViewById(R.id.dogru13Text);

    }
    public void soru11yanlis(View view){

        dogru11Text.setText("");
        yanlis11Text.setText("Yanlış Cevap :(");
    }
    public void soru11dogru(View view){

        yanlis11Text.setText("");
        dogru11Text.setText(" Doğru Cevap!\n   Tebrikler :)");
    }
    public void soru12yanlis(View view) {

        dogru12Text.setText("");
        yanlis12Text.setText("Yanlış Cevap :(");
    }
    public void soru12dogru(View view){

        yanlis12Text.setText("");
        dogru12Text.setText(" Doğru Cevap!\n   Tebrikler :)");
    }
    public void soru13yanlis (View view){

        dogru13Text.setText("");
        yanlis13Text.setText("Yanlış Cevap :(");
    }
    public void soru13dogru(View view){

        yanlis13Text.setText("");
        dogru13Text.setText(" Doğru Cevap!\n   Tebrikler :)");

    }

}
