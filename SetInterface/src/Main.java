
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
public static void main(String[] args){
    //Set Interface ----> HashSet, LinkedHashSet, FreeSet...
    
    /*
    Set Interface'i iplemente eden classlar bir elementten sadece bir tane depolar...
    List Interface'i iplemente eden classlar bir elementten birden fazla depolayabilir...
    */
    
    Set<String> set = new HashSet<String>();
    Set<String> set2 = new LinkedHashSet<String>();
    Set<String> set3 = new TreeSet<String>();
    
    set.add("Java");
    set.add("Phyton");
    set.add("C");
    set.add("C++");
    set.add("Javascript");
    
    set2.add("Java");
    set2.add("Phyton");
    set2.add("C");
    set2.add("C++");
    set2.add("Javascript");
    
    set3.add("Java");
    set3.add("Phyton");
    set3.add("C");
    set3.add("C++");
    set3.add("Javascript");
    
    set3.add("Java"); // Bir şey değişmez çünkü Set implementlerde sadece bir element oluşur...
    
    System.out.println("HashSet**************************");
    for(String s: set){
        System.out.println(s);
    }
    
    System.out.println("LinkedHashSet**************************");
    for(String s: set2){
        System.out.println(s);
    }
    
    System.out.println("TreeSet**************************");
    for(String s: set3){
        System.out.println(s);
    }
    
    System.out.println("**************************");
    // Contains() methodu elementin olup olmadığını sorgular....
    
    System.out.println(set.contains("Go")); // Bulunmadığı için false döner...
    System.out.println(set.contains("Java")); // Bulunduğu için truee döner...
    System.out.println("**************************");
    // isEmpty() methodu içeriğin boş olup olmadığını sorgular...
    
    System.out.println(set.isEmpty()); // Element olduğu için false döner...
    
    System.out.println("**************************");
    // removeAll() methodu iki küme arasındaki farkı bulma...
    Set<String> methodSet = new HashSet<String>();
    methodSet.add("Html");
    methodSet.add("Css");
    methodSet.add("Go");
    methodSet.add("Java");
    methodSet.add("Javascript");
    
    Set<String> fark = new HashSet<String>(methodSet);
    
    System.out.println(fark.removeAll(set)); //Farklı elementleri atar...
    System.out.println(fark);
    
    System.out.println("**************************");
    // retainAll() methodu iki küme arasındaki kesişimi bulur...
    Set<String> kesisim = new LinkedHashSet<String>(methodSet);
    
    System.out.println(kesisim.retainAll(set));
    System.out.println(kesisim);
    
    

    
    
}    
}
