package package08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("eded yazin: ");
		String s = scan.nextLine();
		
		try {
			int converted=Integer.parseInt(s);
			System.out.println(converted);
		}catch(NumberFormatException e) {
			System.out.println("xeta!");
		}finally {
			scan.close();
		}
	}

}
