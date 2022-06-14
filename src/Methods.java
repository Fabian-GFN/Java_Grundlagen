// Methoden sind Javas "Funktionen" 
	
// Methoden haben in erster Linie die Aufgabe, einen bestimmten Algorithmus
// zu definieren, den wir wiederholt ausführbar machen wollen

public class Methods {

	public static void main(String[] args) {
		// Angenommen, wir wollen zwei Zahlen vergleichen und nur die Größere ausgeben
		int a = 10;
		int b = 12;
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
		
		// Was ist wenn ich jetzt zwei andere Zahlen vergleichen möchte?
		// Ich muss den selben Code noch einmal schreiben :(
		a = 17;
		b = 13;
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
		
		// Ich kann die Aufgabe, die größere von zwei Zahlen zu erkennen,
		// an eine Methode delegieren
		// Ich darf der Methode zwei ints übergeben, obwohl sie per DEKLARATION
		// zwei doubles erwartet (siehe unten)
		double result = findLargerNumber(a, b);
		System.out.println(result);
		
		// Ich kann die Methode beliebig häufig wiederholt verwenden, und jedes
		// Mal andere Argumente verwenden - es können auch Literale sein
		result = findLargerNumber(100313, 316327618);
		
		// Wir müssen aber darauf achten, Argumente zu übergeben,
		// welche für die Parameter gültige Werte darstellen
		/* result = findLargerNumber("12", "25"); */
		
		// Außerdem müssen wir uns auch nach dem Rückgabetyp richten
		// Weil die Methode einen double zurück gibt, kann ich diesen nicht
		// als int auffangen
		/* int intResult = findLargerNumber(1, 2); */
		
		// Es ist allerdings möglich, den zurückgegebenen Wert verfallen zu lassen
		findLargerNumber(5, 5);
		
	}
	
	// Meine Methode soll die größere von zwei Zahlen zurückgeben
	public static double findLargerNumber(double number1, double number2) {
		if (number1 > number2) {
			return number1;
		} else if (number2 > number1) {
			return number2;
		} else {
			System.out.println("Die Zahlen sind gleich groß!");
			return 0;
		}
	}


}
