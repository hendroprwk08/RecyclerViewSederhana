package com.hendro.recyclerviewsederhana;

public class Teman {
    String nama, telepon, alamat;

    public Teman(String nama, String telepon, String alamat) {
        this.nama = nama;
        this.telepon = telepon;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getTelepon() {
        return telepon;
    }

    public String getAlamat() {
        return alamat;
    }
}
