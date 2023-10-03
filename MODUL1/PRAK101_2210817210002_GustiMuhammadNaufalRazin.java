import java.util.Scanner;
public class PRAK101_2210817210002_GustiMuhammadNaufalRazin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan Tempat Lahir: ");
        String tmpt = scanner.nextLine();
        System.out.print("Masukkan Tanggal Lahir: ");
        int tgl = scanner.nextInt();
        System.out.print("Masukkan Bulan Lahir: ");
        int bulanLahir = scanner.nextInt();
        System.out.print("Masukkan Tahun Lahir: ");
        int tahun = scanner.nextInt();
        System.out.print("Masukkan Tinggi Badan: ");
        int tb = scanner.nextInt();
        System.out.print("Masukkan Berat Badan: ");
        Double bb = scanner.nextDouble();

        String bulan = getBulan(bulanLahir);
        System.out.println("Nama Lengkap " + name + ",Lahir di " + tmpt + " pada tanggal " + tgl +" "+ bulan +" "+ tahun);
        System.out.println("Tinggi Badan " + tb + " cm dan " + "Berat Badan " + bb + " kilogram");
    }
    public static String getBulan(int bulan){
        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        if(bulan >= 1 && bulan <= 12){
            return namaBulan[bulan - 1];
        }
        else{
            return "Bulan Tidak Ada";
        }
    }
}
