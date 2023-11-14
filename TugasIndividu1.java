import java.util.Scanner;

public class TugasIndividu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
            do {
                // memasukkan nilai N
                System.out.print("Masukkan Nilai : ");
                N = sc.nextInt();

                // penggunaan if untuk menyeleksi apakah nilai yang diinputkan lebih dari 3, jika ya maka akan dilanjutkan programnya
                if (N >= 3) {
                    // for 1 untuk mengatur baris
                    for (int i = 1; i <= N; i++) {
                        // for 2 untuk mengatur kolom tetapi dengan rata kiri
                        for (int j = N; j > i; j--) {
                            System.out.print(" ");
                        }
                        // for 3 untuk mengatur kolom tetapi dengan rata kanan
                        for (int j = 1; j <= i; j++) {
                            System.out.print(j + "");
                        }
                        // S.o.pln untuk meng enter baris
                        System.out.println();
                    }
                }else{
                    System.out.println("masukkan Nilai Lebih dari 3!");
                }
            } while (N < 3);
            
    }
}
