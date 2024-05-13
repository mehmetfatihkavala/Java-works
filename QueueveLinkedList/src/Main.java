
import java.util.LinkedList;
import java.util.Queue;

public class Main {
public static void main(String[] args){
/*
* Queue(Kuyruk) Interface'ini implemente eden LinkedList Class FIFO
* add(Eleman) ---> Elemanı kuyruğa ekler. Ekleyemezse hata fırlatır...
*** offer(Eleman) ---> Elemanı kuyruğa ekler. Eklerse true döner, ekleyemezse false döner...
* remove() ---> Kuyruğun en başındaki elemanı kuyruktan çıkarır. Kuyruk boşsa hata fırlatır...
*** poll() ---> Kuyruğun en başındaki elemanı kuyruktan çıkarır. Kuyruk boşsa null elemanı döndürür...
* element() ---> Kuyruğun en başındaki elemanı döner. Kuyruk boşsa, hata fırlatır...
*** peek() ---> Kuyruğun en başındaki elemanı döner. Kuyruk boşsa, null referansı döner...
*** isEmpty() ---> Kuyruktan eleman olup olmadığını kontrol eder. Kuyruk boşsa true döner, kuyrukta eleman varsa false döner...    
*/

    Queue<String> queue = new LinkedList<>();
    
    queue.offer("Java");
    queue.offer("Phyton");
    queue.offer("C");
    queue.offer("Javascript");
    
    System.out.println(queue.peek());
    
    System.out.println("*****************************");
    
    for(String s : queue){
        System.out.println(s);
    }
}    
}
