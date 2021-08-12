import java.util.Scanner;
public class Count{
public static void main(String [] args){
int count=0;
System.out.println("Enter the string:");
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
System.out.println("The string is:" +str);
int length=str.length();
System.out.println("Enter the letter:");
char letter=sc.next().charAt(0);
for(int i=0;i<length;i++){
if(str.charAt(i)==letter){
count++;
}
}
System.out.println(count);
}
}
