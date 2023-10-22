package praktikum2.soal3;

public class Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        //Baris dibawah error karena tidak ada tanda titik koma di akhir baris
        //p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        //Ditambahkan setter sehingga nilai umurnya ada
        p1.setUmur(17);

        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        //Baris dibawah kurang tepat karena tidak ada tambahan String "Tahun" setelah umur
        //System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}
