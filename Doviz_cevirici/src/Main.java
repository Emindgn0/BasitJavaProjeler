import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        final double usd_kuru=35.88;
        final double eur_kuru=37.24;
        final double gbp_kuru=44.62;
        final double jpy_kuru=0.24;
        final double krw_kuru=0.02;
        System.out.println(" 1. US DOLAR - TÜRK LİRASI  " );
        System.out.println(" 2.EURO - TÜRK LİRASI");
        System.out.println(" 3.JAPON YENİ - TÜRK LİRASI");
        System.out.println(" 4.KORE WONU - TÜRK LİRASI");
        System.out.println(" 5.İNGİLİZ STERLİNİ - TÜRK LİRASI");
        System.out.print("İşlem çifti seçiniz  (1-5) : ");
        int select= scanner.nextInt();
        if (select<1 || select>5){
            System.out.println("Geçersiz seçim !! 1 ile 5 arasında seçim yapın !!");
            scanner.close();
            return;
        }

        System.out.print("Miktar giriniz : ");
        double amount = scanner.nextDouble();
        double tutar ;
        switch (select){
            case 1 :
                tutar=usd_kuru*amount;
                System.out.println(amount+" Dolar = " + tutar +" Türk Lirası");
                break;
            case 2:
                tutar=eur_kuru * amount;
                System.out.println(amount+" Euro = " + tutar +" Türk Lirası");
                break;
            case 3:
                tutar = jpy_kuru * amount;
                System.out.println(amount+" Japon Yeni = " + tutar +" Türk Lirası");
                break;
            case 4 :
                tutar = krw_kuru * amount;
                System.out.println(amount+" Kore Wonu = " + tutar +" Türk Lirası");
                break;
            case 5:
                tutar = gbp_kuru*amount;
                System.out.println(amount+" Sterlin = " + tutar +" Türk Lirası");
                break;

        }
        scanner.close();


    }
}