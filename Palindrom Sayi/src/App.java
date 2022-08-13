import java.util.Scanner;

public class App {

    public static boolean isPalindrome(int N) {

        int temp = N;
        int reversOfNumber = 0;
        int lastDigitOfNumber;

        while (temp != 0) {

            lastDigitOfNumber = temp % 10;
            reversOfNumber = (reversOfNumber * 10) + lastDigitOfNumber;
            temp = temp / 10;
        }

        if (N == reversOfNumber) {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) throws Exception {

        int N;
        Scanner input = new Scanner(System.in);

        System.out.print("Kontrol Etmek İstediğinzi Sayıyı Girinizi : ");
        N = input.nextInt();

        System.out.println(isPalindrome(N));
    }
}
