// Das Keyword static kennzeichnet "Instanzunabh�ngigkeit"
// Statische Variablen oder Methoden k�nnen unabh�ngig von Objekten verwendet werden
// und stehen auch nicht in Verbindung mit solchen

public class Static {

	// Die main-Methode ist immer "static" - wir haben auch gar kein Objekt, mit dem
	// wir sie aufrufen k�nnten, denn sie steht ganz am Anfang des Programmablaufes
	public static void main(String[] args) {
		// lokale Variable -- wird nicht als Attribut bezeichnet
		int local;
		
//		System.out.println(local);					-- Lokale Variable muss zugewiesen werden
		
		// Statische Variablen sind in der Verwendung am Einfachsten
		// Sie werden mit Standardwerten automatisch initialisiert
		System.out.println(instances);						// 0
		
		// An das nicht-statische Attribut kommen wir so einfach nicht heran...
//		System.out.println(thisNumber);				-- Kompilierfehler...
		
		// Wir m�ssen ein Objekt der Klasse erzeugen
		Static obj = new Static();
		System.out.println(obj.thisNumber);					// 0
		
		// Ich weise dem Objekt als Wert des Attributes die 100 zu
		obj.thisNumber = 100;
		System.out.println(obj.thisNumber);					// 100
		
		// Ich �ndere die statische Variable auf 500
		instances = 500;
		System.out.println(instances);						// 500
		
		// Jetzt erzeuge ich wieder ein neues Objekt, und das alte wird �berspeichert
		obj = new Static();
		// Das neue Objekt hat wieder die 0 als Wert seines Attributes
		System.out.println(obj.thisNumber);					// 0
		
		// Der Wert der statisches Variable bleibt unver�ndert
		System.out.println(instances);						// 500
		
	}
	
	//	statisches Attribut
	static int instances;
	
	//	nicht-statisches Attribut
	int thisNumber;

}
