public class Main {
public static void main(String[] args){
    Character[] char_dizi = {'J','A','V','A'};
    Integer[] int_dizi = {1,2,3,4,5,6};
    String[] string_dizi = {"Java","Phyton","C++"};
    Ogrenci[] ogrenci_dizi = {new Ogrenci("Mehmet"),new Ogrenci("Fatih"),new Ogrenci("KAVALA")};
    
    /*CharYazdir.yazdir(char_dizi);
    IntegerYazdir.yazdir(int_dizi);     //Generic ile hepsine ayrı sınıf oluşturnaya gerek yoktur...
    StringYazdir.yazdir(string_dizi);
    OgrenciYazdir.yazdir(ogrenci_dizi);*/
    
    YazdirmaSinifi<Character> yazdir_char = new YazdirmaSinifi<Character>();
    YazdirmaSinifi<Integer> yazdir_int = new YazdirmaSinifi<Integer>();         //Generic ile tek sınıfta
    YazdirmaSinifi<String> yazdir_string = new YazdirmaSinifi<String>();        // yazdırıldı...
    YazdirmaSinifi<Ogrenci> yazdir_ogrenci = new YazdirmaSinifi<Ogrenci>();
    
    yazdir_char.yazdir(char_dizi);
    System.out.println("***********************");
    yazdir_int.yazdir(int_dizi);
    System.out.println("***********************");   
    yazdir_string.yazdir(string_dizi);
    System.out.println("***********************");    
    yazdir_ogrenci.yazdir(ogrenci_dizi);
    
}    
}
