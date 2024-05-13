public class Test {



public static void main(String[] args){

    Araba araba = new Araba();
    araba.setRenk("Siyah");
    araba.setKapilar(4);
    araba.setKursunizi(7);
    araba.setModel("Posat");
    araba.setMotor("16V");
    araba.setTekerlekler(4);


    System.out.println("Arabanın rengi:" + araba.getRenk());
    System.out.println(araba.getKapilar());
    System.out.println(araba.getKursunizi());
    System.out.println(araba.getModel());
    System.out.println(araba.getMotor());
    System.out.println(araba.getTekerlekler());



}
}
