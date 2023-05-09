
public class Person {
private String nombre;
private int edad;
public Person(String nombre, int edad) {
	super();
	this.nombre = nombre;
	this.edad = edad;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}

class PersonBuilder{
	private String nombre;
	private int edad;
	public  PersonBuilder setNombre(String nombre) {
		this.nombre=nombre;
		return this;
		
	}
	public  PersonBuilder setEdad(int edad) {
		this.edad=edad;
		return this;
		
	}
	
	public Person build() {
		return new Person(nombre, edad);
	}
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
Person persona1= new PersonBuilder()
.setNombre("Pepe")
.setEdad(20)
.build();
}
}
