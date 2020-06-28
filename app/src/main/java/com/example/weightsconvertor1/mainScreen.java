package com.example.weightsconvertor1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class mainScreen extends AppCompatActivity {
    Button button_pounds,button_kilogram;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        button_pounds=findViewById(R.id.button_pounds);
        button_kilogram=findViewById(R.id.button_kilogram);


        button_pounds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a =new Intent(mainScreen.this,pounds.class);
                startActivity(a);

            }
        });


        button_kilogram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b =new Intent(mainScreen.this,kilograms.class);
                startActivity(b);

            }
        });




    }
}
