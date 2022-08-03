import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int number;
        int power;
        int result = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayınızı Girin : ");
        number = input.nextInt();

        System.out.print("Kuvvetini Girin : ");
        power = input.nextInt();

        for (int i = 1; i <= power; i++) {
            result = result * number;
        }

        System.out.println(number + " Sayısının " + power + ". Kuvveti : " + result);

        input.close();
    }
}
