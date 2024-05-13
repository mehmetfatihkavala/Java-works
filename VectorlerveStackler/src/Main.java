
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class Main {
public static void main(String[] args){
    
    Vector<String> vector = new Vector<>();
    
    vector.add("Java");
    vector.add("Phyton");
    vector.add("C");
    vector.add("Javascript");
    vector.add("Go");
    
    System.out.println("ForEach ile yazdirma...");
    
    for(String s : vector){
        System.out.println(s);
    }
    System.out.println("***********************");
    
    System.out.println("Iterator ile yazdirma...");
    ListIterator<String> iterator = vector.listIterator();
    while(iterator.hasNext()){
        System.out.println(iterator.next());
    }
    
    System.out.println("***********************");
    
    System.out.println("Enumeration ile yazdirma...");

    Enumeration<String> enumeration = vector.elements();
    
    while(enumeration.hasMoreElements()){
        System.out.println(enumeration.nextElement());
    }
    System.out.println("***********************");
    
    System.out.println("Ilk eleman: " + vector.firstElement());
    System.out.println("Son eleman: " + vector.lastElement());
    
    System.out.println("***********************");
    
    System.out.println("Stack olusturma ve yazdirma...");
    
    Stack<String> stack = new Stack<>();
    
    stack.push("Java");
    stack.push("Phyton");
    stack.push("Javascript");
    stack.push("C");
    
    Enumeration<String> enume = stack.elements();
    
    while (enume.hasMoreElements()) {
        System.out.println(enume.nextElement());

    }
    System.out.println("***********************");
    //Son giren elemanı çekme...
    System.out.println("Son giren eleman: " + stack.peek());
    
    System.out.println("***********************");
    //Elemanları çıkarma...
    int i = 4;
    while(!stack.empty()){
        
        System.out.println(i + ".Eleman cikariliyor... " + stack.pop());
        i--;
    }

    
}    
}
