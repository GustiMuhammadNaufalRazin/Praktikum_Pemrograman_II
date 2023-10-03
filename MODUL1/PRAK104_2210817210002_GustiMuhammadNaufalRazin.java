import java.util.Scanner;
public class PRAK104_2210817210002_GustiMuhammadNaufalRazin {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                for(int j=0; j<3; j++){
                System.out.print("Tangan Abu: ");
                String[] tanganAbuArr = input.nextLine().split(" ");
                System.out.print("Tangan Bagas: ");
                String[] tanganBagasArr = input.nextLine().split(" ");

                int poinAbu = 0;
                int poinBagas = 0;

                for (int i = 0; i < 3; i++) {
                    String tanganAbu = tanganAbuArr[i];
                    String tanganBagas = tanganBagasArr[i];

                    if (tanganAbu.equals(tanganBagas)) {}
                    else if ((tanganAbu.equals("B") && tanganBagas.equals("G"))
                            || (tanganAbu.equals("G") && tanganBagas.equals("K"))
                            || (tanganAbu.equals("K") && tanganBagas.equals("B"))) {
                        poinAbu++;
                    } else {
                        poinBagas++;
                    }
                }

                if (poinAbu > poinBagas) {
                    System.out.println("Abu");
                } else if (poinAbu < poinBagas) {
                    System.out.println("Bagas");
                } else {
                    System.out.println("Seri");
                }}
            }
        }