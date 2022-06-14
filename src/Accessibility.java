// Diese Datei bezieht sich auf die Datei AccessTester, welche im Package myPackage liegt

// Die Zug�nglichkeit von Klassen, Methoden und Attributen wird �ber 
// sogenannte "Access-Modifier"  eingerichtet
// In Java existieren 3 Access-Modifier:
// public
// protected
// private
// Dabei wird aber zwischen 4 "Zugangsstufen" unterschieden
// public: 			der Zugriff ist uneingeschr�nkt
// kein modifier: 	der Zugriff ist auf das eigene Package beschr�nkt
// protected:		der Zugriff ist auf das eigene Package beschr�nkt (it's complicated)
// private:			der Zugriff ist auf die eigene Klasse beschr�nkt

// Klassen sind immer public oder haben keinen modifier:
public class Accessibility {

	public static void main(String[] args) {
		// Zugriff auf eine public class aus einem anderen Package:
		// Ich muss den Namen des Packages mit angeben
		myPackage.AccessTester acc = new myPackage.AccessTester();
		
		// Zugriff auf eine Klasse ohne access modifier aus einem anderen Package:
		/*myPackage.Restricted res = new myPackage.Restricted(); -- Kompiliert nicht*/
		
		// Zugriff auf ein �ffentliches Attribut einer nicht �ffentlichen Klasse
		// aus einem anderen Package (sinnlos, da die Klasse nicht sichtbar ist)
		/* myPackage.Restricted.restrictedInt = 50; */
		
		// Zugriff auf ein �ffentliches Attribut einer �ffentlichen Klasse
		myPackage.AccessTester.publicInt = 50;
		
		// Zugriff auf ein nicht-�ffentliches Attribut einer �ffentlichen Klasse
		// aus einem anderen Package
		/* myPackage.AccessTester.nonPublicInt = 10; */
	}

}





