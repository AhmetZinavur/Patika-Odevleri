import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        new App().calculateBodyMassIndex();
    }

    void calculateBodyMassIndex(){

        double height;
        double kilo;
        double bodyMassIndex;

        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden yazınız. Örnek : 1.80 = ");
        height = input.nextDouble();

        System.out.print("Kilonuzu yazınız = ");
        kilo = input.nextInt();

        bodyMassIndex = kilo / (height * height);

        System.out.println("Vücut Kitle Endeksiniz = " + bodyMassIndex);

        input.close();
    }
}
