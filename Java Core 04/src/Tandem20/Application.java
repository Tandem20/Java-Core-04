package Tandem20;

public class Application {
	public static void main(String[] args) {
		Robot r = new Robot("� Robot" , "� ������ ������");
		System.out.println(r);
		
		CoffeRobot c = new CoffeRobot("� CoffeRobot" , "� ���� ����");
		System.out.println(c);
		
		RobotDancer d = new RobotDancer("� RobotDancer" , "� ������ ������");
		System.out.println(d);
		
		RobotCoocker k = new RobotCoocker("RobotCoocker" , "� ������ �����");
		System.out.println(k);
		
	}

}
