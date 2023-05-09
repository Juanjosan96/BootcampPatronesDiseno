import java.util.ArrayList;
import java.util.List;

public class Persona extends CrearPersona{
private List<Persona> listaPersonas;
public Persona(String name, int age) {
	super(name, age);
	// TODO Auto-generated constructor stub
}


public List<Persona> ObtenerEdad(){
	List<Persona> personasFiltradas = new ArrayList<Persona>();
	for(Persona persona: listaPersonas) {
		if(persona.getAge()>=20&&persona.getAge()<=30) {
			personasFiltradas.add(persona);
		}
	}
	return personasFiltradas;
}
}
