import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int number;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        do {

            System.out.print("Lütfen Sayı Giriniz : ");
            number = input.nextInt();

            if ((number % 2 == 0) || (number % 4 == 0)) {
                sum += number;
            }
        } while (number % 2 != 1);

        System.out.println("Girilen Çift Sayıların ve Dördün Katlarının Toplamı : " + sum);

        input.close();
    }
}
