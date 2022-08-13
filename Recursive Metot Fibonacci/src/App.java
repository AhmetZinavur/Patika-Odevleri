import java.util.Scanner;

public class App {

    public static int fibonacci(int n) {

        if (n == 1 || n == 2) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) throws Exception {
        
        int n;

        Scanner input = new Scanner(System.in);

        System.out.print("Fibonnaci Serisinin Kaçıncı Elemanını Görmek İstiyorsunuz : ");
        n = input.nextInt();

        System.out.println(fibonacci(n));
    }
}
