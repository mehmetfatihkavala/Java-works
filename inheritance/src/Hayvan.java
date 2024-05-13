public class Hayvan {
    private String isim;
    private int kilo;
    private int boy;
    private int bacakSaiysi;
    
    
    public Hayvan(String isim,int kilo,int boy,int bacakSayisi){
        this.isim=isim;
        this.kilo=kilo;
        this.boy=boy;
        this.bacakSaiysi=bacakSayisi;
            
}
    public void yemekYe(){
        System.out.println("Hayvan şu anda yemek yiyor...");
    }
    public void hareketeGeç(int hız){
        System.out.println("Hayvan " + hız +  " ile hareket ediyor...");
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the kilo
     */
    public int getKilo() {
        return kilo;
    }

    /**
     * @param kilo the kilo to set
     */
    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    /**
     * @return the boy
     */
    public int getBoy() {
        return boy;
    }

    /**
     * @param boy the boy to set
     */
    public void setBoy(int boy) {
        this.boy = boy;
    }

    /**
     * @return the bacakSaiysi
     */
    public int getBacakSaiysi() {
        return bacakSaiysi;
    }

    /**
     * @param bacakSaiysi the bacakSaiysi to set
     */
    public void setBacakSaiysi(int bacakSaiysi) {
        this.bacakSaiysi = bacakSaiysi;
    }
    
}
