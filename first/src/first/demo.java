package first;
import java.util.Scanner;


public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the integer : ");
		Scanner Scan = new Scanner(System.in);
		int a = Scan.nextInt();
		System.out.println("value of the a"+a);
		System.out.println("Enter the float : ");
		Scanner Scan1=  new Scanner(System.in);
		float b = Scan1.nextFloat();
		System.out.println("value of the b"+b);
		System.out.println("Enter the email : ");
		Scanner scan = new Scanner(System.in);
		String c = Scan1.next();
		System.out.println("value of the c"+c);
		System.out.println("Enter the Full name : ");
		Scanner scan1 = new Scanner(System.in);
		String d = scan1.nextLine();
		System.out.println("value of the "+d);
	}

}
