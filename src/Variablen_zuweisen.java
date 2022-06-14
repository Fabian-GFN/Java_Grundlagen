// Java-Quelldatei
//
// Klassendeklaration 
// Eine Klasse ist zunächst ein "Behälter" für Code

class MyClass {
	// Dies ist der "Classbody"

	// Methodendeklaration
	public static void main(String[] args) {
		// Dies ist der "Method-body" der main-Methode
		// Hier wird der Programmablauf beschrieben
		
		// Unsere erste Anweisung: Schreibe Hello World auf die Konsole
		// Dafür rufen wir die Methode "print" des Standardoutputstreams auf
		System.out.println("Hello World!");
		
		// Ohne Angabe der Klasse System kann die Methode nicht gefunden werden:
		// print("");					-- erzeugt Kompilierfehler wenn ohne Kommentar
		
		// Variablendeklaration -- lokale Variable der Methode main
		int number;
		
		// Zuweisung der Variable
		number = 1;
		
		// Variable auf der Konsole ausgeben -- zu diesem Zeitpunkt 1
		System.out.println(number);
		
		// Variablen können jederzeit neu zugewiesen werden
		number = 5;
		
		// Number ist jetzt 5
		System.out.println(number);
		
		// Variablen können aber nicht auf Werte gesetzt werden, die ihrem Datentyp
		// nicht entsprechen
		// number = 5.5;			-- erzeugt einen Kompilierfehler wenn ohne Kommentar
		
		// Wir deklarieren eine zweite Variable
		int secondNumber = 10;
		
		
		// Eine Variable kann mit einer anderen Variable zugewiesen werden Die 10 wird
		// aus secondnumber ausgelesen und auf number zugewiesen
		 
		number = secondNumber; 								// number = 10
		
		System.out.println(number);							// 10
		System.out.println(secondNumber);					// 10
		
		// Die Variablen sind NICHT dauerhaft verknüpft 
		// Eine Neuzuweisung mit secondNumber ändert also nicht number!
		secondNumber = 20;
		
		System.out.println(number);							// 10
		System.out.println(secondNumber);					// 20
		
	}	// Ende der Methode
}	// Ende der Klasse

// Beachte, dass die schließenden Klammern unbedingt nötig sind.
// Außerhalb der KLasse darf sich kein Programmcode befinden.
