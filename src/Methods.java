// Methoden sind Javas "Funktionen" 
	
// Methoden haben in erster Linie die Aufgabe, einen bestimmten Algorithmus
// zu definieren, den wir wiederholt ausf�hrbar machen wollen

public class Methods {

	public static void main(String[] args) {
		// Angenommen, wir wollen zwei Zahlen vergleichen und nur die Gr��ere ausgeben
		int a = 10;
		int b = 12;
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
		
		// Was ist wenn ich jetzt zwei andere Zahlen vergleichen m�chte?
		// Ich muss den selben Code noch einmal schreiben :(
		a = 17;
		b = 13;
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
		
		// Ich kann die Aufgabe, die gr��ere von zwei Zahlen zu erkennen,
		// an eine Methode delegieren
		// Ich darf der Methode zwei ints �bergeben, obwohl sie per DEKLARATION
		// zwei doubles erwartet (siehe unten)
		double result = findLargerNumber(a, b);
		System.out.println(result);
		
		// Ich kann die Methode beliebig h�ufig wiederholt verwenden, und jedes
		// Mal andere Argumente verwenden - es k�nnen auch Literale sein
		result = findLargerNumber(100313, 316327618);
		
		// Wir m�ssen aber darauf achten, Argumente zu �bergeben,
		// welche f�r die Parameter g�ltige Werte darstellen
		/* result = findLargerNumber("12", "25"); */
		
		// Au�erdem m�ssen wir uns auch nach dem R�ckgabetyp richten
		// Weil die Methode einen double zur�ck gibt, kann ich diesen nicht
		// als int auffangen
		/* int intResult = findLargerNumber(1, 2); */
		
		// Es ist allerdings m�glich, den zur�ckgegebenen Wert verfallen zu lassen
		findLargerNumber(5, 5);
		
	}
	
	// Meine Methode soll die gr��ere von zwei Zahlen zur�ckgeben
	public static double findLargerNumber(double number1, double number2) {
		if (number1 > number2) {
			return number1;
		} else if (number2 > number1) {
			return number2;
		} else {
			System.out.println("Die Zahlen sind gleich gro�!");
			return 0;
		}
	}


}
