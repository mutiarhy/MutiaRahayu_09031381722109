package com.example.mutiarahayu_09031381722109;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class bd_segitiga extends AppCompatActivity implements View.OnClickListener {
    private EditText txtAlas;
    private EditText txtTinggi;
    private EditText txtLuas;
    private Button btnHitung;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bd_segitiga);

        txtAlas = (EditText) findViewById(R.id.txtAlas);
        txtTinggi = (EditText) findViewById(R.id.txtTinggi);
        txtLuas = (EditText) findViewById(R.id.txtLuas);
        btnHitung = (Button) findViewById(R.id.btnHitung);

        btnBack = findViewById(R.id.btn_back);
        btnBack.setOnClickListener(this);

    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    @Override
    public void onClick (View v) {
        Intent i = new Intent(bd_segitiga.this, MainActivity.class);
        startActivity(i);


    }



    /**
     * Method untuk Menghitung Luas Segitiga dipanggil pada saat button
     * Hitung Luas diklik
     *
     * @param view
     */
    public void hitungLuas(View view) {
        try {

            int alas = Integer.parseInt(txtAlas.getText().toString());
            int tinggi = Integer.parseInt(txtTinggi.getText().toString());
            int luas = (alas * tinggi) / 2;
            txtLuas.setText(String.valueOf(luas));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }}

