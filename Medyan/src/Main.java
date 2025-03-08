import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutunu girin : ");
        int size = scanner.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Dizinin " + (i + 1) + ". elemanını girin : ");
            array[i] = scanner.nextInt();
        }
        //Diziyi küçükten büyüğe sıraladık
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Dizinin sıralanmış hali : " + Arrays.toString(array) );
        int ortaNokta=size/2;
        //dizi çift elemanlıdır ortada 2 eleman vardır o 2 elemanın ortalaması medyandır
        if (size%2==0){
            System.out.println("Medyan : " + (array[ortaNokta-1]+array[ortaNokta])/2.0);
        }else {
            System.out.println("Medyan : " + array[ortaNokta]);
        }


    }

}

