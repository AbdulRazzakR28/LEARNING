package javaproject;

import java.util.Scanner;

public class galaticarithmetic {

	public static void main(String[] args) 
	{
	        Scanner scan = new Scanner(System.in);
			System.out.println("enter the long values :   ");
			long a = scan.nextLong();
			long b = scan.nextLong();
			//long a = 125678;
			//long b = 9876543210l;
			long res = galaticAddition(a,b);
			System.out.println("print the res value is" +res);
	}
	public static long galaticAddition(long num1,long num2)
	{
		long value = num1+num2;
		return value;
	}

}
