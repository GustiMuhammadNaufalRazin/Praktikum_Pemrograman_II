package praktikum2.soal2;

public class Kopi {
    String namaKopi, ukuran, pembeli;
    int harga;
    double pajak;
    Kopi(){
    }
    public void info(){
        System.out.println("Nama Kopi: "+ namaKopi);
        System.out.println("Ukuran: "+ ukuran);
        System.out.println("Harga: Rp. "+ harga);
    }
    public void setPembeli(String nama){
        this.pembeli = nama;
    }
    public String getPembeli(){
        return pembeli;
    }
    public double getPajak(){
        pajak = harga * 0.11;
        return pajak;
    }
}
