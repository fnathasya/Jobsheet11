import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        int i = 0;
        while (i <= N) {
          int  j = 0;
          while (j < i) {
            System.out.print("*");
            j++;
          }
          System.out.println(); // menambahkan s.o.pln agar kolom dapat ke enter dan agar outputnya tidak menjadi 1 baris
          i++;
        }
    }
}
