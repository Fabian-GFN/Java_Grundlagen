import java.util.Scanner;

// Diese Klasse soll einen Spielw�rfel beschreiben
// Jedes Objekt der Klasse w�re demnach ein eigener W�rfel und k�nnte unabh�ngig
// von anderen Objekten benutzt werden

class Wuerfel {
	
	// Ein W�rfel wird f�r die Belange unseres Programmes lediglich �ber seine
	// Seitenzahl beschrieben
	// Daf�r ben�tigen wir eine Variable direkt im class body
	int Seitenzahl = 6;
	
	// Ein W�rfel sollte ebenfalls geworfen werden k�nnen, um ihn benutzbar zu machen
	int werfen() {
		return (int)Math.ceil(Math.random() * Seitenzahl);	// Zuf�lligen Wert ermitteln und zur�ckgeben
	}
	
	// Konstruktor der Klasse Wuerfel
	// MUSS so hei�en wie die Klasse selbst!
	// Diese "Methode" wird immer ausgef�hrt, wenn wir new Wuerfel() schreiben
	Wuerfel(int param) {
		this.Seitenzahl = param;
	}
	
	
}

// Diese Klasse dient lediglich als "Beh�lter" f�r die main-Methode
// Es ist in Java aus Gr�nden der �bersichtlichkeit �blich, die main-Methode
// in eine eigene Klasse auszulagern
public class WuerfelSpiel {
	
	public static void main(String[] args) {
		System.out.println("Hallo und herzlich Willkommen!");
		System.out.println("Wie viele Seiten soll der W�rfel haben?");	
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
		System.out.println("Sie haben eine "+ result +" gew�rfelt!");
	}
}
