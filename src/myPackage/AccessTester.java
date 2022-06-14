// Diese Datei bezieht sich auf die Datei Accessibility
package myPackage;

public class AccessTester {

	public static int publicInt;

	static int nonPublicInt;
	
	private int privateInt;
}

//Diese Klasse kann NICHT in einem anderen Package verwendet werden:
class Restricted {
	
	// Die Klasse darf Attribute haben, die public sind
	// Dies hat aber keinen Effekt, weil die Sichtbarkeit der Klasse Vorrang hat
	public static int restrictedInt;
	
	public static void main(String[] args) {
		AccessTester.publicInt = 100;
		
		// Zugriff auf das nichtöffentliche Attribut funktioniert, weil die die 
		// Klasse AccessTester im selben Package liegt
		AccessTester.nonPublicInt = 100;
		
		// Zugriff auf private Variablen anderer Klassen sind IMMER verboten
		/* AccessTester.privateInt = 100; */
	}
}
