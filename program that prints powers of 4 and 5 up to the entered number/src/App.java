import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int number;
        int value = 0;
        int value2 = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Bİr Sayı Giriniz : ");
        number = input.nextInt();

        for (int i = 1; i <= number; i*=4) {
            System.out.println("4'ün " + value + ". Kuvveti : " + i);
            value++;
        }

        System.out.println("======================================");

        for (int i = 1; i <= number; i*=5) {
            System.out.println("5'ün " + value2 + ". Kuvveti : " + i);
            value2++;
        }

        input.close();
    }
}
