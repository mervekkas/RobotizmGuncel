package com.example.robotizm.odevler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.robotizm.R;

public class IkinciOdev_Activity extends AppCompatActivity {

    TextView ikinciodevText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikinci_odev_);

        ikinciodevText = findViewById(R.id.ikinciodevText);
        ikinciodevText.setText("Devremizde 3 adet led, 3 adet 220 ohm direnç kullanılmıştır. GND pini breadboard üzerindeki – (eksi)" +
                "yuvasına bağlanarak dağıtılmıştır. Her üç ledin kısa ayakları breadboard üzerindeki – (eksi) yuvalarına" +
                "bağlanır. Her üç ledin uzun ayağına 220 ohm direnç seri bağlanır. Daha sonra 1.ledin direnci 13 nolu" +
                "pine, 2.ledin direnci 12 nolu pine, 3.ledin direnci 11 nolu pine bağlanmıştır.");
    }
}
