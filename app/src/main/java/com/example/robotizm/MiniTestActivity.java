package com.example.robotizm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.robotizm.testler.AltinciTest_Activity;
import com.example.robotizm.testler.BesinciTest_Activity;
import com.example.robotizm.testler.BirinciTest_Activity;
import com.example.robotizm.testler.DorduncuTest_Acitivity;
import com.example.robotizm.testler.IkinciTest_Activity;
import com.example.robotizm.testler.UcuncuTest_Activity;
import com.example.robotizm.testler.YedinciTest_Activity;

import java.util.ArrayList;

public class MiniTestActivity extends AppCompatActivity {

    ListView testlist;
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini_test);


        testlist = findViewById(R.id.testlist);

        ArrayList<String> testler = new ArrayList<>();
        testler.add("Bilişimde Gelişme");
        testler.add("Bilişim Teknolojilerinin Günlük Yaşamdaki Önemi");
        testler.add("Bilişim Teknolojileri");
        testler.add("Algoritma Bilgisi");
        testler.add("Donanım");
        testler.add("Donanım 2");
        testler.add("İşletim Sistemleri");

        arrayAdapter = new ArrayAdapter(this,R.layout.mytextview,testler);

        testlist.setAdapter(arrayAdapter);

        testlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0){

                    Intent intent = new Intent(MiniTestActivity.this, BirinciTest_Activity.class);
                    startActivity(intent);
                }
                if(position == 1){

                    Intent intent = new Intent(MiniTestActivity.this, IkinciTest_Activity.class);
                    startActivity(intent);
                }
                if(position == 2){

                    Intent intent = new Intent(MiniTestActivity.this, UcuncuTest_Activity.class);
                    startActivity(intent);
                }
                if(position == 3){

                    Intent intent = new Intent(MiniTestActivity.this, DorduncuTest_Acitivity.class);
                    startActivity(intent);
                }
                if (position == 4){

                    Intent intent = new Intent(MiniTestActivity.this, BesinciTest_Activity.class);
                    startActivity(intent);
                }
                if(position == 5){

                    Intent intent = new Intent(MiniTestActivity.this, AltinciTest_Activity.class);
                    startActivity(intent);
                }
                if(position == 6){

                    Intent intent = new Intent(MiniTestActivity.this, YedinciTest_Activity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
