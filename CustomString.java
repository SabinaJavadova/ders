package package04_1;

import java.util.Arrays;

public class CustomString {
	private String deyishen;
	
	public CustomString(String deyishen) {
		this.deyishen=deyishen;
	}
	
	public int customLength() {
		return deyishen.length();

}
	public char customCharArt(int index) {
		return deyishen.charAt(index);
	}
	
	public char[] customChararray() {
		
        return deyishen.toCharArray();

	}
	
	public boolean customIsEmpty() {
		return deyishen.isEmpty();
	}
	
	public boolean customIsBlank() {
		return deyishen.isBlank();
				
	}
	public boolean customContains(CharSequence sequence) {
		return deyishen.contains(sequence);
		
	}
	public static  CustomString customValueOf(Object obj) {
		return new CustomString(String.valueOf(obj));
	}

    public static void main(String[] args) {
        CustomString customStr = new CustomString("the  Neighbourhood");

        System.out.println( customStr.customLength());
        System.out.println( customStr.customCharArt(7));
        System.out.println( Arrays.toString(customStr.customChararray()));
        System.out.println( customStr.customIsBlank());
        System.out.println( customStr.customIsEmpty());
        System.out.println( customStr.customContains("Custom"));

        CustomString valueOfExample = CustomString.customValueOf(2);
        System.out.println( valueOfExample.toString());
	
    }
}
