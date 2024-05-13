
import java.util.ArrayList;

public class Main {
public static void main(String[] args) {
    ArrayList<String> diller = new ArrayList<String>();
    
    diller.add("java");
    diller.add("phyton");
    diller.add("kotlin");
    diller.add("php");
    diller.add("C");
    
    /* for(int i=0;i<diller.size();i++){
        System.out.println(diller.get(i));
    }*/
    for(String s : diller){
        System.out.println(s);//foreach yapısı...
    }
    System.out.println("------------------------");
    
    diller.add(1,"C++");
    for(String s : diller){
        System.out.println(s);//foreach yapısı...
    }
    // linkedlistler arraylistlere göre daha hızlıdır fakat daha fazla yer kaplar...

    
}
    
}
