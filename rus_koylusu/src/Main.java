import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("1.sayıyı girin : ");
        int sayi1=scanner.nextInt();
        System.out.print("2.sayıyı girin : ");
        int sayi2 = scanner.nextInt();
        int kalan =0;
        while (sayi1!=0){
            if (sayi1%2==0){
                sayi1=sayi1/2;
                sayi2=sayi2*2;
            }else {
                kalan = kalan + sayi2;
                sayi1=(sayi1-1)/2;
                sayi2=sayi2*2;
            }
        }

        System.out.println("Sonuç : " +kalan);
    }
}