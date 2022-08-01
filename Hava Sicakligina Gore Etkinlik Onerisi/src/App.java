import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int weatherHeat;

        Scanner input = new Scanner(System.in);

        System.out.print("Hava Sıcaklığını Giriniz : ");
        weatherHeat = input.nextInt();

        if (weatherHeat > 25) {
            System.out.println("Yüzmeye Gidebilirsiniz.");
        }else{
            if (weatherHeat > 15 && weatherHeat <= 25) {
                System.out.println("Pikniğe Gidebilirsiniz.");
            }
            
            if (weatherHeat > 5 && weatherHeat <=15) {
                System.out.println("Sinemaya Gideblirsiniz.");
            }
            if (weatherHeat <= 5) {
                System.out.println("Kayak Yapmaya Gideblirsiniz.");
            }
        }
        input.close();
    }
}
