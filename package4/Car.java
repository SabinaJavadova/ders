package package4;

public class Car extends Vehicle {

	private String color;
	private int engine;
	public Car(String make, String model, int year, String color, int engine) {
		super(make, model, year);
		this.setColor(color);
		this.setEngine(engine);
		
		
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getEngine() {
		return engine;
	}
	public void setEngine(int engine) {
		this.engine = engine;
	}
	

	@Override
	public void displayDetails() {
		System.out.println("Make: "  +  getMake());
		System.out.println("Moldel: " + getModel());
		System.out.println("Year: " + getYear());
	}
	
	
	
	
	

}
