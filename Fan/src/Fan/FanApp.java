package Fan;

public class FanApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fans f1 = new Fans();
		f1.no_of_Wings = 4;
		f1.cost = 2500;
		f1.color = "blue";
		f1.brand  = "sparks";
		f1.fanCanRotate();
		f1.blowAir();
		
		System.out.println(f1.cost);
		
	}

}
