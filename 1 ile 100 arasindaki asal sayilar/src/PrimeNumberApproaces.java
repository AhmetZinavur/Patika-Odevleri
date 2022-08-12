public class PrimeNumberApproaces {
    public static void main(String[] args) throws Exception {

        //new PrimeNumberApproaces().PrimeNumberApproach_1();
        new PrimeNumberApproaces().PrimeNumberApproach_2();
        
    }
    // Approach_1 
    public void PrimeNumberApproach_1() {
            int i = 0;
            int num = 0;
            // Empty String
            String primeNumbers = "";
    
            for (i = 1; i <= 100; i++) {
                int counter = 0;
                for (num = i; num >= 1; num--) {
                    if (i % num == 0) {
                        counter = counter + 1;
                    }
                }
                if (counter == 2) {
                    // Appended the Prime number to the String
                    primeNumbers = primeNumbers + i + " ";
                }
            }
            System.out.println("Prime numbers from 1 to 100 are :");
            System.out.println(primeNumbers);
    }

    // Approach_2
    public void PrimeNumberApproach_2() {
        
        for (int numberToCheck = 2; numberToCheck <= 100; numberToCheck++) {
            
            boolean isPirme = true;

            for (int factor = 2; factor <= numberToCheck / 2; factor++) {

                if (numberToCheck % factor == 0) {
                    isPirme = false;
                    break;
                }
            }

            if (isPirme) {
                System.out.print(numberToCheck + " ");
            }
        }
        System.out.println();
    }
}

