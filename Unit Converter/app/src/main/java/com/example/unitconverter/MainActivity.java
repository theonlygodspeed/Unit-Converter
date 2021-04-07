package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView, textView3, textView5, valueOfPounds;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView3 = findViewById(R.id.textView3);
        textView5 = findViewById(R.id.valueOfPounds);
        valueOfPounds = findViewById(R.id.valueOfPounds);


        editText = findViewById(R.id.editTextNumber);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ConvertFromKiloToPound ();


            }
        });

    }



    private void ConvertFromKiloToPound() {

        String valueEnteredinKILO = editText.getText().toString();

        double Kilo = Double.parseDouble(valueEnteredinKILO);

        double pounds = Kilo * 2.205;

        textView5.setText("" + pounds);
    }
}