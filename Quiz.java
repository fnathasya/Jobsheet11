import java.util.Scanner;
import java.util.Random;

public class Quiz {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        char menu = 'y';
        do {
            int number = rd.nextInt(10) + 1;
            boolean success = false;

            do {
                System.out.print("Tebak angka(1-10) : ");
                int answer = sc.nextInt();
                sc.nextLine();
                
                if (answer < number) {
                    System.out.println("Angka terlalu kecil. Silahkan coba lagi!");
                } else if (answer > number) {
                    System.out.println("Angka terlalu besar. silahkan coba lagi!");
                } else {
                    success = true;
                   System.out.println("Tebakan Anda Benar!"); 
                }
                
                   
            } while (!success);
                System.out.print("Apakah anda ingin mengulang permainan (Y/y) ? ");
                menu = sc.nextLine().charAt(0);

        } while (menu == 'y' || menu == 'Y');
    }
}
