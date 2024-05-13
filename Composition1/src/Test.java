public class Test {


public static void main(String[] args) {

    Resolution resolution = new Resolution(1920,1080);
    Monitor monitor = new Monitor("VS197DE","Asus","18.5", resolution);
    Kasa kasa = new Kasa("Shadow Blade","Shadow","Temperli Cam");
    Anakart anakart = new Anakart("B250-pro","ASUS", 10,"Windows");
    Bilgisayar pc = new Bilgisayar(anakart, kasa, monitor);
    
    pc.getKasa().bilgisayari_ac();
    pc.getMonitor().monitoru_kapat();
    pc.getAnakart().isletim_sistemi_yukle("Ubuntu 16.04");
    
    
    



    
}
    
}
