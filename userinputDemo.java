import java.util.*;  
class userinputDemo  
{  
public static void main(String[] args)  
{  
Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
System.out.print("Enter a string: ");  
String str= sc.nextLine();              //reads string  
System.out.print("You have entered: "+str);             
}  
}  

