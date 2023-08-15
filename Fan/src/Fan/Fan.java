package Fan;
class Fans
{
	int no_of_Wings;
	int cost;
	String color;
	String brand;
	
	void fanCanRotate()
	{
		System.out.println("The fan can rotate with " +no_of_Wings+ "which is in " +color+ "of brand "+brand);
	}
	void blowAir()
	{
		System.out.println("Fan which blows air in color" +color);
	}
}


