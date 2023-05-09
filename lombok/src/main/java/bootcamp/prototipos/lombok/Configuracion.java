package bootcamp.prototipos.lombok;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import lombok.Builder;

@Configurable

public class Configuracion {
	
	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public @Qualifier Person prototype() {
//		return prototype();
		return new Person("carlos", 21);
	}
	
	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
	public @Qualifier Person singleton() {
//		return singleton();
		return new Person("Jose", 30);
	}

}
