
import java.util.HashMap;

public class Main {
public static void main(String[] args){
    /*
    HashMap Sınıfı
    
    1. Değerleri Key(Anahtar) ve Value(Değer) olarak depolar. Her key'e karşılık
    gelen bir değer bulunur.
    2. Bir anahtar sadece bir kez varolabilir. Ancak bir değer birden fazla olabilir.
    3. Elementleri tıpkı HashSet gibi ekleme sırasına göre depolamaz. (HashSet gibi)   
    */
    
    HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
    
    hashMap.put(10,"Java");
    hashMap.put(20,"Phyton");
    hashMap.put(30,"C");
    hashMap.put(50,"Java");
    hashMap.put(50,"Java"); // Bir değişiklik olmaz sadece bir kez yazdırır...
    
    // hashMap.put(10,"Javascript"); // Üstteki java silinip yerine yazdırılır...
    
    System.out.println(hashMap);
    System.out.println(hashMap.get(20));
    System.out.println(hashMap.get(100)); // Hataya sebep olmaz null değer yazdırır...
    
    System.out.println("*********************************");
    
    for(HashMap.Entry<Integer,String> entry: hashMap.entrySet()){
        System.out.println("Key: " + entry.getKey() + " -------> Deger: " + entry.getValue());
    }
}    
}
