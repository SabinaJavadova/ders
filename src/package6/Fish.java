package package6;

public class Fish extends Animal implements Swimable{

	@Override
	public void swim() {
		System.out.println("fish can swim ");
		
	}

	@Override
	public void eat() {
		System.out.println("fish can eat");
		
	}

	@Override
	public void Description() {
		System.out.println("size of fish is change from small to large");
		
	}

	@Override
	public void skintypes() {
		System.out.println("Fish skintypes is a scales.");
		
	}

}
