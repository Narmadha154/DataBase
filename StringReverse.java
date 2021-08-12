import java.util.Scanner;
public class StringReverse{
public static void main(String [] args){
System.out.println("Enter the string:");
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
System.out.println("The string is:" +str);
char [] ch=str.toCharArray();
int length=str.length();
int j=length-1;
for(int i=0;i<length;i++){
ch[i]=ch[j];
j--;
}
for(char c:ch){
System.out.println(c);
}
}
}
