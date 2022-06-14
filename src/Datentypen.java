
class Datentypen {

	public static void main(String[] args) {
		// Es gibt in Java eine Reihe von sogenannten "primitiven" Datentypen
		// Diese sind lediglich Zahlen, Schriftzeichen und der Boolean
		// byte
		// short
		// char
		// int
		// long
		// float
		// double
		
		// boolean
		
		// Ein byte ist eine Ganzzahl im Bereich von 8 bit
		byte b = 100;							// -128 bis 127
		
		// Ein short ist eine Ganzzahl im Bereich von 16 bit
		short s = 30000;						// bis ca. 32500
		
		// Ein char ist eine Ganzzahl im Bereich von 16 bit, aber ohne negativen Bereich
		// die Zahl wird als Schriftzeichen nach Unicode interpretiert
		// Es kann der Einfachheit halber das Schriftzeichen selbst zugewiesen werden
		// Beachte die einfachen Anf�hrungszeichen!
		char c = 'a';
		System.out.println(c);
		
		c = 57;
		System.out.println(c);							// 9				
		// Die 57. Stelle des ASCII-Zeichensatzes ist die Ziffer 9
		
		// Den Zahlenwert eines chars anzeigen:
		System.out.println((int)(c));					// 57
		
		// Ein int ist eine Ganzzahl im Bereich von 32 bit
		int i = Integer.MAX_VALUE;
		System.out.println(i);					// 2147483647
		
		// Ein long ist eine Ganzzahl im Bereich von 64 bit
		long l = Long.MAX_VALUE;
		System.out.println(l);					// SEHR SEHR gro�e Zahl :)
		
		// Ein float ist eine Kommazahl im Bereich von 32 bit
		// Ein literaler Float muss ein f hinten tragen
		float f = 20.37f;
		
		// Floats sind nicht sehr pr�zise, was Probleme beim konvertieren verursachen kann
		
		// Ein double ist eine Kommazahl im Bereich von 64 bit 
		double d = Double.MAX_VALUE;
		System.out.println(d);					
		// SEHR SEHR gro�e Zahl mit Nachkommastellen
		
		// Ein boolean ist KEINE Zahl, sondern entweder true oder false
		boolean bool = true;
		
		// Bei den Zahlentypen ist zu beachten, dass sie nur bedingt miteinander
		// kompatibel sind
		// Betrachten wir folgendes Beispiel:
		
		byte small = 10;
		short big = 10;
		System.out.println(small + big);				// 20
		
		// Folgende Anweisung ist ung�ltig, obwohl 20 ein g�ltiger Wert f�r die
		// Variable small w�re. 
		// Der Kompiler wei� aber nicht, welche Werte in den Variablen stehen.
		// Ihn interessiert nur, dass das Ergebnis der Berechnung zu gro� sein k�nnte!
//		small = small + big;						-- geht nicht
		
//		big = small + big;							-- geht nicht
		
		int sum = small + big;						// Ok!
		
		// Die Regel ist: 
		// Alle Berechnungen mit Ganzzahlen (au�er long) haben als Ergebnis den Datentyp int
		// Alle Berechnungen mit Flie�kommazahlen haben als Ergebnis den gr��ten
		// beteiligten Datentyp
		
		// Wir d�rfen diese Regel au�er Kraft setzen mit einem sogenannten Cast
		// Um zu casten, geben wir den gew�nschten Datentyp in Klammern vor der Berechnung an
		small = (byte)(small + big);								// 10 + 10
		// Solange small und big klein genug sind, funktioniert dies...
		System.out.println(small);									// 20
		// Aber was ist, wenn big gr��er wird?
		big = 125;
		small = (byte)(small + big);								// 20 + 125
		System.out.println(small);									// -111??	
		// Da das Ergebnis 145 zu gro� f�r 8 bit ist, wird eine andere Zahl daraus
		// Rechne: -128+(-128+145)
		// Nach dem �berschreiten des Maximalwerts f�ngt die Maschine wieder beim
		// Minimalwert an zu rechnen!
	}
}
