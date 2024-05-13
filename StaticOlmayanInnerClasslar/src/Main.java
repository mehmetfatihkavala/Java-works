
import java.util.Scanner;

public class Main {
public static void main(String[] args){
    Matematik.Factorial faktoriyel = new Matematik().new Factorial();
    // **** İç içe classlarda öncelikle üst sınıftan nesne oluşturulmalı...
    Matematik.Alan alan = new Matematik().new Alan();
    Matematik.Asal asal = new Matematik().new Asal();
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Bir sayi giriniz...");
    int sayi = scanner.nextInt();
    if(asal.asal_mi(sayi)){
        System.out.println("Sayi asal sayidir...");
    }else{
        System.out.println("Sayi asal sayi degildir...");
    }
    faktoriyel.faktoriyel();
    alan.daire_alan(5);
    
}    
}
