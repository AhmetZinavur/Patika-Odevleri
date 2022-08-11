import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç Basamaklı Üçgen İstersiniz? : ");
        int N = input.nextInt();

        for (int i = N; i >= 1; i--) {

            for (int j = N - i + 1; j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = (2 * i - 1); k >=1 ; k--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
