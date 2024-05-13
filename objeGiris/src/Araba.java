public class Araba {

    private String renk;
    private int kapilar;
    private int tekerlekler;
    private String motor;
    private String model;
    private int kursunizi;


    public void setRenk(String renk){
        this.renk=renk;
    }
    public String getRenk(){
        return this.renk;
    }

    public int getKapilar() {
        return kapilar;
    }

    public void setKapilar(int kapilar) {
        if (kapilar<1){
            System.out.println("Kapı sayısı sıfırdan küçük olamaz...");
        }
        else {
            this.kapilar = kapilar;
        }
    }

    public int getTekerlekler() {
        return tekerlekler;
    }

    public void setTekerlekler(int tekerlekler) {
        this.tekerlekler = tekerlekler;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getKursunizi() {
        return kursunizi;
    }

    public void setKursunizi(int kursunizi) {
        this.kursunizi = kursunizi;
    }
}
