public class MakinaMuhendisi implements IMuhendis,ICalisma{
    private boolean askerlik;
    private boolean adli_sicil;

    @Override
    public void calis() {
        System.out.println("Makine muhendisi calisiyor...");
    }

    public MakinaMuhendisi(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }
    
    public void referans_getir(String[] array){
        if(array.length==0){
            System.out.println("Herhangi bir referansım bulunmuyor.");
        }else{
            System.out.println("Referanslarim: ");
            for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
            
        }
    }
    @Override
    public void askerlik_durumu_sorgula() {
        if(askerlik){
            System.out.println("Askerligimi yaptim.");
        }else{
            System.out.println("Askerligimi yapmadim."); 
        }
    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {
        return "Ortalamam: " + derece;
    }

    @Override
    public void adli_sicil_sorgula() {
        if(adli_sicil){
            System.out.println("Adli sicil kaydim bulunuyor.");
        }else{
            System.out.println("Herhangi bir adli sicil kaydim bulunmuyor.");
        }
    }

    @Override
    public void is_tecrubesi(String[] array) {
        if(array.length == 0){
            System.out.println("Herhangi bir is tecrubem bulunmuyor.");
        }else{
        System.out.println("Makina muhendisi olarak su sirketlerde calistim:");
        
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
     }
    }     
}
