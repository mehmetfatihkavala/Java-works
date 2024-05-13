public class Kopek extends Hayvan {
private int disSayisi;

public Kopek(String isim,int kilo,int boy,int ayakSayisi,int disSayisi){
    
    super(isim,kilo,boy,ayakSayisi);
    this.disSayisi=disSayisi;
    
}
public void hareketeGeç(int hız){
        System.out.println("Kopek " + hız +  " ile hareket ediyor...");
    }
public void kos(int hiz){
    System.out.println("Kopek kosuyor...");
    hareketeGeç(hiz); //super.hareketeGeç(hiz) olarakta kullanılır ama bu kullanım daha iyi...
}

    /**
     * @return the disSayisi
     */
    public int getDisSayisi() {
        return disSayisi;
    }

    /**
     * @param disSayisi the disSayisi to set
     */
    public void setDisSayisi(int disSayisi) {
        this.disSayisi = disSayisi;
    }


}
