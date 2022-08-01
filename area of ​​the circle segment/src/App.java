import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        new App().calculateArea();
    }

    public void calculateArea(){

        int centerAngle;
        int radius;
        float pi = 3.14f;
        double area;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin Yarı Çapını Giriniz : ");
        radius = input.nextInt();

        System.out.print("Merkez Açı Ölçüsünü Giriniz : ");
        centerAngle = input.nextInt();

        area = (pi * Math.pow(radius, 2) * centerAngle) / 360;

        System.out.println();
        System.out.println("Daire Diliminin Alanı : " + area);

        input.close();
    }
}
