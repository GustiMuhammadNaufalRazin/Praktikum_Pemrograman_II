import java.util.Scanner;
public class PRAK005_2210817210002_GustiMuhammadNaufalRazin {
    public static void main(String[] args) {
        String myFood, myHobby;
        Scanner myObj = new Scanner(System.in);

        System.out.print("Masukan Makanan Favorit : ");
        myFood = myObj.nextLine();
        System.out.print("Masukan Hobi : ");
        myHobby = myObj.nextLine();
        System.out.println("Aku suka makan " + myFood + ", dan Hobiku " + myHobby);
    }
}