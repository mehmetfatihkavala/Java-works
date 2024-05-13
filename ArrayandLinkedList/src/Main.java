
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
public static void main(String[] args){
    
    LinkedList<Integer> linked = new LinkedList<Integer>();
    ArrayList<Integer> array = new ArrayList<Integer>();
    
    zamanHesapla("LinkedList", linked);
    zamanHesapla("ArrayList", array);
    System.out.println("*******************************************");
    indexZamanHesapla("LinkedList", linked);
    indexZamanHesapla("ArrayList", array);
    
}  
public static void zamanHesapla(String veriTipi , List<Integer> list){
    //Listin sonuna değer ekleme...
    
    long baslangic;
    long bitis;
    
    
    baslangic = System.currentTimeMillis(); // for başlamadan önceki süreyi verir...
    for(int i=0; i<1000000; i++){
        list.add(i);
    }
    bitis = System.currentTimeMillis(); // for bittikten sonraki süreyi verir...
    
    System.out.println(veriTipi + " ekleme suresi " + (bitis-baslangic) + " ms..."); //Sürekli veri ekleme...   
}

public static void indexZamanHesapla(String veriTipi , List<Integer> list){
    long yeniBaslangic;
    long yeniBitis;
     yeniBaslangic = System.currentTimeMillis(); // for başlamadan önceki süreyi verir...
    for(int i=0; i<1000; i++){
        list.add(0,i);
    }
    yeniBitis = System.currentTimeMillis(); // for bittikten sonraki süreyi verir...
    
    System.out.println(veriTipi + " ekleme suresi " + (yeniBitis-yeniBaslangic) + " ms..."); // Sürekli sıfırıncı indexe veri ekleme...
}


}
