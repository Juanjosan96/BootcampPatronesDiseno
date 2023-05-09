
public abstract class DecoratorMain implements PersonaI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Persona 1");

		PersonaI persona = new PersonaNormal();
		PersonaI personaCreada = new PersonaCreada(persona);
		personaCreada.descripcion();

	}

}
