import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin Boyutunu Giriniz : ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Dizini Elemanlarını Giriniz : ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        //20 12 1 15 2
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            //swap
            int temp = numbers[minIndex];
            numbers[minIndex]=numbers[i];
            numbers[i]=temp;
        }
        for (int k = 0;k < n ; k++ ){
            System.out.print(numbers[k] + "  ");
        }

    }
}