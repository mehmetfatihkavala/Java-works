
import java.util.Scanner;

public class Main {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    String islemler = "Islemler...\n"
                    + "Kare alan hesapla\n"
                    + "Ucgen alan hesapla\n"
                    + "Daire alan hesapla\n"
                    + "Cikis: q ";
    while(true){
        System.out.println(islemler);
        System.out.print("Hangi seklin alanini hesaplamak istiyorsunuz: ");
        String sekil_turu = scanner.nextLine();
        Sekil sekil = null;
        if(sekil_turu.equals("q")){
            System.out.println("Cikis yapiliyor...");
            break;
        }else if(sekil_turu.equals("1")){
            System.out.print("Karenin kenari: ");
            int kenar = scanner.nextInt();
            scanner.nextLine();
            sekil = new Kare(kenar, "Keare1");
            sekil.alan_hesapla(); 
        }else if(sekil_turu.equals("2")){
            System.out.print("Kenar 1: ");
            int kenar1 = scanner.nextInt();
            System.out.print("Kenar 2: ");
            int kenar2 = scanner.nextInt();
            System.out.print("Kenar 3: ");
            int kenar3 = scanner.nextInt();
            scanner.nextLine();
            
            sekil = new Ucgen(kenar1, kenar2, kenar3, "Ucgen1");
            sekil.alan_hesapla();
        }else if(sekil_turu.equals("3")){
            System.out.print("Dairenin yaricapi: ");
            int yaricap = scanner.nextInt();
            scanner.nextLine();
            sekil = new Daire("Daire", yaricap);
            sekil.alan_hesapla();
        }else{
            System.out.println("Gecersiz islem...");
        }
    }
}    
}
