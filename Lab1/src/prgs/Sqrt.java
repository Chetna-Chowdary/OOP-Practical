package prgs;
import java.util.*;
public class Sqrt {
	public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Square roots of numbers from 1 to " + n + ":");
        
        for (int i = 1; i <= n; i++) {
            double sqrt = Math.sqrt(i);
            System.out.printf("√%d = %.3f\n", i, sqrt);
        }
    }
}


