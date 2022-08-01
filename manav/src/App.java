import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        new App().calculateProductsFee();
    }

    void calculateProductsFee() {
        float pearKilo = 2.14f;
        float appleKilo = 3.67f;
        float tomatoKilo = 1.11f;
        float bananaKilo = 0.95f;
        float eggplantKilo = 5.00f;
        float sum;

        Scanner input = new Scanner(System.in);

        System.out.print("=========Ürünlermiz===========\n" + "\n" + "Armut : 2,14 TL" + "\n" + "Elma : 3,67 TL" + "\n"
                + "Domates : 1,11 TL" +
                "\n" + "Muz: 0,95 TL" + "\n" + "Patlıcan : 5,00 TL" + "\n" + "==============================\n");

        System.out.println("Almak isteğiniz ürün için kilo belirtiniz\n" + "Almak istemediğiniz ürün için 0 yazınız\n");

        System.out.print("Muz Almak İstermisiniz : ");
        int banana = input.nextInt();

        System.out.print("Armut Almak İstermisiniz : ");
        int pear = input.nextInt();

        System.out.print("Elma Almak İstermisiniz : ");
        int apple = input.nextInt();

        System.out.print("Domates Almak İstermisiniz : ");
        int tomato = input.nextInt();

        System.out.print("Patlıcan Almak İstermisiniz : ");
        int eggplant = input.nextInt();

        sum = banana * bananaKilo + pear * pearKilo + apple * appleKilo + tomato * tomatoKilo + eggplant * eggplantKilo;

        System.out.println("Toplam Borcunuz : " + sum + "TL");

        input.close();
    }
}
