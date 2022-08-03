import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        /*
            Kombinasyon formülü
            C(n,r) = n! / (r! * (n-r)!)
         */

        int n;
        int r;
        int nFact = 1;
        int rFact = 1;
        int nMinesRFact = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("n Sayısını Giriniz : ");
        n = input.nextInt();

        System.out.println("r Sayısının Giriniz : ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            nFact = nFact * i;
        }

        for (int j = 1; j <= r; j++) {
            rFact = rFact * j;
        }

        for (int k = 1; k <= (n-r); k++) {
             nMinesRFact = nMinesRFact * k;
        }

        double result = (nFact) / (rFact * nMinesRFact);

        System.out.println("C(n,r) = " + result);

        input.close();
    }
}
