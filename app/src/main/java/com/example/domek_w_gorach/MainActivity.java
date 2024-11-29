package com.example.domek_w_gorach;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private int polubienia = 0;
    private TextView TextViewPolubienia;
    private Button buttonPolubienie;
    private  Button buttonUsuniecie;

    protected void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextViewPolubienia = findViewById(R.id.pulubienia);
        buttonPolubienie = findViewById(R.id.Polubienie);
        buttonUsuniecie = findViewById(R.id.usuwanie);
        buttonPolubienie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                polubienia++;
                        TextViewPolubienia.setText(polubienia + "polubien");
            }
        });
        buttonUsuniecie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (polubienia>0){
                    polubienia--;
                    TextViewPolubienia.setText(polubienia + "polubien");
                }

            }

        });
    }


}