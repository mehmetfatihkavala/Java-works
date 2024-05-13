import java.util.Stack;
public class StackOrnek {
public static void main(String[] args) {
Stack<Integer> s=new Stack<>();
s.push(1);
s.push(7);
s.push(5);
s.push(21);
int toplam=0;
while (!s.isEmpty()){
toplam+=s.peek();
System.out.println(s.pop());
}
System.out.println("Toplam="+toplam);
}

}

