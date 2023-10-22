package praktikum2.PRAK203_2210817210002_GustiMuhammadNaufalRazin;
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

    //Baris dibawah error karena dalam parameternya kosong, maka dari itu diisi dengan variabel j dgn tipe data String
//    public void setJabatan() {
    public void setJabatan(String j) {
        this.jabatan = j;
    }
//Ditambahkan setter untuk umur
        public void setUmur(int umur){
            this.umur = umur;
        }
    }

