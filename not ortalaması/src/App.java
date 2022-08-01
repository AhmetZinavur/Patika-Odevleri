import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int matematik;
		int fizik;
		int kimya;
		int turkce;
		int tarih;
		int muzik;

		Scanner input = new Scanner(System.in);

		System.out.print("Matematik Notunzu Giriniz : ");
		matematik = input.nextInt();

		System.out.print("Fizik Notunzu Giriniz : ");
		fizik = input.nextInt();

		System.out.print("kimya Notunzu Giriniz : ");
		kimya = input.nextInt();

		System.out.print("Türkçe Notunzu Giriniz : ");
		turkce = input.nextInt();

		System.out.print("Tarih Notunzu Giriniz : ");
		tarih = input.nextInt();

		System.out.print("Müzik Notunzu Giriniz : ");
		muzik = input.nextInt();

		double avarage = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;

		String result = avarage >= 60 ? "Geçti" : "Kaldı";
		
		System.out.println(result);
		
		input.close();
    }
}
