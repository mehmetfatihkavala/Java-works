class Hayvan{
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String konus(){
        return "Hayvan konuşuyor...";
    }
    
}
class Kedi extends Hayvan{

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " miyavlıyor...";
    } 
}

class Kopek extends Hayvan{

    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " havlıyor...";
    }
}

class At extends Hayvan{

    public At(String isim) {
        super(isim);
    }

   /* @Override
    public String konus() {
        return this.getIsim() + " kişniyor...";
    } */
}

public class Main {
    public static void konustur(Hayvan hayvan){
        System.out.println(hayvan.konus());
    }
    public static void main(String[] args) {
        
        
    //------------------------------------------
       /* Hayvan hayvan1 = new Kedi("Tekir");
        Hayvan hayvan2 = new Kopek("Karabaş");
        Hayvan hayvan3 = new At("Şahbatur");
        System.out.println(hayvan1.konus());
        System.out.println(hayvan2.konus());
        System.out.println(hayvan3.konus()); //Kendi methodu olmadığı için üst sınıftan aldı... */
    //-------------------------------------------
    //Konustur sınıfı açıp kullanılabilir...
      /* konustur(new Kedi("Tekir"));
       konustur(new Kopek("Karabaş"));
       konustur(new At("Şahbatur")); */
    //-------------------------------------------  
    
    //instanceof --> Kullanılan objeler hangi sınıftan öğrenmek için kullanılır...
    Kopek kopek = new Kopek("Karabaş");
    
    if(kopek instanceof Kopek){
        System.out.println("Bu nesne Kopek sınıfından...");
    }
    
    
    
    
}
}
