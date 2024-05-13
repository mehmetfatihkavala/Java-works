public class Main {
    public static void main(String[] args){
        //Sekil sekil = new Sekil("Sekil"); //Abstract classlarda obje oluşturulamaz...
        
        Sekil sekil = new Kare("kare2",12); //Referans alarak kullanılabilir...
        Kare kare1 = new Kare("kare1",5);
        Daire daire1 = new Daire("daire1",7);
    
        sekil.alan_hesapla();
        kare1.alan_hesapla();
        daire1.alan_hesapla();
        kare1.cevre_hesapla();
        /* sekil.cevre_hesapla();// Abstract classı referans aldığı için kare sınıfındaki
                                 diğer metodları alamıyor bu yüzden çalışmıyor... */
    }
}
