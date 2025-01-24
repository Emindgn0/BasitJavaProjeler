import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("1.kenarı giriniz :");
        int a= scan.nextInt();

        System.out.print("2.kenarı giriniz :");
        int b = scan.nextInt();

        // Hipotenüs formülü( kök içinde (1.kenar uzunluğu karesi + 2.kenar uzunluğu karesi))

        double c  = Math.sqrt((a*a)+(b*b));

        System.out.println("Hipotenüs : " +  c);
          /* Alan formülleri :
         ücgenin cevresi=2u
         u = (a+b+c)/2
         alan = √(u * (u-a) * (u-b) * (u-c))
          */
        double cevre= a+b+c;
        double yariCevre =cevre/2;

        // Gösterimin düzgün olması String.format() methodu kullanıldı
        double alan = Math.sqrt(yariCevre *(yariCevre - a) * (yariCevre - b) * (yariCevre -  c));
        System.out.println("Üçgenin Çevresi : " +String.format("%.2f",cevre));
        System.out.println("Üçgenin Alanı : " + String.format("%.2f",alan));





    }
}
