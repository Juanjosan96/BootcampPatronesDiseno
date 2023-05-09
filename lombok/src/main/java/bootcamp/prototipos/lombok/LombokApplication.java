package bootcamp.prototipos.lombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class LombokApplication extends Configuracion{

	public static void main(String[] args) {
		
		
		
		SpringApplication.run(LombokApplication.class, args);
		
		LombokApplication persona2=new LombokApplication();

		System.out.println(persona2.singleton().getNombre()+persona2.singleton().getEdad());
		System.out.println(persona2.prototype().getNombre()+persona2.prototype().getEdad());

		
		System.out.println();
		Person persona1 =new Person("pepe", 20);
		System.out.println(persona1.getNombre()+persona1.getEdad());
				
	}

}
