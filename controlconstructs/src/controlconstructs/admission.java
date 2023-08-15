package controlconstructs;
import java.util.Scanner;
public class admission {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter the marks : ");
		int a = scan.nextInt();
		//System.out.println("Enter the marks : ");
		System.out.println("Welcome to Kodnest!.....");
		marks(a);	
	}
	public static void marks(int b)
	{
		if(b>=80)
		{
			System.out.println("welcome to Tech Club!......");
		}
	}

}
