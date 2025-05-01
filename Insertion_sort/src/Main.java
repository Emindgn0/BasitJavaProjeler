import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin Boyutunu Giriniz : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Dizini Elemanlarını Giriniz : ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        // Arrays.toString() ile dizi yazdırma
        System.out.println("\nSıralanmamış Dizi:");
        System.out.println(Arrays.toString(array));

        //insetion algoritması
        for (int i = 1; i <size ; i++) {
            int v = array[i];
            int j = i-1;
            while (j>=0 && array[j]>v){
                array[j+1]=array[j];
                j=j-1;
            }
            array[j+1]=v;
        }
        // Arrays.toString() ile dizi yazdırma
        System.out.println("\nSıralanmış Dizi:");
        System.out.println(Arrays.toString(array));


    }
}