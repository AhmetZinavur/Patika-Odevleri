import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int number;
        int digit;
        int sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Basamakları Toplamını Öğrenmek İstediğinzi Sayıyı Girin : ");
        number = input.nextInt();
        
        System.out.println();

        while (number > 0) {
            digit = number % 10;
            System.out.println("Giren Sayının Son Basamağı : " + digit);
            System.out.println();

            sum = sum + digit;
            System.out.println("Toplam : " + sum);
            System.out.println();

            number = number / 10;
            System.out.println("Bölümden Geriye Dönen Sayı : " + number);
            System.out.println();
        }
        
        System.out.println("Rakamlar toplamı : " + sum);

        input.close();
    }
}
