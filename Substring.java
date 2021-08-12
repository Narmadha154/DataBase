import java.util.Scanner;
public class Substring{
public static void main(String [] args){
System.out.println("Enter the string:");
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
System.out.println("The string is:" +str);
int length=str.length();
String str1=str.substring(4,length);
System.out.println("Required String is:"+str1);
}
}
