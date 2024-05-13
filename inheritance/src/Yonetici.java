public class Yonetici extends Calisan{//subclass
    
    private int sorumluKisi;//Ekstra özellik...
    
    
    
    public Yonetici(String isim, int maas, String departman,int sorumluKisi){
        super(isim,maas,departman);//özellikler private olduğu için direkt alamıyoruz...
        this.sorumluKisi=sorumluKisi;
    }
     public void bilgileriGoster(){
        /*System.out.println("İsim: " + getIsim());                  //
        System.out.println("Maaş: " + getMaas());                  // OVERRİDİNG
        System.out.println("Departman: " + getDepartman());*/        // 
        
        super.bilgileriGoster(); // Yukarıda yazılanları direkt miras almak için kullanılır...
        
         System.out.println("Sorumlu kişi sayısı: " + sorumluKisi);
       }
    public void zamYap(int zamMiktarı){
        System.out.println("Çalışanlara " + zamMiktarı + "tl zam yapıldı...");
    }
}
