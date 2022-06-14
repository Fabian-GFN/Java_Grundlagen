import java.util.Arrays;

// Ein Array ist eine Auflistung von Werten
// Arrays in Java müssen auf einen Datentyp beschränkt sein

public class Array {

	public static void main(String[] args) {
		// Ein Array von ints deklarieren
		int[] nums;
		
		// Das Array instanziieren -- die Länge ist unbedingt anzugeben!
		nums = new int[5];

		// Die Elemente des Arrays anzeigen
		System.out.println(Arrays.toString(nums));		/* [0, 0, 0, 0, 0] */
		
		// Die Länge des Arrays ausgeben
		System.out.println(nums.length);				/* 5 */
		
		// Eine bestimmte Position des Arrays neu zuweisen
		nums[3] = 7;
		
		System.out.println(Arrays.toString(nums));
		
		// Arrays lassen sich auch mit einem Literal instanziieren
		int[] digits = {7, 9, 5, 3, 11};
		
		// Dies funktioniert nicht bei einer bereits bekannten Variable:
//		nums = {1, 1, 1, 1, 1};
		
		// Dafür müssen wir eine Mischform wählen:
		nums = new int[] {1, 1, 1, 1, 1};
		
		// Arrays dürfen jeden beliebigen Datentyp haben:
		String[] names = {"Fabian", "Steller"};
		
		// Für ein "general purpose" Array wählen wir Object als Typ
		Object[] things = {"String", 12, new Exception()};
		
		// Wenn wir die Array-Variable direkt ausdrucken lassen, bekommen wir
		// lediglich einen HashCode
		System.out.println(things);			/*[Ljava.lang.Object;@2c7b84de*/
		
		// Wir können Arrays von Arrays instanziieren
		int[][] twoDimensional = new int[8][8];
		
		// Die Methode zeigt uns 5 HashCodes an
		System.out.println(Arrays.toString(twoDimensional));
		
		// Mit einer Schleife geht es besser
		for (int i = 0; i < twoDimensional.length; i++) {
			System.out.println(Arrays.toString(twoDimensional[i]));
		}
	}

}
