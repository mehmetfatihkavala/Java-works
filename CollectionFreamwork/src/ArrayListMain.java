
import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
public static void main(String[] args){
    
    //ArrayList<String> arrayList = new ArrayList<String>();
    List<String> list = new ArrayList<String>();
    
    list.add("Java");
    list.add("Phyton");
    list.add("C");
    
    System.out.println(list.get(0));
    System.out.println(list.get(2));
    
    System.out.println("***********************");
    
    for(String s : list){
        System.out.println(s);
    }
    System.out.println("***********************");
    
    list.remove(1);
    for(String s : list){
        System.out.println(s);
    }
    System.out.println("***********************");
    list.remove("Java");
    for(String s : list){
        System.out.println(s);
    }
}    
}
