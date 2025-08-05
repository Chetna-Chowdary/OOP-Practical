package lab2;

import java.util.*;

public class Strmethods {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		String accept=sc.nextLine();
		System.out.println(accept);
		int strlen=accept.length();
		System.out.println(strlen);
		String strlow=accept.toLowerCase();
		System.out.println(strlow);
		String strupp=accept.toUpperCase();
		System.out.println(strupp);
		String substr=accept.substring(0,3);
		System.out.println(substr);
		String search = sc.nextLine();
		boolean check=accept.contains(search);
		System.out.println(search+" is present -> "+ check);
     

		

		

	}

}
