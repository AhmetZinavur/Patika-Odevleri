import java.util.Scanner;

public class App {

    public static boolean isPrime(int n, int i){

        if (n <= 2) {
            return (n == 2) ? true : false;
        }
        if (n % i == 0){
            return false;
        }
        if (i * i > n){
            return true;
        }
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Kontrol Etmek İstediğniz Sayıyı Giriniz : ");
        int n = input.nextInt();

        if (isPrime(n, 2)) {
            System.out.println(n + " Asal Sayıdır.");
        }else{
            System.out.println(n + " Asal Sayı Değil.");
        }
    }
}
