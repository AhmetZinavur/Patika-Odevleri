import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        String userName;
        String password;
        String newPassword;
        String choise;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz: ");
        userName = input.nextLine();

        System.out.print("Kullanıcı Parolanızı Giriniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yptınız.");            
        }else{
            System.out.println("Parolanızı Hatalı Girdiniz.");
            System.out.print("Parolanızı Sıfırlamak İster Misiniz? (E/H)? : ");
            
            choise = input.next();
            switch (choise) {
                case "e":
                case "E":
                
                    System.out.print("Yeni Parolanızı Yazınız : ");
                    input.nextLine();
                    newPassword = input.nextLine();

                    do {
                        if(newPassword.equals("java123")){
                            System.out.print("Parola Oluşturulamadı, Farklı Bir Parola Deneyiniz : ");
                            newPassword = input.nextLine();
                        }
                    } while (newPassword.equals("java123"));

                    System.out.println("Parolanız Oluşturuldu.");
                    break;
                case "h":
                case "H":
                    System.out.println("İşleminiz İptal Edildi!!!");
                    break;    
                default:
                    System.out.println("Hatalı Seçim Yaptınız.");
                    break;
            }

            
        }
        input.close();
    }
}
