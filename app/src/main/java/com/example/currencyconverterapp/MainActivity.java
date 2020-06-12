package com.example.currencyconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convert(View view){
        EditText rupeeAmountEditText=(EditText)findViewById(R.id.rupeeAmountEditText);
        Double rupeeAmountDouble=Double.parseDouble(rupeeAmountEditText.getText().toString());
        Double dollarAmount=rupeeAmountDouble*0.013;
        Toast.makeText(MainActivity.this,"$" + dollarAmount.toString(),Toast.LENGTH_SHORT).show();
        Log.i("amount",rupeeAmountEditText.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
