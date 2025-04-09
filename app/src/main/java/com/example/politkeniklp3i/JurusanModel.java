package com.example.politkeniklp3i;

public class JurusanModel {
    private String namaJurusan;
    private int imageResId;

    public JurusanModel(String namaJurusan, int imageResId) {
        this.namaJurusan = namaJurusan;
        this.imageResId = imageResId;
    }

    public String getNamaJurusan() {
        return namaJurusan;
    }

    public int getImageResId() {
        return imageResId;
    }
}
