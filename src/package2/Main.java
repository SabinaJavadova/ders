package package2;
import package1.Person;
public class Main {

	public static void main(String[] args) {
	    Person person = new Person();
        person.setName("Sabina");
        person.setSurname("Javadova");
        person.setAge(19);

        System.out.println(person.getName());
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
	}

}
