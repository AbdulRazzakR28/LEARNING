package sample2;
import java.util.Scanner;
public class nestedif {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int value = scan.nextInt();
		if(value == 90)
		{
			if(value > 85)
			{
				System.out.println("you are selected for the cse branch!........");
			}
			//System.out.println("you will not eligible for the cse branch!.........");
		}
		//System.out.println("you will not eligible for the cse branch!.........");
	}

}
