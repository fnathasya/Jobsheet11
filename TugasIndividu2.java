import java.util.Scanner;

public class TugasIndividu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N;
        do {
            // memasukkan nilai N
            System.out.print("Masukkan Nilai (Minimal 5!) : ");
            N = sc.nextInt();

            // if untuk menyeleksi apakah N yang dimasukkan lebih dari 5
            if (N >= 5) {
                // jika N lebih dari 5 maka akan dilanjutkan program pada for
                for (int i = 1; i <= N; i++) {
                    // for pertama untuk pengaturan baris
                    for (int j = i; j <= N; j++) {
                        // for kedua untuk pengaturan kolom
                        System.out.print("*");
                        // S.o.p untuk output kolom(for ke2)
                    }
                    System.out.println();
                    // S.o.pln untuk output dari baris yang berbeda line

                }
                // else untuk N yang diinputkan kurang dari 5
            } else {
                // S.o.p untuk peringatan bahwa N yang diinputkan minimal 5
                System.out.println("Masukkan nilai minimal 5!" );
            } 
        } while (N< 5);
            


            
       
    }
}
