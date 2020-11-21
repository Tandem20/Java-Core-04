package Tandem20;

public class Robot {

	private String name;
	private String work;

	Robot(String name, String work){
		this.name = name;
		this.work = work;
	}	
	public String getName() {
		return name;
	}
	public String getWork() {
		return work;
	}
	@Override
	public String toString() {
		return "Robot [name = " + name + ", work = " + work + " ] ";
	}
	
	
	}

