
// Bei der Vererbung (Inheritance) geht es um die Weitergabe von Eigenschaften
// bzw. Verhaltensweisen (Methoden) von Klassen an andere Klassen.
// Dabei ist die "ELternklasse" dafür Zuständig, die Teile zu definieren, welche
// an ihre "Kinder" vererbt werden sollen.
// Vererbung findet in Java überall statt, auch in unseren Klassen. Jede Klasse erbt
// per Definition von der Klasse Object. 

public class Vererbung {

	public static void main(String[] args) {
		Fahrzeug fahrzg = new Fahrzeug();
		Auto auto = new Auto();
		fahrzg.anzahlRäder 	= 2;
		// Auto hat die Räder von Fahrzeug bekommen!
		auto.anzahlRäder 	= 4;
		
		System.out.println(fahrzg.anzahlRäder);			// 2
		System.out.println(auto.anzahlRäder);			// 4

		auto.treibStoff = "Diesel";
		// Fahrzeug hat keinen Treibstoff, dieser ist nur im Auto deklariert
		/* fahrzg.treibStoff = "Olivenöl"; */
		
		Käfer käfer = new Käfer();
		// Auch Käfer kann das Attribut Hersteller des Fahrzeuges verwenden!
		käfer.hersteller = "Volkswagen";
		
		// Was wir bisher gesehen haben, ist noch nicht atemberaubend, aber nützlich
		// Es ist aber noch etwas anderes passiert:
		
		Fahrzeug myBeatle = new Käfer();
		myBeatle.anzahlRäder = 4;
		// Wir haben ein Käfer-Objekt erzeugt und dieses einer Variable vom Typ
		// Fahrzeug zugewiesen. Dies funktioniert NUR, weil Käfer ein "Nachfahr"
		// von Fahrzeug ist.
		/* käfer = new Fahrzeug(); -- Ein Fahrzeug ist KEIN Käfer */
		
		// Es ist NICHT möglich, über diese Variable myBeatle an die anzahlTüren
		// Variable heranzukommen. Die Variable ist vom Typ Fahrzeug, und der Kompiler
		// geht davon aus, dass es sich um ein Fahrzeug-Objekt handelt.
		/* System.out.println(myBeatle.anzahlTüren); */
		
		// Folgendes ist ein sogenannter "TypeCast", bei dem wir dem Kompiler versprechen,
		// dass sich hinter der Variable vom Typ Fahrzeug tatsächlich ein Käfer-Objekt
		// verbirgt. Wenn wir Recht haben, funktioniert die Zuweisung, und wir können
		// auf das Käfer-Objekt zugreifen.
		käfer = (Käfer)myBeatle;
		
		// An dem Käfer-Objekt hat sich absolut nichts verändert - lediglich die Variable
		// ist eine andere geworden - wir kommen jetzt wieder an die Käfer-Attribute heran
		System.out.println(käfer.anzahlTüren);
		
		// Es ist von Bedeutung, dass wir bei einem TypeCast nicht lügen
		// Da der Kompiler uns vertraut, kann es sonst zur Laufzeit zu Abstürzen kommen
		// Diese Zeile führt zu einer ClassCastException
		/* käfer = (Käfer)fahrzg; */
		
		// Der Typ eines Objektes lässt sich jederzeit anzeigen:
		System.out.println(myBeatle.getClass());
		
		// Ebenso lässt sich eine Bedingung formulieren, dass etwas
		// nur getan werden soll, wenn der Objekttyp der richtige ist:
		if (fahrzg instanceof Käfer) {
			käfer = (Käfer)fahrzg;				// -- Exception wurde verhindert
		}
	}

}

// Diese Klasse stellt ein nicht näher definiertes Fahrzeug da
class Fahrzeug {
	
	int maxGeschwindigkeit;
	int anzahlRäder;
	String hersteller;
	
	
}

// Diese Klasse stellt ein Auto dar, von beliebiger Bauart
// Sie soll von der Fahrzeug-Klasse erben
// Die Vererbung wird von der Kindklasse über das Keyword extends eingeleitet
// Das Auto bekommt alle Eigenschaften des Fahrzeuges, aber das Fahrzeug bekommt keine
// Eigenschaften des Autos!
class Auto extends Fahrzeug {
	
	String treibStoff;
}

// Diese Klasse stellt eine Spezialisierung des Autos dar, nämlich einen Käfer
// Auch der Käfer hat die Attribute von Fahrzeug, er hat sie aber von Auto bekommen
class Käfer extends Auto {
	
	int anzahlTüren;
	
}
