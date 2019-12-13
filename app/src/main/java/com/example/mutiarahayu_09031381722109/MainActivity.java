package com.example.mutiarahayu_09031381722109;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);



        //I added this if statement to keep the selected fragment when rotating the device
        if (savedInstanceState == null) {
            final int commit = getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new HomeFragment()).commit();
        }


    }
    //untuk intent
    public void konversisuhu (View view){
        Intent intent = new Intent(this, KonversiSuhu.class);
        startActivity(intent);
    }
    public void persegipanjang (View view){
        Intent intent = new Intent(this, bd_persegipanjang.class);
        startActivity(intent);
    }
    public void segitiga (View view){
        Intent intent = new Intent(this, bd_segitiga.class);
        startActivity(intent);
    }
    public void lingkaran (View view){
        Intent intent = new Intent(this, bd_lingkaran.class);
        startActivity(intent);
    }
    public void konversimatauang (View view){
        Intent intent = new Intent(this, konversi_matauang.class);
        startActivity(intent);
    }
    public void kalkulator (View view){
        Intent intent = new Intent(this, kalkulator.class);
        startActivity(intent);
    }
    public void linePilGan (View view){
        Intent intent = new Intent(this, KuisPilihanganda.class);
        startActivity(intent);
    }
    public void lineEssay (View view){
        Intent intent = new Intent(this, KuisEssay.class);
        startActivity(intent);
    }
    public void Pembahasan (View view){
        Intent intent = new Intent(this, Pembahasan.class);
        startActivity(intent);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.nav_home:
                            selectedFragment = new HomeFragment();
                            break;
                        case R.id.nav_rumus:
                            selectedFragment = new RumusFragment();
                            break;
                        case R.id.nav_latihan:
                            selectedFragment = new LatihanFragment();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true;
                }
            };
}
