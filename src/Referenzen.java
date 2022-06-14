// Referenzen sind "Verweise" auf Objekte im Speicher
// Immer, wenn wir Objekte auf Variablen zuweisen, wird in Wirklichkeit lediglich
// die Referenz auf das entsprechende Objekt zugewiesen

public class Referenzen {

	public static void main(String[] args) {
		// Wir haben ein kleines Array:
		int[] nums = {1, 2};
		
		// Das Array wird über eine zweite Variable referenziert
		int[] nums2 = nums;
		
		// Wenn ich in der Variable nums jetzt den Index 0 neu zuweise...
		nums[0] = 3;
		// ändert dieser sich auch für die Variable nums2!
		System.out.println(nums2[0]);					// 3
		
		// Es handelt sich um ein und dasselbe Array!
		System.out.println(nums == nums2);				// true
		
		// Zwei Objektreferenzen sind nur gleich, wenn sie auf das selbe Objekt verweisen
		nums = new int[] {1, 1};
		nums2 = new int[] {1, 1};
		
		System.out.println(nums == nums2);				// false
		
		// Beachte, dass sich dies deutlich von primitiven Variablen unterscheidet:
		int a = 1;
		int b = a;
		
		System.out.println(a == b);						// true
		
		a = 2;
		System.out.println(b);							// 1
		
		// Nicht alle Objekte sind änderbar -- immutable Objects wie Strings
		// können ihre Form im Speicher nicht mehr ändern
		
		String word 	= "Blabla";
		String word2 	= word;
		
		word.toUpperCase();								// verändert NICHT den String
		
		System.out.println(word);						// Blabla				
		System.out.println(word2);						// Blabla
	}

}
