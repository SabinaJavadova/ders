package package6;

public class Eagle extends Animal implements Flyable  {

	@Override
	public void fly() {
		System.out.println("Eagle can fly");
		
	}

	@Override
	public void migrates() {
		System.out.println("Eagles dont migrate");
		
	}

	@Override
	public void Description() {
		System.out.println("size of eagle is a large");
		
	}

	@Override
	public void skintypes() {
		System.out.println("skintype of eagle is a feather. ");
		
	}

}
