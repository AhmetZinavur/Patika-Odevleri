import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        new App().calculateTax();

    }

    void calculateTax() {

        double amountToBePaid;
        double taxRateOne = 1.18;
        double taxRateTwo = 1.08;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Kdv'siz Tutarı Giriniz: ");
        amountToBePaid = input.nextDouble();

        if (amountToBePaid > 0 && amountToBePaid < 1000) {
            double tax = amountToBePaid * taxRateOne - amountToBePaid;
            System.out.println("KDV Miktarı : " + tax + "\n" + "Tutarın Kdv'li Hali : " + (amountToBePaid + tax));
            
        } else if (amountToBePaid >= 1000) {
            double tax = amountToBePaid * taxRateTwo - amountToBePaid;
            System.out.println("KDV Miktarı : " + tax + "\n" + "Tutarın Kdv'li Hali : " + (amountToBePaid + tax));
        }

        input.close();
    }

}
