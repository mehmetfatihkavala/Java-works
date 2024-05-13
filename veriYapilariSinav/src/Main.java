import java.util.*;

public class Main {
public static void main(String[] args) {
 List<Double> yaricaplar=new ArrayList<>();
 yaricaplar.add(10.0);
 yaricaplar.add(2.5);
 yaricaplar.add(8.0);
 for (double r : yaricaplar) {
 System.out.println(String.format( "r: %.2f alan: %f", r, Math.PI*r*r));
 }
 }

    
}
