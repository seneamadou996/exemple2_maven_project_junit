import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import testClass.Person;

public class TestJavaCode {
	
	//intanciation de la class Person
	Person person = new Person();

	//initialisation de la class Person et sp�cifi� qu'il sera initial� pour chaque appelle dans methode
	@BeforeEach
	void setupPerson() {
		person.setNom("Amadou");
		person.setAge(25);
	}
	
	//effectuer un test sur le nom
	@Test
	void testName() {
		
		Assertions.assertEquals("Amadou", person.getNom());
	}
	
	//effectuer un test en utilisant un autre nom
	
	@Test
	void testUserAliou() {
		person.setNom("Aliou");
		
		Assertions.assertEquals("Aliou", person.getNom());
	}
	
	//effectuer un test sur l'�ge
	
	@Test
	void testAge() {
		
		Assertions.assertTrue(person.getAge() < 30);
	}
}
