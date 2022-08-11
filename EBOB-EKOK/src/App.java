import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        int ekok = 1;
        int ebob = 1;
        int i = 1;
        int j = 1;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz : ");
        int a = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz : ");
        int b = input.nextInt();

        
        while (i <= Math.min(a, b)) {
            
            if (a%i == 0  && b%i == 0) {               
                ebob = i;
            }
            i++;            
        }
        System.out.println("EBOB : " + ebob);

        while (j <= a * b ) {
            
            if (j%a == 0 && j%b == 0) {
                ekok = j;
            }
            j++;
        }
        System.out.println("EKOK : " + ekok/ebob);

        input.close();
    }
}
