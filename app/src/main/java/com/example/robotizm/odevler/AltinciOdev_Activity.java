package com.example.robotizm.odevler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.robotizm.R;

public class AltinciOdev_Activity extends AppCompatActivity {

    TextView altinciodevText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altinci_odev_);

        altinciodevText = findViewById(R.id.altinciodevText);
        altinciodevText.setText("Devremizde 1 adet led, 1 adet 220 ohm direnç, 1 adet LDR, 1 adet 10 Kohm direnç kullanılmıştır. LDR" +
                "ışık şiddetini ölçen bir sensördür. Işık şiddetini 0-1023 aralığında ölçmektedir. Devremize göre 0 en" +
                "karanlık, 1023 en aydınlık ışık şiddetini ifade etmektedir. LDR ışık sensörü sokak lambalarında, ışığa" +
                "yönelen robotlarda kullanılmaktadır. GND pini breadboard üzerindeki – (eksi) yuvasına bağlanarak" +
                "dağıtılmıştır. Ledin kısa ayağı breadboard üzerindeki – (eksi) yuvalarından birine bağlanır. Ledin uzun" +
                "ayağındaki direnç 13 nolu pine bağlanır. LDR’nin sağ ayağı 5V pinine bağlanır. LDR’nin sol ayağına seri" +
                "bağlı 10 Kohm direncinin sol ucu breadboard üzerindeki – (eksi) yuvalarından birine bağlanır. LDR ile" +
                "10 Kohm direncinin breadboard üzerindeki ortak noktalarının birinden A0 analog giriş pinine bağlantı" +
                "yapılır.\n" +
                "Analog Giriş Pin: A0 ile A5 aralığında olmak üzere 6 adettir.");
    }
}
