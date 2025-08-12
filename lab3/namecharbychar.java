package lab3;
import java.util.*;
public class namecharbychar {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        int length=name.length();
        for (int i = 0; i < length; i++) {
            System.out.println(name.charAt(i));
        }
	}

}

