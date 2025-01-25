import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int sayi1,sayi2;
        //Alınan 1.sayının 0 kontrolü
        do {
            System.out.print("1.Sayıyı giriniz : ");
            sayi1=scanner.nextInt();
            if (sayi1==0){
                System.out.println("0 Girilmez başka bir sayı girin !!");
            }
        } while(sayi1==0); // 0 ise yeniden sayı istenir
        //Alınan 2.sayının 0 kontrolü
        do {
            System.out.print("2.Sayıyı giriniz : ");
            sayi2=scanner.nextInt();
            if (sayi2==0) {
                System.out.println("0 Girilmez başka bir sayı girin !!");
            }
        }while(sayi2==0);// 0 ise yeniden sayı istenir

        //ebob hesaplama
        int n = Math.min(sayi1,sayi2);//küçük olan sayıyı bulup n'e atadık
        int ebob=1; // her sayıynın böleni 1 olduğu için başlangıç değerimiz 1
        for (int i = 1; i <=n ; i++) {
                if (sayi1%i==0 && sayi2%i==0){
                    ebob=i;
                }
        }
        //ekok hesaplama
        int ekok=(sayi1*sayi2)/ebob;

        System.out.println("Sayıların Ebob'u : " + ebob);
        System.out.println("Sayıların Ekok'u : "+ ekok);

    }

}
