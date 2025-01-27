import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Bir Sayı Girin : ");
        int number = input.nextInt();
        int temp = number;
        int reverseNumber=0;
        int originalNumber = number;
        int digitCount=0;
        // girilen sayının tersini bulduğumuz kısım
        while (number !=0){
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number = number / 10 ;
        }
        // sayının tersi ile kendisini karşılaştırıyoruz eşitse palindromik eşit değilse palindromik değil
        if (reverseNumber == originalNumber)
            System.out.println( originalNumber + " Sayısı Palindromik bir Sayıdır !" );
        else {
            System.out.println( originalNumber + " Sayısı Palindromik bir Sayı Değildir !");
        }
        // kaç basamaklı olduğunu bulduğumuz kısım
        do {
            temp=temp/10;
            digitCount++;
        }while (temp!=0);
        System.out.println(originalNumber + " " + "Sayısı" + " " + digitCount + " " +  "Basamaklıdır !");
        //Sayının tek mi çift mi olduğunu sorguladığımız kısım
        if (originalNumber /2 ==0)
            System.out.println(originalNumber + " " + "Sayısı Çifttir !");
        else{
            System.out.println(originalNumber + " " + "Sayısı Tektir !");
        }
    }
}