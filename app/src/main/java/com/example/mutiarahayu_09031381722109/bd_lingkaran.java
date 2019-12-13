package com.example.mutiarahayu_09031381722109;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class bd_lingkaran extends AppCompatActivity implements View.OnClickListener {
    private EditText txtJari;
    private EditText txtLuas;
    private Button btnHitung;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bd_lingkaran);

        txtJari = (EditText) findViewById(R.id.txtJari);
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
        Intent i = new Intent(bd_lingkaran.this, MainActivity.class);
        startActivity(i);


    }


    /**
     * Method untuk Menghitung Luas Lingkaran dipanggil pada saat button
     * Hitung Luas diklik
     *
     * @param view
     */
    public void hitungLuas(View view) {
        try {

            int jarijari = Integer.parseInt(txtJari.getText().toString());
            double phi = 3.14;
            double luas =  phi * jarijari * jarijari;
            txtLuas.setText(String.valueOf(luas));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method untuk menutup activity dan kembali ke menu
     * @param view
     */
    public void backtoMenu(View view){
        finish();
    }
}
