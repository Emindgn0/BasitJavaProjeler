import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int number = scanner.nextInt(); // Kullanıcıdan alınan sayı
        int digitCount=0; // Sayac
        do {
            number=number/10; //Sayı her bölündüğünde bir basamak azalır
            digitCount++; //10'a her bölündüğünde sayaç 1 artar 
        }while(number!=0);
        System.out.println("Basamak Sayısı : "+digitCount);

        //Program girilen sayının 10'a kaç defa bölünebileceğini sayıyor böylece basamak sayısını buluyoruz


        }

    }
