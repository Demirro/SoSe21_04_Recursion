package de.uk.java;

public class SchafsBeine {

	public static int schafsBeine(int anzahlSchafe) {
		// Bei 0 Schafen werden null Beine gezählt und die Rekursion ist beendet
		if (anzahlSchafe == 0) {
			return 0;
		}
		// Wenn die übergebene Zahl ungerade ist, werden 4 Beine gezählt 
		// und zum nächsten Schritt der Rekursion übergegangen
		if (anzahlSchafe % 2 == 1) {
			return 4 + schafsBeine(anzahlSchafe-1);
		}
		// Wenn die übergebene Zahl gerade ist, werden 3 Beine gezählt
		// und zum nächsten Schritt der Rekursion übergegangen
		else if (anzahlSchafe % 2 == 0) {
			return 3 + schafsBeine(anzahlSchafe-1);
		}
		// Alle Fälle abdecken. Zwei Möglichkeiten//
		// Entweder eine Exception schmeißen
		// Oder mit return -1 einen Wert zurückgeben, der nicht vorkommen sollte.
		else {
			System.err.println("Falsches Argument eingegeben. Keine positive Zahl?");
			throw new IllegalArgumentException();

		}
	}

	public static void main(String[] args) {
		System.out.println(schafsBeine(10));
	}
}

