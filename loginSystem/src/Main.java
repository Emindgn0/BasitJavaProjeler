import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String correctuserName = "admin";
        String correctuserPin = "1234";

        Scanner scanner = new Scanner(System.in);

        System.out.println("---Kullanıcı Girişi---");

        System.out.print("Kullanıcı Adı : ");
        String userName = scanner.nextLine();

        System.out.print("Kullanıcı Pin : ");

        String userPin = scanner.nextLine();

        if (userName.equals(correctuserName) && (userPin.equals(correctuserPin))) {
            System.out.println("Giriş Başarılı");

        } else System.out.println("Yeniden Deneyin");

        scanner.close();
    }

}