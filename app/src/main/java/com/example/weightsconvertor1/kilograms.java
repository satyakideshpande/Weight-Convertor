
package com.example.weightsconvertor1;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class kilograms extends AppCompatActivity {

    TextView tv_kg,tv_pounds,result_kg;
    EditText ed_kg;
    Button convert_kg,clear_kg,exit_kg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kilograms);

        tv_kg=(TextView)findViewById(R.id.tv_kg);
        tv_pounds=(TextView)findViewById(R.id.tv_pounds);
        result_kg=(TextView)findViewById(R.id.result_kg);

        ed_kg=(EditText)findViewById(R.id.ed_kg);

        convert_kg=(Button)findViewById(R.id.convert_kg);
        clear_kg=(Button)findViewById(R.id.clear_kg);
        exit_kg=(Button)findViewById(R.id.exit_kg);

        convert_kg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                {
                    if(ed_kg.getText().toString().equals(""))
                    {
                        Toast.makeText(getApplicationContext(), "Enter weight in kilograms:", Toast.LENGTH_SHORT).show();
                    }
                    else {

                        double p = Double.valueOf(ed_kg.getText().toString());
                        double res = p * 2.20462;
                        result_kg.setText(java.lang.String.valueOf(res));
                        System.out.println(result_kg);
                    }

                }

            }
        });

        clear_kg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed_kg.setText("");
                ed_kg.setText("");
            }
        });

        exit_kg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });


    }
}
