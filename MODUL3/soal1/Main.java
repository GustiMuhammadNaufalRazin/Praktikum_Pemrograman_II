package MODUL3.soal1;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Dadu> angkaList = new LinkedList<>();

        int jumlahDadu = scanner.nextInt();

        for (int i = 0; i < jumlahDadu; i++) {
            Dadu dadu1 = new Dadu();
            angkaList.add(dadu1);
            System.out.println("Dadu ke-" + (i + 1) + dadu1);
        }

        int totalNilai = angkaList.stream().mapToInt(Dadu::getNilai).sum();

        System.out.println("Total nilai dadu keseluruhan " + totalNilai);
    }
}
