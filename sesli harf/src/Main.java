import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner harf = new Scanner(System.in);
        System.out.print("Sesli harf giriniz :");

        String sesli = harf.nextLine();




        switch (sesli){

            case ("A") :
                System.out.println("Kalın sesli");
                break;

            case ("E") :
                System.out.println("Ince sesli");
                break;

            case ("I") :
                System.out.println("Kalın sesli");
                break;

            case ("O") :
                System.out.println("Kalın sesli");
                break;

        }
    }
}
