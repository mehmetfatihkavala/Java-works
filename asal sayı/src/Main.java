import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     Scanner number= new Scanner(System.in);
     int sayac=0;
     System.out.print("bir sayi gir:");
     int sayi = number.nextInt();
     for (int i=1; i<=25 ;i++){
         int kalan = sayi % i ;
         if (kalan == 0){
             sayac++;
         }

     }

     if (sayac>2){
         System.out.println("Sayi asal sayi degildir.");
     }else{
         System.out.println("Sayi asal sayidir.");
     }
    }
}