public class Main {
public static void main(String[] args) throws InterruptedException{
    System.out.println("Diyarbakir havalimanina hosgeldiniz...");
    String sartlar = "Yurt Disi Cikis Kurallari...\n" +
                        "Herhangi bir siyasi yasaginizin bulunmamasi gerekiyor...\n" +
                        "15 tl harc bedelinizi tam yatirmaniz gerekiyor...\n " + 
                        "Gideceginiz ulkeye vizeniz bulunmalidir... ";
    String message = "Yurt disi sartlarinin hepsini saglamalisiniz...";
    
    while(true){
        System.out.println("*************************");
        System.out.println(sartlar);
        System.out.println("*************************");
        
        Yolcu yolcu = new Yolcu();
        
        System.out.println("Harc bedeli kontrol ediliyor...");
        Thread.sleep(3000);//Program 3 saniye durdurur...
        if(yolcu.yurtdisiHarciKontrol()==false){
            System.out.println(message);
            continue;//Döngünün en başına gider...
        } 
        System.out.println("Siyasi yasak kontrol ediliyor...");
        Thread.sleep(3000);
        if(yolcu.siyasiYasakKontrol()==false){
            System.out.println(message);
            continue;
        }
        System.out.println("Vize durumu kontrol ediliyor...");
        Thread.sleep(3000);
        if(yolcu.vizeDurumuKontrol()==false){
            System.out.println(message);
            continue;
        }
        System.out.println("Islemleriniz tamamlanmistir...");
        break;
    }
    
}    
}
