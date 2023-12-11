package package2;

public class Book {
	private String ad;
	private String yazichi;
	private int sehifeSayi;
	private int chapTarixi;
	
	private static int totalBookCount = 0;
	

	public Book(String ad,String yazichi,int sehifeSayi,int chapTarixi) {
		this.ad=ad;
		this.yazichi=yazichi;
		this.sehifeSayi=sehifeSayi;
		this.chapTarixi=chapTarixi;
		
		totalBookCount++;
	}
	public void displayDetails() {
		System.out.println("Kitab adi: " + ad);
		System.out.println("Kitab yazichisi: " + yazichi);
		System.out.println("Kitabin sehife sayi: " + sehifeSayi);
		System.out.println("Kitabin Chap Tarixi: "+ chapTarixi);
		
	}
	public static int getTotalBooks() {
		return totalBookCount;
		
	}
	public class Main {
		public static void main (String[] args) {
			Book book1 = new Book("Oyunbaz", "Wulf Dorn", 324, 2011);
			Book book2 = new Book("Psikiyatrist", "Wulf Dorn", 416, 2009);
			book1.displayDetails();
			book2.displayDetails();
			System.out.println("Kitab1 haqqinda: ");
			System.out.println("Kitab2 haqqinda: ");
			
			
			int totalBooks = Book.getTotalBooks();
			System.out.println("Butovlukde olan kitab sayi: " + totalBooks);
	}
	
	}
}
