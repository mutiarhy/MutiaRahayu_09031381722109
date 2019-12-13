package com.example.mutiarahayu_09031381722109;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class KonversiSuhu extends AppCompatActivity {
    private Spinner sp;
    private EditText edt_awal, edt_C, edt_R, edt_F, edt_K;
    private String[] list={"C","R","F","K"};
    Double awal, celcius, reamur, fahrenheit, kelvin;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konversi_suhu);

        sp=(Spinner) findViewById(R.id.spinner1);
        edt_awal=(EditText) findViewById(R.id.editText1);
        edt_C=(EditText) findViewById(R.id.editText2);
        edt_R=(EditText) findViewById(R.id.editText3);
        edt_F=(EditText) findViewById(R.id.editText4);
        edt_K=(EditText) findViewById(R.id.editText5);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(adapter);
    }

    public void Konversi(View v){
        String satuan = String.valueOf(sp.getSelectedItemPosition());
        if(edt_awal.getText().toString().equals("")){
            Toast.makeText(getBaseContext(), "Masukkan suhu awal, default suhu awal = 0 jika tidak dimasukkan suhu awal", Toast.LENGTH_LONG).show();
            awal = 0.0;
        }else{
            awal = Double.parseDouble(edt_awal.getText().toString());
        }
        if(satuan.equals("0")){
            celcius = awal;
            reamur = 0.8 * awal;
            fahrenheit = (1.8 * awal) + 32;
            kelvin = awal + 273;

            edt_C.setText(String.valueOf(celcius));
            edt_R.setText(String.valueOf(reamur));
            edt_F.setText(String.valueOf(fahrenheit));
            edt_K.setText(String.valueOf(kelvin));
        }else if(satuan.equals("1")){
            celcius = 1.25 * awal;
            reamur = awal;
            fahrenheit = (2.25 * awal) + 32;
            kelvin = celcius + 273;

            edt_C.setText(String.valueOf(celcius));
            edt_R.setText(String.valueOf(reamur));
            edt_F.setText(String.valueOf(fahrenheit));
            edt_K.setText(String.valueOf(kelvin));
        }else if(satuan.equals("2")){
            celcius = 0.55555 *(awal - 32);
            reamur = 0.44444 * (awal-32);
            fahrenheit = awal;
            kelvin = celcius + 273;

            edt_C.setText(String.valueOf(celcius));
            edt_R.setText(String.valueOf(reamur));
            edt_F.setText(String.valueOf(fahrenheit));
            edt_K.setText(String.valueOf(kelvin));
        }else if(satuan.equals("3")){
            celcius = awal-273;
            reamur = 0.8 * (awal-273);
            fahrenheit = (1.8 * (awal-273)) + 32;
            kelvin = awal;

            edt_C.setText(String.valueOf(celcius));
            edt_R.setText(String.valueOf(reamur));
            edt_F.setText(String.valueOf(fahrenheit));
            edt_K.setText(String.valueOf(kelvin));
        }
    }
    //untuk intent
    public void kembali (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}