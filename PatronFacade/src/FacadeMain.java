import java.util.ArrayList;
import java.util.List;

public class FacadeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Persona persona1 = new Persona("Pepe", 20);
Persona persona2 = new Persona("Carlos", 23);
Persona persona3 = new Persona("Pepa", 40);
//List<Persona> lista= new ArrayList<Persona>();
//lista.add(persona1);
//lista.add(persona2);
//lista.add(persona3);
//Persona gestor=new Persona(lista)
persona1.ObtenerEdad();
persona2.ObtenerEdad();
persona3.ObtenerEdad();
List<Persona> personasfiltradas=persona1.ObtenerEdad();

personasfiltradas=persona2.ObtenerEdad();
personasfiltradas=persona3.ObtenerEdad();

for(Persona persona:personasfiltradas) {
	System.out.println(persona.getName()+persona.getAge());
}


	}

}
