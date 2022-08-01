import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int number1;
        int number2;
        int select;

        Scanner input = new Scanner(System.in);
        System.out.println("Yapmak İstediğiniz İşlemi Seçiniz.");
        System.out.println("1-Toplama 2-Çıkarma 3-Çarpma 4-Bölme");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();

        System.out.print("İlk Sayıyı Gİriniz : ");
        number1 = input.nextInt();

        System.out.print("İkinci Sayıyı Gİriniz : ");
        number2 = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("İki Sayının Toplam : " + (number1 + number2));
                break;

            case 2:
                System.out.println("İki Sayının Farkı : " + (number1 - number2));
                break;
            case 3:
                System.out.println("İki sayının Çarpımı : " + (number1 * number2));
                break;
            case 4:
                if(number2 != 0)
                    System.out.println("İlk Sayının İkinci Sayıya Bölümü : " + (number1 / number2));
                else
                    System.out.println("İkinci Sayı Sıfır Olamaz!!!");
                break;
            default:
                System.out.println("Yanlış Bir Seçim Yaptınız.");
                break;
        }
        input.close();
    }
}
