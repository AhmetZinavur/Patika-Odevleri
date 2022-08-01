import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int mat;
        int fizik;
        int turkce;
        int kimya;
        int muzik;
        int count = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("\n0'dan küçük 100'den büyük not girilirse, girilen notlar ortalmaya dahil olmaz." +
        " ancak ortalama yine 5 ders üzerinde değerlendirilir.");

        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = input.nextInt();
        if(mat >= 0 && mat <= 100){
            count++;
        }else{
            count++;
            mat = 0;
        }

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = input.nextInt();
        if(fizik >= 0 && fizik <= 100){
            count++;
        }else{
            count++;
            fizik = 0;
        }
        
        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce = input.nextInt();
        if(turkce  >= 0 && turkce <= 100){
            count++;
        }else{
            count++;
            turkce = 0;
        }

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = input.nextInt();
        if(kimya >= 0 && kimya <= 100){
            count++;
        }else{
            count++;
            kimya = 0;
        }

        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik = input.nextInt();
        if(muzik >= 0 && muzik <= 100){
            count++;
        }else{
            count++;
            muzik = 0;
        }

        double avg = (mat + fizik + turkce + kimya +muzik) / count;

        if(avg >= 55 ){
            System.out.println(count + " Dersiniz Var. Ortalamanız : " + avg + " Geçtiniz!!!");
        }else{
            System.out.println(count + " Dersiniz Var. Ortalamanız : " + avg + " Kaldınız!!!");
        }

        input.close();
    }
}
