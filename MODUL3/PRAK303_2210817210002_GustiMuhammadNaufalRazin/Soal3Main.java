package MODUL3.PRAK303_2210817210002_GustiMuhammadNaufalRazin;
import java.util.Scanner;
import java.util.ArrayList;

public class Soal3Main {
    public static void main(String[] args) {
        String menu = ("Menu: \n"+"1. Tambah Mahasiswa \n"+"2. Hapus Mahasiswa berdasarkan NIM \n"+"3. Cari Mahasiswa berdasarkan NIM \n"+"4. Tampilkan Daftar Mahasiswa \n"+"0. Keluar \n"+"Pilihan: ");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();
        int angka = 0;
        do {
            System.out.print(menu);
            angka = scanner.nextInt();
            scanner.nextLine();
            switch(angka) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String nim = scanner.nextLine();
                    Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
                    listMahasiswa.add(mahasiswa);
                    System.out.print("Mahasiswa "+ mahasiswa.getNama() +" ditambahkan \n");
                    break;
                case 2:
                    System.out.print("Masukkan NIM Mahasiswa Yang Ingin Dihapus: ");
                    String nimHapus = scanner.nextLine();
                    for (int i = 0; i < listMahasiswa.size(); i++) {
                        if (listMahasiswa.get(i).getNim().equals(nimHapus)) {
                            listMahasiswa.remove(i);
                            System.out.print("Mahasiswa dengan NIM " + nimHapus + " dihapus. \n");
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Masukkan NIM Yang Ingin Dicari: ");
                    String nimCari = scanner.nextLine();
                    for (Mahasiswa mhs : listMahasiswa) {
                        if (mhs.getNim().equals(nimCari)) {
                            System.out.println("Mahasiswa ditemukan:");
                            System.out.println("NIM : " + mhs.getNim());
                            System.out.println("Nama : " + mhs.getNama());
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Daftar Mahasiswa: ");
                    for (Mahasiswa mhs : listMahasiswa) {
                        System.out.println("NIM : " + mhs.getNim()+ ", Nama : " + mhs.getNama());
                    }
                    break;
                case 0:
                    listMahasiswa.clear();
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while(angka != 0);
    }
}
