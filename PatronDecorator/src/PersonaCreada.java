
public class PersonaCreada extends Person {

	public PersonaCreada(PersonaI persona) {
		super (persona);
	}
	
	public void descripcion() {
		super.descripcion();
		System.out.println("Soy una persona alta");
	}
}
