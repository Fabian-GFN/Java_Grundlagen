// Das Keyword abstract in Java wird häufig im Zusammenhang mit Vererbung verwendet
// Abstrakt bedeutet zunächst das Gegenteil von Konkret, d.h. die spezifischen Details
// sind noch unklar

// Nur Klassen und Methoden dürfen abstract sein (Interfaces sind immer abstract)
public class Abstract {

	public static void main(String[] args) {
		// Eine Klasse, die abstract ist, darf nicht instanziiert werden:
		/* Food f = new Food(); */
		
		Food f = new Salad();
		// Ich kann die abstrakte Methode consume über eine Variable vom Typ Food
		// scheinbar aufrufen -- in Wirklichkeit wählt Java die Version aus der 
		// Subklasse, welche wir instanziiert haben, also hier Salad
		f.consume(); 				/* I don't like it */	
		
		
		// Für jedes Objekt aus dem unteren Array wird die "passende" Methode
		// consume() gewählt, nämlich die aus der eigenen Klasse
		Food[] foods = {new Salad(), new Fruit(), new Candy()};
		for (Food e : foods) {
			e.consume();
		}

	}

}

// Diese Klasse ist abstrakt
abstract class Food {
	// Attribute können ganz normal angelegt werden
	int calories;
	
	// Methoden können ganz normal angelegt werden
	public void grow() {
		System.out.println("Food is growing");
	}
	
	// Aber methoden in abstrakten Klassen dürfen AUCH abstract sein 
	// Eine solche Methode hat keinen Body und ist noch nicht implementiert
	abstract void consume();
}


// Die Subklassen werden gezwungen, eine eigene Implementierung für
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
