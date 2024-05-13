import java.util.*;

/**
 * Islemler sınıfı içindeki 4 metodun yazılması istenmektedir
 */
public class Islemler {
    /**
     * Yığıtın elemnlarının sırasını tersine çevirir
     * @param s Tersine çevrilecek yığıt
     * @return Tersine çevirlmiş yığıtı döndürür
     */
    public static <T> Stack<T> tersCevir(Stack<T> s){
        Stack<T> yedek =(Stack<T>) s.clone();
        Stack<T> bos = new Stack<>();
        while(!yedek.isEmpty()){
            bos.push(yedek.pop());}
        return bos;
    }

    /**
     * İki yığıtın eşit olup olmadığını kontrol eder
     * @param s1 Birinci yığıt
     * @param s2 İkinci yığıt
     * @return İki yığıtın eşit olma durumunu döndürür
     */
    public static <T> boolean esit(Stack<T> s1, Stack<T> s2)
    {
        
        if(s1.size() != s2.size()){
            return false;
        }
        Stack<T> yedek1 = (Stack<T>)s1.clone();
        Stack<T> yedek2 = (Stack<T>)s2.clone();
        while(yedek1.isEmpty()){
            if(yedek1.pop().equals(yedek2.pop())){
            return false;
        }
    }
        return true;
    }

    /**
     * Postfix ifadeyi değerlendirir. İşlemler tamsayılar üzerinde gerçekleşir. "7 5 /" işleminin sonucu 1'dir.
     * @param girdi Girdi ifadesi
     * @return İfadenin sonucu
     */
    public static int postfixDegerlendir(String girdi) {
        Stack<Integer> s = new Stack<>();
        String[] semboller = splitToTokens(girdi);
        for(String d : semboller){
            if(d.equals("+") || d.equals("-") || d.equals("*") || d.equals("/") ){
                int d1 = s.pop();
                int d2 = s.pop();
                int sonuc = 0;
                if(d.equals("+"))
                sonuc = d2+d1;
                if(d.equals("-"))
                sonuc = d2-d1;
                if(d.equals("*"))
                sonuc = d2*d1;
                if(d.equals("/"))
                sonuc = d2/d1;
                s.push(sonuc);
            }else{
                s.push(Integer.parseInt(d));
            }
        }
        return s.pop();
    }

    /**
     * Infix ifadeyi postfix'e dönüştürür.
     * @param girdi Infix girdi metni
     * @return Dönüştürülmüş postfix ifade
     */
    public static String infixToPostfix(String girdi){
        //Metodun gövdesini yazınız
        return null;
    }

    /**
     * Infix ifadeyi sembollerine ayıran metod
     * @param girdi Infix ifade
     * @return Sembol dizisi
     */
    private static String[] splitToTokens(String girdi)
    {
        StringTokenizer t=new StringTokenizer(girdi, "+-*/^() ",true);
        List<String> tokenList=new ArrayList<>();
        while (t.hasMoreTokens()){
            String s=t.nextToken().trim();
            if(!s.equals(""))
                tokenList.add(s);
        }
        String [] tl=new String[tokenList.size()];
        tokenList.toArray(tl);
        return tl;
    }
}

