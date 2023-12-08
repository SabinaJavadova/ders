package package1;

import java.util.Scanner;

public class Calculator1 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
		System.out.println("Birinci sayini yazin: ");
		double eded1 = scanner.nextDouble();
		
		System.out.println("Ikinci sayini yazin: ");
		double eded2=scanner.nextDouble();
		
		System.out.println("Hansi emeli edeceyinizi sechin: ");
		System.out.println("1.Toplama");
		System.out.println("2.Cixma");
		System.out.println("3.Vurma");
		System.out.println("4.Bolme");
		 
		int choice = scanner.nextInt();
		 
		switch (choice) {
			case 1:
				System.out.println("Toplama: " + add(eded1,eded2));
				break;
			case 2:
				System.out.println("Ferq: "+ substract(eded1,eded2));
				break;
			case 3:
				System.out.println("Vurma: "+ multiply(eded1,eded2));
				break;
			case 4:
				
				System.out.println("Bolme: "+ divide(eded1,eded2));
				break;
			
		}	
			scanner.close();
        }
		public static double add(double x,double y) {
			return x+y;
		}
		public static double substract (double x,double y) {
			return x-y;
		}
		public static double multiply (double x,double y) {
			return x*y;
		}
		public static double divide (double x,double y) {
			return x /y;
		}
}

					
		
	