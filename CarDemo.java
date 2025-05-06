class Car
{
	double topSpeed;
	String name;
	Car()
	{
		topSpeed=110;
		name="Nano";
	}

	Car(double topSpeed, String name)
	{
		this.topSpeed=topSpeed;
		this.name=name;
	}

	public String toString()
	{
		return "name = " + name + ": " + "topspeed = " + topSpeed;

	}
}

class ToStingMethodDemo
{
	public static void main(String args[])
	{
		Car c1 = new Car();
		Car c2 = new Car(250,"ferrari");
		Car c3 = new Car(300, "Thar");
		Car c4 = new Car(249, "Alto");
		Car c5 = new Car(220,"i20");

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
	}
}