public class Main {
public static void main(String[] args){
    MyQueue<Integer> q = new MyQueue<>();
    q.enqueue(5);
    q.enqueue(7);
    q.enqueue(4);
    q.dequeue();
    q.dequeue();
    q.dequeue();
    q.enqueue(6);
    q.print();
    System.out.println("A: " + q.count());//Count metodu eleman sayısını verir...
}    
}
