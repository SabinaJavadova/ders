package pck4;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Student stud1=new Student("Eli ", 8 , 3.5);
		Student stud2 = new Student("Veli ", 9 , 3.4);
		Student stud3 =new Student("Ehmed ", 10 , 3.2);
		
		List<Student> list=new ArrayList<>();
		list.add(stud1);
		list.add(stud2);
		list.add(stud3);
		for (Student student : list) {
			System.out.println(student);
		}
	}

}
