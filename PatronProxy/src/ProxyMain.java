import java.util.List;

public class ProxyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PersonI lista=new ProxyListaPersonas();
List<Person> personas=lista.getPersonas();
for(Person persona: personas) {
	System.out.println(persona.getName()+persona.getAge());
}
	}

}
