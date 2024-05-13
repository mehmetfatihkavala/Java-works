import java.util.Scanner;

public class Hesap {
private double bakiye;
Scanner scanner= new Scanner(System.in);

    

    public void paraCekme(){
        System.out.println("ÇEKMEK İSTEDİĞİNİZ MİKTARI GİRİNİZ:");
        double miktar=scanner.nextDouble();
        if(miktar>bakiye){
            System.out.println("Bakiyeniz yetersiz...\n Bakiyeniz:" + bakiye);
        }
        else if(miktar>1500){
            System.out.println("Bir günde en fazla 1500 tl çekebilirsiniz...");
        }else{
            bakiye=bakiye-miktar;
            System.out.println("Yeni bakiyeniz:" + bakiye);
        }
    }
    public void paraYatırma(){
        System.out.println("YATIRMAK İSTEDİĞİNİZ MİKTARI GİRİNİZ:");
        double miktar = scanner.nextDouble();
        bakiye = bakiye + miktar;
        System.out.println("Yeni bakiyeniz:" + bakiye);
    }
    
    
    
    
    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

}
