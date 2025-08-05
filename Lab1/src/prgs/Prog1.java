package prgs;

import java.util.Scanner;

public class Prog1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float bill=sc.nextFloat();
		float gst=sc.nextFloat();
		float maintainance=sc.nextFloat();
		float gst_tot=bill*(gst/100);
		float tot_bill=bill+gst_tot+maintainance;
		float discount = 0f;
		if(tot_bill>1000) {
		discount=tot_bill*(10f/100);
		}
		else {
		discount=tot_bill*(5f/100);	
		}
		float final_bill=tot_bill-discount;
		System.out.printf("Gst:- %.2f\nMaitainance:- %.2f\nTotal Bill:- %.2f\n",gst_tot,maintainance,final_bill);
		sc.close();
	}

}
