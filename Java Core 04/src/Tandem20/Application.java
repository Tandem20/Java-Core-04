package Tandem20;

public class Application {
	public static void main(String[] args) {
		Robot r = new Robot("Я Robot" , "я просто працюю");
		System.out.println(r);
		
		CoffeRobot c = new CoffeRobot("Я CoffeRobot" , "я варю каву");
		System.out.println(c);
		
		RobotDancer d = new RobotDancer("Я RobotDancer" , "я просто танцюю");
		System.out.println(d);
		
		RobotCoocker k = new RobotCoocker("RobotCoocker" , "я просто готую");
		System.out.println(k);
		
	}

}
