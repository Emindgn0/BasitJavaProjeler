import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("- Max 10 girin - size: ");
        int size = sc.nextInt();
        while (size > 10) {
            System.out.println("10'dan büyük girdiniz yeniden girin: ");
            size = sc.nextInt();
        }

        System.out.println("Aranan sayıyı girin: ");
        int arananSayi = sc.nextInt();

        int[] dizi1 = new int[size];
        int[] dizi2 = new int[size];
        int[] dizi3 = new int[size];
        int[] birlesikDizi = new int[3 * size];

        // Dizileri kullanıcıdan alma
        diziAl("1. dizinin", dizi1, sc);
        diziAl("2. dizinin", dizi2, sc);
        diziAl("3. dizinin", dizi3, sc);

        // Dizileri büyükten küçüğe sıralama
        sirala(dizi1);
        sirala(dizi2);
        sirala(dizi3);

        // Dizileri birleştirme
        birlestir(dizi1, dizi2, dizi3, birlesikDizi);

        // Birleştirilmiş diziyi tekrar sıralama
        sirala(birlesikDizi);

        System.out.println("Sıralanmış Dizi 1: " + diziYazdir(dizi1));
        System.out.println("Sıralanmış Dizi 2: " + diziYazdir(dizi2));
        System.out.println("Sıralanmış Dizi 3: " + diziYazdir(dizi3));
        System.out.println("Birleştirilmiş ve Sıralanmış Dizi: " + diziYazdir(birlesikDizi));

        if (sayiVarMi(birlesikDizi, arananSayi)) {
            System.out.println(arananSayi + " Sayısı dizide bulunuyor ");
        } else {
            System.out.println(arananSayi + " Sayısı dizide bulunmuyor ");
        }

        sc.close();
    }

    // Dizi elemanlarını kullanıcıdan alan metod
    public static void diziAl(String diziAdi, int[] dizi, Scanner sc) {
        System.out.println(diziAdi + " elemanlarını girin:");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i + 1) + ". elemanı girin: ");
            dizi[i] = sc.nextInt();
        }
    }

    // Diziyi küçükten büyüğe  sıralayan metod (Bubble Sort)
    public static void sirala(int[] dizi) {
        for (int i = 0; i < dizi.length - 1; i++) {
            for (int j = 0; j < dizi.length - i - 1; j++) {
                if (dizi[j] > dizi[j + 1]) {
                    // Elemanları yer değiştirme
                    int temp = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = temp;
                }
            }
        }
    }

    public static boolean sayiVarMi(int[] dizi, int aranan) {
        for (int sayi : dizi) {
            if (sayi == aranan) {
                return true;
            }
        }
        return false;

    }

    // Üç diziyi birleştiren metod
    public static void birlestir(int[] d1, int[] d2, int[] d3, int[] hedef) {
        int index = 0;

        // 1. diziyi kopyala
        for (int i = 0; i < d1.length; i++) {
            hedef[index++] = d1[i];
        }

        // 2. diziyi kopyala
        for (int i = 0; i < d2.length; i++) {
            hedef[index++] = d2[i];
        }

        // 3. diziyi kopyala
        for (int i = 0; i < d3.length; i++) {
            hedef[index++] = d3[i];
        }
    }

    // Diziyi string olarak yazdırmak için metod
    public static String diziYazdir(int[] dizi) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < dizi.length; i++) {
            sb.append(dizi[i]);
            if (i < dizi.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}