import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz:");
        String metin = scanner.nextLine();

        int kelimeSayisi = kelimeSay(metin);
        int harfSayisi = harfSay(metin);
        int cumleSayisi = cumleSay(metin);

        System.out.println("Toplam Kelime Sayısı: " + kelimeSayisi);
        System.out.println("Toplam Harf Sayısı: " + harfSayisi);
        System.out.println("Toplam Cümle Sayısı: " + cumleSayisi);
    }
    public static int kelimeSay(String metin) {
        if (metin == null || metin.isEmpty()) {
            return 0;
        }
        String[] kelimeler = metin.split("\\s+"); // Boşluklara göre kelimeleri ayırmaya yarar
        return kelimeler.length;
    }

    public static int harfSay(String metin) {
        if (metin == null || metin.isEmpty()) {
            return 0;
        }
        return metin.replaceAll("[^a-zA-ZğüşıöçĞÜŞİÖÇ]", "").length(); // Sadece harfleri sayar
    }

    public static int cumleSay(String metin) {
        if (metin == null || metin.isEmpty()) {
            return 0;
        }
        String[] cumleler = metin.split("[.!?]"); // Nokta, ünlem ve soru işaretine göre cümleleri ayırır
        return cumleler.length;
    }
}