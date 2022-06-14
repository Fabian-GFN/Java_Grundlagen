import java.util.Scanner;

// Diese Klasse soll einen Spielwürfel beschreiben
// Jedes Objekt der Klasse wäre demnach ein eigener Würfel und könnte unabhängig
// von anderen Objekten benutzt werden

class Wuerfel {
	
	// Ein Würfel wird für die Belange unseres Programmes lediglich über seine
	// Seitenzahl beschrieben
	// Dafür benötigen wir eine Variable direkt im class body
	int Seitenzahl = 6;
	
	// Ein Würfel sollte ebenfalls geworfen werden können, um ihn benutzbar zu machen
	int werfen() {
		return (int)Math.ceil(Math.random() * Seitenzahl);	// Zufälligen Wert ermitteln und zurückgeben
	}
	
	// Konstruktor der Klasse Wuerfel
	// MUSS so heißen wie die Klasse selbst!
	// Diese "Methode" wird immer ausgeführt, wenn wir new Wuerfel() schreiben
	Wuerfel(int param) {
		this.Seitenzahl = param;
	}
	
	
}

// Diese Klasse dient lediglich als "Behälter" für die main-Methode
// Es ist in Java aus Gründen der Übersichtlichkeit üblich, die main-Methode
// in eine eigene Klasse auszulagern
public class WuerfelSpiel {
	
	public static void main(String[] args) {
		System.out.println("Hallo und herzlich Willkommen!");
		System.out.println("Wie viele Seiten soll der Würfel haben?");	
		Scanner scanner = new Scanner(System.in);
		int input = 6;
		while (true) {			
			try {				
				input = Integer.parseInt(scanner.next());
				break;
			} catch (Exception e) {
				System.out.println("Das hat leider nicht funktioniert. Bitte eine gerade Zahl eingeben");				
			}
		}

		Wuerfel w = new Wuerfel(input);
		int result = w.werfen();
		System.out.println("Sie haben eine "+ result +" gewürfelt!");
	}
}
