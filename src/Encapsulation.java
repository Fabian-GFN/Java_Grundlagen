import java.time.LocalDate;

// Die "Kapselung" ist das Konzept, nach dem Attribute von Klassen
// immer private sein sollten
// Ggf. werden für die Attribute sogenannte "Getter" und "Setter" zur Verfügung gestellt
// Dies sind Methoden, die den Zugriff regeln
public class Encapsulation {

	public static void main(String[] args) {
		// wir benutzen die Klasse Person:
		Person p = new Person();
		p.age = 5;
		p.birth = LocalDate.of(10, 5, 1966);
		
		// Wir haben jetzt eine Person, die 5 Jahre alt ist, aber vor
		// 56 Jahren geboren wurde -- nicht so gut
		
		// Mit einer korrekt "gekapselten" Klasse lässt sich das Problem verhindern

		ImprovedPerson ip = new ImprovedPerson();
		/* ip.age = 10; -- Zugriff verboten */
		ip.setBirthDay(LocalDate.of(10, 5, 1966));
	}

}

class Person {
	// Diese beiden Attribute stehen in einem Zusammenhang:
	// Das Alter sollte immer die Differenz zwischen Heute und birth in Jahren sein
	int age;
	LocalDate birth;
}

// Dieselbe Klasse in gekapselter Variante
class ImprovedPerson {
	private int age;
	private LocalDate birth;
	
	// den Zugriff auf die Attribute regeln wir über eine öffentliche Methode
	public void setBirthDay(LocalDate date) {
		birth = date;
		// Differenz zwischen Heute und Geburtstag ausrechnen und auf age zuweisen
	}
	
	// Weil ich das Alter jetzt nicht direkt ändern kann, bleibt die Klasse immer
	// in einem logisch konsistenten Zustand!
}
