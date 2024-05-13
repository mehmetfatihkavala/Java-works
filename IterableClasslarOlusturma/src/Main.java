public class Main {
public static void main(String[] args){
    String[] kanallar ={"Alem FM","Kral Pop","Radyo Viva","Metro FM","Radyo 21"};
    
    Radyo radyo = new Radyo(kanallar);
    
    for(String s : radyo){
        System.out.println(s);
    }
}    
}
