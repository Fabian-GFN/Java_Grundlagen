// Das Keyword abstract in Java wird h�ufig im Zusammenhang mit Vererbung verwendet
// Abstrakt bedeutet zun�chst das Gegenteil von Konkret, d.h. die spezifischen Details
// sind noch unklar

// Nur Klassen und Methoden d�rfen abstract sein (Interfaces sind immer abstract)
public class Abstract {

	public static void main(String[] args) {
		// Eine Klasse, die abstract ist, darf nicht instanziiert werden:
		/* Food f = new Food(); */
		
		Food f = new Salad();
		// Ich kann die abstrakte Methode consume �ber eine Variable vom Typ Food
		// scheinbar aufrufen -- in Wirklichkeit w�hlt Java die Version aus der 
		// Subklasse, welche wir instanziiert haben, also hier Salad
		f.consume(); 				/* I don't like it */	
		
		
		// F�r jedes Objekt aus dem unteren Array wird die "passende" Methode
		// consume() gew�hlt, n�mlich die aus der eigenen Klasse
		Food[] foods = {new Salad(), new Fruit(), new Candy()};
		for (Food e : foods) {
			e.consume();
		}

	}

}

// Diese Klasse ist abstrakt
abstract class Food {
	// Attribute k�nnen ganz normal angelegt werden
	int calories;
	
	// Methoden k�nnen ganz normal angelegt werden
	public void grow() {
		System.out.println("Food is growing");
	}
	
	// Aber methoden in abstrakten Klassen d�rfen AUCH abstract sein 
	// Eine solche Methode hat keinen Body und ist noch nicht implementiert
	abstract void consume();
}


// Die Subklassen werden gezwungen, eine eigene Implementierung f�r
// die Methode consume() vorzugeben
class Salad extends Food {
	
	void consume() {
		System.out.println("I don't like it!");
	}
}

class Candy extends Food {
	
	void consume() {
		System.out.println("Yummy!");
	}
}

class Fruit extends Food {
	
	void consume() {
		System.out.println("Meh!");
	}
}
