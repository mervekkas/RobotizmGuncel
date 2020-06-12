package com.example.robotizm.odevler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.robotizm.R;

public class YedinciOdev_Activity extends AppCompatActivity {

    TextView yedinciodevText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yedinci_odev_);

        yedinciodevText = findViewById(R.id.yedinciodevText);
        yedinciodevText.setText("Devremizde 1 adet led, 1 adet 220 ohm direnç, 1 adet LDR, 1 adet 10 Kohm direnç kullanılmıştır. GND" +
                "pini breadboard üzerindeki – (eksi) yuvasına bağlanarak dağıtılmıştır. Ledin kısa ayağı breadboard" +
                "üzerindeki – (eksi) yuvalarından birine bağlanır. Ledin uzun ayağındaki direnç 13 nolu pine bağlanır." +
                "LDR’nin sağ ayağı 5V pinine bağlanır. LDR’nin sol ayağına seri bağlı 10 Kohm direncinin sol ucu" +
                "breadboard üzerindeki – (eksi) yuvalarından birine bağlanır. LDR ile 10 Kohm direncinin breadboard" +
                "üzerindeki ortak noktalarının birinden A0 analog giriş pinine bağlantı yapılır." +
                "Işık şiddeti ortama göre seçeceğimiz bir değerden (örneğin uygulamamızda 700) küçükse yani ortam" +
                "kararmaya başladıysa veya karanlıksa led yanacak, panda kuklası GECE diyecek ve sahne dekoru “city" +
                "with water” olarak değişecektir. Işık şiddeti değeri seçilen değerden küçük değilse yani ortam" +
                "aydınlanmaya başladıysa veya aydınlıksa led sönecek, panda kuklası GÜNDÜZ diyecek ve sahne dekoru" +
                "“city with water2” olarak değişecektir.");
    }
}
