import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int arrayLenght;
        int arrayElement;
        int count = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Diziniz Kaç Elamanlı Olacak : ");
        arrayLenght = input.nextInt();

        int[] myArray = new int[arrayLenght];

        System.out.println("Dizinin Elemanlarını Giriniz : ");

        for (int i = 0; i < arrayLenght; i++) {
            count++;
            System.out.print(count + ". Eleman : ");
            arrayElement = input.nextInt();
            myArray[i] = arrayElement;
        }

        Arrays.sort(myArray);
        System.out.println("Dizi Sıralanmış Hali.");

        for (int i : myArray) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
