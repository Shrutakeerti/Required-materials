import java.util.*;
public class calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a operator");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        char move=sc.next.charAt(o);
        switch(move)
        { 
            case '+':
            c=a+b;
            break;
            case '-':
            c=a-b;
            break;
            case '*':
            c= a*b;
            break;
            case '/':
            c=a/b;
            break;
            System.out.println("Invalid Operator");
        }

    } 
    
}
