
package com.example.weightsconvertor1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class pounds extends AppCompatActivity {

    TextView pound,kilogram,result1;
    EditText num1;
    Button convert,clr,exit1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pounds);

        pound=(TextView)findViewById(R.id.tv_pounds);
        kilogram=(TextView)findViewById(R.id.tv2);
        result1=(TextView)findViewById(R.id.result);

        num1=(EditText)findViewById(R.id.ed_pounds);

        convert=(Button)findViewById(R.id.convert1);
        clr=(Button)findViewById(R.id.clear);
        exit1=(Button)findViewById(R.id.exit);

        convert.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)

            {
                if(num1.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Enter weight in pounds:", Toast.LENGTH_SHORT).show();
                }
                else {

                    double p = Double.valueOf(num1.getText().toString());
                    double res = p * 0.453592;
                    result1.setText(java.lang.String.valueOf(res));
                    System.out.println(result1);
                }

            }

        });

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText("");
                result1.setText("");
            }
        });

        exit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });


    }
}



