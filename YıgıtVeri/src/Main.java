public class Main {
public static void main(String[] args){
    MyStack<Integer> s = new MyStack<>();
    s.push(1);
    s.push(21);
    s.push(15);
    s.pop();
    s.push(6);
    s.push(9);
    s.push(4);
    s.pop();
    s.pop();
    s.push(12);
    s.print();
    System.out.println(s.isEmpty());// Dizinin içinin boş olup olmadığını sorgular...
    System.out.println("ilk eleman:" + s.peek());
}    
}
