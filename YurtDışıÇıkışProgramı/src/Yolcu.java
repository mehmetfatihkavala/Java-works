
import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari{
private int harc;
private boolean siyasiYasak;
private boolean vizeDurumu;

public Yolcu(){
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Yatirdiginiz Harc Bedeli: ");
    this.harc = scanner.nextInt();
    scanner.nextLine();
    
    
    System.out.println("Herhangi bir siyasi yasaginiz bulunuyor mu?");
    String cevap = scanner.nextLine();
    if(cevap.equals("evet")){
        this.siyasiYasak=true;
    }
    else if (cevap.equals("Evet")){
        this.siyasiYasak=true;
    }else{
        this.siyasiYasak=false;
    }
    System.out.println("Vizeniz bulunuyor mu?(Evet Ya da Hayir...): ");
    String cevap2 = scanner.nextLine();
    if(cevap2.equals("evet")){
        this.vizeDurumu=true;
    }
    else if (cevap2.equals("Evet")){
        this.vizeDurumu=true;
    }else{
        this.vizeDurumu=false;
    }
    
}

    @Override
    public boolean yurtdisiHarciKontrol() {
        if(this.harc < 15){
            System.out.println("Lutfen yurtdisi harcinizi tam yatiriniz...");
            return false;
        }else{
            System.out.println("Yurtdisi harci isleminiz tamamlanmistir...");
            return true;
        }

    }

    @Override
    public boolean siyasiYasakKontrol() {
        if (this.siyasiYasak == true){
            System.out.println("Siyasi yasaginiz bulunuyor.Yurt disina cikamazsiniz...");
            return false;
        }else{
            System.out.println("Siyasi yasaginiz bulunmuyor...");
            return true;
        }
    }

    @Override
    public boolean vizeDurumuKontrol() {
        if(this.vizeDurumu==true){
            System.out.println("Vize islemleri tamam...");
            return true;
        }else{
            System.out.println("Vizeniz gideceginiz ulkeye bulunmamaktadir");
            return false;
        }
        }
    }

