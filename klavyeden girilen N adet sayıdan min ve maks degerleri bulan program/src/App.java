import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int N;
        int num;
        int min = 1;
        int max = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç Adet Sayı Karşılaştıracaksınız? : ");
        N = input.nextInt();


        for (int i = 1; i <= N; i++) {
            System.out.print(i + ". Sayıyı Girin : ");
            num = input.nextInt();

            if (i == 1) {
                min = num;
                max = num;
            }
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Girdiğiniz En Büyük Sayı : " + max);
        System.out.println("Girdiğiniz En Küçük Sayı : " + min);
    }
}
