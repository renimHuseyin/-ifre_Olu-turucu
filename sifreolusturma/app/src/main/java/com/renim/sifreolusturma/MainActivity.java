package com.renim.sifreolusturma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView text;
    Button buton,alti,dokuz;

    String[] harf = {"A","B","C","D","E","F","G","H","İ","K","L","M","N","O","P","Q","R","S","T","U","V","X","Y","Z"};
    Integer[] rakam = {0,1,2,3,4,5,6,7,8,9};
    String[] karakter = {"!","+","%","&","/","*","?","{","}","_",".","#","$","=","<",">"};

    int deger = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.yazdir);
        buton = findViewById(R.id.button);
        alti = findViewById(R.id.alti);
        dokuz = findViewById(R.id.dokuz);

        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deger = 1;

                if(deger==1){
                    String sifre = "";
                    Random random = new Random();

                    sifre = sifre + harf[random.nextInt(24)] + rakam[random.nextInt(10)] + karakter[random.nextInt(16)];
                    text.setText(""+sifre);
                }
            }
        });

        alti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deger = 2;

                if(deger==2){
                    String sifre2 = "";
                    Random random = new Random();

                    for(int i=0;i<2;i++) {
                        sifre2 = sifre2 + harf[random.nextInt(24)] + rakam[random.nextInt(10)] + karakter[random.nextInt(16)];
                    }
                    text.setText(""+sifre2);
                }
            }
        });

        dokuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deger = 3;

                if(deger==3){
                    String sifre3 = "";
                    Random random = new Random();

                    for(int j=0;j<3;j++) {
                        sifre3 = sifre3 + harf[random.nextInt(24)] + rakam[random.nextInt(10)] + karakter[random.nextInt(16)];
                    }
                    text.setText(""+sifre3);
                }
            }
        });


    }
}