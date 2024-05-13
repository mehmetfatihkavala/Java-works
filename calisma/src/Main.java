public class Main {

    public static void main(String[] args) {
    DortIslem dortIslem = new DortIslem();
    int sonuc = dortIslem.Cikar(12,7);
    System.out.println("Sonuç = " + sonuc);
    int sonucTop =  dortIslem.Topla(18,26);
    System.out.println("Sonuç = " + sonucTop);
    int sonucBol = dortIslem.Bol(120,24);
    System.out.println("Sonuç = " + sonucBol);
    int sonucCarp = dortIslem.Carp(35,76);
    System.out.println("Sonuç = " + sonucCarp);

    // Sınıf tanımlamalarının mainde yazdırma kısmı...
    }
}
