package pck3;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		
		return p1.price+p2.price;
	}

}
