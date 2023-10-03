import java.util.Scanner;
public class PRAK102_2210817210002_GustiMuhammadNaufalRazin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int j=0; j<3; j++){
        int angkaAwal = scanner.nextInt();

        int i = 0;
        int angka = angkaAwal;

        while (i < 10) {
            if (angka % 5 == 0) {
                int kelipatan = angka / 5 - 1;
                System.out.print(kelipatan);
            } else {
                System.out.print(angka);
            }
            i++;
            angka++;
            if (i < 10) {
                System.out.print(", ");
            }
        }
    }}
}
