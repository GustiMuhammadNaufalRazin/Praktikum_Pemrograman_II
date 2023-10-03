import java.util.Scanner;
public class PRAK103_2210817210002_GustiMuhammadNaufalRazin{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int j=0; j<3; j++){
        int N = scanner.nextInt();
        int bilangan = scanner.nextInt();

        int i = 0;
        do {
            if (bilangan % 2 != 0) {
                System.out.print(bilangan);
                i++;
                if (i < N) {
                    System.out.print(", ");
                }
            }
            bilangan++;
        } while (i < N);
        }
    }
}
