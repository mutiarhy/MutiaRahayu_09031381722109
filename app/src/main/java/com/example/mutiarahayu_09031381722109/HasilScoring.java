
package com.example.mutiarahayu_09031381722109;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HasilScoring extends AppCompatActivity {
    TextView mtvHasilAkhir;
    Button mbtnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_scoring);

        mtvHasilAkhir = (TextView) findViewById(R.id.tvSkorAkhir);
        mbtnMenu = (Button) findViewById(R.id.btnMenu);

        setSkor();

        mbtnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HasilScoring.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

    //method untuk mengatur skor yang akan ditampilkan pada textview
    public void setSkor(){
        //hasil lemparan (putExtra) dari activity sebelumnya ditampung dalam variabel lokal
        String activity = getIntent().getStringExtra("activity");
        String skorPilGan = getIntent().getStringExtra("skorAkhir");
        String skorEssay = getIntent().getStringExtra("skorAkhir2");

        if(activity.equals("PilihanGanda")){ //jika var activity bernilai PilihanGanda
            //dipastikan activity sebelumnya datang dari kelas KuisPilihanGanda
            //maka skornya diatur dari skorPilGan
            mtvHasilAkhir.setText("SKOR : "+skorPilGan);
        }
        else{
            //dipastikan activity sebelumnya datang dari kelas KuisEssay
            //maka skornya diatur dari skorEssay
            mtvHasilAkhir.setText("SKOR : "+skorEssay);
        }
    }

    //ini adalah method bawaan dari Android Studio
    //fungsi : memberi aksi ketika tombol back pada hp diklik
    public void onBackPressed(){
        Toast.makeText(this, "Tidak bisa kembali, silahkan tekan menu", Toast.LENGTH_SHORT).show();
        //jadi yang awalnya klik tombol back maka akan kembali ke activity sebelumnya
        //kali ini ketika tombol back diklik maka
        //hanya muncul Toast
    }


    public void onButtonTap(View v) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_CC, new String[]{"mutiarahayu14@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Email dari Aplikasi Android biodata Mutia");
        intent.putExtra(Intent.EXTRA_TEXT, " Nama   : Mutia Rahayu ");

        try {
            startActivity(Intent.createChooser(intent, "Ingin Mengirim Email ?"));
        } catch (android.content.ActivityNotFoundException ex) {
            //do something else
        }
    }
    public void telp (View view){
        String phoneNumber = "081274831986";
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }
    }
}