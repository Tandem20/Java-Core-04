package Tandem20;

public class Leopard extends Animal {
	
	private int id;
	
	Leopard(String name , int speed , int  age , int id){
		super(name, speed, age);
		this.id = id;
	}
	Leopard (int id) {
		super("Leopard" , 20   , 7);
		this.id = id;
	}
	@Override
	public String toString() {
		return "Leopard [ id=" + id + " , name =  " + super.getName() + " , age = " + super.getAge() + " , speed = " + super.getSpeed() + " ]";
	}
}

