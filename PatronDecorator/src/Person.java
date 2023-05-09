
public abstract class Person implements PersonaI {
protected PersonaI persona;
public Person(PersonaI persona) {
	this.persona=persona;
}
public void descripcion() {
	persona.descripcion();
}

}
