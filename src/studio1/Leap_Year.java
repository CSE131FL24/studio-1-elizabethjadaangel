package studio1;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the year?");
		int year = in.nextInt();
		boolean isLeap = (year%4==0)&&(year%100!=0)||(year%400==0);
		System.out.print(year + " is a leap year: "+isLeap);
		// TODO Auto-generated method stub

	}

}
