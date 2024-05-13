
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

class Player implements Comparable<Player>{
    private String isim;
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
       return "||| ID: " + id + " ISIM: " + isim + " |||";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.isim);
        hash = 37 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.isim, other.isim);
    }

    @Override
    public int compareTo(Player player) {
        if(this.id < player.id){
            return -1;
        }else if(this.id ==  player.id){
            return 0;
        }
        return 1; 
    }
    
    
        
}

public class Main {
    public static void main(String[] args){
        /* List<String> list = new ArrayList<>();
        
        list.add("Java");
        list.add("Phyton");
        list.add("C");
        list.add("Javascript");
        list.add("Go");
        
        Collections.sort(list); // List sıralama yapan methoddur. sort()!!!
        
        for(String s : list){
            System.out.println(s);
        }*/
        
        List<Player> newList = new ArrayList<>();
        
        newList.add(new Player("Mehmet",29));
        newList.add(new Player("Fatih",07));
        newList.add(new Player("KAVALA",21));
        newList.add(new Player("Serrahim",12));
        newList.add(new Player("Serhat",11));
    
        Player p1 = new Player("Java",01);
        Player p2 = new Player("Phyton",16);
        
        System.out.println(p1.compareTo(p2)); // this.id p1 olur. player.id ise p2 olur...!!!!!
        // Çıktı olarak 1 döner...
        System.out.println("********************************************");
        
        Collections.sort(newList); // Player sınıfında Comparable implement edilmediğinde hata verir!!!!!!!!...
        
        for(Player p : newList){
            System.out.println(p);
        }
    }
    
}
