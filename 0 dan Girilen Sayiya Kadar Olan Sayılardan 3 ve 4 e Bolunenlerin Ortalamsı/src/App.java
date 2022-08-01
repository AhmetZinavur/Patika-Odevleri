import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int number;
        int count = 0;
        int sum = 0;
        int avg;

        Scanner input = new Scanner(System.in);

        System.out.println("Hangi Sayıya Kadar Ortalama Alınsın : ");
        number = input.nextInt();

        for (int i = 0; i < number; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                sum += i;
                count++;
            }
        }
        avg = sum / count;

        System.out.println("Ortalama : " + avg);
    }
}
