package lab2;
import java.util.*;
public class Datetime {
public static void main(String args[]) {
	Date currentdate=new Date();
	System.out.println(currentdate);
	int year=currentdate.getYear();
	System.out.println(year);
	int month=currentdate.getMonth();
	System.out.println(month);
	int date=currentdate.getDate();
	System.out.println(date);
	int hours=currentdate.getHours();
	System.out.println(hours);
	System.out.println("Year:- "+currentdate.getYear());
	System.out.println("Month:- "+currentdate.getMonth());
	System.out.println("Date:- "+currentdate.getDate());
	System.out.println("Hours:- "+currentdate.getHours());
	System.out.println("Minutes:- "+currentdate.getMinutes());
	System.out.println("Seconds:- "+currentdate.getSeconds());
	


	/*
	Date d1 = new Date(2025, 8, 5);
    Date d2 = new Date();  // Current date
    Date d3 = new Date(2025, 8, 6);

    boolean a = d3.after(d1);
    System.out.println("Date d3 comes after " + "date d2: " + a);

    boolean b = d3.before(d2);
    System.out.println("Date d3 comes before "+"date d2: " + b);
     int c = d1.compareTo(d2);
    System.out.println(c);
    System.out.println("Miliseconds from Jan 1 "+"1970 to date d1 is " + d1.getTime());
    System.out.println("Before setting "+d2);
    d2.setTime(20L);
    System.out.println("After setting "+d2);
	*/
 	}
}
