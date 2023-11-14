import java.util.Scanner;

public class TugasIndividu3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        do {
            // memasukkan nilai N 
            System.out.print("Masukkan Nilai  : ");
            N = sc.nextInt();

            if (N >= 3) {
                for (int i = 1; i <= N ; i++) {
                    for (int j = 1; j <= N; j++) {
                        if (i == 1 || i == N || j == 1 || j == N ) {
                        System.out.print(N +  " ");
                        }else{
                            System.out.print( "  ");

                        }
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Masukkan Nilai Minimal 5!");
            }
        
        } while (N < 3);
        
    }
}
