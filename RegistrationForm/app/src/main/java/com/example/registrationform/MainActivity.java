package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onbtnClick (View view) {
        TextView textViewFirst = (findViewById(R.id.textViewFirst));
        TextView textViewLast = (findViewById(R.id.textViewLast));
        TextView textViewEmail = (findViewById(R.id.textViewEmail));

        EditText editTextFirst = (findViewById(R.id.editTextFirst));
        EditText editTextLast = (findViewById(R.id.editTextLast));
        EditText editTextEmail = (findViewById(R.id.editTextEmail));

        textViewFirst.setText("First Name: " + editTextFirst.getText().toString());
        textViewLast.setText("Last Name: " + editTextLast.getText().toString());
        textViewEmail.setText("Email: " + editTextEmail.getText().toString());


    }
}
