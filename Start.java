import java.util.Scanner;
public class Start{
public static void main(String [] args){
System.out.println("Enter the string:");
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
System.out.println("The string is:" +str);
System.out.println(str.startsWith("ent"));
}
}