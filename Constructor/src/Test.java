public class Test {
public static void main(String[] args) {
    Account account = new Account();
    Account account1 = new Account("21","Mehmet Fatih Kavala","mkavala20","2165421",1000);
    Account account2 = account1; // account2 kendini account1'e eşitledi... Aynı objeyi gösteriyorlar...
    
    account1.paraCekme(250);
    account1.paraYatırma(500);
    account1.bilgileriGoster();
    System.out.println("*************************");
    account.bilgileriGoster();//Bilgiler account1 nesnesinde gösterildiği için bilgiler burada gösterilmiyor...
    System.out.println("*************************");
    account2.bilgileriGoster();//account1'e eşitlediği için bilgileri gösteriyor...
    System.out.println("*************************");
    new Account("21","Serhat","sskavala20","212121",1500).bilgileriGoster();//Daha sonra kullanılamaz.Tek satırlık kodlar için kullanılabilir...
                                                                            //Herhangi bir nesneye atama yapmaz...
}




    
}
