
// Bei der Vererbung (Inheritance) geht es um die Weitergabe von Eigenschaften
// bzw. Verhaltensweisen (Methoden) von Klassen an andere Klassen.
// Dabei ist die "ELternklasse" daf�r Zust�ndig, die Teile zu definieren, welche
// an ihre "Kinder" vererbt werden sollen.
// Vererbung findet in Java �berall statt, auch in unseren Klassen. Jede Klasse erbt
// per Definition von der Klasse Object. 

public class Vererbung {

	public static void main(String[] args) {
		Fahrzeug fahrzg = new Fahrzeug();
		Auto auto = new Auto();
		fahrzg.anzahlR�der 	= 2;
		// Auto hat die R�der von Fahrzeug bekommen!
		auto.anzahlR�der 	= 4;
		
		System.out.println(fahrzg.anzahlR�der);			// 2
		System.out.println(auto.anzahlR�der);			// 4

		auto.treibStoff = "Diesel";
		// Fahrzeug hat keinen Treibstoff, dieser ist nur im Auto deklariert
		/* fahrzg.treibStoff = "Oliven�l"; */
		
		K�fer k�fer = new K�fer();
		// Auch K�fer kann das Attribut Hersteller des Fahrzeuges verwenden!
		k�fer.hersteller = "Volkswagen";
		
		// Was wir bisher gesehen haben, ist noch nicht atemberaubend, aber n�tzlich
		// Es ist aber noch etwas anderes passiert:
		
		Fahrzeug myBeatle = new K�fer();
		myBeatle.anzahlR�der = 4;
		// Wir haben ein K�fer-Objekt erzeugt und dieses einer Variable vom Typ
		// Fahrzeug zugewiesen. Dies funktioniert NUR, weil K�fer ein "Nachfahr"
		// von Fahrzeug ist.
		/* k�fer = new Fahrzeug(); -- Ein Fahrzeug ist KEIN K�fer */
		
		// Es ist NICHT m�glich, �ber diese Variable myBeatle an die anzahlT�ren
		// Variable heranzukommen. Die Variable ist vom Typ Fahrzeug, und der Kompiler
		// geht davon aus, dass es sich um ein Fahrzeug-Objekt handelt.
		/* System.out.println(myBeatle.anzahlT�ren); */
		
		// Folgendes ist ein sogenannter "TypeCast", bei dem wir dem Kompiler versprechen,
		// dass sich hinter der Variable vom Typ Fahrzeug tats�chlich ein K�fer-Objekt
		// verbirgt. Wenn wir Recht haben, funktioniert die Zuweisung, und wir k�nnen
		// auf das K�fer-Objekt zugreifen.
		k�fer = (K�fer)myBeatle;
		
		// An dem K�fer-Objekt hat sich absolut nichts ver�ndert - lediglich die Variable
		// ist eine andere geworden - wir kommen jetzt wieder an die K�fer-Attribute heran
		System.out.println(k�fer.anzahlT�ren);
		
		// Es ist von Bedeutung, dass wir bei einem TypeCast nicht l�gen
		// Da der Kompiler uns vertraut, kann es sonst zur Laufzeit zu Abst�rzen kommen
		// Diese Zeile f�hrt zu einer ClassCastException
		/* k�fer = (K�fer)fahrzg; */
		
		// Der Typ eines Objektes l�sst sich jederzeit anzeigen:
		System.out.println(myBeatle.getClass());
		
		// Ebenso l�sst sich eine Bedingung formulieren, dass etwas
		// nur getan werden soll, wenn der Objekttyp der richtige ist:
		if (fahrzg instanceof K�fer) {
			k�fer = (K�fer)fahrzg;				// -- Exception wurde verhindert
		}
	}

}

// Diese Klasse stellt ein nicht n�her definiertes Fahrzeug da
class Fahrzeug {
	
	int maxGeschwindigkeit;
	int anzahlR�der;
	String hersteller;
	
	
}

// Diese Klasse stellt ein Auto dar, von beliebiger Bauart
// Sie soll von der Fahrzeug-Klasse erben
// Die Vererbung wird von der Kindklasse �ber das Keyword extends eingeleitet
// Das Auto bekommt alle Eigenschaften des Fahrzeuges, aber das Fahrzeug bekommt keine
// Eigenschaften des Autos!
class Auto extends Fahrzeug {
	
	String treibStoff;
}

// Diese Klasse stellt eine Spezialisierung des Autos dar, n�mlich einen K�fer
// Auch der K�fer hat die Attribute von Fahrzeug, er hat sie aber von Auto bekommen
class K�fer extends Auto {
	
	int anzahlT�ren;
	
}
