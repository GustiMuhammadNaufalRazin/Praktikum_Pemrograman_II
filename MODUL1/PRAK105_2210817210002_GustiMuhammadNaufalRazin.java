import java.util.Scanner;
public class PRAK105_2210817210002_GustiMuhammadNaufalRazin{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double PHI = 3.14;
        for(int i = 0; i<3; i++){
        System.out.print("Masukkan jari-jari: ");
        double jariJari = scanner.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = scanner.nextDouble();

        double volume = PHI * jariJari * jariJari * tinggi;
        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m^3\n\n", jariJari, tinggi, volume);
    }}
}
