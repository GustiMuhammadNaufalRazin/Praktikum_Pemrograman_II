package com.example.praktikum6;

public class Mahasiswa {
    private int id;
    private String nama, nim;

    public Mahasiswa(int id,String nim, String nama){
        this.id = id;
        this.nim = nim;
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }
}