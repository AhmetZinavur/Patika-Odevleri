import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        new App().calculateTaxiMeterFee();
    }

    void calculateTaxiMeterFee() {

        int kiloMeter;
        int startingFee = 10;
        double perKilometerFee = 2.20;
        int minimumFare = 20;
        final int distance = 20;

        Scanner input = new Scanner(System.in);

        System.out.print("Hoşgeldiniz, Lütfen Gitmek İstediğiniz Mesafeyi Km Olarak Belirtin : ");
        kiloMeter = input.nextInt();

        if (kiloMeter <= distance) {
            System.out.println("20 Km ve Altında Mesafe Ücreti : " + minimumFare + " TL");
        } else if (kiloMeter > distance) {
            System.out.println(
                    "Gidelecek Mesafe " + kiloMeter + " Km Ücreti : " + (startingFee + (perKilometerFee * kiloMeter)) + " TL");
        }

        input.close();
    }
}
