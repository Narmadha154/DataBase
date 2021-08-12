import java.util.Scanner;
public class ConvertUpperCase{
public static void main(String [] args){
System.out.println("Enter the string:");
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
System.out.println("The string is:" +str);
String str1=str.toUpperCase();
System.out.println("Converted string :"+str1);
}
}