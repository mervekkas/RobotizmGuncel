package com.example.robotizm.odevler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.robotizm.R;

import org.w3c.dom.Text;

public class UcuncuOdev_Activity extends AppCompatActivity {

    TextView ucuncuodevText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ucuncu_odev_);

        ucuncuodevText = findViewById(R.id.ucuncuodevText);
        ucuncuodevText.setText("Devremizde 3 adet led, 3 adet 220 ohm direnç kullanılmıştır. GND pini breadboard üzerindeki – (eksi)" +
                "yuvasına bağlanarak dağıtılmıştır. Her üç ledin kısa ayakları breadboard üzerindeki – (eksi) yuvalarına" +
                "bağlanır. Her üç ledin uzun ayağına 220 ohm direnç seri bağlanır. Daha sonra 1.ledin direnci 13 nolu" +
                "pine, 2.ledin direnci 12 nolu pine, 3.ledin direnci 11 nolu pine bağlanmıştır. Bu uygulama ile 0’dan 3’e" +
                "ileriye doğru, 3’ten 0’a geriye doğru sayım yapılmaktadır.");
    }
}
