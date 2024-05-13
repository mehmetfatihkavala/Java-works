public class Main {

    public static void main(String[] args) {
    int[] sayilar = new int[]{1,2,5,7,9,0};
    int aranacak = 9;
   int x= 0 ;

    for (int i=0;i< sayilar.length;i++){
        if (sayilar[i]==aranacak){
            x=i;
        }
    }
    if (sayilar[x]==aranacak) {
        System.out.println(aranacak + " sayisi dizide vardir");
    }else {
        System.out.println(aranacak + " sayisi bulunamadi");
    }
    }
}
