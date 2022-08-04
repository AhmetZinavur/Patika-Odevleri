import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        double sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("N Sayısını Giriniz : ");
        int N = input.nextInt();

        for (double i = 1; i <= N; i++) {
            sum = sum + 1/i;
        }

        System.out.println(sum);

        input.close();
    }
}
