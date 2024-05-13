
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    
public static void listeyi_bastir(LinkedList<String> gidilecek_yerler){
    /*for(String s : gidilecek_yerler){
        System.out.println(s);*/
    
    ListIterator<String> iterator = gidilecek_yerler.listIterator();
    
    while(iterator.hasNext()){
        
        System.out.println(iterator.next());
    
    }
}    
    
public static void main(String[] args) {
    LinkedList<String> gidilecek_yerler = new LinkedList<>();
    
    gidilecek_yerler.add("Yemekhane");
    gidilecek_yerler.add("Okul");
    gidilecek_yerler.add("Kutuphane");
    gidilecek_yerler.add("Durak");
    gidilecek_yerler.add("Yurt");
    
    listeyi_bastir(gidilecek_yerler);
    
}
    
}
