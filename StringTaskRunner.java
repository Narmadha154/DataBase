package task1;
import java.util.Scanner;
public class StringTaskRunner{
public static void main(String [] args){
System.out.println("Enter the program number:");
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
System.out.println("Enter the string:");
String str=sc.nextLine();
System.out.println("the string is:"+ str);
 switch(number){
     case 1:
        int length=task.findLength(str);
        System.out.println("length of the string:"+length);
        break;
     case 2:
        task.convertIntoArray(str);
        break;
    case 3:
        char character=task.findLastOne(str);
        System.out.println("Last character in the string is:"+character);
        break;
    case 4:
        int count=task.findOccurence(str);
        System.out.println(count);
        break;
    case 5:
        int position=task.findGreatestPosition(str);
        System.out.println("Greatest position of the letter is:"+position);
        break;
    case 6:
       String str=task.printLastFive(str);
       System.out.println("Required String is:"+str1);
       break;
    case 7:
       String string=task.printFirstThree(str);
       System.out.println("Required String is:"+string);
       break;
    case 8:
       String replacedString=task.replaceThree(str);
       System.out.println("Replaced String is:"+replacedString);
       break;
   case 9:
       boolean value=task.checkEnd(str);
       System.out.println("String ends with le:"+value);
       break;
   case 10:
       boolean value2=task.checkStart(str);
       System.out.println("String starts with ent:"+ value2);
       break;    
   case 11:
       String lowercase=task.convertLowerCase(str);
       System.out.println("Required String is:"+lowercase);
       break;
   case 12:
       String uppercase=task.convertUpperCase(str);
       System.out.println("Required String is:"+uppercase);
       break;              
   case 13:
       String reversedString=task.reverseString(str);
       System.out.println("Reversed String is :" +reversedString);
       break;
   case 14:
       System.out.println("Multiple Strings:"+str);
       break;
   case 15:
       String concatenatedString=task.concatenateStrings(str);
       System.out.println("String without space is:"+concatenatedString);
       break;
  default:
      System.out.println("No program");
  }                    
}
}  
