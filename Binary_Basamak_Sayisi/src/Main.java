import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir Tam Sayı Girin : ");
        int number=scanner.nextInt();
        int sayac=1;
        while (number>1){
            number=number/2;
            sayac++;
        }
        System.out.println("Girilen Sayının Binary Basamak Sayısı : " + sayac);
    }
}