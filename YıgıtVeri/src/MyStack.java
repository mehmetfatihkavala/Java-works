public class MyStack<T>{
    private int es;
    private T[] dizi;
    
 public MyStack() {
    dizi=(T[]) new Object[10];
    es=0;
 }
 public MyStack(int es) {
    dizi=(T[]) new Object[es];
}
public void push(T eleman){
    if(es == dizi.length){
            throw new RuntimeException("Stack overflow");
    }
    dizi[es++] = eleman;
}
public T pop() {
    if(es == 0){
            throw new RuntimeException("Stack underflow");
    }
    return dizi[--es];
}
public T peek() {
    if(es == 0){
        throw new RuntimeException("Stack underflow");
    }
    return dizi[--es];
}
public boolean isEmpty(){
    return es == 0;
}
public void print() {
    for(int i = es-1; i>=0; i--){
        System.out.println(dizi[i]);
    }
}
 
}
