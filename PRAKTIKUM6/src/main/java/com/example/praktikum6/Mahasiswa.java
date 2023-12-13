package com.example.praktikum6;

public class Mahasiswa {
        int id;
        String nama, nim;

        public Mahasiswa(int id,String nim, String nama){
            this.id = id;
            this.nim = nim;
            this.nama = nama;
        }

        public String getNama() {
            return nim;
        }

        public void setNama(String nim) {
            this.nim = nim;
        }

        public String getNim() {
            return nama;
        }

        public void setNim(String nama) {
            this.nama = nama;
        }
    }

