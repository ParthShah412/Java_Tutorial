/* This tutorial teaches about static variable defined in a class
 * Do read the comments for further explanation 
 * 
 * 
 */
class Laptop{
	private int ram,gfx;
	private float cpu;
	static int COUNT;
	Laptop(int ram, int gfx, float cpu){
		this.ram = ram;
		this.gfx = gfx;
		this.cpu = cpu;
		COUNT++;
	}
	public void getInfo() {
		System.out.println("This is a laptop with "+ram+
				" GB ram, with "+gfx+" GB graphics card and with a CPU of Hz"+cpu);
	}
}

public class Tutorial1{
	public static void main(String[] args) {
		//Let us try not to call count with any class instance
		Laptop Mac = new Laptop(4,2,3.3f);
		Mac.getInfo();
		Laptop Acer = new Laptop(8,3,4.4f);
		Acer.getInfo();
		System.out.println(Laptop.COUNT);
		/* Now I am modifying the value of static variable for each of the created
		instance.*/
		Mac.COUNT = 45;
		System.out.println(Laptop.COUNT); // Will give 45
		Acer.COUNT = 69;
		System.out.println(Laptop.COUNT); // Will give 69
	}
}