import java.util.Random;
import java.util.Scanner;

public class App {
	
	int guessRight = 3;
	int randomNumber;
	int inputNumber;
	
	
	public static void main(String[] args) {

		App game = new App();
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();

		game.randomNumber = random.nextInt(10);

		while (game.guessRight != 0) {
			
			System.out.print("Tahmininizi Girin : ");
			game.inputNumber = input.nextInt();
			
			if (game.inputNumber < game.randomNumber) {
				System.out.println("Girdiğiniz Sayı Hafızadaki Sayıdan Küçük.");
				System.out.println("Kalan Hakkınız " + ((game.guessRight--) - 1));
				
			}else if (game.inputNumber > game.randomNumber) {
				System.out.println("Girdiğiniz Sayı Hafızadaki Sayıdan Büyük.");
				System.out.println("Kalan Hakkınız " + ((game.guessRight--) - 1));
				
			} else {
				System.out.println("Sayıyı Doğru Tahmin Ettiniz.");
				break;
			}
		}
		
		if(game.guessRight == 0) {
			System.out.println("Tahmin Hakkınız Bitti, Kaybettiniz");
		}else {
			System.out.println("Kazandınız.");
		}
	}
}