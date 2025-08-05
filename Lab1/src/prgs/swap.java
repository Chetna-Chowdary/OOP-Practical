package prgs;

import java.util.Scanner;

public class swap {
	public static void main(String[] args) {
		
		int tom_bags=3;
		int jerry_bags=5;
		
		System.out.println("Before Swapping");
		System.out.println("Jerrys bag "+jerry_bags+" apples");
		System.out.println("Toms bag "+tom_bags+" apples");
		
		int temp=jerry_bags;
		jerry_bags=tom_bags;
		tom_bags=temp;
		
		System.out.println("After Swapping");
		System.out.println("Jerrys bag "+jerry_bags+" apples");
		System.out.println("Toms bag "+tom_bags+" apples");
		
		
		
		
		
	}
}
