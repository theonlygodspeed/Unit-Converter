package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView, textView3, textView5, valueOfPounds, textView2, valueOfTonne;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView3 = findViewById(R.id.textView3);
        textView5 = findViewById(R.id.valueOfPounds);
        valueOfPounds = findViewById(R.id.valueOfPounds);
        textView2 = findViewById(R.id.valueOfTonne);
        valueOfTonne = findViewById(R.id.valueOfTonne);


        editText = findViewById(R.id.editTextNumber);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ConvertFromKiloToPound ();
                ConvertFromKiloToTonne ();


            }
        });

    }

    private void ConvertFromKiloToTonne() {

        String valueEnteredinKILO = editText.getText().toString();

        double Kilo = Double.parseDouble(valueEnteredinKILO);

        double tonne = Kilo / 1000;

        textView2.setText("" + tonne);
    }


    private void ConvertFromKiloToPound() {

        String valueEnteredinKILO = editText.getText().toString();

        double Kilo = Double.parseDouble(valueEnteredinKILO);

        double pounds = Kilo * 2.205;

        textView5.setText("" + pounds);
    }
}