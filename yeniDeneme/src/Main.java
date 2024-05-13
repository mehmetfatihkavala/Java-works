import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner  yeniSayi = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int mukemmelSayi = yeniSayi.nextInt() ;
    int top = 0 ;
    for(int i = 1 ; i < mukemmelSayi ; i++){
        if(mukemmelSayi % i == 0) {
            top=i+top;
        }



    }
        if (top == mukemmelSayi){
            System.out.println( mukemmelSayi + " bir mükemmel sayidir");
        }else{
            System.out.println( mukemmelSayi + " bir mükemmel sayi değildir.");
        }


    }
    }

