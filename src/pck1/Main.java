package pck1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Person person =new Person();
		List<Integer> list=new ArrayList<>();
		list.add(15);
		list.add(30); 
//		for (Integer integer : list) {
//			System.out.println(integer);
//			
//		}
//		
		list.add(1, 40);
		for (Integer integer : list) {
			System.out.println(integer);
		}
		System.out.println("index2 after add method:");
		System.out.println(list.get(2));
		System.out.println(list.size());
		list.remove(2);
		System.out.println("list after remove method:");
		System.out.println(list.size());

		list.set(1, 50);
		for (Integer integer : list) {
			System.out.println(integer);
		}
	
		}
	}


