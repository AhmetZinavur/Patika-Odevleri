import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int sum;
        int N;
        int a = 0;
        int b = 1;
        int c = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci Serisinin Kaç Elemanını Görmek İstersiniz : ");
        N = input.nextInt();

        for (int counter = 1; counter <= N; counter++) {
            
            a = b;
            b = c;
            c = a + b;
            sum = c;

            System.out.print(sum + " ");
        }
        System.out.println();
    }
}
