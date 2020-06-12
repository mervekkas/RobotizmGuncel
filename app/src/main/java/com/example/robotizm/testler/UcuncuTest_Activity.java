package com.example.robotizm.testler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.robotizm.R;

public class UcuncuTest_Activity extends AppCompatActivity {

    TextView soru31Text;
    TextView dogru31Text;
    TextView yanlis31Text;

    TextView soru32Text;
    TextView dogru32Text;
    TextView yanlis32Text;

    TextView soru33Text;
    TextView dogru33Text;
    TextView yanlis33Text;

    TextView soru34Text;
    TextView dogru34Text;
    TextView yanlis34Text;

    TextView soru35Text;
    TextView dogru35Text;
    TextView yanlis35Text;

    TextView soru36Text;
    TextView dogru36Text;
    TextView yanlis36Text;

    TextView soru37Text;
    TextView dogru37Text;
    TextView yanlis37Text;

    TextView soru38Text;
    TextView dogru38Text;
    TextView yanlis38Text;

    TextView soru39Text;
    TextView dogru39Text;
    TextView yanlis39Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ucuncu_test_);

        soru31Text = findViewById(R.id.soru31Text);
        soru31Text.setText("1-)Genellikle internet üzerinden görüntülü konuşmaya yarayan donanım aracıdır." +
                "Bu donanım sayesinde fotoğraf ve video çekebilir, bilgisayarımıza kaydedebiliriz.\n"+
                "Tanımı verilen donanım birimi aşağıdakilerden hangisidir?");

        dogru31Text = findViewById(R.id.dogru31Text);
        yanlis31Text = findViewById(R.id.yanlis31Text);

        soru32Text = findViewById(R.id.soru32Text);
        soru32Text.setText("2-)Bilgisayarın çalışması için gerekeli olan, elle tutulamayan, gözle görülen programlara ........ denir.\n"+
                "Boş bırakılan yere uygun olan ifade aşağıdakilerden hangisidir?");

        dogru32Text = findViewById(R.id.dogru32Text);
        yanlis32Text = findViewById(R.id.yanlis32Text);

        soru33Text = findViewById(R.id.soru33Text);
        soru33Text.setText("3-)Kasanın içerisinde yer alan donanımlardır. İşlemci, hdd, anakart gibi donanımlardır.\n"+
                "Tanımı verilen kavram aşağıdakilerden hangisidir?");

        dogru33Text = findViewById(R.id.dogru33Text);
        yanlis33Text = findViewById(R.id.yanlis33Text);

        soru34Text = findViewById(R.id.soru34Text);
        soru34Text.setText("4-)Bilgisayarın çalışması için gerekli olan, elle tutulup, gözle görülen bilgisayar parçalarıdır.\n"+
                "Bu tanım aşağıdakilerden hangisine aittir?");

        dogru34Text = findViewById(R.id.dogru34Text);
        yanlis34Text = findViewById(R.id.yanlis34Text);

        soru35Text = findViewById(R.id.soru35Text);
        soru35Text.setText("5-)Kerem arkadaşından, internet üzerinden herkesin indirebileceği ve sürekli kullanabileceği bir film programı olduğunu " +
                "öğrendi ve bilgisayarına yükledi. Artık istediği zaman film izleyebilecekti.\n"+
                "Kerem'in indirdiği program ne tür bir yazılımdır?");

        dogru35Text = findViewById(R.id.dogru35Text);
        yanlis35Text = findViewById(R.id.yanlis35Text);

        soru36Text = findViewById(R.id.soru36Text);
        soru36Text.setText("6-)Aşağıdaki işletim sistemlerinden hangisi telefonlar için kullanılan işletim sistemidir?");

        dogru36Text = findViewById(R.id.dogru36Text);
        yanlis36Text = findViewById(R.id.yanlis36Text);

        soru37Text = findViewById(R.id.soru37Text);
        soru37Text.setText("7-)Bilgiye ulaşılmasını, bilginin depolanmasını, saklanmasını ve kullanılmasını sağlayan; iletişim ve bilgisayar" +
                "uygulamalarını kapsayan tüm teknolojilerdir.\n" +
                "Yukarıdaki açıklama aşağıdakilerden hangisine aittir?");

        dogru37Text = findViewById(R.id.dogru37Text);
        yanlis37Text = findViewById(R.id.yanlis37Text);

        soru38Text = findViewById(R.id.soru38Text);
        soru38Text.setText("8-)Aşağıdakilerden hangisi web sayfaları kullanılarak işlenilen suçlar arasında yer almaz?");

        dogru38Text = findViewById(R.id.dogru38Text);
        yanlis38Text = findViewById(R.id.yanlis38Text);

        soru39Text = findViewById(R.id.soru39Text);
        soru39Text.setText("9-)Aşağıdaki yazılım türlerinden hangisi zararlı yazılımdır?");

        dogru39Text = findViewById(R.id.dogru39Text);
        yanlis39Text = findViewById(R.id.yanlis39Text);

    }
    public void soru31dogru(View view){

        dogru31Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis31Text.setText("");
    }
    public void soru31yanlis(View view){

        yanlis31Text.setText("Yanlış Cevap :(");
        dogru31Text.setText("");
    }
    public void soru32dogru(View view){

        dogru32Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis32Text.setText("");
    }
    public void soru32yanlis(View view){

        yanlis32Text.setText("Yanlış Cevap :(");
        dogru32Text.setText("");
    }
    public void soru33dogru(View view){

        dogru33Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis33Text.setText("");
    }
    public void soru33yanlis(View view) {

        yanlis33Text.setText("Yanlış Cevap :(");
        dogru33Text.setText("");
    }
    public void soru34dogru(View view){

        dogru34Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis34Text.setText("");
    }
    public void soru34yanlis(View view) {

        yanlis34Text.setText("Yanlış Cevap :(");
        dogru34Text.setText("");
    }
    public void soru35dogru(View view){

        dogru35Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis35Text.setText("");
    }
    public void soru35yanlis(View view) {

        yanlis35Text.setText("Yanlış Cevap :(");
        dogru35Text.setText("");
    }
    public void soru36dogru(View view){

        dogru36Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis36Text.setText("");
    }
    public void soru36yanlis(View view) {

        yanlis36Text.setText("Yanlış Cevap :(");
        dogru36Text.setText("");
    }
    public void soru37dogru(View view){

        dogru37Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis37Text.setText("");
    }
    public void soru37yanlis(View view) {

        yanlis37Text.setText("Yanlış Cevap :(");
        dogru37Text.setText("");
    }
    public void soru38dogru(View view){

        dogru38Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis38Text.setText("");
    }
    public void soru38yanlis(View view) {

        yanlis38Text.setText("Yanlış Cevap :(");
        dogru38Text.setText("");
    }
    public void soru39dogru(View view){

        dogru39Text.setText("Doğru Cevap!\n  Tebrikler :)");
        yanlis39Text.setText("");
    }
    public void soru39yanlis(View view) {

        yanlis39Text.setText("Yanlış Cevap :(");
        dogru39Text.setText("");
    }
}
