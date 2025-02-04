import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        Random random =new Random();
        boolean oyunDevam=true;

        while(oyunDevam){
            System.out.println("---Sayı Tahmin Oyunu---");
            int rastgeleSayi=random.nextInt(50)+1;
            int tahmin;
            int denemeSayisi=0;
            boolean tahminDogru=false;
            int kalanHak=5;


            System.out.print(" 1 ile 50 arası bir sayı tuttum. Tahmin et ! ");
            System.out.println("Kalan Hak : " + kalanHak);

            while (kalanHak>0){
                System.out.print(" Tahmininiz : ");
                tahmin= scan.nextInt();
                denemeSayisi++;
                kalanHak--;

                if (tahmin<rastgeleSayi){
                    System.out.print(" Daha büyük bir sayı giriniz ! ");
                    System.out.println("Kalan Hak : " + kalanHak);
                } else if (tahmin>rastgeleSayi) {
                    System.out.print(" Daha küçük bir sayı giriniz !");
                    System.out.println("Kalan Hak : " + kalanHak);
                }else{ tahminDogru=true;
                System.out.print(" Tebrikler " + denemeSayisi + " . tahminde bildiniz !!!");

                    break;

                }
                if (kalanHak==0 && !tahminDogru){
                    System.out.println("Hak Bitti Kaybettiniz. Doğru cevap :" +rastgeleSayi );
                }

            }
            System.out.print("Tekrar oynamak ister misiniz ? (Evet :1 , Hayır :0 ) ");
            int tekrar =scan.nextInt();
            if (tekrar==0){
                oyunDevam = false;
                System.out.println("Oyun bitti !!");
            }
        }

      scan.close();
    }
}