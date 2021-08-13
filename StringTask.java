package task;
import java.util.Scanner;
public class StringTask{
public static int findLength(){
int length=str.length();
return length;
}
public static void convertIntoArray(){
char [] ch=str.toCharArray();
System.out.println("Character array is:");
  for(char c:ch){
    System.out.println(c);
  }
}
public static char findLastOne(){
int length=this.findLength();
char ch=str.charAt(length-2);
return ch;
}
public static int findOccurence(){
int length=this.findLength();
System.out.println("Enter the letter:");
char letter=sc.next().charAt(0);
  for(int i=0;i<length;i++){
    if(str.charAt(i)==letter){
         count++;
    }
 }
return count;
}
public static int findGreatestPosition(){
int length=this.findLength();
System.out.println("Enter the letter:");
char letter=sc.next().charAt(0);
  for(int i=0;i<length;i++){
    if(str.charAt(i)==letter){
         greatestPosition=i;
    }
 }
 return greatestPosition;
}
public static String printLastFive(){
int length=this.findLength();
String str1=str.substring(length-5,length);
return str1;
}
public static String printFirstThree(){
int length=this.findLength();
String str1=str.substring(0,3);
return str1;
}
public static String replaceThree(){
String str1=str.replace(str.substring(0,3),"xyz");
return str1;
}
public static boolean checkEnd(){
boolean value=str.endsWith("le");
return value;
}
public static boolean checkStart(){
boolean value=str.startsWith("ent");
return value;
}
public static String convertLowerCase(){
String str1=str.toLowerCase();
return str1;
}
public static String convertUpperCase(){
String str1=str.toUpperCase();
return str1;
}
public static String reverseString(){
int length=this.findLength();
char [] ch=new char[length];
for(int i=length-1,j=0;i>=0&j<length;i--,j++){
ch[j]=str.charAt(i);
}
String str1 = String.valueOf(ch);
return str1;
}
public static String concatenateStrings(){
String [] array=str.split(" ");
 for(String a:array){
     System.out.println(a);
 } 
 int length=array.length;
 System.out.println("length is:"+length);
 String newString=array[0];
    for(int i=1;i<length;i++){
     newString=newString.concat(array[i]);
     }
  return newString;
  }
}

















