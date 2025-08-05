package lab2;
import java.util.*;
public class Strequals {

    public static void main(String[] args) {
       
    	//String str1 = "Hello";
       // String str2 = "Hello";
    	
    	Scanner sc=new Scanner(System.in);
    	String str1 = sc.nextLine(); 
        String str2 = sc.nextLine();
       
        boolean strequal = str1.equals(str2);
        System.out.println("str1.equals(str2): " + strequal);

      
        boolean strsame = (str1 == str2);
        System.out.println("str1 == str2: " + strsame);
    }
} 
