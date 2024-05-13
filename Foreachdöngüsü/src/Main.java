public class Main {
public static void main(String[] args){
    
    String[] array={"elma","armut","ayva"};
    int[] array2 = {1,2,3,4,5,6};
    Deneme[] array3 = {new Deneme("Mehmet"),new Deneme("Fatih"),new Deneme("KAVALA")};
    
    for(Deneme d : array3){
        d.yazdir();
    }
    
    for(int i : array2){
        System.out.println(i);
    }
    
    for(String a : array){
        System.out.println(a);
    }
}    
}
