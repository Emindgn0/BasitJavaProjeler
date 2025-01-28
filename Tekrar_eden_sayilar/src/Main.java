import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin Boyutunu Giriniz : ");
        int size = scanner.nextInt();
        int[] numbers = new int [size];

        System.out.println("Dizinin Elemanlarını Giriniz : ");
        for (int i = 0; i <numbers.length ; i++) {
            System.out.print((i+1) + " . Elemanı Giriniz : ");
            numbers[i] = scanner.nextInt();
        }
        boolean [] checked = new boolean[numbers.length];

        System.out.println("Dizideki Tekrar Eden Sayılar :");

        for (int i = 0; i<numbers.length; i++){
            int count = 1 ;
            if (!checked[i]){
                for (int j = i +1 ; j< numbers.length ; j++){
                    if (numbers[i] == numbers[j]){
                        count++;
                        checked[j]= true;

                    }
                }
            }if (count>1){
                System.out.println(numbers[i] + "(" + count + "kez )");
            }
        }
    }
}