import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int N;

        Scanner input =new Scanner(System.in);

        System.out.print("Satır Sayısını Belirleyin Lütfen : ");
        N = input.nextInt();

        for (int i = 0; i < N; i++) {

            for (int j = 1; j < N-i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        N--;

        for (int i = N; i >= 1; i--) {

            for (int j = N - i + 1; j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = (2 * i - 1); k >=1 ; k--) {
                System.out.print("*");
            }

            System.out.println();
        }

        input.close();
    }
}
