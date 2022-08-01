import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        new App().calculateArea();
    }

    void calculateArea(){

        double a;
        double b;
        double c;

        Scanner input = new Scanner(System.in);

        System.out.print("A kenarını girniz : ");
        a = input.nextInt();

        System.out.print("B kenarını girniz : ");
        b = input.nextInt();

        System.out.print("C kenarını girniz : ");
        c = input.nextInt();

        double u = (a+b+c) / 2;        

        double Area = u * (u - a) * (u - b) * (u - c);

        System.out.println("Üçgenin Alanı : " + Area);

        input.close();
    }
}
