import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Liste {

	public static void main(String[] args) {
		// Angenommen, wir wollen eine EinkaufsListe f�hren
		// Diese Aufgabe l�sst sich mit einem Array l�sen:
		String[] einkauf;
		// Wir m�ssen vorher wissen, wie lang die Liste sein soll
		einkauf = new String[] {"Tomaten", "Brot", "Eier", "Katzenfutter", "Flammenwerfer"};
		
		// Nun k�nnen wir jederzeit den Inhalt der Liste ansehen
		System.out.println(Arrays.toString(einkauf));

		// Leider hat sich in letzter Sekunde unsere Schwiegermutter angek�ndigt
		// Wir m�ssen den Einkauf �ndern, weil wir unbedingt Branntwein und Pralinen ben�tigen
		// Wir ben�tigen ein neues Array, weil sich die Anzahl der Elemente �ndert :(
		
		einkauf = new String[] {"Tomaten", "Brot", "Eier", 
				"Katzenfutter", "Flammenwerfer", "BranntWein", "Pralinen"
		};
		
		// Die Liste zeigt sich hier deutlich angenehmer in der Benutzung
		// Eine Liste muss nicht auf eine feste Gr��e instanziiert werden
		List<String> einkaufsListe = new ArrayList<String>();
		
		System.out.println(einkaufsListe.size());				// 0
		System.out.println(einkaufsListe);						// []
		
		// Die Methode add f�gt ein Element ans Ende der Liste an
		// Die Reihenfolge der Elemente bleibt wie beim Array fest geordnet
		einkaufsListe.add("Tomaten");
		einkaufsListe.add("Brot");
		einkaufsListe.add("Eier");
		einkaufsListe.add("Katzenfutter");
		einkaufsListe.add("Flammenwerfer");
		einkaufsListe.add("Branntwein");
		einkaufsListe.add("Pralinen");
		
		System.out.println(einkaufsListe);
		
		// Angenommen, wir wollen den Flammenwerfer entfernen, weil unsere Schwiegermutter
		// Feuerfest ist
		einkaufsListe.remove("Flammenwerfer");
		// Alternativ entfernen einfach die Position 4
//		einkaufsListe.remove(4); 
		
		System.out.println(einkaufsListe);
		
		// Kennen wir die Position eines Elementes nicht, und wollen sie herausfinden,
		// verwenden wir die Methode indexOf
		// Das Ergebnis ist der Index des gesuchten Elementes, bzw. -1 wenn es nicht existiert
		System.out.println(einkaufsListe.indexOf("Flammenwerfer"));			// -1
		
		System.out.println(einkaufsListe.indexOf("Katzenfutter"));			// 3
		
		// Mit get holen wir ein Element aus einer spezifischen Position
		// Das Element wird aus der Liste NICHT entfernt
		System.out.println(einkaufsListe.get(3));							// Katzenfutter
		
		// Eine Liste l�sst sich auch problemlos aus einem bereits bekannten Array erzeugen:
		einkaufsListe = new ArrayList<>(Arrays.asList(einkauf));
		
		// Das k�nnen wir auch mit einem literalen Array machen:
		einkaufsListe = new ArrayList<>(Arrays.asList(new String[] {
				/* Hier die gew�nschten Strings mit Kommata getrennt eintragen */
		}));
		
		
		
	}

}
