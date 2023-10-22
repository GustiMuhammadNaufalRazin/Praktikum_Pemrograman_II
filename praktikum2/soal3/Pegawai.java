package praktikum2.soal3;
//Pada baris ini error karena nama class tidak sesuai dengan yang dipaggil di Main
//public class Employee {
public class Pegawai {
    public String nama;
//    Pada baris dibawah error karena menggunakan tipe data char, seharusnnya menggunakan String
//    public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }
    public String getAsal() {
        return asal;
    }
//Baris dibawah error karena dalam parameternya kosong
//    public void setJabatan() {
//         this.jabatan = j;
    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}

