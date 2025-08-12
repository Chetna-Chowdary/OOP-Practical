package lab3;
import java.util.*;
public class palindromestring {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string");
		String str=sc.nextLine();
		
		
		 String reversed = new StringBuilder(str).reverse().toString();

		if(str.equals(reversed)) {
			System.out.println("Is a Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

}

//StringBuilder sb = new StringBuilder(str);
//sb.reverse();                              
//String reversed = sb.toString();           

                            

