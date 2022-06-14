// Alle Datentypen, die nicht zu den "primitiven" z�hlen, sind "Objekte"
// Was ist ein Objekt?
// Ein Objekt ist eine Kombination von (typischerweise) mehreren Eigenschaften sowie
// Verhaltensweisen. Eigenschaften werden �ber Variablen festgelegt. 
// Das Verhalten eines Objektes wird �ber Methoden festgelegt. 



public class Objekte {

	public static void main(String[] args) {
		// Einer der h�ufigsten Objekttypen in Java ist der String
		// String ist auch der Name einer Klasse in Java!
		String str = "Ich bin ein Objekt";
		
		// Wir haben eine sogenannte "Instanz" der Klasse String erzeugt
		// Mit einer Instanz einer Klasse k�nnen wir arbeiten, indem wir ihre Methoden,
		// das sogenannte "Verhalten", verwenden
		str = str.toUpperCase();
		
		// Wir haben jetzt das Ergebnis der Methode toUpperCase() auf die Variable
		// str neu zugewiesen. Das Ergebnis ist wiederum ein String, allerdings komplett
		// mit Gro�buchstaben geschrieben.
		System.out.println(str);
		
		// Vergleichen wir dies mit einem primitiven Datentyp 
		int num = 0;
//		 num.toUpperCase();				-- erzeugt einen Kompilierfehler
		// Tats�chlich ist es nicht m�glich, eine Methode auf der Variable num aufzurufen.
		// Primitive Typen haben keine Eigenschaften und kein Verhalten!
		
		// Da wir eine eigene Klasse namens "Objekte" geschrieben haben, k�nnen wir
		// diese genau wie String als Datentyp verwenden.
		// Mit dem Keyword new und dem Namen der Klasse plus der runden Klammer wird
		// eine neue Instanz erzeugt!
		Objekte myObjekt = new Objekte();
		
		// Viel machen k�nnen wir mit diesem Objekt aber nicht, da wir in dieser
		// Klasse keine Eigenschaften und kaum Verhalten definiert haben
		// Immerhin haben wir Zugriff auf einige Methoden aus der Klasse Object, welche
		// grunds�tzlich an alle anderen Klassen vererbt werden. 
		System.out.println(myObjekt.toString());
		
		// Auch der String l�sst sich �brigens mit dem "new" erzeugen!
		String newStr = new String("Ich bin ein Objekt");
		// Das Resultat ist genau das gleiche wie ganz Oben, wo wir den String
		// nur mit str = "Ich bin ein Objekt" erzeugt haben.
		// F�r Strings existiert einfach nur eine Vereinfachung, bei der wir das new
		// weglassen k�nnen.
	}

}
