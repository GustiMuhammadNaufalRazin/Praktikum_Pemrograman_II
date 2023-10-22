package praktikum2.PRAK201_2210817210002_GustiMuhammadNaufalRazin;

public class Fruit {
    String buah;
    Double berat, harga, jmlhBeli,pothar, hsebd, td, hsetd;

    Fruit(String buah, Double berat, Double harga, Double jb){
        this.buah = buah;
        this.berat = berat;
        this.harga = harga;
        this.jmlhBeli = jb;
        this.hsebd = harga/berat * jb;
        this.pothar = Math.floor(jb / 4);
        this.td = pothar * (harga * 4 * 0.02);
        this.hsetd = hsebd - td;
    }

    public void display(){
        System.out.println("Nama Buah : " + this.buah);
        System.out.println("Berat : " + this.berat);
        System.out.println("Harga : " + this.harga);
        System.out.println("Jumlah Beli : " + this.jmlhBeli +"kg");
        System.out.println("Harga Sebelum Diskon : Rp" + this.hsebd);
        System.out.println("Total Diskon : Rp" + td);
        System.out.println("Harga Setelah Diskon : Rp" + hsetd);
        System.out.println();
    }
}
