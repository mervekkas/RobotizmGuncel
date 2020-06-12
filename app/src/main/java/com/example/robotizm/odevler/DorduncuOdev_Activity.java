package com.example.robotizm.odevler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.robotizm.R;

public class DorduncuOdev_Activity extends AppCompatActivity {

    TextView dorduncuodevText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dorduncu_odev_);

        dorduncuodevText = findViewById(R.id.dorduncuodevText);
        dorduncuodevText.setText("Devremizde 1 adet led, 1 adet 220 ohm direnç, 1 adet 4 ayaklı çıt çıt buton, 1 adet 10 Kohm (Kahverengi" +
                "Siyah Turuncu) direnç kullanılmıştır. Ledin kısa ayağı GND pinine, ledin uzun ayağındaki 220 ohm direnci" +
                "13 nolu pine bağlanmıştır. 4 ayaklı butonumuzun sol alt taraftaki ayağı 5V pinine bağlanmıştır." +
                "Butonumuzun sağ üst ayağı 2 nolu pine bağlanmıştır. Butona basılmadığı durumlarda 2 nolu pinde" +
                "elektriksel yük kalmaması için butonun sağ üst ayağının breadboard üzerindeki noktalarından birine 10" +
                "Kohm direnç takılmıştır. Bu direnç kullanılmadığında butona basılmaması durumunda led yanmaya" +
                "devam edebilmektedir.");
    }
}
