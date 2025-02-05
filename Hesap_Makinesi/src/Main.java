import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("İlk Sayıyı Girin : ");
        double ilkSayi = scan.nextDouble();
        System.out.print("İkinci Sayıyı Girin : ");
        double ikinciSayi = scan.nextDouble();

        while (true) {
            System.out.println("İşlem Seçiniz : ");
            System.out.println("1 - Toplama");
            System.out.println("2 - Çıkarma");
            System.out.println("3 - Çarpma");
            System.out.println("4 - Bölme");
            System.out.println("İşleminiz : ");
            int select = scan.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Toplamları : " + (ilkSayi + ikinciSayi));
                    break;
                case 2:
                    System.out.println("Farkları : " + (ilkSayi - ikinciSayi));
                    break;
                case 3:
                    System.out.println("Çarpımları : " + (ilkSayi * ikinciSayi));
                    break;
                case 4:
                    if (ikinciSayi == 0) {
                        System.out.println("Bölen sayısı 0 olamaz !!");
                    } else {
                        System.out.println("Bölümleri : " + (ilkSayi / ikinciSayi));
                    }
                    break;
                default:
                    System.out.println("Hatalı seçim yaptınız !! 1-4 arasında seçim yapın ");
                    continue;
            }
            break;

        }
        scan.close();
    }
}