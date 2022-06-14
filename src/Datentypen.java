
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
		// Beachte die einfachen Anführungszeichen!
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
		System.out.println(l);					// SEHR SEHR große Zahl :)
		
		// Ein float ist eine Kommazahl im Bereich von 32 bit
		// Ein literaler Float muss ein f hinten tragen
		float f = 20.37f;
		
		// Floats sind nicht sehr präzise, was Probleme beim konvertieren verursachen kann
		
		// Ein double ist eine Kommazahl im Bereich von 64 bit 
		double d = Double.MAX_VALUE;
		System.out.println(d);					
		// SEHR SEHR große Zahl mit Nachkommastellen
		
		// Ein boolean ist KEINE Zahl, sondern entweder true oder false
		boolean bool = true;
		
		// Bei den Zahlentypen ist zu beachten, dass sie nur bedingt miteinander
		// kompatibel sind
		// Betrachten wir folgendes Beispiel:
		
		byte small = 10;
		short big = 10;
		System.out.println(small + big);				// 20
		
		// Folgende Anweisung ist ungültig, obwohl 20 ein gültiger Wert für die
		// Variable small wäre. 
		// Der Kompiler weiß aber nicht, welche Werte in den Variablen stehen.
		// Ihn interessiert nur, dass das Ergebnis der Berechnung zu groß sein könnte!
//		small = small + big;						-- geht nicht
		
//		big = small + big;							-- geht nicht
		
		int sum = small + big;						// Ok!
		
		// Die Regel ist: 
		// Alle Berechnungen mit Ganzzahlen (außer long) haben als Ergebnis den Datentyp int
		// Alle Berechnungen mit Fließkommazahlen haben als Ergebnis den größten
		// beteiligten Datentyp
		
		// Wir dürfen diese Regel außer Kraft setzen mit einem sogenannten Cast
		// Um zu casten, geben wir den gewünschten Datentyp in Klammern vor der Berechnung an
		small = (byte)(small + big);								// 10 + 10
		// Solange small und big klein genug sind, funktioniert dies...
		System.out.println(small);									// 20
		// Aber was ist, wenn big größer wird?
		big = 125;
		small = (byte)(small + big);								// 20 + 125
		System.out.println(small);									// -111??	
		// Da das Ergebnis 145 zu groß für 8 bit ist, wird eine andere Zahl daraus
		// Rechne: -128+(-128+145)
		// Nach dem Überschreiten des Maximalwerts fängt die Maschine wieder beim
		// Minimalwert an zu rechnen!
	}
}
