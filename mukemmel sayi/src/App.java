import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int N;
        int sum = 0;
        int i = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Kontrol Etmek İStediğiniz Sayıyı Giriniz : ");
        N = input.nextInt();

        while (N >= i) {
            i++;

            if (N%i == 0) {

                if(N == i) {                    
                    break;
                }
                System.out.println(i);
                sum += i; 
            }       
        }
        System.out.println("Çarpanların Toplamı : " + (sum));

        if (sum == N) {
            System.out.println("Girdiğiniz Sayı Mükkemmel Sayı!!!");   
        }else{
            System.out.println("Girdiğiniz Sayı Mükkemmel Sayı Değil.");
        }
    }
}
