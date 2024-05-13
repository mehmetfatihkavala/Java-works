public class Main {
public static void main(String[] args){
    //Imuhendis muhendis1 = new IMuhendis(false,false);// Çalışmıyor interface ile nesne oluturulmuyor.
    //IMuhendis muhendis1 = new PcMuhendisi(false,false); //Çalışıyor.Bu şekilde de yazılabilir. 
    
    
    PcMuhendisi muhendis1 = new PcMuhendisi(false,false);
    muhendis1.askerlik_durumu_sorgula();
    muhendis1.adli_sicil_sorgula();
    System.out.println(muhendis1.mezuniyet_ortalamasi(2.47));
    String[] tecrube = {"Yolsuzlar","blaBla","bAb"};
    
    muhendis1.is_tecrubesi(tecrube);
    System.out.println("******************************");
    //Imuhendis muhendis2 = new MakinaMuhendisi(true,false); // Burada çalışmıyor çünkü ek metod yazıldı...
                                                             // Referans olarak alamıyor....
    MakinaMuhendisi muhendis2 = new MakinaMuhendisi(true,false);
    muhendis2.adli_sicil_sorgula();
    muhendis2.askerlik_durumu_sorgula();
    System.out.println(muhendis2.mezuniyet_ortalamasi(2.31));
    String[] tecrube1 ={};
    muhendis2.is_tecrubesi(tecrube1);
    String[] referans = {"Ali","Veli"};
    muhendis2.referans_getir(referans);
    muhendis2.calis();// Bir sınıfta iki interface implements edilebilir...
    
}    
}
