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

public class makaleActivity extends AppCompatActivity {
    ListView makalelist;
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makale);
        makalelist= findViewById(R.id.makaleListview);
        ArrayList<String> makaleler = new ArrayList<>();
        makaleler.add("Kodlamanın Yararları");
        makaleler.add("Dünyada Kodlama");
        makaleler.add("Kodlamanın Önemi");
        makaleler.add("Kodlamanın Yolları");



        arrayAdapter = new ArrayAdapter(this,R.layout.mytextview,makaleler);

        makalelist.setAdapter(arrayAdapter);

        makalelist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0){

                    Intent intent = new Intent(makaleActivity.this, birinci_makale.class);
                    startActivity(intent);
                }
                if(position == 1){

                    Intent intent = new Intent(makaleActivity.this, ikinci_makale.class);
                    startActivity(intent);
                }
                if(position == 2){

                    Intent intent = new Intent(makaleActivity.this, ucuncu_makale.class);
                    startActivity(intent);
                }
                if(position == 3){

                    Intent intent = new Intent(makaleActivity.this, dorduncu_makale.class);
                    startActivity(intent);
                }
                if(position == 4){

                    Intent intent = new Intent(makaleActivity.this, dorduncu_makale.class);
                    startActivity(intent);
                }



                }

        });
    }
}
