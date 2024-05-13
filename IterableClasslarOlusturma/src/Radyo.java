
import java.util.ArrayList;
import java.util.Iterator;

public class Radyo implements Iterable<String> {

private ArrayList<String> kanallarListesi = new ArrayList<>();

public Radyo(String[] kanallar){
    for(String kanal : kanallar){
        kanallarListesi.add(kanal);
    }
}

    @Override
    public Iterator<String> iterator() {
        
        return kanallarListesi.iterator();
                        
     }
}
