package com.example.mutiarahayu_09031381722109;

public class SoalEssay {
    //membuat array untuk pertanyaan
    public String pertanyaan[] = {
            "1. Hasil perkalian yang tepat dari gambar di atas adalah ….",
            "2. Hasil penjumlahan yang tepat dari gambar di atas adalah ….",
            "3. Hasil perkalian yang tepat dari gambar di atas adalah ….",
            "4. hasil pengurangan pensil di atas adalah ....",
            "5. Hasil perkalian yang tepat dari gambar di atas adalah ….",
            "6. hasil pengurangan  di atas adalah ....",
            "7. Hasil penjumlahan yang tepat dari gambar di atas adalah ….",
            "8. Hasil penjumlahan yang tepat dari gambar di atas adalah ….",
            "9. Hasil perkalian yang tepat dari gambar di atas adalah ….",
    };

    //membuat array untuk set gambar (dari String diubah jadi ImageView)
    //pastikan yang tertulis disini sama dengan nama di drawable
    //lihat gambar penjelasan1
    private String image[] = {
            "s7",
            "s2",
            "s3",
            "s1",
            "s5",
            "s9",
            "s8",
            "s4",
            "s6",
    };

    //membuat array jawaban benar
    private String jawabanBenar[] = {
            "24",
            "21",
            "12",
            "18",
            "10",
            "7",
            "17",
            "9",
            "20",
    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getStringGambar(int x){
        String gambar = image[x];
        return gambar;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}