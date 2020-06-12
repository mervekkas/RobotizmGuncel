package com.example.robotizm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.robotizm.odevler.AltinciOdev_Activity;
import com.example.robotizm.odevler.BesinciOdev_Activity;
import com.example.robotizm.odevler.BirinciOdev_Activity;
import com.example.robotizm.odevler.DorduncuOdev_Activity;
import com.example.robotizm.odevler.IkinciOdev_Activity;
import com.example.robotizm.odevler.UcuncuOdev_Activity;
import com.example.robotizm.odevler.YedinciOdev_Activity;
import com.example.robotizm.testler.IkinciTest_Activity;
import com.example.robotizm.testler.UcuncuTest_Activity;
import com.example.robotizm.testler.YedinciTest_Activity;

import java.util.ArrayList;

public class Odevler_Activity extends AppCompatActivity {

    ListView odevlist;
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odevler_);

        odevlist = findViewById(R.id.odevlist);

        ArrayList<String> odevler = new ArrayList<>();
        odevler.add("Yan Sön Uygulaması");
        odevler.add("Yürüyen Işık Uygulaması");
        odevler.add("Sayma Uygulaması");
        odevler.add("Buton İle Led Yakma Uygulaması");
        odevler.add("Buton İle Buzzer(Düdük) Ses Üreticisi");
        odevler.add("LDR İle Karanlıkta Yanan Aydınlıkta Sönen Led Uygulaması");
        odevler.add("LDR İle Gece Gündüz Oyunu");

       arrayAdapter = new ArrayAdapter(this,R.layout.mytextview, odevler);
       odevlist.setAdapter(arrayAdapter);

       odevlist.setOnItemClickListener(new AdapterView.OnItemClickListener( ) {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               if (position == 0){

                   Intent intent = new Intent(Odevler_Activity.this, BirinciOdev_Activity.class);
                   startActivity(intent);
               }
               if(position == 1){

                   Intent intent = new Intent(Odevler_Activity.this, IkinciOdev_Activity.class);
                   startActivity(intent);
               }
               if (position == 2){

                   Intent intent = new Intent(Odevler_Activity.this, UcuncuOdev_Activity.class);
                   startActivity(intent);
               }
               if(position == 3){

                   Intent intent = new Intent(Odevler_Activity.this, DorduncuOdev_Activity.class);
                   startActivity(intent);
               }
               if (position == 4){

                   Intent intent = new Intent(Odevler_Activity.this, BesinciOdev_Activity.class);
                   startActivity(intent);
               }
               if(position == 5){

                   Intent intent = new Intent(Odevler_Activity.this, AltinciOdev_Activity.class);
                   startActivity(intent);
               }
               if(position == 6){

                   Intent intent = new Intent(Odevler_Activity.this, YedinciOdev_Activity.class);
                   startActivity(intent);
               }
           }

       });


    }
}
