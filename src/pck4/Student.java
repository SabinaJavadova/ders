package pck4;

public class Student implements Comparable<Student>{
	String name;
	int age;
	double GPA;
	
	public Student(String name,int age,double GPA) {
		this.name=name;
		this.age=age;
		this.GPA=GPA;
	}

	@Override
	public int compareTo(Student s) {
		if (this.GPA>s.GPA) {
			return 1;
		}else if(this.GPA<s.GPA) {
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return name+ age +GPA;
	}
}
