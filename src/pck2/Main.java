package pck2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Book book1=new Book("Oyunbaz", "Wulf Dorn",2011);
		Book book2 = new Book("Fobi", "Wulf Dorn", 2013);
		Book book3 = new Book("Shizofren","Wulf dorn",2012);
	
		
		List<Book> bookList =new ArrayList<>();
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		
		Collections.sort(bookList);
		
		for (Book book : bookList) {
			System.out.println(book);
		}
		
		
	}

}
