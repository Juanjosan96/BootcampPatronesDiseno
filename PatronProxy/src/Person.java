
public class Person {
	private static Person instance;
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public static Person getInstance() {
		return instance;
	}

	public static void setInstance(Person instance) {
		Person.instance = instance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static Person getInstance(String name, int age) {

		if (instance == null) {
			instance = new Person("Pepe", 20);
		}
		return instance;
	}
}
