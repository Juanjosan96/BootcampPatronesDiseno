
public class PatronSingletonMain {
	public static void main(String[] args) {

		Person person = Person.getInstance("Jose", 20);
		System.out.println(person.getAge() + " " + person.getName());

	}

}
