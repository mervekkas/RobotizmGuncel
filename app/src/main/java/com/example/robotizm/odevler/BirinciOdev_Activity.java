package com.example.robotizm.odevler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.robotizm.R;

public class BirinciOdev_Activity extends AppCompatActivity {


    TextView birinciodevText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birinci__odev);

        birinciodevText = findViewById(R.id.birinciodevText);
        birinciodevText.setText("Devremizde 1 adet led, 1 adet 220 ohm direnç kullanılmıştır. Ledin kısa ayağı GND pinine, uzun ayağı" +
                "13 nolu dijital pinine bağlanmıştır. Ledin uzun ayağı dijital pine bağlanırken ledin zarar görmemesi," +
                "ömrünün azalmaması için uzun ayağa seri şekilde 220 ohm (Kırmızı Kırmızı Kahverengi) direnç" +
                "bağlanmıştır.\n" +
                "Not: Led ile yapılacak tüm çalışmalarda malzemeleriniz içerisinde 220 ohm direnç yoksa 330 ohm" +
                "(Turuncu Turuncu Kahverengi) veya 470 ohm (Sarı Mor Kahverengi) direnç kullanabilirsiniz.");
    }
}
