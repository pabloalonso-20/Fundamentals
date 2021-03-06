package fundamentals;

public class Main {
	
	//field is the term for class members/variables
	//this class can be stateful with static members
	public static int x = 5;
	
	//this field cannot be directly accessed
	//need some form of encapsulation to access it
	private int z = 3;
	
	public int getZ() {
		return z;
	}
	
	
	public static void myMethod() {
		//this is a local variable in the scope of myMethod()
		int y = 5;
	}
	//main method is considered the entry point
	//public is access modifier
	//static means that this code belongs to the class implementation/state
	public static void main(String[] args) {
		
	//Instantiation //creates an instance
	Main myMain = new Main();
	Main otherMain = new Main();
	
	
	System.out.println(myMain.x);
	System.out.println(otherMain.x);
	System.out.println(Main.x);
	System.out.println(myMain.getZ());
	
	Wall northWall = new Wall("red",false);
	Wall southWall = new Wall("blue", true);
	System.out.println(northWall.getAmountOfWalls());
	}

}
