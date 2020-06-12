package com.example.robotizm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class videolarActivity extends AppCompatActivity {
    ListView videolist;
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videolar);

        videolist= findViewById(R.id.videolarList);
        ArrayList<String> videolar = new ArrayList<>();
        videolar.add("Ders 1 - Programı Başlatma ve Robota Kod Yükleme");
        videolar.add(" Ders 2 - Robotu İleri Hareket Ettirme");
        videolar.add("Ders 3 - Robotu 3 Saniye İleri Hareket Ettirme");
        videolar.add("Ders 4 - Robotta Dönme Çeşitleri");
        videolar.add(" Ders 5 - Algoritma Nedir ve Nasıl Çizilir?");


        arrayAdapter = new ArrayAdapter(this,R.layout.mytextview,videolar);

        videolist.setAdapter(arrayAdapter);

        videolist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0){

                    Intent intent = new Intent(videolarActivity.this, birinciVideo.class);
                    startActivity(intent);
                }
                if(position == 1){

                    Intent intent = new Intent(videolarActivity.this, ikinciVideo.class);
                    startActivity(intent);
                }
                if(position == 2){

                    Intent intent = new Intent(videolarActivity.this, ucuncuVideo.class);
                    startActivity(intent);
                }
                if(position == 3){

                    Intent intent = new Intent(videolarActivity.this, dorduncuVideo.class);
                    startActivity(intent);
                }
                if(position == 4){

                    Intent intent = new Intent(videolarActivity.this, besinciVideo.class);
                    startActivity(intent);
                }



            }

        });
    }
}
