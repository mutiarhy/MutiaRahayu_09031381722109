package com.example.mutiarahayu_09031381722109;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class Pembahasan extends AppCompatActivity {
    //Data-Data yang Akan dimasukan Pada ListView
    private String[] jawaban = {"jawaban pilihan ganda:",
            "1. c 80 cm",
            "2. b 4050 m2",
            "3. a 510 cm2",
            "4. c 80 cm",
            "5. b 10 cm",
            "6. a 616",
            "7. b 132",
            "8. a 48 cm",
            "9. c 1540 cm³n",
            "Jawaban Essay:",
            "1. 24",
            "2. 21",
            "3. 12",
            "4. 18",
            "5. 10",
            "6. 7",
            "7. 17",
            "8. 9",
            "9. 20",};

    //ArrayList digunakan Untuk menampung Data mahasiswa
    private ArrayList<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembahasan);

        ListView listView = findViewById(R.id.listview);
        data = new ArrayList<>();
        getData();
        ArrayAdapter adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, data);
        listView.setAdapter(adapter);
    }

    private void getData(){
        //Memasukan Semua Data mahasiswa kedalam ArrayList
        Collections.addAll(data, jawaban);
    }
}