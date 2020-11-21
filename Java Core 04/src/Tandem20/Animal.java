package Tandem20;

public class Animal {

	private String name;
	private int speed;
	private int  age;
	
	Animal(String name , int speed , int  age){
		this.name = name;
		this.speed = speed;
		this.age  = age;
	}
	public String getName() {
		return name;
	}
	public int getSpeed() {
		return speed;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", speed=" + speed + ", age=" + age + " ]";
		
	}
	}	

		