public class Main {
public static void main(String[] args) {
    Seyirci seyirci1 = new Seyirci("Mehmet");
    Seyirci seyirci2 = new Seyirci("Fatih");
    
    seyirci1.oyun_seyret();
    System.out.println("Seyirci sayisi: " + Seyirci.getSeyirci_sayisi());   //  |
    System.out.println("Seyirci sayisi: " + seyirci1.getSeyirci_sayisi());  //  |  Static kullanıldığı için hem
    System.out.println("Seyirci sayisi: " + seyirci2.getSeyirci_sayisi());  //  | obje ile hem de sınıf ile ulaşılıt...

    System.out.println(Math.PI);  // Ctrl basıp math kütüphanesine girilebilir...
}
    
}
