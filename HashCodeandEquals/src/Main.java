
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Player{
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
    
    
        
}

public class Main {
   public static void main(String[] args){
       
       Set<Player> hashSet = new HashSet<>();
       
       /*hashSet.add("Java");
       hashSet.add("Phyton");
       hashSet.add("C");
       hashSet.add("Javascript");
       
       for(String s : hashSet){
           System.out.println(s);
       }*/
       
       Player player1 = new Player("Mehmet",1);
       Player player2 = new Player("Fatih",2);
       Player player3 = new Player("KAVALA",21);
       Player player4 = new Player("Mehmet",1);
       
       hashSet.add(player1);
       hashSet.add(player2);
       hashSet.add(player3);
       hashSet.add(player4);
       
       for(Player p : hashSet){
           System.out.println(p); //Eğer equals methodu ovveride edilmese player4 ve player1 de yazdırılacaktı!!!...
       }

   }
           
}
