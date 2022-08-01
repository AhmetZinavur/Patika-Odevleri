import java.util.Scanner;

public class Passanger {
    private int age;
    private int distance;
    private String isRoundTrip;

    private static double PER_KM_FEE = 0.10;
    private static double FOR_UNDER_TWELVE_AGE_DISCOUNT_RATE = 0.50;
    private static double FOR_TWELVE_TO_TWENTYFOUR_AGE_DISCOUNT_RATE = 0.10;
    private static double FOR_SIXTYFIVE_AND_OLDER_AGE_DISCOUNT_RATE = 0.30;
    private static double FOR_ROUND_TRIP_DISCOUNT_RATE = 0.20;
    
    void calculateTicket(){
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi Yazınız : ");
        distance = input.nextInt();

        System.out.print("Yaşınızı Yazınız : ");
        age = input.nextInt();

        if (distance <= 0 || age < 0) {
            System.out.println("Değerler Sıfırdan Küçük Olamaz Bilgileri Tekrar Giriniz.");

            System.out.print("Mesafeyi Yazınız : ");
            distance = input.nextInt();

            System.out.print("Yaşınızı Yazınız : ");
            age = input.nextInt();
        }

        System.out.print("Biletiniz Gidiş/Dönüş Olarak Mı Alacaksınız (E/H)? : ");
        isRoundTrip = input.next();

        double normalFee = distance * Passanger.PER_KM_FEE;        

        switch (isRoundTrip) {
            case "E":
            case "e":
                if (age < 12) {
                    double ageDiscount = normalFee * Passanger.FOR_UNDER_TWELVE_AGE_DISCOUNT_RATE;
                    double discountedFee = normalFee - ageDiscount;
                    double roundTripDiscount = discountedFee * Passanger.FOR_ROUND_TRIP_DISCOUNT_RATE;
                    double total = (discountedFee - roundTripDiscount) * 2;
                    System.out.println("Toplam Tutar : " + total + " TL");
                }
                if (age >= 12 && age <= 24) {
                    double ageDiscount = normalFee * Passanger.FOR_TWELVE_TO_TWENTYFOUR_AGE_DISCOUNT_RATE;
                    double discountedFee = normalFee - ageDiscount;
                    double roundTripDiscount = discountedFee * Passanger.FOR_ROUND_TRIP_DISCOUNT_RATE;
                    double total = (discountedFee - roundTripDiscount) * 2;
                    System.out.println("Toplam Tutar : " + total + " TL");
                }
                if (age >= 65) {
                    double ageDiscount = normalFee * Passanger.FOR_SIXTYFIVE_AND_OLDER_AGE_DISCOUNT_RATE;
                    double discountedFee = normalFee - ageDiscount;
                    double roundTripDiscount = discountedFee * Passanger.FOR_ROUND_TRIP_DISCOUNT_RATE;
                    double total = (discountedFee - roundTripDiscount) * 2;
                    System.out.println("Toplam Tutar : " + total + " TL");
                }                
                break;

            case "H":
            case "h":
                if (age < 12) {
                    double ageDiscount = normalFee * Passanger.FOR_UNDER_TWELVE_AGE_DISCOUNT_RATE;
                    double discountedFee = normalFee - ageDiscount;
                    
                    double total = discountedFee;
                    System.out.println("Toplam Tutar : " + total + " TL");
                }
                if (age >= 12 && age <= 24) {
                    double ageDiscount = normalFee * Passanger.FOR_TWELVE_TO_TWENTYFOUR_AGE_DISCOUNT_RATE;
                    double discountedFee = normalFee - ageDiscount;
                    
                    double total = discountedFee;
                    System.out.println("Toplam Tutar : " + total + " TL");
                }
                if (age >= 65) {
                    double ageDiscount = normalFee * Passanger.FOR_SIXTYFIVE_AND_OLDER_AGE_DISCOUNT_RATE;
                    double discountedFee = normalFee - ageDiscount;
                    
                    double total = discountedFee;
                    System.out.println("Toplam Tutar : " + total + " TL");
                }
                break;

            default:
                System.out.println("Yanlış Seçim Yaptınız!!!");
                break;
        }

        input.close();
    }
}
