import java.util.Scanner;

public class Main {

    public static int ebobBulma(int sayi1 , int sayi2){
        int enb = 1;
        if(sayi1<=sayi2){
            int a = sayi1;
            sayi1 = sayi2;
            sayi2 = a;
        }
        for (int i=1;i<=sayi2;i++){
            if ((sayi1%i==0) && (sayi2%i==0)){
                enb=i;
            }
        }
    return enb;
    }



    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz ...");
        int birinciSayi = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz ...");
        int ikinciSayi = scanner.nextInt();

        System.out.println("İki sayının ebobu:" + ebobBulma(birinciSayi,ikinciSayi));



    }
}

