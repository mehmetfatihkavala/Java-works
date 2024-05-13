import java.util.Scanner;

public class Atm {

public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    Login login = new Login("mehmetfatihkavala",212121,"25462186","mkavala20");
    Hesap hesap = new Hesap();
    
    hesap.setBakiye(2500);
    
    String islemler = "1.BAKİYE SORGULAMA\n"
            + "2.PARA YATIRMA\n"
            + "3.PARA ÇEKME\n"
            + "q. ÇIKIŞ\n"
            +"***************************";
    
    while(login.giris()==true){
        while(true){
        System.out.println("***************************");
        System.out.println(islemler);
        String islem = scanner.nextLine();
        System.out.println("***************************");

        if(islem.equals("1")){
            System.out.println("GÜNCEL BAKİYENİZ: " + hesap.getBakiye());
        }
        if(islem.equals("2")){
            hesap.paraYatırma();
        }
        if(islem.equals("3")){
            hesap.paraCekme();
        }
        if(islem.equals("q")){
            System.out.println("ÇIKIŞ YAPILIYOR...");
            break;
        }
        }
        break;
    }
}




    
}
