package lab3;
//import java.util.*;
public class vowelsinstr {
public static void main(String args[]) {
	//Scanner sc=new Scanner(System.in);
	//String str=sc.nextLine();
	String str="chetna chaudhary";
	int length=str.length();
	int count=0;
	for(int i=0;i<length;i++) {
		char ch=str.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			count++;
		}
	}
	System.out.println("Count of Vowels in str is "+count);
}
}
