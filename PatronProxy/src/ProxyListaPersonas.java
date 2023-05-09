import java.util.List;

public class ProxyListaPersonas implements PersonI {

	private PersonI lista;

	@Override
	public List<Person> getPersonas() {
		// TODO Auto-generated method stub
		if (lista == null) {
			lista = new ListaPersonas();
		}
		return lista.getPersonas();
	}

	@Override
	public void agregarPersonas(Person persona) {
		// TODO Auto-generated method stub
		if (lista == null) {
			lista = new ListaPersonas();
		}
		lista.agregarPersonas(persona);
	}

}
