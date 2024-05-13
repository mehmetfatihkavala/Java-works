
import java.util.Scanner;
import java.util.Stack;

public class Main {
public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Bir cumle giriniz: ");
    String cumle = scanner.nextLine();
    
    Stack<Character> stack = new Stack<>();
    
    for(int i=0 ; i< cumle.length() / 2 ; i++){
        stack.push(cumle.charAt(i));
    }
    if(isPalandrome(cumle, stack)){
        System.out.println("Bu cumle Palindromedur...");
    }else{
        System.out.println("Bu cumle Palindrome degildir...");
    }
}
public static boolean isPalandrome(String cumle,Stack<Character> stack){
    for(int i=(cumle.length()/2)+1;i<cumle.length();i++ ){
        if(cumle.charAt(i) != stack.pop()){
            return false;
        }
    }
    
    return true;    
}
}
