
public class CrearPersona{
	private static CrearPersona instance;
	private String name;
	private int age;

	public CrearPersona(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public static CrearPersona getInstance() {
		return instance;
	}

	public static void setInstance(CrearPersona instance) {
		CrearPersona.instance = instance;
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

	public static CrearPersona getInstance(String name, int age) {

		if (instance == null) {
			instance = new CrearPersona("Pepe", 20);
		}
		return instance;
	}
}
