package pck3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


	public static void main(String[] args) {
		Product product1=new Product("Milk ",4, " drink");
		Product product2 = new Product("bread ",2," flour product");
		
		
		List<Product> list =new ArrayList<>();
		list.add(product1);
		list.add(product2);
		
		
		
		Collections.sort(list,new PriceComparator());
		
		for (Product product : list) {
			System.out.println(product);
		}

	}

}
