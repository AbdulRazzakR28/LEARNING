package com.methods.program;
import java.util.Scanner;
public class program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		int x = scan.nextInt();
		int res = age(x);
		//System.out.println("your age" +res);
	    greet(a);
	    System.out.println("your age" +res);
			
	}
	public static void greet(String a)
	{
		System.out.println("Hello " +a);
	}
    public static int age(int b)
    {
    	//System.out.println("your age" +b);
    	return(b);
    }
    
}