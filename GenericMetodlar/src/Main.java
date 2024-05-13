public class Main {
public static void main(String[] args){
    Character[] char_dizi = {'J','A','V','A'};
    Integer[] int_dizi = {1,2,3,4,5,6};
    String[] string_dizi = {"Java","Phyton","C++"};
    Ogrenci[] ogrenci_dizi = {new Ogrenci("Mehmet"),new Ogrenci("Fatih"),new Ogrenci("KAVALA")};
    
    yazdir(string_dizi);
    yazdir(int_dizi);
    yazdir(char_dizi);
    yazdir(ogrenci_dizi);
}  
public static <E> void yazdir(E[] dizi){
    for(E e : dizi){
        System.out.println(e);
    }
}
}
