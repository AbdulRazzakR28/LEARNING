package gradingsystem;
import java.util.Scanner;
public class score {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("enter the score of he/she :  ");
        int score = scan.nextInt();
        givegrade g1 = new givegrade();	
        g1.checkgrade(score);
	}
	

}
