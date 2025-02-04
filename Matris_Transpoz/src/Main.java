import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // İlk matrisi alalım
        System.out.print("Birinci matrisin Satır Sayısını Giriniz: ");
        int satir1 = scanner.nextInt();
        System.out.print("Birinci matrisin Sütun Sayısını Giriniz: ");
        int sutun1 = scanner.nextInt();

        int[][] matrix1 = new int[satir1][sutun1];

        System.out.println("Birinci Matrisin Elemanlarını Giriniz:");
        for (int i = 0; i < satir1; i++) {
            for (int j = 0; j < sutun1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Birinci Matris:");
        printMatrix(matrix1);


        System.out.print("İkinci matrisin Satır Sayısını Giriniz: ");
        int satir2 = scanner.nextInt();
        System.out.print("İkinci matrisin Sütun Sayısını Giriniz: ");
        int sutun2 = scanner.nextInt();

        int[][] matrix2 = new int[satir2][sutun2];

        System.out.println("İkinci Matrisin Elemanlarını Giriniz:");
        for (int i = 0; i < satir2; i++) {
            for (int j = 0; j < sutun2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        System.out.println("İkinci Matris:");
        printMatrix(matrix2);

        // Matris toplamı
        if (satir1 == satir2 && sutun1 == sutun2) {
            int[][] sum = addMatrices(matrix1, matrix2);
            System.out.println("Matris Toplamı:");
            printMatrix(sum);
        } else {
            System.out.println("Matris boyutları uyuşmuyor, toplama yapılamaz.");
        }
    }

    // Matrisleri ekrana yazdıran fonksiyon
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // İki matrisin toplamını hesaplayan fonksiyon
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int satir = matrix1.length;
        int sutun = matrix1[0].length;
        int[][] sum = new int[satir][sutun];

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum;
    }
}