public class Main {
public static void main(String[] args){
    KapsamSinifi kapsamsinifi = new KapsamSinifi();
    kapsamsinifi.onileCarp(); // Oluşturulan değişkenlerden en yerel olan seçilir. Bu yüzden privateDegisken 
                              //    burada 30 değil de 10 oldu...
    kapsamsinifi.otuzileCarp(); // this. kullanıldığı için sınıfın değişkeni kullanıldı...
                              
                              
}    
}
