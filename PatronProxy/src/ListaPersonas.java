import java.util.ArrayList;
import java.util.List;

public class ListaPersonas implements PersonI{
private List<Person> personas;

public ListaPersonas() {
	cargarPersonas();
}

@Override
public List<Person> getPersonas() {
	// TODO Auto-generated method stub
	return personas;
}

@Override
public void agregarPersonas(Person persona) {
	// TODO Auto-generated method stub
	personas.add(persona);
}
private void cargarPersonas() {
	personas= new ArrayList<>();
	personas.add(new Person("Pepe", 20));
	personas.add(new Person("Paco", 10));
	personas.add(new Person("Felipe", 40));

}

}
