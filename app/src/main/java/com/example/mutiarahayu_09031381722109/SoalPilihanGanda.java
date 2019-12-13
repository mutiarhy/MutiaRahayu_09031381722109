package com.example.mutiarahayu_09031381722109;

public class SoalPilihanGanda  {
    //membuat array untuk pertanyaan
    public String pertanyaan[] = {
            "1. Sebuah persegi mempunyai luas 400 cm². Berapa keliling persegi tersebut?",
            "2. Sebidang tanah berbentuk segitiga memiliki tinggi 1,8 km dengan panjang sisi alas 45 m. Luas permukaan tersebut adalah…",
            "3. Yulis ingin membuat sebuah bingkai foto yang berbentuk persegi panjang dengan keliling 118 cm. Jika panjang salah satu sisi bingkai foto tersebut adalah 25 cm. Luas dari bingkai foto tersebut adalah…",
            "4. Sebuah persegi mempunyai luas 400 cm². Berapa keliling persegi tersebut?",
            "5. Luas sebuah persegi panjang adalah 120 cm². Jika panjangnya adalah 12 cm maka lebarnya adalah ….",
            "6.  Luas lingkaran yang berjari-jari 14 cm adalah …. cm²",
            "7. Keliling lingkaran yang berdiameter sepanjang 42 cm adalah ….",
            "8. Panjang alas suatu jajar genjang yang luasnya 1008 cm² dan tinggi 21 cm adalah ….",
            "9. Volume prisma yang mempunyai luas alas 154 cm² dan tinggi 10 cm adalah ….",
    };




    //membuat array untuk pilihan jawaban
    private String pilihanJawaban[][] = {
            {"a. 200 cm","b. 160 cm","c. 80 cm"},
            {"a. 4000 m2","b. 4050 m2","c. 8000 m2"},
            {"a. 510 cm2","b. 511 cm2","c. 515 cm2."},
            {"a. 200 cm","b. 160 cm","c. 80 cm"},
            {"a. 10 dm","b. 10 cm","c. 12 cm"},
            {"a. 616","b. 154","c. 308 "},
            {"a. 64","b. 132","c. 2772"},
            {"a. 48 cm","b. 18 cm","c. 38 cm"},
            {"a. 15,4 dm³","b. 1,54 m³","c. 1540 cm³"},
    };

    //membuat array untuk jawaban benar
    private String jawabanBenar[] = {
            "c. 80 cm",
            "b. 4050 m2",
            "a. 510 cm2",
            "c. 80 cm",
            "b. 10 cm",
            "a. 616",
            "b. 132",
            "a. 48 cm",
            "c. 1540 cm³n",
    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil pilihan jawaban 1
    public String getPilihanJawaban1(int x){
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }

    //membuat getter untuk mengambil pilihan jawaban 2
    public String getPilihanJawaban2(int x){
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    //membuat getter untuk mengambil pilihan jawaban 3
    public String getPilihanJawaban3(int x){
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}