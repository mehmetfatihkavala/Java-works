public class Kare extends Sekil{

    private int kenar;

    public Kare(int kenar, String isim) {
        super(isim);
        this.kenar = kenar;
    }
    
    @Override
    public void alan_hesapla() {
        System.out.println(getIsim() + "in alani: " + (kenar*kenar));    
    }
    
}
