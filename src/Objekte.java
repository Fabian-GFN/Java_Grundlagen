// Alle Datentypen, die nicht zu den "primitiven" zählen, sind "Objekte"
// Was ist ein Objekt?
// Ein Objekt ist eine Kombination von (typischerweise) mehreren Eigenschaften sowie
// Verhaltensweisen. Eigenschaften werden über Variablen festgelegt. 
// Das Verhalten eines Objektes wird über Methoden festgelegt. 



public class Objekte {

	public static void main(String[] args) {
		// Einer der häufigsten Objekttypen in Java ist der String
		// String ist auch der Name einer Klasse in Java!
		String str = "Ich bin ein Objekt";
		
		// Wir haben eine sogenannte "Instanz" der Klasse String erzeugt
		// Mit einer Instanz einer Klasse können wir arbeiten, indem wir ihre Methoden,
		// das sogenannte "Verhalten", verwenden
		str = str.toUpperCase();
		
		// Wir haben jetzt das Ergebnis der Methode toUpperCase() auf die Variable
		// str neu zugewiesen. Das Ergebnis ist wiederum ein String, allerdings komplett
		// mit Großbuchstaben geschrieben.
		System.out.println(str);
		
		// Vergleichen wir dies mit einem primitiven Datentyp 
		int num = 0;
//		 num.toUpperCase();				-- erzeugt einen Kompilierfehler
		// Tatsächlich ist es nicht möglich, eine Methode auf der Variable num aufzurufen.
		// Primitive Typen haben keine Eigenschaften und kein Verhalten!
		
		// Da wir eine eigene Klasse namens "Objekte" geschrieben haben, können wir
		// diese genau wie String als Datentyp verwenden.
		// Mit dem Keyword new und dem Namen der Klasse plus der runden Klammer wird
		// eine neue Instanz erzeugt!
		Objekte myObjekt = new Objekte();
		
		// Viel machen können wir mit diesem Objekt aber nicht, da wir in dieser
		// Klasse keine Eigenschaften und kaum Verhalten definiert haben
		// Immerhin haben wir Zugriff auf einige Methoden aus der Klasse Object, welche
		// grundsätzlich an alle anderen Klassen vererbt werden. 
		System.out.println(myObjekt.toString());
		
		// Auch der String lässt sich übrigens mit dem "new" erzeugen!
		String newStr = new String("Ich bin ein Objekt");
		// Das Resultat ist genau das gleiche wie ganz Oben, wo wir den String
		// nur mit str = "Ich bin ein Objekt" erzeugt haben.
		// Für Strings existiert einfach nur eine Vereinfachung, bei der wir das new
		// weglassen können.
	}

}
