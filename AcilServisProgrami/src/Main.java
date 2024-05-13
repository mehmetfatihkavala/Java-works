
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
public static void main(String[] args){
    /*
    Apandisit ---> en yüksek öncelik...
    Yanık ---> orta öncelik...
    Baş Ağrısı ---> düşük öncelik...
    */
    
    Queue<Hasta> acilServis = new PriorityQueue<Hasta>();
    
    acilServis.offer(new Hasta("Murat","Yanik"));
    acilServis.offer(new Hasta("Veli","Apandisit"));
    acilServis.offer(new Hasta("Melih","Apandisit"));
    acilServis.offer(new Hasta("Delil","Bas Agrisi"));
    acilServis.offer(new Hasta("Veli","Yanik"));
    acilServis.offer(new Hasta("Kemal","Yanik"));
    acilServis.offer(new Hasta("Veli","Bas Agrisi"));
    
    int i = 1;
    
    while(!acilServis.isEmpty()){
        System.out.println("**********************");
        System.out.println(i + ". sirada");
        System.out.println(acilServis.poll());
        System.out.println("**********************");
        i++;
    }
    
}
}
