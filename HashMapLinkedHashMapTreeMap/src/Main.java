
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    
public static void mapYazdir(Map<Integer,String> map){
    
    map.put(10,"C");
    map.put(20,"Java");
    map.put(35, "Phyton");
    map.put(50, "Javascript");
    map.put(25, "Kotlin");
     
   /* for(Map.Entry<Integer,String> entry : map.entrySet()){
        System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
    } */
   
   /* for(Integer key : map.keySet()){
       System.out.println("Key: " + key + " Value: " + map.get(key));
   } // Bu şekilde de yazdırılabilir...
    */ 
   Collection<String> values = map.values();
   for(String s : values){
       System.out.println("Deger: " + s); // Sadece değerleri döndürür...
   }
        
}
public static void main(String[] args){
    
    Map<Integer,String> hashMap = new HashMap<Integer,String>(); 
    Map<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
    Map<Integer,String> treeMap = new TreeMap<Integer,String>();
    
    System.out.println("**********************");
    mapYazdir(hashMap); // SIRASIZ bir şekilde yazdırır...
    System.out.println("**********************");
    mapYazdir(linkedHashMap); // EKLENDİĞİ sırayla yazdırır...
    System.out.println("**********************");
    mapYazdir(treeMap); // KÜÇÜKTEN BÜYÜĞE doğru yazdırır...
}    
}
