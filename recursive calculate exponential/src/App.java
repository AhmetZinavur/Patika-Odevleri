import java.util.Scanner;

public class App {

    public static int calculateExponential(int base, int power){
        
        if(power == 0){
            return 1;
        }else{
            return base * calculateExponential(base, power-1);
        } 
    }
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Üssünü Almak İstediğniz Sayıyı Yazınız : ");
        int base = input.nextInt();

        System.out.print("Kuvveti Yazınız : ");
        int power = input.nextInt();

        System.out.println(calculateExponential(base, power));
    }
}
