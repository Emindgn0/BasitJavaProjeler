import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Matrisin Satır Sayısını Giriniz: ");
        int satir = scanner.nextInt();
        System.out.print("Matrisin Sütun Sayısını Giriniz: ");
        int sutun = scanner.nextInt();

        int[][] matrix = new int[satir][sutun];

        System.out.println("Matrisin Elemanlarını Giriniz:");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Orijinal Matris:");
        printMatrix(matrix);


        int[][] transpose = new int[sutun][satir];

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transpoze Matris:");
        printMatrix(transpose);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}