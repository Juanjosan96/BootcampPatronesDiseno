

public class PrototypeMain extends Person{
	public PrototypeMain(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Person clone() {
		// TODO Auto-generated method stub
		PrototypeMain personClone=new PrototypeMain(this.name, this.age);
		return personClone;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrototypeMain persona1=new PrototypeMain(name, age);
		persona1.setName("pepe");
		persona1.setAge(20);
		System.out.println(persona1.getName()+persona1.getAge());

	}




}
