import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Dizinin Boyutunu Giriniz : ");
        int size = scanner.nextInt();
        System.out.print("Aranacak Sayıyı Giriniz : ");
        int istenensayi = scanner.nextInt();
        //Yeni dizi oluşturuldu bu dizi boyutunu kulanıcıdan elemanlarını random alacak (1-100 arası)
        int[] array = new int[size];
        //dizi elemanlarını oluşturuyoruz
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100) + 1;
        }
        //Oluşturulan diziyi kontrol amaçlı yazdırdık
        System.out.println("Oluşturulan Dizi : " + Arrays.toString(array));

        //Binary için dizinin sıralı olması gerekiyor diziyi sıralıyoruz
        Arrays.sort(array);
        System.out.println("Sıralanmış Dizi : " + Arrays.toString(array));
        //Binary Algoritma kısmı
        int lower = 0;
        int upper = size - 1;
        boolean bulundu = false;
        while (lower <= upper) {
            int middle = (lower + upper) / 2;
            if (array[middle] == istenensayi) {
                System.out.println("Aranan Sayı " + istenensayi + " Bulundu !!");
                bulundu = true;
                break;
            } else if (istenensayi < array[middle]) {
                upper = middle - 1;
            } else {
                lower = middle + 1;
            }
        }
        if (!bulundu) {
            System.out.println("Aranan Sayı : " + istenensayi + " Bulunamadı!!");
        }
        scanner.close();
    }
}