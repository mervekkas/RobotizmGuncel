package com.example.robotizm.odevler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.robotizm.R;

import org.w3c.dom.Text;

public class BesinciOdev_Activity extends AppCompatActivity {

    TextView besinciodevText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_besinci_odev_);

        besinciodevText = findViewById(R.id.besinciodevText);
        besinciodevText.setText("Devremizde 1 adet buzzer, 1 adet 4 ayaklı çıt çıt buton, 1 adet 10 Kohm direnç kullanılmıştır. Buzzer –" +
                "(eksi) ayağı GND pinine, buzzer + (artı) ayağı 13 nolu pine bağlanmıştır. 4 ayaklı butonumuzun sol alt" +
                "taraftaki ayağı 5V pinine bağlanmıştır. Butonumuzun sağ üst ayağı 2 nolu pine bağlanmıştır. Butona" +
                "basılmadığı durumlarda 2 nolu pinde elektriksel yük kalmaması için butonun sağ üst ayağının" +
                "breadboard üzerindeki noktalarından birine 10 Kohm direnç takılmıştır. Bu direnç kullanılmadığında" +
                "butona basılmaması durumunda buzzer ses üretmeye devam edebilmektedir.");
    }
}
