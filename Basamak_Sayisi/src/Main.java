import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int number = scanner.nextInt(); // Kullanıcıdan alınan sayı
        number = Math.abs(number);//negatif sayıları pozitife çevirir (mutlak değer )
        int digitCount=0; // Sayac
        int digitSum=0; // Basamak toplamı
        int tempNumber=number;

        System.out.println("Basamaklar : " );
        do {
            int digit = tempNumber %10; // son basamağı al
            System.out.println(digit + " ");
            digitSum+=digit;
            tempNumber=tempNumber /10; //Sayı her bölündüğünde bir basamak azalır
            digitCount++; //10'a her bölündüğünde sayaç 1 artar
        }while(tempNumber!=0);
        System.out.println("Basamak Sayısı : "+digitCount);
        System.out.println("Basamak Toplamı : "+digitSum);

        //Program girilen sayının 10'a kaç defa bölünebileceğini sayıyor böylece basamak sayısını buluyoruz


    }

}
